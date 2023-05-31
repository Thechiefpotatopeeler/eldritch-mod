package com.eldritchmod.handlers;

import com.eldritchmod.entities.EntityGhust;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class InGameHandler {

    @SubscribeEvent
    public static void rightClickHandle(PlayerInteractEvent.RightClickEmpty event){
        EntityPlayer player = event.getEntityPlayer();
        if(player.getRidingEntity() instanceof EntityGhust){
            ((EntityGhust) player.getRidingEntity()).shootFireBall();
        }
    }

}
