package com.eldritchmod.entities;

import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityGhust extends EntityFlying {

    private EntityPlayer following;
    public EntityGhust(World worldIn) {
        super(worldIn);
    }

    protected void entityInit() {
        super.entityInit();
        this.setSize(1.0F, 2.0F);
    }

    @Override
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(16.0D);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
    }

    @Nullable
    public EntityPlayer getFollowing() {
        return following;
    }

    @Override
    public boolean canPassengerSteer(){
        return true;
    }

    @Override
    public void onUpdate(){
        super.onUpdate();
    }

    public void shootFireBall(){
        Vec3d vec3d = this.getLook(1.0F);
        EntityLargeFireball entitylargefireball = new EntityLargeFireball(world, this, vec3d.x, vec3d.y, vec3d.z);
        entitylargefireball.explosionPower = 1;
        entitylargefireball.posX = this.posX + vec3d.x * 4.0D;
        entitylargefireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3d.z * 4.0D;
        world.spawnEntity(entitylargefireball);
    }


    public boolean processInteract(EntityPlayer playerIn, EnumHand hand) {
        if (!super.processInteract(playerIn, hand)) {
            ItemStack itemstack = playerIn.getHeldItem(hand);

            if (itemstack.getItem() == Items.NAME_TAG) {
                itemstack.interactWithEntity(playerIn, this, hand);
                return true;
            }
            else if (!this.isBeingRidden()) {
                if (!this.world.isRemote) {
                    playerIn.startRiding(this);
                }
                return true;
            }
            else if(playerIn.isSneaking()) {
                this.following = playerIn;
            }
            else return false;
        }
        return super.processInteract(playerIn, hand);
    }

    public void travel(float strafe, float vertical, float forward)
    {
        Entity entity = this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);

        if (this.isBeingRidden())
        {
            this.rotationYaw = entity.rotationYaw;
            this.prevRotationYaw = this.rotationYaw;
            this.rotationPitch = entity.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.renderYawOffset = this.rotationYaw;
            this.rotationYawHead = this.rotationYaw;
            this.stepHeight = 1.0F;
            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

            if (this.canPassengerSteer())
            {
                float f = (float)this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * 1.2F;
                this.setAIMoveSpeed(f);
                float f2 = MathHelper.sin(this.rotationPitch * -0.017453292F);
                super.travel(0.0F, f2, 1.0F);
            }
            else
            {
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }

            this.prevLimbSwingAmount = this.limbSwingAmount;
            double d1 = this.posX - this.prevPosX;
            double d0 = this.posZ - this.prevPosZ;
            float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;

            if (f1 > 1.0F)
            {
                f1 = 1.0F;
            }

            this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
            this.limbSwing += this.limbSwingAmount;
        }
        else
        {
            this.stepHeight = 0.5F;
            this.jumpMovementFactor = 0.02F;
            super.travel(strafe, vertical, forward);
        }
    }
}
