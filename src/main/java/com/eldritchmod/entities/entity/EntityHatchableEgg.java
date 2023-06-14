package com.eldritchmod.entities.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.World;

public class EntityHatchableEgg extends EntityLiving {

    public final EntitySpider SPIDER;

    private int cracked = 0;
    public EntityHatchableEgg(World worldIn) {
        super(worldIn);
        SPIDER = new EntitySpider(worldIn);
        this.setSize(0.4F, 0.4F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted > 250) this.cracked = 1;
        if(this.ticksExisted >500) this.cracked = 2;
        if (this.ticksExisted > 750) this.hatch();
    }

    public int getHatchedness(){
        return this.cracked;
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
