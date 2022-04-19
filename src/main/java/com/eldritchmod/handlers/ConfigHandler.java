package com.eldritchmod.handlers;

import java.io.File;

import com.eldritchmod.Main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

    public static Configuration config;

    public static boolean enableMana = true;
    public static boolean enableManaOverlay = true;
    public static int maximumMana = 250;

    public static void init(File file) {
        config = new Configuration(file);

        String category;

        category = "Mana"; //This section is for the mana system
        config.addCustomCategoryComment(category, "Adjust the information for the mana system."); 
        enableMana = config.getBoolean("Enable Mana", category, true, "Set to false to disable the mana system."); //This dictates whether mana is enabled, however this may be removed in favour of a gamerule
        enableManaOverlay = config.getBoolean("Enable Mana Overlay", category, true, "Set to false to disable the mana overlay."); //This dictates whether the mana will be displayed on the player's HUD

        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory()+"/eldritchmod");
        Main.config.mkdirs();
        init(new File(Main.config.getPath(), "eldritchmod.cfg"));
    }
}