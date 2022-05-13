package com.eldritchmod.data;

import com.eldritchmod.data.MagicUserType.MagicUserTypes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class MagicUserTypeStorage implements Capability.IStorage<IMagicUserType> {
    @Override
    public NBTBase writeNBT(Capability<IMagicUserType> capability, IMagicUserType instance, EnumFacing side) {
        return new NBTTagString(instance.getType().toString());
    }

    @Override
    public void readNBT(Capability<IMagicUserType> capability, IMagicUserType instance, EnumFacing side, NBTBase nbt) {
        instance.set(MagicUserTypes.valueOf(((NBTTagString)nbt).getString()));
    }
}