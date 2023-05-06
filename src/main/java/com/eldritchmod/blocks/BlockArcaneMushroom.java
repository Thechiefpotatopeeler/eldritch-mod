package com.eldritchmod.blocks;

import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.entities.EntitySpiderMatriarch;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class BlockArcaneMushroom extends BlockBase implements IGrowable{

    public BlockArcaneMushroom(String name) {
        super(Material.PLANTS, name, Main.eldritchmodmaterials);
        }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return true;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        //worldIn.getChunk(pos).addEntity(new EntitySpiderMatriarch(worldIn));
        System.out.println("Shit's not working working betch");
    }
    
}
