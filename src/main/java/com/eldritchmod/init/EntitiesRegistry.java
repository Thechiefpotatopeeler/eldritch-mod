package com.eldritchmod.init;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;
import com.eldritchmod.entities.EntitySpiderMatriarch;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitiesRegistry { //This registers the entities, but doesn't actually create them.

    public static void registerEntities() {
        registerEntity("matriarch", EntitySpiderMatriarch.class, Ref.ENTITY_MATRIARCH, 30, 3120182, 3680599);
    } //It seems a bit over the top to have two of them, but it makes things a bit easier to use/read.

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int c1, int c2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID, name), entity, name, id, Main.main, range, 1, true, c1, c2);
    }
}