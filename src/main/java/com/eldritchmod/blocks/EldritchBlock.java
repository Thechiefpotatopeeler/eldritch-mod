package com.eldritchmod.blocks;

import com.eldritchmod.Main;
import com.eldritchmod.blocks.BlockBase;
import com.eldritchmod.tabs.EldritchTools;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class EldritchBlock extends BlockBase {

    public EldritchBlock(String name) {
        super(Material.ROCK, name);
        setCreativeTab(Main.eldritchmodmaterials);
        
    }
    
}