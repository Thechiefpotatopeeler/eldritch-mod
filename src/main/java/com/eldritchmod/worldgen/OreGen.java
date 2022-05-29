package com.eldritchmod.worldgen;

import java.util.Random;

import akka.japi.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
            IChunkProvider chunkProvider) {
                switch(world.provider.getDimension()) {
                    case -1:
                    break;
                    case 0: //Overworld
                }
    }

    private void runGenerator(IBlockState blockToGen, int blockMeta, int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random random, int chunkX, int chunkZ) {
        if (minHeight < 0 || maxHeight > 256) {
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
        }
    
    }
}