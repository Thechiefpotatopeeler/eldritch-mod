package com.thechiefpotatopeeler.eldritchmod.world.biome;

import com.thechiefpotatopeeler.eldritchmod.init.BlocksRegistry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeShroomland extends Biome {

    public BiomeShroomland() {
        super(new BiomeProperties("shroomland").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(3093151));
        this.topBlock = BlocksRegistry.MYCELIC_GRASS.getDefaultState();
        this.configBiomeDecorator();
    }

    public void configBiomeDecorator(){
        this.decorator.treesPerChunk = 4;
        this.decorator.flowersPerChunk = 2;
        this.decorator.bigMushroomsPerChunk = 1;
        this.decorator.generateFalls = false;
        this.decorator.bigMushroomGen = new WorldGenBigMushroomExtraSubstrates();
    }
    @Override
    public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
        return new WorldGenShroomtree(false);
    }
}
