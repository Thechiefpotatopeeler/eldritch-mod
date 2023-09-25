package com.thechiefpotatopeeler.eldritchmod.entity.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.AbstractIllager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.world.World;

public class EntityCrocodemon extends EntityMob {
    public EntityCrocodemon(World worldIn) {
        super(worldIn);
        this.setSize(1.8F, 2.0F);
    }

    @Override
    protected void initEntityAI(){
        this.tasks.addTask(1, new EntityAISwimming(this));
        //this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, true));
        targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityAnimal.class, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityVillager.class, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, AbstractIllager.class, false));
    }
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10D);
    }

    @Override
    public void onUpdate(){
        super.onUpdate();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((this.isInWater())?5.0D:0.5D);
    }

}
