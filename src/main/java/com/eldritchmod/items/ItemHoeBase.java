package com.eldritchmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.eldritchmod.init.ItemsRegistry;
import com.eldritchmod.Main;

public class ItemHoeBase extends ItemHoe implements IRegisterable{

    protected String name;
    public ItemHoeBase(ToolMaterial material, String name) {
        super(material);
        
        this.name=name;

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