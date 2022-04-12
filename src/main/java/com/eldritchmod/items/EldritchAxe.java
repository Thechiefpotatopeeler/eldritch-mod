package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchAxe extends ItemAxeBase {
	
	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 99999, 9999, 9999999, 14); 
	
	public EldritchAxe(String name) {
		super(Eldritch_TOOL_MATERIAL, name);		
	}
}
