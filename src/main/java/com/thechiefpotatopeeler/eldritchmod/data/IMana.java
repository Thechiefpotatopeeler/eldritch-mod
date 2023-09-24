package com.thechiefpotatopeeler.eldritchmod.data;

import com.thechiefpotatopeeler.eldritchmod.data.Mana.MagicUserTypes;


/**
 * Mana capability
 */
public interface IMana {
//All the most important methods
    public void consume(int points);
    public void fill(int points);
    public void set(int points);
    public int getMana();
    public int getMaxMana();
    public void setMaxMana(int maxMana);
    public void setMagicType(MagicUserTypes type);
    public MagicUserTypes getMagicType();
}