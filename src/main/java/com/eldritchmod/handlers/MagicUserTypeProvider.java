package com.eldritchmod.handlers;

import com.eldritchmod.data.IMagicUserType;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class MagicUserTypeProvider implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(IMagicUserType.class)
    public static final Capability<IMagicUserType> MAGIC_USER_TYPE_CAP = null;

    private IMagicUserType instance = MAGIC_USER_TYPE_CAP.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == MAGIC_USER_TYPE_CAP;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == MAGIC_USER_TYPE_CAP ? MAGIC_USER_TYPE_CAP.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return MAGIC_USER_TYPE_CAP.getStorage().writeNBT(MAGIC_USER_TYPE_CAP, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        MAGIC_USER_TYPE_CAP.getStorage().readNBT(MAGIC_USER_TYPE_CAP, this.instance, null, nbt);
    }
}