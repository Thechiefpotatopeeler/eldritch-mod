package com.eldritchmod.handlers;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

import com.eldritchmod.data.MagicUserType;

public class MagicUserTypeHandler {
    

    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event){
        //event.player.getCapability(MagicUserTypeProvider.MAGIC_USER_TYPE_CAP, null).set(MagicUserType.MagicUserTypes.ELDRITCH_WIZARD);
    }
}