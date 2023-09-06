package com.thechiefpotatopeeler.eldritchmod.entity.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIAttackThunder extends EntityAIBase {

    public EntityLiving entity;
    public int delayCounter;
    public EntityAIAttackThunder(EntityLiving entity) {
        this.entity = entity;
    }

    @Override
    public boolean shouldExecute() {
        return (entity.getAttackTarget() instanceof EntityPlayer && entity.getDistance(entity.getAttackTarget()) < (float)entity.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue() && entity.getAttackTarget().isEntityAlive());
    }

    @Override
    public void startExecuting(){
        delayCounter = 0;
    }

    @Override
    public void updateTask(){
        if(delayCounter >= 100){
            executeAttack();
            delayCounter = 0;
        }
        delayCounter++;
    }

    public void executeAttack(){
        entity.world.spawnEntity( new EntityLightningBolt(entity.world, entity.getAttackTarget().posX, entity.getAttackTarget().posY, entity.getAttackTarget().posZ, false));
    }
}
