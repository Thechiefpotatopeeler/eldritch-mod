package com.eldritchmod.entities;

import com.eldritchmod.entities.ai.EntityAILaySpiderEgg;
import com.eldritchmod.handlers.LootTableHandler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
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
        super.initEntityAI();
        this.tasks.addTask(1, new EntityAILaySpiderEgg(this));
    }
    @Override
    protected ResourceLocation getLootTable() {
        return LootTableHandler.MATRIARCH;        
    }    
}