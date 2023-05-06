package com.eldritchmod;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

public class Ref {

    //Entity IDs
    public static final int ENTITY_MATRIARCH = 120;
    public static final int ENTITY_YELLOW_MOOBLOOM = 121;
	public static final int ENTITY_RED_MOOBLOOM = 122;
	public static final int ENTITY_POOBLOOM = 123;    
    public static final int ENTITY_BARNACLE = 124;
    //Dimension IDs
    public static final int BACKROOMS = 2;

    //Damage Sources
    public static final DamageSource MESSING_WITH_ARCANE = new DamageSource("messing_with_arcane").setDamageBypassesArmor().setMagicDamage();
}