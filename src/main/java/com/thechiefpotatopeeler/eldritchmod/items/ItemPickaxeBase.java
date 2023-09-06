package com.thechiefpotatopeeler.eldritchmod.items;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeBase extends ItemPickaxe implements IRegisterable {

	protected String name;
	
	public ItemPickaxeBase(ToolMaterial material, String name, CreativeTabs creativeTab) {
		super(material);
		this.name = name;
		setCreativeTab(creativeTab);
		updateRegistryAndLocalizedName(name);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	public ItemPickaxeBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void updateRegistryAndLocalizedName(String name) {
		setRegistryName(name);
		setTranslationKey(name);
		
		ItemsRegistry.ITEMS.add(this);
	}
}
