package com.eldritchmod.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

import com.eldritchmod.data.IMagicUserType;
import com.eldritchmod.data.MagicUserType;

public class MagicUserTypeHandler {
    

    @SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event){
        EntityPlayer player = event.player;

        IMagicUserType magicUserType = player.getCapability(MagicUserTypeProvider.MAGIC_USER_TYPE_CAP, null);

        String message = String.format("Hello there, your magic user type is §7%d§r .", (MagicUserType.MagicUserTypes) magicUserType.getType());

        //event.player.getCapability(MagicUserTypeProvider.MAGIC_USER_TYPE_CAP, null).set(MagicUserType.MagicUserTypes.ELDRITCH_WIZARD);
    }
}