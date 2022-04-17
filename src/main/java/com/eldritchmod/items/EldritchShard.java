package com.eldritchmod.items;

import com.eldritchmod.Main;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class EldritchShard extends ItemBase { 

	public EldritchShard(String name) {
		super(name);

		setCreativeTab(Main.eldritchmodmaterials);
	}
}
