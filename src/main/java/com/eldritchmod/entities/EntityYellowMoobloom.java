package com.eldritchmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityYellowMoobloom extends EntityCow {

    public EntityYellowMoobloom(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityYellowMoobloom createChild(EntityAgeable ageable) {
        return new EntityYellowMoobloom(this.world);
    }
    


    
}