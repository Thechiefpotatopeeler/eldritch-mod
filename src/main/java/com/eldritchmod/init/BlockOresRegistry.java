package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockOresRegistry {
	public static final ArrayList<BlockOreBase> ORES = new ArrayList<BlockOreBase>();
    public static final EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");

	
	public static void register(final IForgeRegistry<Block> registry) {
		for (final BlockOreBase block : ORES) {
			registry.register(block);
		}
	}

	public static void registerItemBlocks(final IForgeRegistry<Item> registry) {
		for (final BlockOreBase block : ORES) {
			registry.register(block.createItemBlock());
		}
	}

	public static void registerModels() {
		for (final BlockOreBase block : ORES) {
			block.registerItemModel(Item.getItemFromBlock(block));
		}
	}
}
