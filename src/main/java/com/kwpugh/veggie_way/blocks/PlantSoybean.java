package com.kwpugh.veggie_way.blocks;

import com.kwpugh.veggie_way.init.ItemInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

import java.util.List;

public class PlantSoybean extends CropBlock
{ 
    public PlantSoybean(Settings builder)
    {
        super(builder);
    }
    
    @Environment(EnvType.CLIENT)
    protected ItemConvertible getSeedsItem()
    {
        return ItemInit.SOYBEAN_SEEDS;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, BlockView view, List<Text> tooltip, TooltipContext options) 
    {
        super.appendTooltip(stack, view, tooltip, options);
        tooltip.add((new TranslatableText("block.veggie_way.soybean_plant").formatted(Formatting.GREEN)));
    }
}