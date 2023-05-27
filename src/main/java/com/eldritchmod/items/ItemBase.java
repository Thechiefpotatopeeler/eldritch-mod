package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

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
