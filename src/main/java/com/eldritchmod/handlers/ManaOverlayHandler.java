package com.eldritchmod.handlers;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.eldritchmod.Main;
import com.eldritchmod.data.IMana;

public class ManaOverlayHandler extends Gui {

    private final ResourceLocation manaBar = new ResourceLocation("eldritch_mod", "textures/gui/mana_bar.png");
    private int tex_width = 5, tex_height = 100;

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event){
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT){
            Minecraft mc = Minecraft.getMinecraft();
            mc.renderEngine.bindTexture(manaBar);
            IMana mana = mc.player.getCapability(ManaProvider.MANA_CAP, null); //Gets the mana
            //float barUnit = (float) bar_width / (float) IMana.MAXIMUM_MANA; //Calculates the width of the bar
            //int currentWidth = (int) barUnit * mana.getMana();
            drawTexturedModalRect(0,0,0,0,tex_width,tex_height); //The first drawing of the bar
        }
    }
    
}