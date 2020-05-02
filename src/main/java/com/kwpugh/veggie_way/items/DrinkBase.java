package com.kwpugh.veggie_way.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class DrinkBase extends Item
{	
	public DrinkBase(Settings settings)
	{
		super(settings);
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		if (user instanceof PlayerEntity) {
			ItemStack empty_bottle = new ItemStack(Items.GLASS_BOTTLE);
			if (!((PlayerEntity) user).giveItemStack(empty_bottle)) {
				ItemScatterer.spawn(world, user.getX(), user.getY(), user.getZ(), empty_bottle);
			}
		}
		return super.finishUsing(stack, world, user);
	}
	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

}


