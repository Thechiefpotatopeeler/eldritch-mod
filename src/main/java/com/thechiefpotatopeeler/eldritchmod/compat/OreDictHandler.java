package com.thechiefpotatopeeler.eldritchmod.compat;

import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

    public static void registerOres(){
        OreDictionary.registerOre("scaleDragon", ItemsRegistry.DragonScale);
        OreDictionary.registerOre("fangSpider", ItemsRegistry.SpiderFang);
        OreDictionary.registerOre("bucketSemen", ItemsRegistry.SemenBucket);
    }
}
