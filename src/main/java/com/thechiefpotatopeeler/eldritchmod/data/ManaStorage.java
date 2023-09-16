package com.thechiefpotatopeeler.eldritchmod.data;


import com.thechiefpotatopeeler.eldritchmod.data.Mana.MagicUserTypes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

/**
 * This class is responsible for saving and reading mana data from or to server
 */
public class ManaStorage implements Capability.IStorage<IMana> {
    @Override
    public NBTBase writeNBT(Capability<IMana> capability, IMana instance, EnumFacing side) {
        String out = Integer.toString(instance.getMana()) + "," + instance.getMagicType().toString();
        return new NBTTagString(out);
    }

    @Override
    public void readNBT(Capability<IMana> capability, IMana instance, EnumFacing side, NBTBase nbt) {
        instance.set(Integer.parseInt(((NBTTagString)nbt).getString().split(",")[0]));
        instance.setMagicType(MagicUserTypes.valueOf(((NBTTagString)nbt).getString().split(",")[1]));
    }
}