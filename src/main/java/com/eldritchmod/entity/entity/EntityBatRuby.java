package com.eldritchmod.entity.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBatRuby extends EntityCreature {
    //Reference for a friend
    public EntityBatRuby(World worldIn) {
        super(worldIn);
    }

    @Override
    public void initEntityAI(){
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPig.class, false));
    }

    @Override
    public void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0D);
    }
}
