package com.eldritchmod.blocks;

import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IRegisterable {

	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;

		setTranslationKey(name);
		setRegistryName(name);
		
		BlocksRegistry.BLOCKS.add(this);
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
	public BlockBase setCreativeTab(CreativeTabs tab) {
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
