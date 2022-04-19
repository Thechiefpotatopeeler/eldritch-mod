package com.eldritchmod.data;

import com.eldritchmod.handlers.IMana;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

/**
 * This class is responsible for saving and reading mana data from or to server
 */
public class ManaStorage implements IStorage<IMana>
{
 @Override
 public NBTBase writeNBT(Capability<IMana> capability, IMana instance, EnumFacing side)
 {
 return new NBTTagInt(instance.getMana());
 }

 @Override
 public void readNBT(Capability<IMana> capability, IMana instance, EnumFacing side, NBTBase nbt)
 {
 instance.set(((NBTPrimitive) nbt).getFloat());
 }
}