package com.eldritchmod.data;

/**
 * Mana capability
 */
public interface IMana {

    public static final int MAXIMUM_MANA = 100;

    public void consume(int points);
    public void fill(int points);
    public void set(int points);
    
    public int getMana();
}