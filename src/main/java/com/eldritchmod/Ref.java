package com.eldritchmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.MerchantRecipe;

public class Ref {

    //Entity IDs
    public static final int ENTITY_MATRIARCH = 120;
    public static final int ENTITY_YELLOW_MOOBLOOM = 121;
	public static final int ENTITY_RED_MOOBLOOM = 122;
	public static final int ENTITY_POOBLOOM = 123;    
    public static final int ENTITY_BARNACLE = 124;

    public static final int ENTITY_DWARF = 125;
    public static final int ENTITY_CROCODEMON = 126;


    //Dimension IDs
    public static final int BACKROOMS = 2;

    //Damage Sources
    public static final DamageSource MESSING_WITH_ARCANE = new DamageSource("messing_with_arcane").setDamageBypassesArmor().setMagicDamage();

    //Entity trades
    public static MerchantRecipeList getDwarfTrades() {
        MerchantRecipeList DWARF_TRADES = new MerchantRecipeList();
        DWARF_TRADES.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.IRON_INGOT)));
        return DWARF_TRADES;
    }
}