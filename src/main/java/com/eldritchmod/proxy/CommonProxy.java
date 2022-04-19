package com.eldritchmod.proxy;

import com.eldritchmod.data.Mana;
import com.eldritchmod.data.ManaStorage;
import com.eldritchmod.handlers.IMana;

import net.minecraft.item.Item;
import net.minecraftforge.common.capabilities.CapabilityManager;

/**
 * Server side proxy
 * @author ezric
 *
 */
public class CommonProxy {

	public void registerItemRenderer(Item item, int creativeTabValue, String name) {
		CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana.class);
	}

}
