package com.kwpugh.veggie_way.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.kwpugh.pugh_lib.api.CustomRecipeRemainder;

public class ItemCookedSoyBucket extends Item implements CustomRecipeRemainder
{
    public ItemCookedSoyBucket(Settings properties)
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
}