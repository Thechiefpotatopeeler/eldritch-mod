package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchHoe extends ItemShovelBase {

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 1000, 500, 14, 14); 

	public EldritchHoe(String name) {
		super(Eldritch_TOOL_MATERIAL, name);

		setCreativeTab(Main.eldritchmodtools);
	}	
}
