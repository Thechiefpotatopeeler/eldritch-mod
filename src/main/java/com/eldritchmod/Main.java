package com.eldritchmod;

import com.eldritchmod.data.IMana;
import com.eldritchmod.data.Mana;
import com.eldritchmod.data.ManaStorage;
import com.eldritchmod.handlers.ConfigHandler;
import com.eldritchmod.handlers.EntityRenderHandler;
import com.eldritchmod.handlers.ManaHandler;
import com.eldritchmod.handlers.OverlayHandler;
import com.eldritchmod.handlers.PlayerRenderHandler;
import com.eldritchmod.handlers.CapabilityHandler;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.init.EntitiesRegistry;
import com.eldritchmod.init.ItemsRegistry;
import com.eldritchmod.init.PotionRegistry;
import com.eldritchmod.proxy.CommonProxy;
import com.eldritchmod.tabs.*;
import com.eldritchmod.world.OreGen;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid= Main.MOD_ID, version = Main.VERSION, name = Main.NAME, dependencies = "required-after:llibrary@[1.7.19,)" /*, updateJSON = Main.updateJSON)*/ )
public class Main {
	public static final String MOD_ID = "eldritch";
	public static final String VERSION = "1.3";
	public static final String NAME = "Eldritch mod";
	public static File config;
	//public static final String updateJSON = "";
	
	@Instance
	public static Main main;	
	
	/**
	 * must include package paths
	 */
	@SidedProxy(serverSide = "com.eldritchmod.proxy.CommonProxy", clientSide = "com.eldritchmod.proxy.ClientProxy")
	public static CommonProxy proxy; 
	
	//This adds the creative tabs into the game.
	public static final CreativeTabs eldritchmodtools = new EldritchTools("eldritchmodtools");
	public static final CreativeTabs eldritchmodmaterials = new EldritchMaterials("eldritchmodmaterials");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.registerConfig(event);	
		CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana::new);
		EntitiesRegistry.registerEntities();
		EntityRenderHandler.registerEntityRenders();
		GameRegistry.registerWorldGenerator(new OreGen(),0);
		PotionRegistry.registerPotions();
		//BiomeRegistry.registerBiomes();
		//DimensionRegistry.registerDimensions();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new ManaHandler());
		MinecraftForge.EVENT_BUS.register(new OverlayHandler());
		MinecraftForge.EVENT_BUS.register(new PlayerRenderHandler());
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
	/**
	 * This is something we need to immediately load in our event bus at mod construction time (built)
	 * @author ezric
	 *
	 */
	@EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlocksRegistry.register(event.getRegistry());
		
		}
		@SubscribeEvent
		public static void registerItem(RegistryEvent.Register<Item> event) throws Exception {
			try {
				IForgeRegistry<Item> registry = event.getRegistry();
				ItemsRegistry.register(registry);
				BlocksRegistry.registerItemBlocks(event.getRegistry());
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				String message = ex.getMessage();
				throw ex;
			}
			catch(Throwable ex) {
				String message = ex.getMessage();
				throw ex;
			}
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ItemsRegistry.registerModels();
			BlocksRegistry.registerModels();
		}
		
		
	}
}
