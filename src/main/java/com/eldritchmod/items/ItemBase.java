package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IRegisterable, ICreativeTabbable {
	
	protected String name;	
	
	public ItemBase(String name, CreativeTabs tab) {
		this.name = name;	
		
		updateRegistryAndLocalizedName(name);
		setCreativeTab(tab);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	
	public ItemBase(ToolMaterial material, String name) {
		this.name = name;
	}
	
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public void updateRegistryAndLocalizedName(String name) {
		//used for language files
		setTranslationKey(name);
		//used for registering the item and its models
		setRegistryName(name);
		
		ItemsRegistry.ITEMS.add(this);
	}	
}
