package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.init.SoundRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber
public class MenuHandler {

    @SubscribeEvent
    public void onMenuOpen(GuiOpenEvent event) {
        if (event.getGui() instanceof GuiMainMenu) {
            SoundHandler soundHandler = Minecraft.getMinecraft().getSoundHandler();
            soundHandler.stopSounds();
            soundHandler.playSound(new PositionedSoundRecord(new ResourceLocation("eldritch:music.toadstools_and_roadrules_thomas_jackson"), SoundCategory.MUSIC,1.0F, 1.0F, false, 0, ISound.AttenuationType.NONE,0.0F, 0.0F, 0.0F));
        }
    }
}
