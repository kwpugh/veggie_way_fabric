package com.kwpugh.veggie_way.lists;

import com.kwpugh.veggie_way.VeggieWay;
import net.minecraft.item.FoodComponent;

public class FoodList
{
    static int freshTofuHunger = VeggieWay.CONFIG.GENERAL.fresh_tofu_hunger;
    static float freshTofuSaturation = VeggieWay.CONFIG.GENERAL.fresh_tofu_saturation;
 
    static int cookedTofuHunger = VeggieWay.CONFIG.GENERAL.cooked_tofu_hunger;
    static float cookedTofuSaturation = VeggieWay.CONFIG.GENERAL.cooked_tofu_saturation;
    
    static int cookedCarrotHunger = VeggieWay.CONFIG.GENERAL.cooked_carrot_hunger;
    static float cookedCarrotSaturation = VeggieWay.CONFIG.GENERAL.cooked_carrot_saturation;
   
    static int cookedBeetrootHunger = VeggieWay.CONFIG.GENERAL.cooked_beetroot_hunger;
    static float cookedBeetrootSaturation = VeggieWay.CONFIG.GENERAL.cooked_beetroot_saturation;
    
    static int friedEggHunger = VeggieWay.CONFIG.GENERAL.fried_egg_hunger;
    static float friedEggSaturation = VeggieWay.CONFIG.GENERAL.fried_egg_saturation;
    
    static int chocolateBarHunger = VeggieWay.CONFIG.GENERAL.chocolate_bar_hunger;
    static float chocolateBarSaturation = VeggieWay.CONFIG.GENERAL.chocolate_bar_saturation;

    static int cactusChunkHunger = VeggieWay.CONFIG.GENERAL.cactus_chunk_hunger;
    static float cactusChunkSaturation = VeggieWay.CONFIG.GENERAL.cactus_chunk_saturation;

    static int melonChunkHunger = VeggieWay.CONFIG.GENERAL.melon_chunk_hunger;
    static float melonChunkSaturation = VeggieWay.CONFIG.GENERAL.melon_chunk_saturation;

    static int pumpkinChunkHunger = VeggieWay.CONFIG.GENERAL.pumpkin_chunk_hunger;
    static float pumpkinChunkSaturation = VeggieWay.CONFIG.GENERAL.pumpkin_chunk_saturation;

    static int applePieHunger = VeggieWay.CONFIG.GENERAL.apple_pie_hunger;
    static float applePieSaturation = VeggieWay.CONFIG.GENERAL.apple_pie_saturation;

    static int melonPieHunger = VeggieWay.CONFIG.GENERAL.melon_pie_hunger;
    static float melonPieSaturation = VeggieWay.CONFIG.GENERAL.melon_pie_saturation;

    static int berryPieHunger = VeggieWay.CONFIG.GENERAL.berry_pie_hunger;
    static float berryPieSaturation = VeggieWay.CONFIG.GENERAL.berry_pie_saturation;

    static int pumpkinSoupHunger = VeggieWay.CONFIG.GENERAL.pumpkin_soup_hunger;
    static float pumpkinSoupSaturation = VeggieWay.CONFIG.GENERAL.pumpkin_soup_saturation;

    static int melonSoupHunger = VeggieWay.CONFIG.GENERAL.melon_soup_hunger;
    static float melonSoupSaturation = VeggieWay.CONFIG.GENERAL.melon_soup_saturation;

    static int cactusSoupHunger = VeggieWay.CONFIG.GENERAL.cactus_soup_hunger;
    static float cactusSoupSaturation = VeggieWay.CONFIG.GENERAL.cactus_soup_saturation;

    static int carrotSoupHunger = VeggieWay.CONFIG.GENERAL.carrot_soup_hunger;
    static float carrotSoupSaturation = VeggieWay.CONFIG.GENERAL.carrot_soup_saturation;

    static int superPetalsHunger = VeggieWay.CONFIG.GENERAL.super_petals_hunger;
    static float superPetalsSaturation = VeggieWay.CONFIG.GENERAL.super_petals_saturation;

    static int energyDrinkHunger = VeggieWay.CONFIG.GENERAL.energy_drink_hunger;
    static float energyDrinkSaturation = VeggieWay.CONFIG.GENERAL.energy_drink_saturation;

    static int shakeHunger = VeggieWay.CONFIG.GENERAL.shake_hunger;
    static float shakeSaturation = VeggieWay.CONFIG.GENERAL.shake_saturation;

    static int smoothieHunger = VeggieWay.CONFIG.GENERAL.smoothie_hunger;
    static float smoothieSaturation = VeggieWay.CONFIG.GENERAL.smoothie_saturation;

    static int energyBarHunger = VeggieWay.CONFIG.GENERAL.energyBar_hunger;
    static float energyBarSaturation = VeggieWay.CONFIG.GENERAL.energyBar_saturation;

