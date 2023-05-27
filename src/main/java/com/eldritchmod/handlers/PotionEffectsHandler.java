package com.eldritchmod.handlers;

import com.eldritchmod.init.PotionRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@Mod.EventBusSubscriber
public class PotionEffectsHandler {

    @SubscribeEvent
    public static void hallucinationIsActive(PlayerTickEvent event) {
        boolean effectActive = false;
        if (event.player.isPotionActive(PotionRegistry.HALLUCINATION_EFFECT)) effectActive = true;

        if(effectActive){

        }
    }
}
