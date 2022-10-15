package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.Main;
import com.eldritchmod.items.*;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.common.util.EnumHelper;


public class ItemsRegistry {

	
	public static final Item.ToolMaterial ELDRITCH_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 1000, 500, 14, 14);


	public static final ArrayList<IRegisterable> ITEMS = new ArrayList<IRegisterable>();
	
	public static final ItemBase EldritchShard = new ItemBase("eldritch_shard", Main.eldritchmodmaterials);	
	public static final EldritchSword EldritchSword = new EldritchSword("eldritch_sword");
	public static final EldritchPickaxe EldritchPickaxe = new EldritchPickaxe("eldritch_pickaxe");
	public static final EldritchAxe EldritchAxe = new EldritchAxe("eldritch_axe");
	public static final EldritchShovel EldritchShovel = new EldritchShovel("eldritch_shovel");
	public static final EldritchHoe EldritchHoe = new EldritchHoe("eldritch_hoe");
	public static final ItemBase EuphoriumDust = new ItemBase("euphorium_dust", Main.eldritchmodmaterials);
	public static final ItemBase SpiderFang = new ItemBase("spider_fang", Main.eldritchmodmaterials);
	
//	public static final Material TOOL_MATERIAL = EnumHelper.add
	
	public static void register(IForgeRegistry<Item> registry) {		
		registry.registerAll(EldritchShard, EuphoriumDust, SpiderFang, EldritchSword, EldritchPickaxe, EldritchAxe, EldritchShovel, EldritchHoe);
	}
	
//	public static void registerSwords(IForgeRegistry<ItemSword> registry) {
//		
//	}

	public static void registerModels() {
		for(IRegisterable item : ITEMS) {
			item.registerItemModel();
		}
		
//		EldritchSword.registerItemModel();
//		EldritchPickaxe.registerItemModel();
//		EldritchAxe.registerItemModel();
//		EldritchShovel.registerItemModel();
	}

}
