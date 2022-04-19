package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item;

public class EldritchShovel extends ItemShovelBase {

	public static final Item.ToolMaterial Eldritch_TOOL_MATERIAL = EnumHelper.addToolMaterial("eldritch", 3, 1000, 500, 14, 14);
	
	public EldritchShovel(String name) {
		super(Eldritch_TOOL_MATERIAL, name);

		setCreativeTab(Main.eldritchmodtools);
	}

}
