package com.kwpugh.veggie_way.items.food;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

public class ItemSuperfoodBar extends Item
{	
	public ItemSuperfoodBar(Settings properties)
	{
		super(properties);
	}

	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.EAT;
	}
	
	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((new TranslatableText("item.veggie_way.superfood_bar.line1").formatted(Formatting.GREEN)));
	}
}