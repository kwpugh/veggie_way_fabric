package com.kwpugh.veggie_way.handlers;

import com.kwpugh.veggie_way.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EventHandler
{
    // Drop tests performed as a result of the break block event
    public static boolean onBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity)
    {
        boolean isResourceful;
        boolean hasShovel;

        if(player.isCreative() || player.isSpectator()) return false;

        if(!world.isClient)
        {
            ItemStack tool = player.getMainHandStack();
            hasShovel = tool.getItem() instanceof ShovelItem;
            isResourceful = hasResourcefulness(tool);

            if(tool.getItem() == ItemInit.HAND_RAKE ||
                    (hasShovel && isResourceful))
            {
                HandRakeDrops.testForDrops(world, player, pos, state, entity, tool);
            }
        }

        return true;
    }

    public static boolean hasResourcefulness(ItemStack tool)
    {
        if(tool.getEnchantments() != null)
        {
            String enchantments = tool.getEnchantments().toString();
            if(enchantments.contains("resourcefulness")) return true;
        }

        return false;
    }
}