package com.thechiefpotatopeeler.eldritchmod;

import com.thechiefpotatopeeler.eldritchmod.command.CommandDisplayManaBar;
import com.thechiefpotatopeeler.eldritchmod.command.CommandEnableMana;
import com.thechiefpotatopeeler.eldritchmod.data.IMana;
import com.thechiefpotatopeeler.eldritchmod.data.Mana;
import com.thechiefpotatopeeler.eldritchmod.data.ManaStorage;
import com.thechiefpotatopeeler.eldritchmod.handlers.*;
import com.thechiefpotatopeeler.eldritchmod.proxy.CommonProxy;
import com.thechiefpotatopeeler.eldritchmod.world.OreGen;

import java.io.File;

import com.thechiefpotatopeeler.eldritchmod.init.*;
import com.thechiefpotatopeeler.eldritchmod.tabs.EldritchMaterials;
import com.thechiefpotatopeeler.eldritchmod.tabs.EldritchTools;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod(modid= Main.MOD_ID, version = Main.VERSION, name = Main.NAME, dependencies = "required-after:llibrary@[1.7.19,)" /*, updateJSON = Main.updateJSON)*/ )
public class Main {
	public static final String MOD_ID = "eldritch";
	public static final String VERSION = "Beta 1.4";
	public static final String NAME = "Eldritch mod";
	public static File config;
	//public static final String updateJSON = "";

	public static Logger logger = LogManager.getLogger(NAME);
	
	@Instance
	public static Main instance;
	
	/**
	 * must include package paths
	 */
	@SidedProxy(serverSide = "com.thechiefpotatopeeler.eldritchmod.proxy.CommonProxy", clientSide = "com.thechiefpotatopeeler.eldritchmod.proxy.ClientProxy")
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
		BiomeRegistry.registerBiomes();
		DimensionRegistry.registerDimensions();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		SoundRegistry.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new ManaHandler());
		MinecraftForge.EVENT_BUS.register(new OverlayHandler());
		MinecraftForge.EVENT_BUS.register(new PlayerRenderHandler());
		MinecraftForge.EVENT_BUS.register(new InGameHandler());
		MinecraftForge.EVENT_BUS.register(new PotionEffectsHandler());
		MinecraftForge.EVENT_BUS.register(new MusicHandler());
		MinecraftForge.EVENT_BUS.register(new PacketHandler());
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		RegistrationHandler.serverRegistries(event);
	}

	@EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlocksRegistry.register(event.getRegistry());
		
		}
		@SubscribeEvent
		public static void registerItem(RegistryEvent.Register<Item> event) throws Exception {
			IForgeRegistry<Item> registry = event.getRegistry();
			ItemsRegistry.register(registry);
			BlocksRegistry.registerItemBlocks(registry);
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ItemsRegistry.registerModels();
			BlocksRegistry.registerModels();
		}

		public static void serverRegistries(FMLServerStartingEvent event) {
			event.registerServerCommand(new CommandDisplayManaBar());
			event.registerServerCommand(new CommandEnableMana());
		}
		
	}
}
