package com.thechiefpotatopeeler.eldritchmod.init;

import com.thechiefpotatopeeler.eldritchmod.potion.PotionBase;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionRegistry {

    public static final Potion HALLUCINATION_EFFECT = new PotionBase("hallucination",false, 0x00FF00,0,0);

    public static final PotionType HALLUCINATION =  new PotionType("hallucination", new PotionEffect[] {new PotionEffect(HALLUCINATION_EFFECT, 3600)}).setRegistryName("hallucination");
    public static final PotionType LONG_HALLUCINATION =  new PotionType("hallucination", new PotionEffect[] {new PotionEffect(HALLUCINATION_EFFECT, 9600)}).setRegistryName("long_hallucination");

    public static void registerPotions() {
        registerPotion(HALLUCINATION, LONG_HALLUCINATION, HALLUCINATION_EFFECT);
        registerPotionMixes();
    }

    private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect) {
        ForgeRegistries.POTIONS.register(effect);
        ForgeRegistries.POTION_TYPES.register(defaultPotion);
        ForgeRegistries.POTION_TYPES.register(longPotion);
    }

    private static void registerPotionMixes() {
        PotionHelper.addMix(PotionTypes.AWKWARD, ItemsRegistry.DriedArcaneMushroom, HALLUCINATION);
    }
}
