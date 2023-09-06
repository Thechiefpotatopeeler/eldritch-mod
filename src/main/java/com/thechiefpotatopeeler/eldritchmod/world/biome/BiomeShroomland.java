package com.thechiefpotatopeeler.eldritchmod.world.biome;

import com.thechiefpotatopeeler.eldritchmod.init.BlocksRegistry;
import net.minecraft.world.biome.Biome;

public class BiomeShroomland extends Biome {

    public BiomeShroomland() {
        super(new BiomeProperties("shroomland").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(3093151));
        this.topBlock = BlocksRegistry.MAGIC_MYCELIUM.getDefaultState();
    }
}
