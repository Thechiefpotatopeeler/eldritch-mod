package com.eldritchmod.handlers;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.eldritchmod.Main;
import com.eldritchmod.data.IMana;

public class ManaOverlayHandler extends Gui {

    private final ResourceLocation manaBar = new ResourceLocation("eldritch_mod:textures/gui/manabar.png");
    private static final int TEX_WIDTH = 5, TEX_HEIGHT = 100;
    //Getting the location of the texture and setting the width and height of the texture.

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event){
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT){
            Minecraft mc = Minecraft.getMinecraft();
            mc.renderEngine.bindTexture(manaBar); //This stuff is about adding the texture to the screen/
            drawTexturedModalRect(0,0,0,0,TEX_WIDTH,TEX_HEIGHT); //The first drawing of the bar
        }
    }
    
}