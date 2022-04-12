package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchHoe extends ItemShovelBase{

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("Eldritch", 3, 99999, 9999, 9999999, 14); 

	public EldritchHoe(String name) {
		super(Eldritch_TOOL_MATERIAL, name);
	}	
}
