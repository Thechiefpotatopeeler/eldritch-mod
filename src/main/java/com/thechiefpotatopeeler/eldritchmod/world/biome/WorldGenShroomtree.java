package com.thechiefpotatopeeler.eldritchmod.world.biome;

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
        return false;
    }
}
