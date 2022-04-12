package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchPickaxe extends ItemPickaxeBase {

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("Eldritch", 3, 99999, 9999, 9999999, 14);
	
	public EldritchPickaxe(String name) {
		super(Eldritch_TOOL_MATERIAL, name);
	}

}
