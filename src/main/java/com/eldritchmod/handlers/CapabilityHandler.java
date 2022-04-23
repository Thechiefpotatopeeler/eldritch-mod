package com.eldritchmod.handlers;

import com.eldritchmod.Main;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Capability handler
 * 
 * This class is responsible for attaching our capabilities
 */
public class CapabilityHandler{
   public static final ResourceLocation MANA_CAP = new ResourceLocation(Main.MOD_ID, "mana");
    
    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) { 
            event.addCapability(MANA_CAP, new ManaProvider());
            System.out.println("attached mana capability");
        }

    }
}