package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.data.IMana;
import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerManaTracker {

    private final EntityPlayer player;
    private final IMana mana;

    public PlayerManaTracker(EntityPlayer player){
        this.player = player;
        this.mana = player.getCapability(ManaProvider.MANA_CAP, null);
    }

    public boolean regenMana() {
        if (player.world.isRemote || !mana.canRegen()) return false;
        System.out.println("Regenning mana for " + player.getName() + " (" + mana.getMana() + "/" + mana.getMaxMana() + ")");
        mana.fill(1, player);
        return true;
    }
    public EntityPlayer getPlayer() {
        return player;
    }
}
