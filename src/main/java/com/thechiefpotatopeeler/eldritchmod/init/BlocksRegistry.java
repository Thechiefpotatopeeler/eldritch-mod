package com.thechiefpotatopeeler.eldritchmod.init;

import java.util.ArrayList;

import com.thechiefpotatopeeler.eldritchmod.Main;
import com.thechiefpotatopeeler.eldritchmod.items.IRegisterable;

import com.thechiefpotatopeeler.eldritchmod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlocksRegistry {
	public static final ArrayList<IRegisterable> BLOCKS = new ArrayList<IRegisterable>();
	public static final com.thechiefpotatopeeler.eldritchmod.blocks.EldritchBlock EldritchBlock = new EldritchBlock("eldritch_block");
	public static final com.thechiefpotatopeeler.eldritchmod.blocks.EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");
	public static final BlockLogBase LogTwilightYarrow = new BlockLogBase("log_twilight_yarrow");
	public static final com.thechiefpotatopeeler.eldritchmod.blocks.EldritchAltar EldritchAltar = new EldritchAltar("eldritch_altar");
	public static final BlockGargoyleStatue GargoyleStatueBlock = new BlockGargoyleStatue("gargoyle_statue");
	public static final BlockArcaneMushroom ArcaneMushroom = new BlockArcaneMushroom("arcane_mushroom");
	public static final BlockBase MAGIC_MYCELIUM = new BlockBase(Material.GROUND,"magic_mycelium", Main.eldritchmodmaterials);


	
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
