package com.thechiefpotatopeeler.eldritchmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;
import com.thechiefpotatopeeler.eldritchmod.Main;

public class ItemHoeBase extends ItemHoe implements IRegisterable{

    protected String name;
    public ItemHoeBase(ToolMaterial material, String name, CreativeTabs creativeTab) {
        super(material);
        this.name=name;
		setCreativeTab(creativeTab);
        updateRegistryAndLocalizedName(name);
    }
    
    public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	public ItemHoeBase setCreativeTab(CreativeTabs tab) {
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