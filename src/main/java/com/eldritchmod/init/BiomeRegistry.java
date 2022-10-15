package com.eldritchmod.init;

import com.eldritchmod.world.biome.BiomeBackrooms;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeRegistry {

    //public static final Biome ELDRITCH_FOREST = new BiomeEldritchForest();
    public static final Biome BACKROOMS = new BiomeBackrooms();
    
    public static void registerBiomes() {
        //biomeInit(new BiomeEldritchForest(), "eldritch_forest", BiomeType.WARM, Type.FOREST, Type.HILLS, Type.MAGICAL, Type.DENSE);
        biomeInit(BACKROOMS, "backrooms", BiomeType.WARM, Type.SPOOKY, Type.DRY);
    }

    private static Biome biomeInit(Biome biome, String name, BiomeType biomeType, Type... type){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, type);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}