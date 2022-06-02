package com.eldritchmod.handlers;

import com.eldritchmod.data.IMana;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OverlayHandler extends Gui {
    private static final ResourceLocation bar = new ResourceLocation("eldritch_mod", "textures/mana_bar.png");
    private int tex_width = 5, tex_height = 100;

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event){
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT){
            Minecraft mc = Minecraft.getMinecraft();
            mc.renderEngine.bindTexture(bar);
            IMana mana = mc.player.getCapability(ManaProvider.MANA_CAP, null); //Gets the mana
            //System.out.println("Player mana:dsssssssssssssfedfewefwewewdwefdfsapoo " + mana.getMana()); //Prints the mana
            drawTexturedModalRect(0,0,0,0,tex_width,tex_height); //The first drawing of the bar
            drawTexturedModalRect(0,0,tex_width,0,tex_width,mana.getMana()); //The second drawing of the bar
        }
    }
}