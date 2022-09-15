package com.eldritchmod.blocks;

import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.init.BlocksRegistry;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;

public class BlockLogBase extends BlockRotatedPillar implements IRegisterable {
    
    public static final PropertyEnum<BlockLogBase.EnumAxis> LOG_AXIS = PropertyEnum.<BlockLogBase.EnumAxis>create("axis", BlockLogBase.EnumAxis.class);

    protected String name;

    public BlockLogBase(String name) {
        super(Material.WOOD);
        this.name = name;
        setTranslationKey(name);
		setRegistryName(name);
        // BlocksRegistry.LOGS.add(this);

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
    public static enum EnumAxis implements IStringSerializable
        {
            X("x"),
            Y("y"),
            Z("z"),
            NONE("none");
    
            private final String name;
    
            private EnumAxis(String name)
            {
                this.name = name;
            }
    
            public String toString()
            {
                return this.name;
            }
    
            public static BlockLogBase.EnumAxis fromFacingAxis(EnumFacing.Axis axis)
            {
                switch (axis)
                {
                    case X:
                        return X;
                    case Y:
                        return Y;
                    case Z:
                        return Z;
                    default:
                        return NONE;
                }
            }
    
            public String getName()
            {
                return this.name;
            }
        }
}