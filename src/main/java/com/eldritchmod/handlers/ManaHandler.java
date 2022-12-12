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
        switch (mana.getMagicType()) {
            case ELDRITCH_SORCERER:
                mana.set(150);
                break;
            case LIFE_GIVER:
                mana.set(150);
                break;
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
        mana.set(100);
        System.out.println("Player mana: " + mana.getMana());
        System.out.println(player);
        
        player.sendMessage(new TextComponentString("Your mana is: " + mana.getMana() + " and your magic type is: " + mana.getMagicType()));
    }
}