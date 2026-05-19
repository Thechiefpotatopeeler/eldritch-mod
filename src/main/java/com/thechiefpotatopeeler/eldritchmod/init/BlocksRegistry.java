package com.thechiefpotatopeeler.eldritchmod.init;

import java.util.ArrayList;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.items.IRegisterable;

import com.thechiefpotatopeeler.eldritchmod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksRegistry {
	public static final ArrayList<IRegisterable> BLOCKS = new ArrayList<IRegisterable>();
	public static final Block EldritchBlock = new BlockBase(Material.ROCK,"eldritch_block",Main.eldritchmodmaterials, "pickaxe").setHardness(1.5F).setResistance(10.0F);
	public static final EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");
	public static final BlockLogBase LogTwilightYarrow = new BlockLogBase("log_twilight_yarrow");
	public static final EldritchAltar EldritchAltar = new EldritchAltar("eldritch_altar");
	public static final BlockGargoyleStatue GargoyleStatueBlock = new BlockGargoyleStatue("gargoyle_statue");
	public static final BlockArcaneMushroom ArcaneMushroom = new BlockArcaneMushroom("arcane_mushroom");
	public static final Block MYCELIC_GRASS = new BlockBase(Material.GROUND,"magic_mycelium", Main.eldritchmodmaterials,"shovel").setHardness(0.6F).setResistance(0.6F);
	public static final Block MUSHROOM_GILLS = new BlockBase(Material.CLOTH,"mushroom_gills", Main.eldritchmodmaterials,"shovel").setHardness(0.6F).setResistance(0.6F);
	public static final Block MYCELIC_DIRT = new BlockBase(Material.GROUND,"mycelic_dirt", Main.eldritchmodmaterials,"shovel").setHardness(0.6F).setResistance(0.6F);
	public static final Block TreeFernLog = new BlockBase(Material.WOOD,"tree_fern",Main.eldritchmodmaterials,"axe"){
		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}
		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}
		@SideOnly(Side.CLIENT)
		public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
		{
			return true;
		}
	};

	public static final Block TreeFernHead = new BlockBase(Material.WOOD,"tree_fern_head",Main.eldritchmodmaterials,"axe"){
		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}
		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}
		@SideOnly(Side.CLIENT)
		public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
		{
			return true;
		}
		@SideOnly(Side.CLIENT)
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}
	};
	
	public static void register(final IForgeRegistry<Block> registry) {
		for (final IRegisterable block : BLOCKS) {
			registry.register((Block) block);
		}
	}

	public static void registerItemBlocks(final IForgeRegistry<Item> registry) {
		for (final IRegisterable block : BLOCKS) {
			if(block instanceof BlockLogBase) {
				registry.register(((BlockLogBase) block).createItemBlock());
			}
			else {
				registry.register(((BlockBase) block).createItemBlock());
			}
		}
	}

	public static void registerModels() {
		for (final IRegisterable block : BLOCKS) {
			block.registerItemModel();
		}
	}
}
