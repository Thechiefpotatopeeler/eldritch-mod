package com.thechiefpotatopeeler.eldritchmod.init;

import com.thechiefpotatopeeler.eldritchmod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundRegistry {

    public static SoundEvent MUSHROOM_DIMENSION_MUSIC;

    public static void init() {
        MUSHROOM_DIMENSION_MUSIC = registerSound("music.toadstools_and_roadrules_thomas_jackson");
    }
    private static SoundEvent registerSound(String name) {
        SoundEvent sound = new SoundEvent(new ResourceLocation(Main.MOD_ID, name)).setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(sound);
        return sound;
    }
}
