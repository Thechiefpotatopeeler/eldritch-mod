package com.thechiefpotatopeeler.eldritchmod.tabs;

import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EldritchMaterials extends CreativeTabs {
    
    public EldritchMaterials(String label) {
        super("eldritchmodmaterials"); //Here we have our tab label.
        hasSearchBar(); //This is a boolean that determines if the tab has a search bar.
        this.setBackgroundImageName("eldritchmodcreativegui.png"); //This sets the background image for the tab.
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemsRegistry.EldritchShard);//Gives it a block to use as a symbol.
    }

}