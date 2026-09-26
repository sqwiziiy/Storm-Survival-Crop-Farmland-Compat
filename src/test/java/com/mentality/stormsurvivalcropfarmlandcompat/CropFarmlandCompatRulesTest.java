package com.mentality.stormsurvivalcropfarmlandcompat;

import net.minecraft.util.Identifier;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CropFarmlandCompatRulesTest {
    @Test
    void allowlistContainsExactlyTheTenVerifiedIds() {
        Set<Identifier> ids = CropFarmlandCompatRules.targetCropIds();

        assertEquals(10, ids.size());
        assertTrue(ids.contains(new Identifier("farm_and_charm", "barley_crop")));
        assertTrue(ids.contains(new Identifier("farm_and_charm", "strawberry_crop")));
        assertTrue(ids.contains(new Identifier("herbalbrews", "coffee_plant")));
        assertTrue(ids.contains(new Identifier("herbalbrews", "yerba_mate_plant")));
        assertFalse(ids.contains(new Identifier("farm_and_charm", "tomato_crop")));
        assertFalse(ids.contains(new Identifier("minecraft", "wheat")));
    }
}
