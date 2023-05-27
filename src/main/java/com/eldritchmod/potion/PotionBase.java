package com.eldritchmod.potion;

import com.eldritchmod.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBase extends Potion {
    public PotionBase(String name, boolean isBadEffectIn, int colour, int iconIndexX, int iconIndexY) {
        super(isBadEffectIn, colour);
        setIconIndex(iconIndexX, iconIndexY);
        setPotionName("effect."+name);
        setRegistryName(new ResourceLocation(Main.MOD_ID+":"+name));
    }

    @Override
    public boolean hasStatusIcon() {
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Main.MOD_ID, "textures/gui/potion_effects.png"));
        return true;
    }
}
