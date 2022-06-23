package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootInit
{
	static boolean dryingAgentDrop = VeggieWay.CONFIG.GENERAL.dryingAgentDropFromSandEasy;
	static boolean seedsFromGrass = VeggieWay.CONFIG.GENERAL.seedsFromGrassEasy;
	static float quinooa = VeggieWay.CONFIG.GENERAL.quionaFromGrass;
	static float soybean = VeggieWay.CONFIG.GENERAL.soybeanFromGrass;
	static float lentil = VeggieWay.CONFIG.GENERAL.lentilFromGrass;
	static float corn = VeggieWay.CONFIG.GENERAL.cornFromGrass;
	static float cotton = VeggieWay.CONFIG.GENERAL.cottonFromGrass;
	static float dryingagent = VeggieWay.CONFIG.GENERAL.dryingAgentFromSand;

	public static void init()
	{
		if(seedsFromGrass)
		{
			LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
				if (Blocks.GRASS.getLootTableId().equals(id))
				{
					if (source != LootTableSource.VANILLA)
					{
						throw new AssertionError("grass loot table should have LootTableSource.VANILLA");
					}

					LootPool QUINOA_SEEDS = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.QUINOA_SEEDS).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(quinooa).build())
							.build();

					tableBuilder.pool(QUINOA_SEEDS);

					LootPool SOYBEAN_SEEDS = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.SOYBEAN_SEEDS).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(soybean).build())
							.build();

					tableBuilder.pool(SOYBEAN_SEEDS);

					LootPool LENTIL_SEEDS = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.LENTIL_SEEDS).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(lentil).build())
							.build();

					tableBuilder.pool(LENTIL_SEEDS);

					LootPool CORN_SEEDS = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.CORN_SEEDS).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(corn).build())
							.build();

					tableBuilder.pool(CORN_SEEDS);

					LootPool COTTON_SEEDS = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.COTTON_SEEDS).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(cotton).build())
							.build();

					tableBuilder.pool(COTTON_SEEDS);
				}

			});
		}

		if(dryingAgentDrop)
		{
			LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
				if (Blocks.SAND.getLootTableId().equals(id))
				{
					if (source != LootTableSource.VANILLA)
					{
						throw new AssertionError("sand loot table should have LootTableSource.VANILLA");
					}

					LootPool DRYING_AGENT = LootPool.builder()
							.with(ItemEntry.builder(ItemInit.DRYING_AGENT).build())
							.rolls(ConstantLootNumberProvider.create(1))
							.conditionally(RandomChanceLootCondition.builder(dryingagent).build())
							.build();

					tableBuilder.pool(DRYING_AGENT);
				}
			});
		}
	}
}