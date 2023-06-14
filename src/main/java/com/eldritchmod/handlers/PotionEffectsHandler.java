package com.eldritchmod.handlers;

import com.eldritchmod.init.PotionRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber
public class PotionEffectsHandler {

    @SubscribeEvent
    public static void hallucinationIsActive(PlayerTickEvent event) {
        boolean effectActive = false;
        if (event.player.isPotionActive(PotionRegistry.HALLUCINATION_EFFECT)) effectActive = true;

        if(effectActive){
            //Minecraft.getMinecraft().player.timeInPortal = 1;
            event.player.sendMessage(new TextComponentString("You are hallucinating! The effect is WIP!"));
        }
    }
}
