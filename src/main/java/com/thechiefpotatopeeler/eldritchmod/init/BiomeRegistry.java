package com.thechiefpotatopeeler.eldritchmod.init;

import com.thechiefpotatopeeler.eldritchmod.world.biome.BiomeShroomland;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeRegistry {

    //public static final Biome ELDRITCH_FOREST = new BiomeEldritchForest();
    public static final Biome SHROOMLAND = new BiomeShroomland();
    
    public static void registerBiomes() {
        biomeInit(SHROOMLAND, "shroomland", BiomeType.COOL, Type.SPOOKY, Type.WET, Type.MAGICAL);
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