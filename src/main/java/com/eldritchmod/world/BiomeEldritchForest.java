package com.eldritchmod.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

import net.minecraft.init.Blocks;
public class BiomeEldritchForest extends Biome {

    protected static final WorldGenAbstractTree TREE = new WorldGenEldritchTree();

    public BiomeEldritchForest() {
        super(new Biome.BiomeProperties("eldritch_forest")
                .setTemperature(0.8F)
                .setRainfall(0.4F)
                .setBaseHeight(0.1F)
                .setHeightVariation(0.2F)
                .setWaterColor(0x5523de)
                .setRainDisabled());
            topBlock = Blocks.GRASS.getDefaultState();
            fillerBlock = Blocks.DIRT.getDefaultState();

            this.decorator.treesPerChunk = 2;
    }

    @Override
    public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
        return TREE;
    }
}
