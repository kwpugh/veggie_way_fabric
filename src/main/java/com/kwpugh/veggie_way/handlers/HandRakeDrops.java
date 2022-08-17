package com.kwpugh.veggie_way.handlers;

import com.kwpugh.veggie_way.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HandRakeDrops
{
    public static void testForDrops(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity, ItemStack stack)
    {
        Block block = state.getBlock();
        if (!world.isClient() && state.getHardness(world,pos) != 0.0F)
        {
            if(block == Blocks.SAND)
            {
                stack.damage(1, player, (e) -> {
                    e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                });

                double r = world.random.nextDouble();
                if (r <= 0.4)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.DRYING_AGENT, 1));
                }
                else if (r > 0.4)
                {
                    //just drop the normal block, no drying agent
                }
            }

            if(block == Blocks.DIRT || block == Blocks.GRASS_BLOCK)
            {
                stack.damage(1, player, (e) -> {
                    e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                });

                double r = world.random.nextDouble();
                if (r <= 0.1)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.QUINOA_SEEDS, 1));
                }
                else if (r > 0.1 && r <= 0.2)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.SOYBEAN_SEEDS, 1));
                }
                else if (r > 0.2 && r <= 0.3)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.LENTIL_SEEDS, 1));
                }
                else if (r > 0.3 && r <= 0.4)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemInit.CORN_SEEDS, 1));
                }
                else if (r > 0.4 && r <= 0.5)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.CARROT, 1));
                }
                else if (r > 0.5 && r <= 0.6)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.BEETROOT_SEEDS, 1));
                }
                else if (r > 0.6 && r <= 0.7)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.POTATO, 1));
                }
                else if (r > 0.7)
                {
                    //Nothing right now
                }
            }

            if(block == Blocks.MYCELIUM || block == Blocks.PODZOL)
            {
                stack.damage(1, player, (e) -> {
                    e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                });

                double r = world.random.nextDouble();
                if (r <= 0.4)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.BROWN_MUSHROOM, 1));
                }
                else if (r > 0.4 && r <= 0.8)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.RED_MUSHROOM, 1));
                }
                else if (r > 0.8)
                {
                    //Nothing right now
                }
            }

            if(block == Blocks.GRAVEL)
            {
                stack.damage(1, player, (e) -> {
                    e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                });

                double r = world.random.nextDouble();
                if (r <= 0.4)
                {
                    ItemScatterer.spawn(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(Items.BONE_MEAL, 1));
                }
                else if (r > 0.4)
                {
                    //Nothing right now
                }
            }
        }
    }
}