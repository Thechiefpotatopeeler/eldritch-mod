package com.eldritchmod.blocks;

import com.eldritchmod.Main;
import com.eldritchmod.init.BlockOresRegistry;
import com.eldritchmod.init.ItemsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

//This is my attempt at having a separate registry for ores, that's what all the modding tutorials do.

public class BlockOreBase extends Block implements IMetaName {

	protected String name, dimension;

	public BlockOreBase(String name) {
		super(Material.ROCK);
		this.name=name;

		setTranslationKey(name);
		setRegistryName(name);

		BlockOresRegistry.ORES.add(this);
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
	public BlockOreBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}

}
