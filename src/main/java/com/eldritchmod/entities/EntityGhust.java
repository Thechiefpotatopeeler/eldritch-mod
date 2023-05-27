package com.eldritchmod.entities;

import com.google.common.base.Optional;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class EntityGhust extends EntityFlying implements IEntityOwnable {

    protected static DataParameter<Byte> TAMED;
    protected static DataParameter<Optional<UUID>> OWNER_UNIQUE_ID;
    public EntityGhust(World worldIn) {
        super(worldIn);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(TAMED, (byte)0);
        this.dataManager.register(OWNER_UNIQUE_ID, Optional.absent());
    }

    public void writeEntityToNBT(NBTTagCompound p_writeEntityToNBT_1_) {
        super.writeEntityToNBT(p_writeEntityToNBT_1_);
        if (this.getOwnerId() == null) {
            p_writeEntityToNBT_1_.setString("OwnerUUID", "");
        } else {
            p_writeEntityToNBT_1_.setString("OwnerUUID", this.getOwnerId().toString());
        }
    }

    public void readEntityFromNBT(NBTTagCompound p_readEntityFromNBT_1_) {
        super.readEntityFromNBT(p_readEntityFromNBT_1_);
        String lvt_2_2_;
        if (p_readEntityFromNBT_1_.hasKey("OwnerUUID", 8)) {
            lvt_2_2_ = p_readEntityFromNBT_1_.getString("OwnerUUID");
        } else {
            String lvt_3_1_ = p_readEntityFromNBT_1_.getString("Owner");
            lvt_2_2_ = PreYggdrasilConverter.convertMobOwnerIfNeeded(this.getServer(), lvt_3_1_);
        }

        if (!lvt_2_2_.isEmpty()) {
            try {
                this.setOwnerId(UUID.fromString(lvt_2_2_));
                this.setTamed(true);
            } catch (Throwable var4) {
                this.setTamed(false);
            }
        }
    }

    public void setTamed(boolean p_setTamed_1_) {
        byte lvt_2_1_ = (Byte)this.dataManager.get(TAMED);
        if (p_setTamed_1_) {
            this.dataManager.set(TAMED, (byte)(lvt_2_1_ | 4));
        } else {
            this.dataManager.set(TAMED, (byte)(lvt_2_1_ & -5));
        }

        this.setupTamedAI();
    }

    protected void setupTamedAI() {
    }
    @Nullable
    @Override
    public UUID getOwnerId() {
        return (UUID)((Optional)this.dataManager.get(OWNER_UNIQUE_ID)).orNull();
    }

    public void setOwnerId(@Nullable UUID p_setOwnerId_1_) {
        this.dataManager.set(OWNER_UNIQUE_ID, Optional.fromNullable(p_setOwnerId_1_));
    }

    @Nullable
    @Override
    public EntityLivingBase getOwner() {
        try {
            UUID owner = this.getOwnerId();
            return owner == null ? null : this.world.getPlayerEntityByUUID(owner);
        } catch (IllegalArgumentException var2) {
            return null;
        }
    }
}
