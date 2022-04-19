package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchHoe extends ItemHoeBase {

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 1000, 500, 14, 14); 

	public EldritchHoe(String name) {
		super(Eldritch_TOOL_MATERIAL, name);

		setCreativeTab(Main.eldritchmodtools);
	}	
}
