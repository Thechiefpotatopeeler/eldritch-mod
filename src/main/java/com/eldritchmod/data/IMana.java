package com.eldritchmod.data;


/**
 * Mana capability
 */
public interface IMana {
//All the most important methods
    public void consume(int points);
    public void fill(int points);
    public void set(int points);
    
    public int getMana();
}