package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class EldritchShovel extends ItemShovelBase {

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("Eldritch", 3, 99999, 9999, 9999999, 14);
	
	public EldritchShovel(String name) {
		super(Eldritch_TOOL_MATERIAL, name);
	}

}
