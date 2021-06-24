package com.kwpugh.veggie_way;

import com.kwpugh.veggie_way.config.ModConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kwpugh.veggie_way.init.BlockInit;
import com.kwpugh.veggie_way.init.Compostables;
import com.kwpugh.veggie_way.init.ItemInit;
import com.kwpugh.veggie_way.init.LootInit;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class VeggieWay implements ModInitializer 
{
    public static final VeggieWay INSTANCE = new VeggieWay();
    public static Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "veggie_way";
    public static final String MOD_NAME = "The Veggie Way";
    public static ItemGroup veggie_way = FabricItemGroupBuilder.create(new Identifier(MOD_ID,"veggie_way")).icon(()->new ItemStack(Items.CARROT)).build();
    public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    @Override
    public void onInitialize()
    {
        log(Level.INFO, " VeggieWay Initializing");
        //AutoConfig.register(VeggieWayConfig.class, GsonConfigSerializer::new);
        BlockInit.init();
        ItemInit.init();
        Compostables.init();
        LootInit.init();
    }  
    
//    public static VeggieWayConfig getConfig()
//    {
//        return AutoConfig.getConfigHolder(VeggieWayConfig.class).getConfig();
//    }
    
    public static void log(Level level, String message)
    {
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}