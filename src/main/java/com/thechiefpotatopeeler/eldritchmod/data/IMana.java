package com.thechiefpotatopeeler.eldritchmod.data;

import com.thechiefpotatopeeler.eldritchmod.data.Mana.MagicUserTypes;
import net.minecraft.entity.player.EntityPlayer;


/**
 * Mana capability
 */
public interface IMana {
//All the most important methods
    public void consume(int points, EntityPlayer player);
    public void fill(int points, EntityPlayer player);
    public void set(int points, EntityPlayer player);
    public int getMana();
    public int getMaxMana();
    public void setMaxMana(int maxMana);
    public void setMagicType(MagicUserTypes type);
    public MagicUserTypes getMagicType();
}