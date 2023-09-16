package com.thechiefpotatopeeler.eldritchmod.entity.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAICauseStorm extends EntityAIBase {

    public EntityLiving entity;
    public EntityAICauseStorm(EntityLiving entity){
        this.entity=entity;
    }

    @Override
    public boolean shouldExecute() {
        return true;
    }

    @Override
    public void startExecuting() {
        entity.world.setRainStrength(1.0F);
        entity.world.setThunderStrength(1.0F);
    }

    @Override
    public void updateTask() {
        if (entity.world.isRaining()) entity.world.setRainStrength(1.0F);
    }
}
