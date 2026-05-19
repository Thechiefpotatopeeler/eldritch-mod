package com.thechiefpotatopeeler.eldritchmod.blocks;

import java.util.Random;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.init.BlocksRegistry;
import com.thechiefpotatopeeler.eldritchmod.items.IRegisterable;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;

public class BlockLogBase extends BlockLog implements IRegisterable {

    protected String name;

    public BlockLogBase(String name) {
        super();
        this.name = name;
        setTranslationKey(name);
		setRegistryName(name);
        BlocksRegistry.BLOCKS.add(this);
        this.setCreativeTab(Main.eldritchmodmaterials);
    }

    @Override
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, name);
	}
	
	public Item createItemBlock() {
		ItemBlock itemBlock = new ItemBlock(this);
		itemBlock.setRegistryName(getRegistryName());
		return itemBlock;
	}
	
	@Override
	public BlockLogBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void updateRegistryAndLocalizedName(String name) {

	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
    }
}