package com.eldritchmod.entities;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import com.eldritchmod.Main;

import javax.annotation.Nullable;

public class EntityTraderBase extends EntityCreature implements IMerchant, INpc {

    public MerchantRecipeList trades;
    public EntityAITasks tasks;

    public EntityPlayer customer;
    public EntityTraderBase(World worldIn) {
        super(worldIn);
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
                //playerIn.openGui(getWorld(), 0, this.world, this.getEntityId(), 0, 0);
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
        return null;
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
