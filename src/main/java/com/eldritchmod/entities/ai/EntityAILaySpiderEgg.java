package com.eldritchmod.entities.ai;

import com.eldritchmod.entities.EntityHatchableEgg;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntitySpider;

public class EntityAILaySpiderEgg extends EntityAIBase {

    public final Entity EGG;

    public Entity entity;

    public EntityAILaySpiderEgg(EntityLiving entity){
        this.entity=entity;
        this.EGG=new EntityHatchableEgg(entity.world);
    }


    @Override
    public boolean shouldExecute() {
        return true;
    }
}
