package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.items.*;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemsRegistry {

	public static final ArrayList<IRegisterable> ITEMS = new ArrayList<IRegisterable>();
	
	public static final EldritchShard EldritchShard = new EldritchShard("eldritch_shard");	
	public static final EldritchSword EldritchSword = new EldritchSword("eldritch_sword");
	public static final EldritchPickaxe EldritchPickaxe = new EldritchPickaxe("eldritch_pickaxe");
	public static final EldritchAxe EldritchAxe = new EldritchAxe("eldritch_axe");
	public static final EldritchShovel EldritchShovel = new EldritchShovel("eldritch_shovel");
	public static final EldritchHoe EldritchHoe = new EldritchHoe("eldritch_hoe");
	public static final EuphoriumDust EuphoriumDust = new EuphoriumDust("euphorium_dust");
	public static final SpiderFang SpiderFang = new SpiderFang("spider_fang");
	
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
