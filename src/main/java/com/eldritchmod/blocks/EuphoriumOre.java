package com.eldritchmod.blocks;

import com.eldritchmod.Main;
import com.eldritchmod.blocks.BlockBase;
import com.eldritchmod.tabs.EldritchTools;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class EuphoriumOre extends BlockOreBase {

    public EuphoriumOre(String name) {
        super(name);
        setCreativeTab(Main.eldritchmodmaterials);
        createItemBlock();
                
    }
    
}