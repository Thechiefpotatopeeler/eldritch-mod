package com.eldritchmod.entities.ai;

import com.eldritchmod.entities.entity.EntityHatchableEgg;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAILaySpiderEgg extends EntityAIBase {

    private int counter;
    private EntityLiving entity;

    private EntityHatchableEgg lastEgg;

    public EntityAILaySpiderEgg(EntityLiving entity){
        this.entity=entity;
    }


    @Override
    public boolean shouldExecute() {
        return true;
    }

    @Override
    public void updateTask() {
        counter++;
        if(counter >= 500 && ((lastEgg.getHatchedness()>1||lastEgg==null||lastEgg.isDead)&&entity.getAttackTarget()!=null)){
            counter = 0;
            spawnEgg();
        } else if(entity.getAttackTarget() instanceof EntityPlayer && counter >= 200 && lastEgg.getHatchedness()>0){
            lastEgg.hatch();
            counter = 0;
            spawnEgg();
        }
    }
    @Override
    public void startExecuting() {
        spawnEgg();
        counter = 0;
    }

    @Override
    public void resetTask() {
        counter = 0;
    }

    public void spawnEgg(){
        EntityHatchableEgg entity = new EntityHatchableEgg(this.entity.world);
        lastEgg = entity;
        entity.setLocationAndAngles(this.entity.posX, this.entity.posY, this.entity.posZ, this.entity.rotationYaw, 0.0F);
        this.entity.world.spawnEntity(entity);
    }
}
