package com.eldritchmod.items;

import com.eldritchmod.Main;
import com.eldritchmod.init.ItemsRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmourBase extends ItemArmor implements IRegisterable{

    protected String name;
    public ItemArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.name = name;
        updateRegistryAndLocalizedName(name);
        setCreativeTab(tab);
    }

    public ItemArmourBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void registerItemModel() {
        Main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public void updateRegistryAndLocalizedName(String name) {
        //used for language files
        setTranslationKey(name);
        //used for registering the item and its models
        setRegistryName(name);

        ItemsRegistry.ITEMS.add(this);
    }
}