    static int superFoodHunger = VeggieWay.CONFIG.GENERAL.superFoodBar_hunger;
    static float superFoodSaturation = VeggieWay.CONFIG.GENERAL.superFoodBar_saturation;

    static int quinoaHunger = VeggieWay.CONFIG.GENERAL.quinoa_hunger;
    static float quinoaSaturation = VeggieWay.CONFIG.GENERAL.quinoa_saturation;

    static int soybeanHunger = VeggieWay.CONFIG.GENERAL.soybean_hunger;
    static float soybeanSaturation = VeggieWay.CONFIG.GENERAL.soybean_saturation;

    static int lentilHunger = VeggieWay.CONFIG.GENERAL.lentil_hunger;
    static float lentilSaturation = VeggieWay.CONFIG.GENERAL.lentil_saturation;

    static int cornHunger = VeggieWay.CONFIG.GENERAL.corn_hunger;
    static float cornSaturation = VeggieWay.CONFIG.GENERAL.corn_saturation;

    public static FoodComponent quinoa = (new FoodComponent.Builder()).hunger(quinoaHunger).saturationModifier(quinoaSaturation).build();
    public static FoodComponent soybean = (new FoodComponent.Builder()).hunger(soybeanHunger).saturationModifier(soybeanSaturation).build();
    public static FoodComponent lentil = (new FoodComponent.Builder()).hunger(lentilHunger).saturationModifier(lentilSaturation).build();
    public static FoodComponent corn = (new FoodComponent.Builder()).hunger(cornHunger).saturationModifier(cornSaturation).build();
    
    public static FoodComponent fresh_tofu = (new FoodComponent.Builder()).hunger(freshTofuHunger).saturationModifier(freshTofuSaturation).build();
    public static FoodComponent cooked_tofu = (new FoodComponent.Builder()).hunger(cookedTofuHunger).saturationModifier(cookedTofuSaturation).build();  
    
    public static FoodComponent cooked_carrot = (new FoodComponent.Builder()).hunger(cookedCarrotHunger).saturationModifier(cookedCarrotSaturation).build();
    public static FoodComponent cooked_beetroot = (new FoodComponent.Builder()).hunger(cookedBeetrootHunger).saturationModifier(cookedBeetrootSaturation).build();
    
    public static FoodComponent chocolate_bar = (new FoodComponent.Builder()).hunger(chocolateBarHunger).saturationModifier(chocolateBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent fried_egg = (new FoodComponent.Builder()).hunger(friedEggHunger).saturationModifier(friedEggSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_chunk = (new FoodComponent.Builder()).hunger(cactusChunkHunger).saturationModifier(cactusChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent pumpkin_chunk = (new FoodComponent.Builder()).hunger(pumpkinChunkHunger).saturationModifier(pumpkinChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_chunk = (new FoodComponent.Builder()).hunger(melonChunkHunger).saturationModifier(melonChunkSaturation).alwaysEdible().snack().build();

    public static FoodComponent apple_pie = (new FoodComponent.Builder()).hunger(applePieHunger).saturationModifier(applePieSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_pie = (new FoodComponent.Builder()).hunger(melonPieHunger).saturationModifier(melonPieSaturation).alwaysEdible().snack().build();
    public static FoodComponent sweet_berry_pie = (new FoodComponent.Builder()).hunger(berryPieHunger).saturationModifier(berryPieSaturation).alwaysEdible().snack().build();

    public static FoodComponent pumpkin_soup = (new FoodComponent.Builder()).hunger(pumpkinSoupHunger).saturationModifier(pumpkinSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_soup = (new FoodComponent.Builder()).hunger(cactusSoupHunger).saturationModifier(cactusSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_soup = (new FoodComponent.Builder()).hunger(melonSoupHunger).saturationModifier(melonSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent carrot_soup = (new FoodComponent.Builder()).hunger(carrotSoupHunger).saturationModifier(carrotSoupSaturation).alwaysEdible().snack().build();

    public static FoodComponent super_petals = (new FoodComponent.Builder()).hunger(superPetalsHunger).saturationModifier(superPetalsSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_drink = (new FoodComponent.Builder()).hunger(energyDrinkHunger).saturationModifier(energyDrinkSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_shake = (new FoodComponent.Builder()).hunger(shakeHunger).saturationModifier(shakeSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_smoothie = (new FoodComponent.Builder()).hunger(smoothieHunger).saturationModifier(smoothieSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_bar = (new FoodComponent.Builder()).hunger(energyBarHunger).saturationModifier(energyBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_bar = (new FoodComponent.Builder()).hunger(superFoodHunger).saturationModifier(superFoodSaturation).alwaysEdible().snack().build();
}
