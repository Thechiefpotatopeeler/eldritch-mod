package com.eldritchmod.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityHatchableEgg extends EntityLiving {

    public final EntitySpider SPIDER;

    private int timeUntilHatch = 1000;
    public EntityHatchableEgg(World worldIn) {
        super(worldIn);
        SPIDER = new EntitySpider(worldIn);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.timeUntilHatch > 0) {
            --this.timeUntilHatch;
        } else {
            this.hatch();
        }
    }

    public void hatch(){
        if (!this.world.isRemote) {
            EntitySpider entity = this.SPIDER;
            entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
            this.world.spawnEntity(entity);
            this.setDead();
        }
    }
}
