package com.eldritchmod.tabs;

import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EldritchMaterials extends CreativeTabs {
    
    public EldritchMaterials(String label) {
        super("eldritchmodmaterials"); //Here we have our tab label.
        hasSearchBar(); //This is a boolean that determines if the tab has a search bar.
        this.setBackgroundImageName("eldritchmodcreativegui.png"); //This sets the background image for the tab.
    }

    @Override
    public ItemStack createIcon() {
        // TODO Auto-generated method stub
        return new ItemStack(ItemsRegistry.EldritchShard);//Gives it a block to use as a symbol.
    }

}