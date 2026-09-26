package com.mentality.stormsurvivalcropfarmlandcompat;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Set;

/** Pure registry-ID policy; intentionally has no references to third-party Java classes. */
public final class CropFarmlandCompatRules {
    private static final Set<Identifier> TARGET_CROPS = Set.of(
            id("farm_and_charm", "barley_crop"),
            id("farm_and_charm", "corn_crop"),
            id("farm_and_charm", "lettuce_crop"),
            id("farm_and_charm", "oat_crop"),
            id("farm_and_charm", "onion_crop"),
            id("farm_and_charm", "strawberry_crop"),
            id("herbalbrews", "coffee_plant"),
            id("herbalbrews", "rooibos_plant"),
            id("herbalbrews", "tea_plant"),
            id("herbalbrews", "yerba_mate_plant")
    );

    private CropFarmlandCompatRules() {}

    private static Identifier id(String namespace, String path) {
        return new Identifier(namespace, path);
    }

    public static boolean isTargetCrop(Block crop) {
        return TARGET_CROPS.contains(Registries.BLOCK.getId(crop));
    }

    public static boolean isCompatibleFarmland(BlockState state) {
        Identifier id = Registries.BLOCK.getId(state.getBlock());
        return id.equals(id("minecraft", "farmland"))
                || id.equals(id("farm_and_charm", "fertilized_farmland"))
                || id.equals(id("regions_unexplored", "peat_farmland"))
                || id.equals(id("regions_unexplored", "silt_farmland"));
    }

    public static boolean isRuFarmland(BlockState state) {
        Identifier id = Registries.BLOCK.getId(state.getBlock());
        return id.equals(id("regions_unexplored", "peat_farmland"))
                || id.equals(id("regions_unexplored", "silt_farmland"));
    }

    public static Set<Identifier> targetCropIds() {
        return TARGET_CROPS;
    }
}
