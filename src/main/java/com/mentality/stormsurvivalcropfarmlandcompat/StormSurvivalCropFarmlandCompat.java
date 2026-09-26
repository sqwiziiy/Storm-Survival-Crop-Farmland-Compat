package com.mentality.stormsurvivalcropfarmlandcompat;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class StormSurvivalCropFarmlandCompat implements ModInitializer {
    public static final String MOD_ID = "storm_survival_crop_farmland_compat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loaded targeted CropBlock farmland compatibility");
    }
}
