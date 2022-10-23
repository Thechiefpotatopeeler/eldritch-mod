package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.blocks.*;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksRegistry {
	public static final ArrayList<IRegisterable> BLOCKS = new ArrayList<IRegisterable>();
	public static final EldritchBlock EldritchBlock = new EldritchBlock("eldritch_block");
	public static final EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");
	public static final BlockLogBase LogTwilightYarrow = new BlockLogBase("log_twilight_yarrow");


	
	public static void register(final IForgeRegistry<Block> registry) {
		for (final IRegisterable block : BLOCKS) {
			registry.register((Block) block);
	}
		
	}

	public static void registerItemBlocks(final IForgeRegistry<Item> registry) {
		for (final IRegisterable block : BLOCKS) {
			switch (block.getName()) {
				case "log_twilight_yarrow":
				registry.register(((BlockLogBase) LogTwilightYarrow).createItemBlock());
				break;
			default:
				registry.register(((BlockBase) block).createItemBlock());
				break;
		}
		}
		
	}

	public static void registerModels() {
		for (final IRegisterable block : BLOCKS) {
			block.registerItemModel();
		}
	}
}
