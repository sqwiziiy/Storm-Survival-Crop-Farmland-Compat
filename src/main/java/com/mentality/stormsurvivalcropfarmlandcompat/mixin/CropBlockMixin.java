package com.mentality.stormsurvivalcropfarmlandcompat.mixin;

import com.mentality.stormsurvivalcropfarmlandcompat.CropFarmlandCompatRules;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CropBlock.class)
abstract class CropBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void stormSurvival$allowTargetCropSoil(BlockState floor, BlockView world, BlockPos pos,
                                                    CallbackInfoReturnable<Boolean> cir) {
        if (CropFarmlandCompatRules.isTargetCrop((Block) (Object) this)
                && CropFarmlandCompatRules.isCompatibleFarmland(floor)) {
            cir.setReturnValue(true);
        }
    }

    /**
     * Vanilla's moisture calculation recognizes farmland by identity. Redirect only that
     * identity test, and only while calculating one of the explicitly targeted crops.
     * This preserves vanilla's hydrated farmland weighting (the following MOISTURE read
     * remains unchanged) and leaves Farm & Charm's own fertilized-soil hook in control.
     */
    @Redirect(method = "getAvailableMoisture",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    private static boolean stormSurvival$recognizeRuFarmland(BlockState state, Block block) {
        return state.isOf(block)
                || (block == Blocks.FARMLAND && CropFarmlandCompatRules.isRuFarmland(state));
    }
}
