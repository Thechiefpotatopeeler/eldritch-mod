package com.eldritchmod.init;

import com.eldritchmod.world.BiomeEldritchForest;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeRegistry {
    
    public static void registerBiomes() {
        biomeInit(new BiomeEldritchForest(), "eldritch_forest", BiomeType.WARM, Type.FOREST, Type.HILLS, Type.MAGICAL, Type.DENSE);
    }

    public static Biome biomeInit(Biome biome, String name, BiomeType biomeType, Type... type){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        //System.out.println("Pootime, jewtime, pewtime, jikojkdfvsjkosdfejlikujikl;jfkdlepsjkil;awefr, I like big butts and I cannot lie. Jamie Masters is incredibly hot, I have a crush on him, does that make me gay? Well yes and no, you see I am both straight and gay, that is what bisexual is, it's not half and half, it's whole and whole.");
        BiomeDictionary.addTypes(biome, type);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}