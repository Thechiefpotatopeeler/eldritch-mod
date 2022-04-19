package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksRegistry {
	public static final ArrayList<BlockBase> BLOCKS = new ArrayList<BlockBase>();
	public static final EldritchBlock EldritchBlock = new EldritchBlock("eldritch_block");
	
	public static void register(final IForgeRegistry<Block> registry) {
		for (final BlockBase block : BLOCKS) {
			registry.register(block);
		}
	}

	public static void registerItemBlocks(final IForgeRegistry<Item> registry) {
		for (final BlockBase block : BLOCKS) {
			registry.register(block.createItemBlock());
		}
	}

	public static void registerModels() {
		for (final BlockBase block : BLOCKS) {
			block.registerItemModel(Item.getItemFromBlock(block));
		}
	}
}