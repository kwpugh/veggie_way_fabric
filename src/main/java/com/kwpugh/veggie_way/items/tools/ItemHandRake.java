package com.kwpugh.veggie_way.items.tools;

import com.kwpugh.veggie_way.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ItemHandRake extends ShovelItem
{
	public ItemHandRake(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
		Block block = state.getBlock();
		if (!world.isClient() && state.getHardness(world,pos) != 0.0F)
		{
			if(block == Blocks.SAND)
			{
				stack.damage(1, miner, (e) -> {
					e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
				});

				double r = world.random.nextDouble();
				if (r <= 0.4)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.DRYING_AGENT, 1));
				}
				else if (r > 0.4)
				{
					//just drop the normal block, no drying agent
				}
			}

			if(block == Blocks.DIRT || block == Blocks.GRASS_BLOCK)
			{
				stack.damage(1, miner, (e) -> {
					e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
				});

				double r = world.random.nextDouble();
				if (r <= 0.1)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.QUINOA_SEEDS, 1));
				}
				else if (r > 0.1 && r <= 0.2)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.SOYBEAN_SEEDS, 1));
				}
				else if (r > 0.2 && r <= 0.3)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.LENTIL_SEEDS, 1));
				}
				else if (r > 0.3 && r <= 0.4)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.CORN_SEEDS, 1));
				}
				else if (r > 0.4 && r <= 0.5)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.CARROT, 1));
				}
				else if (r > 0.5 && r <= 0.6)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.BEETROOT_SEEDS, 1));
				}
				else if (r > 0.6 && r <= 0.7)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.POTATO, 1));
				}
				else if (r > 0.7)
				{
					//Nothing right now
				}
			}

			if(block == Blocks.MYCELIUM)
			{
				stack.damage(1, miner, (e) -> {
					e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
				});

				double r = world.random.nextDouble();
				if (r <= 0.1)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.BROWN_MUSHROOM, 1));
				}
				else if (r > 0.1 && r <= 0.2)
				{
					ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.RED_MUSHROOM, 1));
				}
				else if (r > 0.2)
				{
					//Nothing right now
				}
			}
		}

		return true;

	}

	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((Text.translatable("item.veggie_way.hand_rake.line1").formatted(Formatting.GREEN)));
		tooltip.add((Text.translatable("item.veggie_way.hand_rake.line2").formatted(Formatting.GREEN)));
	}


}

