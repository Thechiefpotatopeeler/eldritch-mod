package com.eldritchmod.data;

import com.eldritchmod.handlers.IMana;

/**
 * Default implementation of IMana
 */
public class Mana implements IMana
{
 private int mana = 250.0;
 
 public void consume(int points)
 {
 this.mana -= points;
 
 if (this.mana < 0.0F) this.mana = 0.0;
 }
 
 public void fill(int points)
 {
 this.mana += points;
 }
 
 public void set(int points)
 {
 this.mana = points;
 }
 
 public int getMana()
 {
 return this.mana;
 }
}