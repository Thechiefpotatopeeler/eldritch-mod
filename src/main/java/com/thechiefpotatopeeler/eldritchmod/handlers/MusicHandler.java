package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.init.SoundRegistry;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber
public class MusicHandler {
    @SubscribeEvent
    public void onPlayerJoins(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (event.player.dimension == ConfigHandler.dimensionShroomworldID) Minecraft.getMinecraft().player.playSound(SoundRegistry.MUSHROOM_DIMENSION_MUSIC, 1.0F, 1.0F);

    }
}
