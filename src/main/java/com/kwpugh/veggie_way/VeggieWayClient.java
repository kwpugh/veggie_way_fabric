package com.kwpugh.veggie_way;

import com.kwpugh.veggie_way.util.BlockRenders;

import net.fabricmc.api.ClientModInitializer;

public class VeggieWayClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
    	BlockRenders.defineRenders();
    }
}
