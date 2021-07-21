package com.kwpugh.veggie_way.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name="veggie_way")
public class ModConfig extends PartitioningSerializer.GlobalData
{
    public General GENERAL = new General();

    @Config(name = "general")
    public static class General implements ConfigData
    {
        @Comment("***********************"
                + "\nGeneral Settings"
                + "\n***********************")
        public int fresh_tofu_hunger = 3;
        public float fresh_tofu_saturation = 0.3F;
        public int cooked_tofu_hunger = 4;
        public float cooked_tofu_saturation = 0.4F;
        public int cooked_carrot_hunger = 4;
        public float cooked_carrot_saturation = 0.8F;
        public int cooked_beetroot_hunger = 2;
        public float cooked_beetroot_saturation = 0.8F;
        public int corn_hunger = 3;
        public float corn_saturation = 0.2F;
        public int quinoa_hunger = 3;
        public float quinoa_saturation = 0.2F;
        public int soybean_hunger = 3;
        public float soybean_saturation = 0.2F;
        public int lentil_hunger = 3;
        public float lentil_saturation = 0.2F;
        public int melon_chunk_hunger = 2;
        public float melon_chunk_saturation = 0.1F;
        public int pumpkin_chunk_hunger = 2;
        public float pumpkin_chunk_saturation = 0.1F;
        public int cactus_chunk_hunger = 2;
        public float cactus_chunk_saturation = 0.1F;
        public int apple_pie_hunger = 6;
        public float apple_pie_saturation = 0.2F;
        public int melon_pie_hunger = 6;
        public float melon_pie_saturation = 0.2F;
        public int berry_pie_hunger = 6;
        public float berry_pie_saturation = 0.2F;
        public int pumpkin_soup_hunger = 6;
        public float pumpkin_soup_saturation = 0.3F;
        public int cactus_soup_hunger = 6;
        public float cactus_soup_saturation = 0.3F;
        public int melon_soup_hunger = 6;
        public float melon_soup_saturation = 0.3F;
        public int carrot_soup_hunger = 6;
        public float carrot_soup_saturation = 0.3F;
        public int super_petals_hunger = 6;
        public float super_petals_saturation = 0.8F;
        public int energy_drink_hunger = 9;
        public float energy_drink_saturation = 0.2F;
        public int shake_hunger = 10;
        public float shake_saturation = 0.3F;
        public int smoothie_hunger = 10;
        public float smoothie_saturation = 0.3F;
        public int energyBar_hunger = 10;
        public float energyBar_saturation = 0.4F;
        public int superFoodBar_hunger = 12;
        public float superFoodBar_saturation = 0.8F;
        public int chocolate_bar_hunger = 4;
        public float chocolate_bar_saturation = 0.2F;
        public int fried_egg_hunger = 3;
        public float fried_egg_saturation = 0.2F;

        @Comment("***********************"
                + "\nDrying Agent"
                + "\nranges from 0.0 - 1.0"
                + "\n***********************")
        public float chanceSandOnTorch = .4F;
    }
}

