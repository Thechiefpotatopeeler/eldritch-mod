package com.eldritchmod.blocks;

import com.eldritchmod.Main;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);

		setTranslationKey(name);
		setRegistryName(name);
		
		BlocksRegistry.BLOCKS.add(this);
	}
	
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
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

}
