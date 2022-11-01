package com.eldritchmod.handlers;

import com.eldritchmod.data.IMana;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber
public class ManaHandler {
    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event) {
        //This code will run whenever a player logs in, then set and tell them their current mana level.
        EntityPlayer player = event.player;
        IMana mana = player.getCapability(ManaProvider.MANA_CAP, null);
        mana.set(100);
        System.out.println("Player mana: " + mana.getMana());
        System.out.println(player);
        
        String message = String.format("Hello there, you have §7%d§r mana.", (int) mana.getMana());
        player.sendMessage(new TextComponentString(message));
    }
}