package com.eldritchmod.world.dimension.backrooms;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

import com.eldritchmod.init.BiomeRegistry;
import com.eldritchmod.init.DimensionRegistry;

public class DimensionBackrooms extends WorldProvider{

    public DimensionBackrooms() {
        this.biomeProvider = new BiomeProviderSingle(BiomeRegistry.BACKROOMS);
    }
    
    @Override
    public DimensionType getDimensionType() {
        return DimensionRegistry.BACKROOMS;
    }
    
    @Override
    public IChunkGenerator createChunkGenerator() {
        //return new ChunkGeneratorBackrooms();
        return null;
    }
    @Override
    public boolean canRespawnHere() {
        return true;
    }
    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
