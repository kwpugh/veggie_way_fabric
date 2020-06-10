package com.kwpugh.veggie_way.items;


import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import com.kwpugh.pugh_lib.api.CustomRecipeRemainder;

public class ItemMill extends Item implements CustomRecipeRemainder
{
	public ItemMill(Settings properties)
	{
		super(properties);
	}

	@Override
	public boolean hasRecipeRemainder()
	{
		return true;
	}

    @Override
    public ItemStack getRecipeRemainder(ItemStack stackIn)
    {	
    	ItemStack stack = stackIn.copy();
    	stack.setDamage(stack.getDamage() + 1);

    	if(stack.getDamage() >= stack.getMaxDamage())
    	{
    		stack.decrement(1);
    	}
    	
        return stack;    
    }
    
	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context)
	{
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((new TranslatableText("item.veggie_way.mill.line1").formatted(Formatting.GREEN)));
	}
}