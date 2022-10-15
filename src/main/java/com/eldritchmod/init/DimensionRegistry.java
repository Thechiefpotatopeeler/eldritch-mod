package com.eldritchmod.init;

import com.eldritchmod.Ref;
import com.eldritchmod.world.dimension.backrooms.DimensionBackrooms;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
    
    public static final DimensionType BACKROOMS = DimensionType.register("Backrooms", "_backrooms", Ref.BACKROOMS, DimensionBackrooms.class, false);

    public static void registerDimensions() {
        DimensionManager.registerDimension(Ref.BACKROOMS, BACKROOMS);
    }
}
