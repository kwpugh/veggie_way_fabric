package com.kwpugh.veggie_way.util;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/*
   Works with FallingBlockEntityMixin
 */
public class DryingAgentFromSandTorch
{
    static float chance = VeggieWay.CONFIG.GENERAL.chanceSandOnTorch;

    public static void sandOnTorch(World world, Block block, BlockPos pos)
    {
        if(!world.isClient)
        {
            if(block instanceof SandBlock)
            {
                double r = world.random.nextDouble();
                if (r <= chance)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.DRYING_AGENT, 1));
                }
            }
        }
    }
}
