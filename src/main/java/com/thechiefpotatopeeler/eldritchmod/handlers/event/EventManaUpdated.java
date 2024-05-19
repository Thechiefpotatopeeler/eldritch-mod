package com.thechiefpotatopeeler.eldritchmod.handlers.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.Event;

public class EventManaUpdated extends Event {

    public EntityPlayer player;

    public EventManaUpdated(EntityPlayer player) {
        this.player = player;
    }

    public EntityPlayerMP getMpPlayer(){
        return player.getServer().getPlayerList().getPlayerByUUID(player.getUniqueID());
    }
}
