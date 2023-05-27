package com.eldritchmod.blocks;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockBase extends Block implements IRegisterable {

	protected String name;
	
	public BlockBase(Material material, String name, CreativeTabs tab) {
		super(material);
		this.name = name;

		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
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
	@Override
    public String getName() {
        return this.name;
    }

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		for(Map.Entry<String,String> entry : Ref.ITEM_BASE_TOOLTIPS.entrySet()){
			if(entry.getKey().equals(this.name))
				tooltip.add(entry.getValue());
		}
		//if(Ref.ITEM_BASE_TOOLTIPS.containsKey(this.name)) tooltip.add(Ref.ITEM_BASE_TOOLTIPS.get(stack.getTranslationKey()));
	}
}
