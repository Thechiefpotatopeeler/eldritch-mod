package com.eldritchmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.MerchantRecipe;

import java.util.HashMap;

public class Ref {

    //Entity IDs (moved to config)
    public static final int ENTITY_MATRIARCH = 120;
    public static final int ENTITY_YELLOW_MOOBLOOM = 121;
	public static final int ENTITY_RED_MOOBLOOM = 122;
	public static final int ENTITY_POOBLOOM = 123;    
    public static final int ENTITY_BARNACLE = 124;

    public static final int ENTITY_DWARF = 125;
    public static final int ENTITY_CROCODEMON = 126;

    public static final int ENTITY_HATCHABLE_EGG = 127;

    public static final int ENTITY_GHUST = 128;

    public static final int ENTITY_THUNDERCOCK = 129;

    public static final int BAT_RUBY = 1076;




    //Dimension IDs
    //public static final int BACKROOMS = 2;

    //Damage Sources
    public static final DamageSource MESSING_WITH_ARCANE = new DamageSource("messing_with_arcane").setDamageBypassesArmor().setMagicDamage();

    //Entity trades
    public static MerchantRecipeList getDwarfTrades() {
        MerchantRecipeList DWARF_TRADES = new MerchantRecipeList();
        DWARF_TRADES.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.IRON_INGOT)));
        return DWARF_TRADES;
    }

    //Item tooltips
    public static final HashMap<String,String> ITEM_BASE_TOOLTIPS = new HashMap<>();
    static {
    	ITEM_BASE_TOOLTIPS.put("dried_arcane_mushroom", "I wouldn't eat that if I were you");
    	ITEM_BASE_TOOLTIPS.put("arcane_mushroom", "It looks like you could dry it and consume it in a perfectly legal, recreational manner");
        ITEM_BASE_TOOLTIPS.put("euphorium_apple", "You are reminded of a golden apple but this is somehow different");
        ITEM_BASE_TOOLTIPS.put("semen_bucket","We don't have a cow");
    }

    //GUI Ids

    public static final int GUI_MANA = 1;

}