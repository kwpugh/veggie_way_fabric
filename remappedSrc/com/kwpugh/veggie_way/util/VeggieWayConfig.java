package com.kwpugh.veggie_way.util;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.*;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

@Config(name=MOD_ID)
public class VeggieWayConfig implements ConfigData
{

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Chunks chunks = new Chunks();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Pies pies = new Pies();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Soups soups = new Soups();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public SuperFoods super_foods = new SuperFoods();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Misc misc = new Misc();


	public static class Chunks {
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int melon_chunk_saturation = 1;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int pumpkin_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int pumpkin_chunk_saturation = 1;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int cactus_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int cactus_chunk_saturation = 1;

	}
	public static class Pies {
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int apple_pie_hunger = 7;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int apple_pie_saturation = 2;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_pie_hunger = 7;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int melon_pie_saturation = 2;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int berry_pie_hunger = 7;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int berry_pie_saturation = 2;


	}
	public static class Soups {

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int pumpkin_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int pumpkin_soup_saturation = 1;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int cactus_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int cactus_soup_saturation = 1;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int melon_soup_saturation = 1;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int carrot_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int carrot_soup_saturation = 1;

	}
	public static class SuperFoods {
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int super_petals_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int super_petals_saturation = 9;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int energy_drink_hunger = 9;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int energy_drink_saturation = 2;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int shake_hunger = 10;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int shake_saturation = 3;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int smoothie_hunger = 10;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int smoothie_saturation = 3;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int energyBar_hunger = 13;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int energyBar_saturation = 4;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int superFoodBar_hunger = 13;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int superFoodBar_saturation = 4;
	}
	public static class Misc {

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int chocolate_bar_hunger = 7;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public int chocolate_bar_saturation = 2;
	}

}