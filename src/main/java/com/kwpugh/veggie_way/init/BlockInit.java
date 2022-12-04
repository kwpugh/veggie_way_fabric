package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

public class BlockInit
{
	public static final PlantQuinoa PLANT_QUINOA = Registry.register(Registries.BLOCK, new Identifier(MOD_ID,"plant_quinoa"), new PlantQuinoa(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP)));
	public static final PlantSoybean PLANT_SOYBEAN = Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"plant_soybean"), new PlantSoybean(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP)));
	public static final PlantLentil PLANT_LENTIL = Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"plant_lentil"), new PlantLentil(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP)));
	public static final PlantCorn PLANT_CORN = Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"plant_corn"), new PlantCorn(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP)));
	public static final PlantCotton PLANT_COTTON = Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"plant_cotton"), new PlantCotton(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP)));

	public static void init()
	{
		// NO OP for now
	}
}
