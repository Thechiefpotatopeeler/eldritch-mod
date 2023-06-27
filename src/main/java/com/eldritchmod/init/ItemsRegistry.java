package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.Main;
import com.eldritchmod.items.*;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.common.util.EnumHelper;


public class ItemsRegistry {

	
	public static final Item.ToolMaterial ELDRITCH_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 1000, 13, 14, 14);
	public static final ItemArmor.ArmorMaterial DRAGON_SCALE_ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("dragon_scale", "eldritchmod:dragon_scale", 1000, new int[]{4, 7, 9, 4}, 14, null, 14);


	public static final ArrayList<IRegisterable> ITEMS = new ArrayList<IRegisterable>();

	public static final ItemBase EldritchToolIngot = new ItemBase("eldritch_tool_ingot", Main.eldritchmodmaterials);
	public static final ItemBase EldritchShard = new ItemBase("eldritch_shard", Main.eldritchmodmaterials);	
	public static final ItemSwordBase EldritchSword = new ItemSwordBase(ELDRITCH_TOOL_MATERIAL, "eldritch_sword", Main.eldritchmodtools);
	public static final ItemPickaxeBase EldritchPickaxe = new ItemPickaxeBase(ELDRITCH_TOOL_MATERIAL,"eldritch_pickaxe",Main.eldritchmodtools);
	public static final ItemAxeBase EldritchAxe = new ItemAxeBase(ELDRITCH_TOOL_MATERIAL, "eldritch_axe", 14, 14, Main.eldritchmodtools);
	public static final ItemShovelBase EldritchShovel = new ItemShovelBase(ELDRITCH_TOOL_MATERIAL,"eldritch_shovel", Main.eldritchmodtools);
	public static final ItemHoeBase EldritchHoe = new ItemHoeBase(ELDRITCH_TOOL_MATERIAL,"eldritch_hoe", Main.eldritchmodtools);
	public static final ItemBase EuphoriumDust = new ItemBase("euphorium_dust", Main.eldritchmodmaterials);
	public static final ItemBase SpiderFang = new ItemBase("spider_fang", Main.eldritchmodmaterials);
	public static final ItemBase SemenBucket = new ItemBase("semen_bucket", Main.eldritchmodmaterials);
	public static final ItemBase DragonScale = new ItemBase("dragon_scale", Main.eldritchmodmaterials);
	public static final ItemFoodBase EuphoriumApple = new ItemFoodBase("euphorium_apple", 4,  false);
	public static final ItemFoodBase DriedArcaneMushroom = new ItemFoodBase("dried_arcane_mushroom", 4,  false);
	public static final ItemArmourBase DragonScaleHelmet = new ItemArmourBase("dragon_scale_helmet",DRAGON_SCALE_ARMOUR_MATERIAL , 1, EntityEquipmentSlot.HEAD, Main.eldritchmodtools);
	public static final ItemArmourBase DragonScaleChestplate = new ItemArmourBase("dragon_scale_chestplate",DRAGON_SCALE_ARMOUR_MATERIAL , 1, EntityEquipmentSlot.CHEST, Main.eldritchmodtools);
	public static final ItemArmourBase DragonScaleLeggings = new ItemArmourBase("dragon_scale_leggings",DRAGON_SCALE_ARMOUR_MATERIAL , 2, EntityEquipmentSlot.LEGS, Main.eldritchmodtools);
	public static final ItemArmourBase DragonScaleBoots = new ItemArmourBase("dragon_scale_boots",DRAGON_SCALE_ARMOUR_MATERIAL , 1, EntityEquipmentSlot.FEET, Main.eldritchmodtools);

	
	public static void register(IForgeRegistry<Item> registry) {		
		//registry.registerAll(EldritchShard, EldritchToolIngot, EuphoriumDust, SpiderFang, EldritchSword, EldritchPickaxe, EldritchAxe, EldritchShovel, EldritchHoe);
		for(IRegisterable item : ITEMS){
			registry.register((Item) item);
		}
	}


	public static void registerModels() {
		for(IRegisterable item : ITEMS) {
			item.registerItemModel();
			System.out.println("ha was a bad print test");
		}
		
	}

}
