package com.eldritchmod.compat;

import com.eldritchmod.init.ItemsRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

    public static void registerOres(){
        OreDictionary.registerOre("scaleDragon", ItemsRegistry.DragonScale);
    }
}
