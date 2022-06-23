package com.kwpugh.veggie_way.items.tools;

import com.kwpugh.veggie_way.VeggieWay;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemWateringCan extends Item
{
    static int wateringCanUses = VeggieWay.CONFIG.GENERAL.wateringCanMaxUses;

    public ItemWateringCan(Settings settings)
    {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getStackInHand(hand);

        if (world.isClient()) return TypedActionResult.success(stack);

        // Sneak right-click to empty the can
        if(player.isSneaking())
        {
            stack.setDamage(0);

            return TypedActionResult.success(stack);
        }

        BlockHitResult hitResult = raycast(world, player, RaycastContext.FluidHandling.SOURCE_ONLY);
        if (hitResult.getType() != HitResult.Type.BLOCK) return TypedActionResult.success(stack);

        BlockPos targetPos = hitResult.getBlockPos();
        BlockState state = world.getBlockState(targetPos);
        Block block = state.getBlock();
        BlockPos posDown = targetPos.offset(Direction.DOWN);
        BlockState stateDown = world.getBlockState(posDown);
        Block blockBelow = stateDown.getBlock();

        if (stack.getDamage() > 0)
        {
            // Plants that can use bonemeal, should work with modded if they extend these
            if (    block instanceof CropBlock ||  //Beets Carrots Potatoes
                    block instanceof BambooSaplingBlock ||
                    block instanceof BambooBlock ||
                    block instanceof CocoaBlock ||
                    block instanceof SweetBerryBushBlock ||
                    block instanceof FungusBlock ||
                    block instanceof StemBlock ||      // pumkins and melons
                    block instanceof SaplingBlock ||   //all saplings
                    block instanceof AzaleaBlock
                    )
            {
                Fertilizable fertilizable = (Fertilizable) block;
                if (fertilizable.isFertilizable(world, targetPos, state, world.isClient))
                {
                    if (world instanceof ServerWorld)
                    {
                        if (fertilizable.canGrow(world, world.random, targetPos, state))
                        {
                            fertilizable.grow((ServerWorld) world, world.random, targetPos, state);
                        }
                    }
                }
            }

            // Water a farmland block
            if (block instanceof FarmlandBlock)
            {
                world.setBlockState(targetPos, state.with(Properties.MOISTURE, FarmlandBlock.MAX_MOISTURE));
            }

            // Water the block beneath the plant
            if (blockBelow instanceof FarmlandBlock)
            {
                world.setBlockState(posDown, stateDown.with(Properties.MOISTURE, FarmlandBlock.MAX_MOISTURE));
            }

            stack.setDamage(stack.getDamage() - 1);

            return TypedActionResult.success(stack);
        }

        // Right-click on water source block to fill
        if (block instanceof FluidDrainable fluid && state.getMaterial() == Material.WATER)
        {
            if (stack.getDamage() == wateringCanUses) return TypedActionResult.success(stack, false);

            fluid.getBucketFillSound().ifPresent((sound) -> player.playSound(sound, 1.0F, 1.0F));

            stack.setDamage(wateringCanUses);
            fluid.tryDrainFluid(world, targetPos, state);
            player.swingHand(hand);

            return TypedActionResult.success(stack);
        }

        return TypedActionResult.success(stack);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack)
    {
        return true;
    }

    @Override
    public int getItemBarStep(ItemStack stack)
    {
        return Math.min(Math.round(13 * stack.getDamage() / (float) wateringCanUses), 13);  // adjusted from Item class to reverse bar
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context)
    {
        tooltip.add((Text.translatable("item.veggie_way.watering_can_copper.line1").formatted(Formatting.GREEN)));
        tooltip.add((Text.translatable("item.veggie_way.watering_can_copper.line2").formatted(Formatting.GREEN)));
        tooltip.add((Text.translatable("item.veggie_way.watering_can_copper.line3", stack.getDamage()).formatted(Formatting.AQUA)));
    }
}
