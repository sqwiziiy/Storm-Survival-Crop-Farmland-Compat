package com.mentality.stormsurvivalcropfarmlandcompat.mixin;

import com.mentality.stormsurvivalcropfarmlandcompat.CropFarmlandCompatRules;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Extends tomato's hard-coded soil predicate without changing its rope/body rules. */
@Mixin(targets = "net.satisfy.farm_and_charm.core.block.crops.TomatoCropBlock", remap = false)
@Pseudo
abstract class TomatoCropBlockMixin {
    @Inject(method = "mayPlaceOn", at = @At("RETURN"), cancellable = true)
    private void stormSurvival$allowRuFarmland(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (CropFarmlandCompatRules.isRuFarmland(state)) {
            cir.setReturnValue(true);
        }
    }
}
