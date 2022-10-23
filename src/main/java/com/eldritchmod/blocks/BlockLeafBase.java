package com.eldritchmod.blocks;

import java.util.List;
import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLeafBase extends BlockLeaves implements IRegisterable {
	protected String name;
	public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");

	public BlockLeafBase(Material material, String name) {
		super();
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
	public BlockLeafBase setCreativeTab(CreativeTabs tab) {
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

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnumType getWoodType(int meta) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
    public String getName() {
        return this.name;
    }
}