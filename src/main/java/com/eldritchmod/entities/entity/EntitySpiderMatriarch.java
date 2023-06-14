package com.eldritchmod.entities.entity;

import com.eldritchmod.entities.ai.EntityAILaySpiderEgg;
import com.eldritchmod.entities.entity.dwarf.EntityDwarf;
import com.eldritchmod.handlers.LootTableHandler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntitySpiderMatriarch extends EntitySpider {

    public EntitySpiderMatriarch(World worldIn) {
        super(worldIn);
        this.setSize(1.8F, 1.0F);
    }
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAILaySpiderEgg(this));
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.8));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIAttackMelee(this, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityDwarf.class, false));
    }
    @Override
    protected ResourceLocation getLootTable() {
        return LootTableHandler.MATRIARCH;        
    }    
}