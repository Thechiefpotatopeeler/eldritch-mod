package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ItemFoodBase extends ItemFood implements ICreativeTabbable, IRegisterable {

    protected String name;

    public ItemFoodBase(String name, int amount,  boolean isWolfFood) {
        super(amount, isWolfFood);
        this.name = name;
		updateRegistryAndLocalizedName(name);
    }

    @Override
    public void registerItemModel() {
        Main.proxy.registerItemRenderer(this, 0, name);
    }
    
    
    @Override
	public void updateRegistryAndLocalizedName(String name) {
		//used for language files
		setTranslationKey(name);
		//used for registering the item and its models
		setRegistryName(name);
		
		ItemsRegistry.ITEMS.add(this);
	}	
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		for(Map.Entry<String,String> entry : Ref.ITEM_BASE_TOOLTIPS.entrySet()){
			if(entry.getKey().equals(this.name))
				tooltip.add(entry.getValue());
		}
        //if(Ref.ITEM_BASE_TOOLTIPS.containsKey(this.name)) tooltip.add(Ref.ITEM_BASE_TOOLTIPS.get(stack.getTranslationKey()));

    }
    
}
