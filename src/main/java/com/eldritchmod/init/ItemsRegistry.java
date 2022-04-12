package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.items.EldritchAxe;
import com.eldritchmod.items.EldritchHoe;
import com.eldritchmod.items.EldritchIngot;
import com.eldritchmod.items.EldritchPickaxe;
import com.eldritchmod.items.EldritchShovel;
import com.eldritchmod.items.EldritchSword;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemsRegistry {

	public static final ArrayList<IRegisterable> ITEMS = new ArrayList<IRegisterable>();
	
	public static final EldritchIngot EldritchIngot = new EldritchIngot("eldritch_ingot");	
	public static final EldritchSword EldritchSword = new EldritchSword("eldritch_sword");
	public static final EldritchPickaxe EldritchPickaxe = new EldritchPickaxe("eldritch_pickaxe");
	public static final EldritchAxe EldritchAxe = new EldritchAxe("eldritch_axe");
	public static final EldritchShovel EldritchShovel = new EldritchShovel("eldritch_shovel");
	public static final EldritchHoe EldritchHoe = new EldritchHoe("eldritch_hoe");
	
//	public static final Material TOOL_MATERIAL = EnumHelper.add
	
	public static void register(IForgeRegistry<Item> registry) {		
		registry.registerAll(EldritchIngot, EldritchSword, EldritchPickaxe, EldritchAxe, EldritchShovel, EldritchHoe);
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
