package com.eldritchmod.entities;

import com.eldritchmod.Ref;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityDwarf extends EntityTraderBase {

    public EntityDwarf(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.6F);
    }

    @Override
    public MerchantRecipeList getRecipes(EntityPlayer entityPlayer) {
        return Ref.getDwarfTrades();
    }
}
