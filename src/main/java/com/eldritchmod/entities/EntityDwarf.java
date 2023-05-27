package com.eldritchmod.entities;

import com.eldritchmod.Ref;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityDwarf extends EntityCreature {

    public EntityDwarf(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.6F);
    }

    public void initEntityAI(){
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.8));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIWander(this, 0.8));
        this.tasks.addTask(8,new EntityAIAttackMelee(this,1.0,false));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0);
    }

    /*@Override
    public MerchantRecipeList getRecipes(EntityPlayer entityPlayer) {
        return Ref.getDwarfTrades();
    }*/

    /*public void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        this.setItemStackToSlot(net.minecraft.inventory.EntityEquipmentSlot.MAINHAND, new net.minecraft.item.ItemStack(net.minecraft.init.Items.IRON_AXE));
    }*/
}
