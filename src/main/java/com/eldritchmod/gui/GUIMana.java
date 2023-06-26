package com.eldritchmod.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUIMana extends GuiScreen {

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        drawHoveringText("Mana", 50, 50);
    }
}
