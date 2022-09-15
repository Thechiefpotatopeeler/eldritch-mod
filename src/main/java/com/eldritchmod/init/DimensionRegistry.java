package com.eldritchmod.init;

import com.eldritchmod.Ref;
import com.eldritchmod.world.dimension.backrooms.DimensionBackrooms;

import net.minecraft.world.DimensionType;

public class DimensionRegistry {
    
    public static final DimensionType BACKROOMS = DimensionType.register("Backrooms", "_backrooms", Ref.BACKROOMS, DimensionBackrooms.class, false);

    public static void registerDimensions() {
        DimensionType.registerDimension(Ref.BACKROOMS, BACKROOMS);
    }
}
