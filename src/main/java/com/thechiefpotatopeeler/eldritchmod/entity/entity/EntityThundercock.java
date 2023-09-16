package com.thechiefpotatopeeler.eldritchmod.entity.entity;

import com.thechiefpotatopeeler.eldritchmod.entity.ai.EntityAIAttackThunder;
import com.thechiefpotatopeeler.eldritchmod.entity.ai.EntityAICauseStorm;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityThundercock extends EntityBossBase {

    public EntityThundercock(World worldIn) {
        super(worldIn);
        this.setSize(2.0F, 4.0F);
        this.experienceValue = 9000;
    }


    @Override
    public void initEntityAI(){
        super.initEntityAI();
        this.tasks.addTask(1, new EntityAICauseStorm(this));
        this.tasks.addTask(2, new EntityAIAttackThunder(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, (float)this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue()));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20D);
    }

    @Override
    public void onDeath(DamageSource cause){

        super.onDeath(cause);
        this.world.spawnEntity(new EntityLightningBolt(this.world, this.posX, this.posY, this.posZ, false));

        for(int i=0;i<250;i++){
            EntityEgg chicken = new EntityEgg(this.world);
            chicken.setLocationAndAngles(this.posX + (Math.random()*7)-3, this.posY+(Math.random()*3)+5, this.posZ+(Math.random()*7)-3, this.rotationYaw, 0.0F);
            this.world.spawnEntity(chicken);
        }
    }
}
