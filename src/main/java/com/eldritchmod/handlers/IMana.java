package com.eldritchmod.handlers;

/**
 * Mana capability
 */
public interface IMana
{
 public void consume(int points);
 public void fill(int points);
 public void set(int points);
 
 public int getMana();
}