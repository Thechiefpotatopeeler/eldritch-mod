package com.eldritchmod.init;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;

import com.eldritchmod.entities.entity.*;
import com.eldritchmod.entities.entity.dwarf.EntityDwarf;
import com.eldritchmod.entities.entity.moobloom.EntityPoobloom;
import com.eldritchmod.entities.entity.moobloom.EntityRedMoobloom;
import com.eldritchmod.entities.entity.moobloom.EntityYellowMoobloom;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitiesRegistry { //This registers the entities, but doesn't actually create them.

    public static void registerEntities() {
        registerEntity("matriarch", EntitySpiderMatriarch.class, Ref.ENTITY_MATRIARCH, 30, 3680599, 3120182);
        registerEntity("yellowMoobloom", EntityYellowMoobloom.class, Ref.ENTITY_YELLOW_MOOBLOOM, 30, 16724787, 16645526);
        registerEntity("redMoobloom", EntityRedMoobloom.class, Ref.ENTITY_RED_MOOBLOOM, 30, 16724787, 16645526);
        registerEntity("poobloom", EntityPoobloom.class, Ref.ENTITY_POOBLOOM, 30);
        registerEntity("barnacle", EntityBarnacle.class, Ref.ENTITY_BARNACLE, 30);
        registerEntity("dwarf", EntityDwarf.class, Ref.ENTITY_DWARF, 30, 6109210, 4145215);
        registerEntity("crocodemon", EntityCrocodemon.class, Ref.ENTITY_CROCODEMON, 30, 3120182, 12044);
        registerEntity("hatchable_egg", EntityHatchableEgg.class, Ref.ENTITY_HATCHABLE_EGG, 30);
        registerEntity("ghust", EntityGhust.class, Ref.ENTITY_GHUST, 30, 0x00FF00, 0x00FF00);
        registerEntity("thundercock", EntityThundercock.class, Ref.ENTITY_THUNDERCOCK, 30, 0x00FF00, 0x00FF00);
    } //It seems a bit over the top to have two of them, but it makes things a bit easier to use/read.

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int c1, int c2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID, name), entity, name, id, Main.main, range, 1, true, c1, c2);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range){
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID, name), entity, name, id, Main.main, range, 1, true);
    }
}