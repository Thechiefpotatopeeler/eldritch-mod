package com.eldritchmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.eldritchmod.init.ItemsRegistry;
import com.eldritchmod.Main;

public class ItemAxeBase extends ItemAxe implements IRegisterable{

    protected String name;
    public ItemAxeBase(ToolMaterial material, String name, int damage, int speed, CreativeTabs tab) {
        super(material,damage,speed);        
        this.name=name;
		setCreativeTab(tab);

        updateRegistryAndLocalizedName(name);
    }
    
    public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	public ItemAxeBase setCreativeTab(CreativeTabs tab) {
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