package com.eldritchmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityBlueMoobloom extends EntityCow {

    public EntityBlueMoobloom(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityBlueMoobloom createChild(EntityAgeable ageable) {
        return new EntityBlueMoobloom(this.world);
    }
    
}