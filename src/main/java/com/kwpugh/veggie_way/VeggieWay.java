package com.kwpugh.veggie_way;

import com.kwpugh.veggie_way.config.ModConfig;
import com.kwpugh.veggie_way.handlers.EventHandler;
import com.kwpugh.veggie_way.init.BlockInit;
import com.kwpugh.veggie_way.init.Compostables;
import com.kwpugh.veggie_way.init.ItemInit;
import com.kwpugh.veggie_way.init.LootInit;
import com.kwpugh.veggie_way.util.VeggieWayGroup;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VeggieWay implements ModInitializer 
{
    public static Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "veggie_way";
    public static final String MOD_NAME = "The Veggie Way";
    public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
    public static void log(Level level, String message)
    {
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

    @Override
    public void onInitialize()
    {
        log(Level.INFO, " VeggieWay Initializing");
        BlockInit.init();
        ItemInit.init();
        VeggieWayGroup.addGroup();
        Compostables.init();
        LootInit.init();
        PlayerBlockBreakEvents.AFTER.register(EventHandler::onBlockBreak);
    }
}