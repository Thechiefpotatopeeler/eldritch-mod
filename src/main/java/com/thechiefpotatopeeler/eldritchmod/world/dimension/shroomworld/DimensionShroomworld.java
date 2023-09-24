package com.thechiefpotatopeeler.eldritchmod.world.dimension.shroomworld;

import com.thechiefpotatopeeler.eldritchmod.init.BiomeRegistry;
import com.thechiefpotatopeeler.eldritchmod.init.DimensionRegistry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionShroomworld extends WorldProvider {

    public DimensionShroomworld() {
        this.biomeProvider = new BiomeProviderSingle(BiomeRegistry.SHROOMLAND);
    }
    @Override
    public DimensionType getDimensionType() {
        return DimensionRegistry.SHROOMWORLD;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorShroomworld(world, true, world.getSeed());
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
