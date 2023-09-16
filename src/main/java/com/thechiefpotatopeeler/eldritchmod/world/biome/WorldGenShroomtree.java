package com.thechiefpotatopeeler.eldritchmod.world.biome;

import com.thechiefpotatopeeler.eldritchmod.init.BlocksRegistry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenShroomtree extends WorldGenAbstractTree {

    public WorldGenShroomtree(boolean notify) {
        super(notify);
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        worldIn.setBlockState(new BlockPos.MutableBlockPos(position).add(0,1,0), BlocksRegistry.EldritchAltar.getDefaultState());
        return false;
    }
}
