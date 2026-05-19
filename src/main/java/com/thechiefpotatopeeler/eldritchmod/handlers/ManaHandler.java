package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.data.IMana;

import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import com.thechiefpotatopeeler.eldritchmod.data.Mana;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.ArrayList;

@EventBusSubscriber
public class ManaHandler {

    private final ArrayList<PlayerManaTracker> manaTrackers;
    public ManaHandler() {
        manaTrackers = new ArrayList<PlayerManaTracker>();
    }
    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event) {
        EntityPlayer player = event.player.getServer().getPlayerList().getPlayerByUUID(event.player.getUniqueID());
        playerEventCaps(player);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        EntityPlayer player = event.player;
        playerEventCaps(player);
    }

    @SubscribeEvent
    public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        EntityPlayer player = event.player;
        playerEventCaps(player);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent event) {
        if (event.phase != TickEvent.Phase.END || !(event instanceof TickEvent.PlayerTickEvent)) {
            return;
        }
        manaTrackers.forEach(PlayerManaTracker::regenMana);
    }

    private void playerEventCaps(EntityPlayer player){
        if(player.world.isRemote || !ConfigHandler.enableMana) return;

        updateManaTracker(player);

        IMana mana = player.getCapability(ManaProvider.MANA_CAP, null);
        switch (mana.getMagicType()) {
            case ELDRITCH_SORCERER:
            case LIFE_GIVER:
            case NECROMANCER:
                mana.setMaxMana(150);
                break;
            case NONE:
                mana.setMaxMana(0);
                break;
            default:
                mana.setMaxMana(100);
                break;
        }
        player.sendMessage(new TextComponentString("Your mana is: " + mana.getMana() + " and your magic type is: " + mana.getMagicType()));
    }

    public void updateManaTracker(EntityPlayer player) {
        if (player.world.isRemote || !ConfigHandler.enableMana) {
            return;
        }

        if (manaTrackers.stream().noneMatch(tracker -> tracker.getPlayer().getUniqueID().equals(player.getUniqueID()))) {
            manaTrackers.add(new PlayerManaTracker(player));
        }
    }
}