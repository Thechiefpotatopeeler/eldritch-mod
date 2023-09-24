package com.thechiefpotatopeeler.eldritchmod.handlers;

import java.io.File;

import com.thechiefpotatopeeler.eldritchmod.Main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

    public static Configuration config;

    //Mana
    public static boolean enableMana = true;
    public static boolean enableManaOverlay = true;
    public static int entityMatriarchID = 120;
    public static int entityYellowMoobloomID = 121;

    //Entity IDs

    public static final int MIN_ENTITY_ID = 120;
    public static final int MAX_ENTITY_ID = 999;
    public static int entityRedMoobloomID = 122;
    public static int entityPoobloomID = 123;
    public static int entityBarnacleID = 124;
    public static int entityDwarfID = 125;
    public static int entityCrocodemonID = 126;
    public static int entityHatchableEggID = 127;
    public static int entityGhustID = 128;
    public static int entityThunderCockID = 129;
    public static int entityBatRubyID = 1076;

    public static int dimensionShroomworldID = 2;


    public static void init(File file) {
        config = new Configuration(file);

        String category;

        category = "Mana"; //This section is for the mana system
        config.addCustomCategoryComment(category, "Adjust the information for the mana system."); 
        enableMana = config.getBoolean("Enable Mana", category, true, "Set to false to disable the mana system."); //This dictates whether mana is enabled, however this may be removed in favour of a gamerule
        enableManaOverlay = config.getBoolean("Enable Mana Overlay", category, true, "Set to false to disable the mana overlay."); //This dictates whether the mana will be displayed on the player's HUD

        category = "Enity IDs";
        config.addCustomCategoryComment(category, "Adjust the entity IDs for the mod.");
        entityMatriarchID = config.getInt("Matriarch ID", category, 120, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Matriarch entity.");
        entityYellowMoobloomID = config.getInt("Yellow Moobloom ID", category, 121, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Yellow Moobloom entity.");
        entityRedMoobloomID = config.getInt("Red Moobloom ID", category, 122, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Red Moobloom entity.");
        entityPoobloomID = config.getInt("Poobloom ID", category, 123, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Poobloom entity.");
        entityBarnacleID = config.getInt("Barnacle ID", category, 124, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Barnacle entity.");
        entityDwarfID = config.getInt("Dwarf ID", category, 125, MIN_ENTITY_ID, MAX_ENTITY_ID,"Set the ID for the Dwarf entity.");
        entityCrocodemonID = config.getInt("Crocodemon ID", category, 126, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Crocodemon entity.");
        entityHatchableEggID = config.getInt("Hatchable Egg ID", category, 127, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Hatchable Egg entity.");
        entityGhustID = config.getInt("Ghust ID", category, 128, MIN_ENTITY_ID, MAX_ENTITY_ID,"Set the ID for the Ghust entity.");
        entityThunderCockID = config.getInt("Thundercock ID", category, 129, MIN_ENTITY_ID, MAX_ENTITY_ID, "Set the ID for the Thundercock entity.");

        category = "Dimension IDs";
        config.addCustomCategoryComment(category, "Adjust the dimension IDs for the mod.");
        dimensionShroomworldID = config.getInt("Shroomworld ID", category, 2, 2, 999, "Set the ID for the Shroomworld dimension.");

        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory()+"/eldritchmod");
        Main.config.mkdirs();
        init(new File(Main.config.getPath(), "eldritchmod.cfg"));
    }
}