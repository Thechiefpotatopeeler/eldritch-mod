package com.thechiefpotatopeeler.eldritchmod.items;


public interface IRegisterable<T> {
	void registerItemModel();
	void updateRegistryAndLocalizedName(String name);
}
