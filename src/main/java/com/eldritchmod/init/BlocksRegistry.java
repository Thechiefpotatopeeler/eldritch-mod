package com.eldritchmod.init;

import java.util.ArrayList;

import com.eldritchmod.blocks.*;
import com.eldritchmod.items.IRegisterable;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksRegistry {
	public static final ArrayList<IRegisterable> BLOCKS = new ArrayList<IRegisterable>();
	public static final EldritchBlock EldritchBlock = new EldritchBlock("eldritch_block");
	public static final EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");
	public static final BlockLogBase LogTwilightYarrow = new BlockLogBase("log_twilight_yarrow");
	public static final EldritchAltar EldritchAltar = new EldritchAltar("eldritch_altar");
	public static final BlockGargoyleStatue GargoyleStatueBlock = new BlockGargoyleStatue("gargoyle_statue");
	public static final BlockArcaneMushroom ArcaneMushroom = new BlockArcaneMushroom("arcane_mushroom");


	
	public static void register(final IForgeRegistry<Block> registry) {
		for (final IRegisterable block : BLOCKS) {
			registry.register((Block) block);
			//System.out.println("Registered block: " + block.getName());
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
