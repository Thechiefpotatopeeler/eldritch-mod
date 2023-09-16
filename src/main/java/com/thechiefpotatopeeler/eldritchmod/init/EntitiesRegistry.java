package com.thechiefpotatopeeler.eldritchmod.init;

import com.thechiefpotatopeeler.eldritchmod.Main;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.*;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.dwarf.EntityDwarf;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityPoobloom;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityRedMoobloom;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityYellowMoobloom;
import com.thechiefpotatopeeler.eldritchmod.handlers.ConfigHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitiesRegistry { //This registers the entities, but doesn't actually create them.

    public static void registerEntities() {
        registerEntity("matriarch", EntitySpiderMatriarch.class, ConfigHandler.entityMatriarchID, 30, 3680599, 3120182);
        registerEntity("yellowMoobloom", EntityYellowMoobloom.class, ConfigHandler.entityYellowMoobloomID, 30, 16724787, 16645526);
        registerEntity("redMoobloom", EntityRedMoobloom.class, ConfigHandler.entityRedMoobloomID, 30, 16724787, 16645526);
        registerEntity("poobloom", EntityPoobloom.class, ConfigHandler.entityPoobloomID, 30);
        registerEntity("barnacle", EntityBarnacle.class, ConfigHandler.entityBarnacleID, 30);
        registerEntity("dwarf", EntityDwarf.class, ConfigHandler.entityDwarfID, 30, 6109210, 4145215);
        registerEntity("crocodemon", EntityCrocodemon.class, ConfigHandler.entityCrocodemonID, 30, 3120182, 12044);
        registerEntity("hatchable_egg", EntityHatchableEgg.class, ConfigHandler.entityHatchableEggID, 30);
        registerEntity("ghust", EntityGhust.class, ConfigHandler.entityGhustID, 30, 0x00FF00, 0x00FF00);
        registerEntity("thundercock", EntityThundercock.class, ConfigHandler.entityThunderCockID, 30, 10592673, 2783956);
        registerEntity("batRuby", EntityBatRuby.class, ConfigHandler.entityBatRubyID, 30, 6097672, 1051417);
    } //It seems a bit over the top to have two of them, but it makes things a bit easier to use/read.

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int c1, int c2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID, name), entity, name, id, Main.instance, range, 1, true, c1, c2);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range){
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID, name), entity, name, id, Main.instance, range, 1, true);
    }
}