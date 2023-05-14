package com.eldritchmod.entities;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.NpcMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityDwarf extends EntityVillager implements IMerchant, INpc {

    public EntityDwarf(World worldIn) {
        super(worldIn);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void setCustomer(@Nullable EntityPlayer entityPlayer) {

    }

    @Nullable
    @Override
    public EntityPlayer getCustomer() {
        return null;
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
