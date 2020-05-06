package com.kwpugh.veggie_way.mixins;

import com.kwpugh.veggie_way.api.CustomRecipeRemainder;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ShapelessRecipe.class)
public abstract class RecipeRemainderMixin implements CraftingRecipe {

    @Override
    public DefaultedList<ItemStack> getRemainingStacks(CraftingInventory inventory) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(inventory.size(), ItemStack.EMPTY);

        for(int i = 0; i < defaultedList.size(); ++i) {
            Item item = inventory.getStack(i).getItem();
            if (item.hasRecipeRemainder()) {
                if (item instanceof CustomRecipeRemainder) {
                    defaultedList.set(i,((CustomRecipeRemainder) item).getRecipeRemainder(inventory.getStack(i)));
                }else {
                    defaultedList.set(i, new ItemStack(item.getRecipeRemainder()));
                }
            }
        }

        return defaultedList;
    }

}
