package com.eldritchmod.proxy;

import com.eldritchmod.data.Mana;
import com.eldritchmod.data.ManaStorage;
import com.eldritchmod.handlers.CapabilityHandler;
import com.eldritchmod.data.IMana;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Server side proxy
 * @author ezric
 *
 */

@Mod.EventBusSubscriber
public class CommonProxy {

	public void registerItemRenderer(Item item, int creativeTabValue, String name) {
	}
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(CapabilityHandler.instance)
	}
}
