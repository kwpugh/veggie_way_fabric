package com.kwpugh.veggie_way.items.crops;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemSeedCotton extends BlockItem
{
	public ItemSeedCotton(Block crop, Settings builder)
	{
		super(crop, builder);      
	}

	@Override
	public String getTranslationKey() {
		return "item.veggie_way.cotton_seeds";
	}

	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((Text.translatable("item.veggie_way.cotton_seeds.line1").formatted(Formatting.GREEN)));
	}
}