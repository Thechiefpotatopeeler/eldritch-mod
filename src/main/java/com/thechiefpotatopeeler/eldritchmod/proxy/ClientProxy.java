package com.thechiefpotatopeeler.eldritchmod.proxy;

import com.thechiefpotatopeeler.eldritchmod.Main;

import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;


public class ClientProxy extends CommonProxy{
	/**
	 * Find the mod ID in the assets folder in [mod id]/models/[item id].json
	 */
	@Override
	public void registerItemRenderer(Item item, int metadataValue, String itemId) {
		ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(Main.MOD_ID + ":" + itemId, "inventory"));
	}

	@Override
	public void updateManaBar(int mana) {
		Minecraft.getMinecraft().player.getCapability(ManaProvider.MANA_CAP, null).set(mana,Minecraft.getMinecraft().player);
	}
}
