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
	public static final Block EldritchBlock = new BlockBase(Material.ROCK,"eldritch_block",Main.eldritchmodmaterials, "pickaxe").setHardness(1.5F).setResistance(10.0F);
	public static final EuphoriumOre EuphoriumOre = new EuphoriumOre("euphorium_ore");
	public static final BlockLogBase LogTwilightYarrow = new BlockLogBase("log_twilight_yarrow");
	public static final EldritchAltar EldritchAltar = new EldritchAltar("eldritch_altar");
	public static final BlockGargoyleStatue GargoyleStatueBlock = new BlockGargoyleStatue("gargoyle_statue");
	public static final BlockArcaneMushroom ArcaneMushroom = new BlockArcaneMushroom("arcane_mushroom");
	public static final Block MYCELIC_GRASS = new BlockBase(Material.GROUND,"magic_mycelium", Main.eldritchmodmaterials,"shovel").setHardness(0.6F).setResistance(0.6F);
	public static final Block MUSHROOM_GILLS = new BlockBase(Material.CLOTH,"mushroom_gills", Main.eldritchmodmaterials,"shovel").setHardness(0.6F).setResistance(0.6F);
	
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
