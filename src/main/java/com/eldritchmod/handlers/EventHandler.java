package com.eldritchmod.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventHandler {
    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event) {
        
        EntityPlayer player = event.player;
        IMana mana = player.getCapability(ManaProvider.MANA_CAP, null);
        
        String message = String.format("Hello there, you have §7%d§r mana left.", (int) mana.getMana());
        player.sendMessage(new TextComponentString(message));
    }

    @SubscribeEvent
    public void onPlayerSleep(PlayerSleepInBedEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        
        if (player.world.isRemote)
        return;
        
        IMana mana = player.getCapability(ManaProvider.MANA_CAP, null);
        
        mana.fill(50);

        String message = String.format("You refreshed yourself in the bed. You received 50 mana, you have §7%d§r mana left.",
                (int) mana.getMana());
        player.sendMessage(new TextComponentString(message));
    }
}