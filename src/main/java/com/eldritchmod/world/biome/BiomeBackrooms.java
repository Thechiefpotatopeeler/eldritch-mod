package com.eldritchmod.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeBackrooms extends Biome {

    public BiomeBackrooms() {
        super(new BiomeProperties("Backrooms").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setRainDisabled());
    }
    
}
