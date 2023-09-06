package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.data.IMana;

import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import com.thechiefpotatopeeler.eldritchmod.data.Mana;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber
public class ManaHandler {
    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event) {
        if(!ConfigHandler.enableMana) return;
        //This code will run whenever a player logs in, then set and tell them their current mana level.
        EntityPlayer player = event.player;
        IMana mana = player.getCapability(ManaProvider.MANA_CAP, null);
        switch (mana.getMagicType()) {
            case ELDRITCH_SORCERER:
            case LIFE_GIVER:
            case NECROMANCER:
                mana.set(150);
                break;
            case NONE:
                mana.set(0);
                break;
            default:
                mana.set(100);
                break;
            }
        //System.out.println("Player mana: " + mana.getMana());
        //System.out.println(player);
        
        player.sendMessage(new TextComponentString("Your mana is: " + mana.getMana() + " and your magic type is: " + mana.getMagicType()));
    }
}