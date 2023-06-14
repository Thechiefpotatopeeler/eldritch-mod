package com.eldritchmod.entities.entity.moobloom;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityRedMoobloom extends EntityCow {

    public EntityRedMoobloom(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityRedMoobloom createChild(EntityAgeable ageable) {
        return new EntityRedMoobloom(this.world);
    }
    
}