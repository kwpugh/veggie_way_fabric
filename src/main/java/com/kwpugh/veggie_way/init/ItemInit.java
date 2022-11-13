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
import net.minecraft.util.registry.Registries;
import net.minecraft.util.registry.Registry;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

public class ItemInit
{
	static int knifeUses = VeggieWay.CONFIG.GENERAL.knifeMaxUses;
	static int handScrapperUses = VeggieWay.CONFIG.GENERAL.handScrapperMaxUses;
	static int soyBucketUses = VeggieWay.CONFIG.GENERAL.soyBucketMaxUses;
	static int millUses = VeggieWay.CONFIG.GENERAL.millMaxUses;
	static int wateringCanUSes = VeggieWay.CONFIG.GENERAL.wateringCanMaxUses;

	public static final ItemKnife KNIFE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "knife"), new ItemKnife(new Item.Settings().maxDamage(knifeUses)));
	public static final ItemHandRake HAND_RAKE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "hand_rake"), new ItemHandRake(ToolMaterials.IRON, -2, -3, new Item.Settings()));
	public static final ItemHandScraper HAND_SCRAPER = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "hand_scraper"), new ItemHandScraper(new Item.Settings().maxDamage(handScrapperUses)));
	public static final ItemWateringCan WATERING_CAN_COPPER = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "watering_can_copper"), new ItemWateringCan(new Item.Settings().maxDamage(wateringCanUSes)));

	public static final Item BAMBOO_SHEET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bamboo_sheet"), new Item(new Item.Settings()));
	public static final Item LARGE_BAMBOO_SHEET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "large_bamboo_sheet"), new Item(new Item.Settings()));

	public static final Item FRESH_TOFU = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fresh_tofu"), new Item(new Item.Settings().food(FoodList.fresh_tofu)));
	public static final Item COOKED_TOFU = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cooked_tofu"), new Item(new Item.Settings().food(FoodList.cooked_tofu)));
	public static final Item SOY_MILK_BUCKET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "soy_milk_bucket"), new Item(new Item.Settings()));
	public static final ItemCookedSoyBucket SOY_MILK_COOKED_BUCKET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "soy_milk_cooked_bucket"), new ItemCookedSoyBucket(new Item.Settings().maxDamage(soyBucketUses)));

	public static final Item FRIED_EGG = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fried_egg"), new Item(new Item.Settings().food(FoodList.fried_egg)));
	
	public static final Item COOKED_CARROT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cooked_carrot"), new Item(new Item.Settings().food(FoodList.cooked_carrot)));
	public static final Item COOKED_BEETROOT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cooked_beetroot"), new Item(new Item.Settings().food(FoodList.cooked_beetroot)));

	public static final ItemMill MILL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mill"), new ItemMill(new Item.Settings().maxDamage(millUses)));
	public static final ItemFlour FLOUR = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "flour"), new ItemFlour(new Item.Settings()));
	public static final ItemDough DOUGH = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dough"), new ItemDough(new Item.Settings()));
	public static final Item CHOCOLATE_BAR = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chocolate_bar"), new Item(new Item.Settings().food(FoodList.chocolate_bar)));

	public static final ItemChunkBase PUMPKIN_CHUNK = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "pumpkin_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.pumpkin_chunk)));
	public static final ItemChunkBase CACTUS_CHUNK = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cactus_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.cactus_chunk)));
	public static final ItemChunkBase MELON_CHUNK = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "melon_chunk"), new ItemChunkBase(new Item.Settings().food(FoodList.melon_chunk)));

	public static final StewItem PUMPKIN_SOUP = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "pumpkin_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.pumpkin_soup)));
	public static final StewItem CACTUS_SOUP = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cactus_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.cactus_soup)));
	public static final StewItem MELON_SOUP = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "melon_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.melon_soup)));
	public static final StewItem CARROT_SOUP = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "carrot_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.carrot_soup)));
	public static final StewItem LENTIL_SOUP = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lentil_soup"), new StewItem(new Item.Settings().maxCount(1).food(FoodList.lentil_soup)));

	public static final Item APPLE_PIE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "apple_pie"), new Item(new Item.Settings().food(FoodList.apple_pie)));
	public static final Item SWEET_BERRY_PIE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "sweet_berry_pie"), new Item(new Item.Settings().food(FoodList.sweet_berry_pie)));
	public static final Item MELON_PIE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "melon_pie"), new Item(new Item.Settings().food(FoodList.melon_pie)));
	public static final Item CACTUS_PIE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cactus_pie"), new Item(new Item.Settings().food(FoodList.cactus_pie)));

	public static final ItemSuperPetals SUPER_PETALS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "super_petals"), new ItemSuperPetals(new Item.Settings().food(FoodList.super_petals)));

	public static final ItemSeedQuinoa QUINOA_SEEDS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "quinoa_seeds"), new ItemSeedQuinoa(BlockInit.PLANT_QUINOA, (new Item.Settings())));
	public static final ItemCropQuinoa QUINOA = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "quinoa"), new ItemCropQuinoa(new Item.Settings().food(FoodList.quinoa)));

	public static final ItemSeedSoybean SOYBEAN_SEEDS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "soybean_seeds"), new ItemSeedSoybean(BlockInit.PLANT_SOYBEAN, (new Item.Settings())));
	public static final ItemCropSoybean SOYBEAN = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "soybean"), new ItemCropSoybean(new Item.Settings().food(FoodList.soybean)));

	public static final ItemSeedLentil LENTIL_SEEDS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lentil_seeds"), new ItemSeedLentil(BlockInit.PLANT_LENTIL, (new Item.Settings())));
	public static final ItemCropLentil LENTIL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lentil"), new ItemCropLentil(new Item.Settings().food(FoodList.lentil)));

	public static final ItemSeedCorn CORN_SEEDS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "corn_seeds"), new ItemSeedCorn(BlockInit.PLANT_CORN, (new Item.Settings())));
	public static final ItemCropCorn CORN = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "corn"), new ItemCropCorn(new Item.Settings().food(FoodList.corn)));

	public static final ItemSeedCotton COTTON_SEEDS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cotton_seeds"), new ItemSeedCotton(BlockInit.PLANT_COTTON, (new Item.Settings())));
	public static final ItemCropCotton COTTON = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cotton"), new ItemCropCotton(new Item.Settings()));


	public static final ItemDryingAgent DRYING_AGENT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "drying_agent"), new ItemDryingAgent(new Item.Settings()));

	public static final ItemCarbs CARBS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "carbs"), new ItemCarbs(new Item.Settings()));
	public static final ItemFructose FRUCTOSE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fructose"), new ItemFructose(new Item.Settings()));
	public static final ItemProteins PROTEINS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "proteins"), new ItemProteins(new Item.Settings()));
	public static final ItemVitamins VITAMINS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "vitamins"), new ItemVitamins(new Item.Settings()));
	public static final ItemCaffeine CAFFEINE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "caffeine"), new ItemCaffeine(new Item.Settings()));
	public static final ItemWheatgerm WHEATGERM = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wheatgerm"), new ItemWheatgerm(new Item.Settings()));

	public static final ItemEnergyPowder ENERGY_POWDER = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "energy_powder"), new ItemEnergyPowder(new Item.Settings()));
	public static final ItemSuperfoodPowder SUPERFOOD_POWDER = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "superfood_powder"), new ItemSuperfoodPowder(new Item.Settings()));

	public static final DrinkBase ENERGY_DRINK = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "energy_drink"), new DrinkBase(new Item.Settings().food(FoodList.energy_drink)));
	public static final DrinkBase SUPERFOOD_SHAKE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "superfood_shake"), new DrinkBase(new Item.Settings().food(FoodList.superfood_shake)));
	public static final DrinkBase SUPERFOOD_SMOOTHIE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "superfood_smoothie"), new DrinkBase(new Item.Settings().food(FoodList.superfood_smoothie)));

	public static final Item ENERGY_BAR = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "energy_bar"), new Item(new Item.Settings().food(FoodList.energy_bar)));
	public static final Item SUPERFOOD_BAR = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "superfood_bar"), new Item(new Item.Settings().food(FoodList.superfood_bar)));

	public static void init()
	{
		// No Op
	}
}
