package com.eldritchmod.world;

import java.util.Random;

import com.eldritchmod.blocks.EuphoriumOre;
import com.eldritchmod.init.BlocksRegistry;

import akka.japi.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
            IChunkProvider chunkProvider) {
                switch(world.provider.getDimension()) {
                    case -1:
                    break;
                    case 0: //Overworld
                    runGenerator(BlocksRegistry.EuphoriumOre.getDefaultState(),3,10, 13, 30, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX,
                            chunkZ);
                }
    }

    private void runGenerator(IBlockState blockToGen, int blockAmount, int chancesToSpawn, int minHeight, int maxHeight, com.google.common.base.Predicate<IBlockState> blockToReplace, World world, Random random, int chunkX, int chunkZ) {
        if (minHeight < 0 || maxHeight > 256) {
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
        }
        WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, blockToReplace);
	int heightdiff = maxHeight - minHeight +1;
	for (int i=0; i<chancesToSpawn; i++){
		int x = chunkX * 16 +random.nextInt(16);
		int y = minHeight + random.nextInt(heightdiff);
		int z = chunkZ * 16 + random.nextInt(16);

		generator.generate(world, random, new BlockPos(x, y, z));
	}    
    }
}