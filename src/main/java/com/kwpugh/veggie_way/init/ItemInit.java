package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.items.crops.*;
import com.kwpugh.veggie_way.items.food.*;
import com.kwpugh.veggie_way.items.tools.*;
import com.kwpugh.veggie_way.lists.FoodList;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

public class ItemInit
{
	static int knifeUses = VeggieWay.CONFIG.GENERAL.knifeMaxUses;
	static int handScrapperUses = VeggieWay.CONFIG.GENERAL.handScrapperMaxUses;
	static int soyBucketUses = VeggieWay.CONFIG.GENERAL.soyBucketMaxUses;
	static int millUses = VeggieWay.CONFIG.GENERAL.millMaxUses;
	static int wateringCanUSes = VeggieWay.CONFIG.GENERAL.wateringCanMaxUses;

	public static final ItemKnife KNIFE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knife"), new ItemKnife(new Item.Settings().maxDamage(knifeUses).group(VeggieWay.veggie_way)));
	public static final ItemHandRake HAND_RAKE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hand_rake"), new ItemHandRake(ToolMaterials.IRON, -2, -3, new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemHandScraper HAND_SCRAPER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hand_scraper"), new ItemHandScraper(new Item.Settings().maxDamage(handScrapperUses).group(VeggieWay.veggie_way)));
	public static final ItemWateringCan WATERING_CAN_COPPER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "watering_can_copper"), new ItemWateringCan(new Item.Settings().maxDamage(wateringCanUSes).group(VeggieWay.veggie_way)));

	public static final Item BAMBOO_SHEET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bamboo_sheet"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item LARGE_BAMBOO_SHEET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "large_bamboo_sheet"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));

	public static final Item FRESH_TOFU = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fresh_tofu"), new Item(new Item.Settings().food(FoodList.fresh_tofu).group(VeggieWay.veggie_way)));
	public static final Item COOKED_TOFU = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_tofu"), new Item(new Item.Settings().food(FoodList.cooked_tofu).group(VeggieWay.veggie_way)));
	public static final Item SOY_MILK_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soy_milk_bucket"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemCookedSoyBucket SOY_MILK_COOKED_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soy_milk_cooked_bucket"), new ItemCookedSoyBucket(new Item.Settings().maxDamage(soyBucketUses).group(VeggieWay.veggie_way)));

	public static final Item FRIED_EGG = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fried_egg"), new Item(new Item.Settings().food(FoodList.fried_egg).group(VeggieWay.veggie_way)));
	
	public static final Item COOKED_CARROT = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_carrot"), new Item(new Item.Settings().food(FoodList.cooked_carrot).group(VeggieWay.veggie_way)));
	public static final Item COOKED_BEETROOT = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_beetroot"), new Item(new Item.Settings().food(FoodList.cooked_beetroot).group(VeggieWay.veggie_way)));

	public static final ItemMill MILL = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mill"), new ItemMill(new Item.Settings().maxDamage(millUses).group(VeggieWay.veggie_way)));
	public static final ItemFlour FLOUR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flour"), new ItemFlour(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemDough DOUGH = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dough"), new ItemDough(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item CHOCOLATE_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_bar"), new Item(new Item.Settings().food(FoodList.chocolate_bar).group(VeggieWay.veggie_way)));

	public static final ItemChunkBase PUMPKIN_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.pumpkin_chunk).group(VeggieWay.veggie_way)));
	public static final ItemChunkBase CACTUS_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cactus_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.cactus_chunk).group(VeggieWay.veggie_way)));
	public static final ItemChunkBase MELON_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.melon_chunk).group(VeggieWay.veggie_way)));

	public static final StewItem PUMPKIN_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.pumpkin_soup).group(VeggieWay.veggie_way)));
	public static final StewItem CACTUS_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cactus_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.cactus_soup).group(VeggieWay.veggie_way)));
	public static final StewItem MELON_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.melon_soup).group(VeggieWay.veggie_way)));
	public static final StewItem CARROT_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.carrot_soup).group(VeggieWay.veggie_way)));
	public static final StewItem LENTIL_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lentil_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.lentil_soup).group(VeggieWay.veggie_way)));

	public static final Item APPLE_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_pie"), new Item(new Item.Settings().food(FoodList.apple_pie).group(VeggieWay.veggie_way)));
	public static final Item SWEET_BERRY_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_pie"), new Item(new Item.Settings().food(FoodList.sweet_berry_pie).group(VeggieWay.veggie_way)));
	public static final Item MELON_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_pie"), new Item(new Item.Settings().food(FoodList.melon_pie).group(VeggieWay.veggie_way)));
	public static final Item CACTUS_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cactus_pie"), new Item(new Item.Settings().food(FoodList.cactus_pie).group(VeggieWay.veggie_way)));

	public static final ItemSuperPetals SUPER_PETALS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "super_petals"), new ItemSuperPetals(new Item.Settings().food(FoodList.super_petals).group(VeggieWay.veggie_way)));

	public static final ItemSeedQuinoa QUINOA_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quinoa_seeds"), new ItemSeedQuinoa(BlockInit.PLANT_QUINOA, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropQuinoa QUINOA = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quinoa"), new ItemCropQuinoa(new Item.Settings().food(FoodList.quinoa).group(VeggieWay.veggie_way)));

	public static final ItemSeedSoybean SOYBEAN_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soybean_seeds"), new ItemSeedSoybean(BlockInit.PLANT_SOYBEAN, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropSoybean SOYBEAN = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soybean"), new ItemCropSoybean(new Item.Settings().food(FoodList.soybean).group(VeggieWay.veggie_way)));

	public static final ItemSeedLentil LENTIL_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lentil_seeds"), new ItemSeedLentil(BlockInit.PLANT_LENTIL, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropLentil LENTIL = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lentil"), new ItemCropLentil(new Item.Settings().food(FoodList.lentil).group(VeggieWay.veggie_way)));

	public static final ItemSeedCorn CORN_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corn_seeds"), new ItemSeedCorn(BlockInit.PLANT_CORN, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropCorn CORN = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corn"), new ItemCropCorn(new Item.Settings().food(FoodList.corn).group(VeggieWay.veggie_way)));

	public static final ItemSeedCotton COTTON_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cotton_seeds"), new ItemSeedCotton(BlockInit.PLANT_COTTON, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropCotton COTTON = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cotton"), new ItemCropCotton(new Item.Settings().group(VeggieWay.veggie_way)));


	public static final ItemDryingAgent DRYING_AGENT = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drying_agent"), new ItemDryingAgent(new Item.Settings().group(VeggieWay.veggie_way)));

	public static final ItemCarbs CARBS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carbs"), new ItemCarbs(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemFructose FRUCTOSE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fructose"), new ItemFructose(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemProteins PROTEINS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "proteins"), new ItemProteins(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemVitamins VITAMINS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vitamins"), new ItemVitamins(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemCaffeine CAFFEINE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "caffeine"), new ItemCaffeine(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemWheatgerm WHEATGERM = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wheatgerm"), new ItemWheatgerm(new Item.Settings().group(VeggieWay.veggie_way)));

	public static final ItemEnergyPowder ENERGY_POWDER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_powder"), new ItemEnergyPowder(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemSuperfoodPowder SUPERFOOD_POWDER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_powder"), new ItemSuperfoodPowder(new Item.Settings().group(VeggieWay.veggie_way)));

	public static final DrinkBase ENERGY_DRINK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_drink"), new DrinkBase(new Item.Settings().food(FoodList.energy_drink).group(VeggieWay.veggie_way)));
	public static final DrinkBase SUPERFOOD_SHAKE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_shake"), new DrinkBase(new Item.Settings().food(FoodList.superfood_shake).group(VeggieWay.veggie_way)));
	public static final DrinkBase SUPERFOOD_SMOOTHIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_smoothie"), new DrinkBase(new Item.Settings().food(FoodList.superfood_smoothie).group(VeggieWay.veggie_way)));

	public static final Item ENERGY_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_bar"), new Item(new Item.Settings().food(FoodList.energy_bar).group(VeggieWay.veggie_way)));
	public static final Item SUPERFOOD_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_bar"), new Item(new Item.Settings().food(FoodList.superfood_bar).group(VeggieWay.veggie_way)));
	public static void init() {

	}
}
