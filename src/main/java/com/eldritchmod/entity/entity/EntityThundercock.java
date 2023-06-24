package com.eldritchmod.entity.entity;

import com.eldritchmod.entity.EntityBossBase;
import com.eldritchmod.entity.ai.EntityAIAttackThunder;
import com.eldritchmod.entity.ai.EntityAICauseStorm;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityThundercock extends EntityBossBase {

    public EntityThundercock(World worldIn) {
        super(worldIn);
        this.setSize(2.0F, 4.0F);
    }


    @Override
    public void initEntityAI(){
        super.initEntityAI();
        this.tasks.addTask(1, new EntityAICauseStorm(this));
        this.tasks.addTask(2, new EntityAIAttackThunder(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, (float)this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue()));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false));
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20D);
    }




}
