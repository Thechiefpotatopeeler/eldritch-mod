package com.thechiefpotatopeeler.eldritchmod.tabs;

import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class EldritchTools extends CreativeTabs {
    
    public EldritchTools(String label) {
        super("eldritchmodtools"); //Here we have our tab label.
        hasSearchBar(); //This is a boolean that determines if the tab has a search bar.
        this.setBackgroundImageName("eldritchmodcreativegui.png"); //This sets the background image for the tab.
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemsRegistry.EldritchAxe);
    }

}