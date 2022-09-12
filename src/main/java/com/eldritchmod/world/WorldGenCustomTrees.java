package com.eldritchmod.world;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockGrass;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomTrees implements IWorldGenerator {
    private final WorldGenerator ELDRITCH = new WorldGenEldritchTree();

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
            IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:
                break;
            case 0:
                runGenerator(ELDRITCH, world, random, chunkX, chunkZ, 3,-1,0, BiomeEldritchForest.class);
                break;
            case 1:
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn,
    int minHeight, int maxHeight, Class<?>... classes) {
        if(chancesToSpawn < 1) {
            if(random.nextDouble() < chancesToSpawn) chancesToSpawn = 1;
            else chancesToSpawn = 0;
        }
        ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chancesToSpawn; i++) {
            BlockPos pos = new BlockPos(chunkX * 16 + random.nextInt(16), minHeight + random.nextInt(heightDiff), chunkZ * 16 + random.nextInt(16));
            Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
            if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
        }
    }
}