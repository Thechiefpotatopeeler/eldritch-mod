package com.thechiefpotatopeeler.eldritchmod.init;

import com.thechiefpotatopeeler.eldritchmod.handlers.ConfigHandler;
import com.thechiefpotatopeeler.eldritchmod.world.dimension.shroomworld.DimensionShroomworld;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
    
    public static final DimensionType SHROOMWORLD = DimensionType.register("Shroomworld", "_shroomworld", ConfigHandler.dimensionShroomworldID, DimensionShroomworld.class, false);
    public static void registerDimensions() {
        DimensionManager.registerDimension(ConfigHandler.dimensionShroomworldID, SHROOMWORLD);
    }
}
