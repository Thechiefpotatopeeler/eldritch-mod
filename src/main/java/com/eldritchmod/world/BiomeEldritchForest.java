package com.eldritchmod.world;

import net.minecraft.world.biome.Biome;

public class BiomeEldritchForest extends Biome {

    public BiomeEldritchForest() {
        super(new Biome.BiomeProperties("eldritch_forest")
                .setTemperature(0.8F)
                .setRainfall(0.4F)
                .setBaseHeight(0.1F)
                .setHeightVariation(0.2F)
                .setWaterColor(0x00FF00)
                .setRainDisabled()
                .setSnowEnabled());
        
    }
}
