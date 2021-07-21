package com.kwpugh.veggie_way.mixin;

import com.kwpugh.veggie_way.util.DryingAgentFromSandTorch;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FallingBlockEntity.class)
public abstract class FallingBlockEntityMixin extends Entity
{
    private FallingBlockEntityMixin(EntityType<?> entityType_1, World world_1)
    {
        super(entityType_1, world_1);
    }

    @Inject(method = "onDestroyedOnLanding", at = @At("TAIL"))
    public void onDestroyedOnLanding(Block block, BlockPos pos, CallbackInfo ci)
    {
        DryingAgentFromSandTorch.sandOnTorch(world, block, pos);
    }
}