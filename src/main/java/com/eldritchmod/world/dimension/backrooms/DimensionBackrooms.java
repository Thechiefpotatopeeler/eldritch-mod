package com.eldritchmod.world.dimension.backrooms;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionBackrooms extends WorldProvider{

    public DimensionBackrooms() {
    }
    
    @Override
    public DimensionType getDimensionType() {
        return null;
    }
    
    @Override
    public IChunkGenerator createChunkGenerator() {
        return null;
    }
    @Override
    public boolean canRespawnHere() {
        return false;
    }
    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
