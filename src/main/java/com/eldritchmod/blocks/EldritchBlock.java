package com.eldritchmod.blocks;

import com.eldritchmod.Main;
import net.minecraft.block.material.Material;


public class EldritchBlock extends BlockBase {

    public EldritchBlock(String name) {
        super(Material.ROCK, name);
        setCreativeTab(Main.eldritchmodmaterials);
        
    }
}