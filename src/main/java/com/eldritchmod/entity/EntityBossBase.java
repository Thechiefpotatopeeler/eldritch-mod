package com.eldritchmod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityBossBase extends EntityMob {

    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfoServer.Color.BLUE, BossInfoServer.Overlay.PROGRESS)).setDarkenSky(true);

    public EntityBossBase(World worldIn) {
        super(worldIn);
    }

    @Override
    public boolean isNonBoss(){
        return false;
    }

    @Override
    public void onLivingUpdate(){
        super.onLivingUpdate();
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }

    /**
     * Add the given player to the list of players tracking this entity. For instance, a player may track a boss in
     * order to view its associated boss bar.
     */
    public void addTrackingPlayer(EntityPlayerMP player)
    {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    /**
     * Removes the given player from the list of players tracking this entity. See {@link Entity#addTrackingPlayer} for
     * more information on tracking.
     */
    public void removeTrackingPlayer(EntityPlayerMP player)
    {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }
}
