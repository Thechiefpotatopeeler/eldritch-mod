package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements ICreativeTabbable, IRegisterable {

    protected String name;

    public ItemFoodBase(String name, int amount,  boolean isWolfFood) {
        super(amount, isWolfFood);
        this.name = name;	
		
		updateRegistryAndLocalizedName(name);        
    }
    
    @Override
    public void registerItemModel() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
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
