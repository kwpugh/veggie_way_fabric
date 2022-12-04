package com.kwpugh.veggie_way.util;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.init.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class VeggieWayGroup
{
    public static void addGroup()
    {
        // force class run when we want
    }

    private static final ItemGroup VEGGIE_WAY_GROUP = FabricItemGroup.builder(new Identifier(VeggieWay.MOD_ID, "veggie_way_group"))
            .icon(() -> new ItemStack(Items.CARROT))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ItemInit.KNIFE);
                entries.add(ItemInit.HAND_RAKE);
                entries.add(ItemInit.HAND_SCRAPER);
                entries.add(ItemInit.WATERING_CAN_COPPER);
                entries.add(ItemInit.BAMBOO_SHEET);
                entries.add(ItemInit.LARGE_BAMBOO_SHEET);
                entries.add(ItemInit.FRESH_TOFU);
                entries.add(ItemInit.COOKED_TOFU);
                entries.add(ItemInit.SOY_MILK_BUCKET);
                entries.add(ItemInit.SOY_MILK_COOKED_BUCKET);
                entries.add(ItemInit.FRIED_EGG);
                entries.add(ItemInit.COOKED_CARROT);
                entries.add(ItemInit.COOKED_BEETROOT);
                entries.add(ItemInit.MILL);
                entries.add(ItemInit.FLOUR);
                entries.add(ItemInit.DOUGH);
                entries.add(ItemInit.CHOCOLATE_BAR);
                entries.add(ItemInit.PUMPKIN_CHUNK);
                entries.add(ItemInit.CACTUS_CHUNK);
                entries.add(ItemInit.MELON_CHUNK);
                entries.add(ItemInit.PUMPKIN_SOUP);
                entries.add(ItemInit.CACTUS_SOUP);
                entries.add(ItemInit.MELON_SOUP);
                entries.add(ItemInit.CARROT_SOUP);
                entries.add(ItemInit.LENTIL_SOUP);
                entries.add(ItemInit.APPLE_PIE);
                entries.add(ItemInit.SWEET_BERRY_PIE);
                entries.add(ItemInit.MELON_PIE);
                entries.add(ItemInit.CACTUS_PIE);
                entries.add(ItemInit.SUPER_PETALS);
                entries.add(ItemInit.QUINOA_SEEDS);
                entries.add(ItemInit.QUINOA);
                entries.add(ItemInit.SOYBEAN_SEEDS);
                entries.add(ItemInit.SOYBEAN);
                entries.add(ItemInit.LENTIL_SEEDS);
                entries.add(ItemInit.LENTIL);
                entries.add(ItemInit.CORN_SEEDS);
                entries.add(ItemInit.CORN);
                entries.add(ItemInit.COTTON_SEEDS);
                entries.add(ItemInit.COTTON);
                entries.add(ItemInit.DRYING_AGENT);
                entries.add(ItemInit.CARBS);
                entries.add(ItemInit.FRUCTOSE);
                entries.add(ItemInit.PROTEINS);
                entries.add(ItemInit.VITAMINS);
                entries.add(ItemInit.CAFFEINE);
                entries.add(ItemInit.WHEATGERM);
                entries.add(ItemInit.ENERGY_POWDER);
                entries.add(ItemInit.SUPERFOOD_POWDER);
                entries.add(ItemInit.ENERGY_DRINK);
                entries.add(ItemInit.SUPERFOOD_SHAKE);
                entries.add(ItemInit.SUPERFOOD_SMOOTHIE);
                entries.add(ItemInit.ENERGY_BAR);
                entries.add(ItemInit.SUPERFOOD_BAR);
            })
            .build();
}
