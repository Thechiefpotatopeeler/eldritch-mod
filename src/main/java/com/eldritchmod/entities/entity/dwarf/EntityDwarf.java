package com.eldritchmod.entities.entity.dwarf;

import com.eldritchmod.Ref;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityDwarf extends EntityCreature implements IMerchant {

    public MerchantRecipeList trades;
    public EntityPlayer customer;

    public EntityDwarf(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.7F);
    }

    public void initEntityAI(){
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.8));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIWander(this, 0.8));
        this.tasks.addTask(3, new EntityAIAttackMelee(this,1.0,true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
    }

    public boolean processInteract(EntityPlayer playerIn, EnumHand hand){
        ItemStack itemstack = playerIn.getHeldItem(hand);
        boolean flag = itemstack.getItem() == Items.NAME_TAG;
        if (flag) {
            itemstack.interactWithEntity(playerIn, this, hand);
            return true;
        } else if (this.isEntityAlive() && !this.isChild() && !playerIn.isSneaking()) {

            if (!this.world.isRemote && !this.trades.isEmpty()) {
                this.setCustomer(playerIn);
            }

            return true;
        } else {
            return super.processInteract(playerIn, hand);
        }
    }

    @Override
    public void setCustomer(@Nullable EntityPlayer entityPlayer) {
        this.customer = entityPlayer;
    }

    @Nullable
    @Override
    public EntityPlayer getCustomer() {
        return this.customer;
    }

    @Nullable
    @Override
    public MerchantRecipeList getRecipes(EntityPlayer entityPlayer) {
        return Ref.getDwarfTrades();
    }

    @Override
    public void setRecipes(@Nullable MerchantRecipeList merchantRecipeList) {

    }

    @Override
    public void useRecipe(MerchantRecipe merchantRecipe) {

    }

    @Override
    public void verifySellingItem(ItemStack itemStack) {

    }

    @Override
    public World getWorld() {
        return null;
    }

    @Override
    public BlockPos getPos() {
        return null;
    }
}
