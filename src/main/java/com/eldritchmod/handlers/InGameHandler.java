package com.eldritchmod.handlers;

import com.eldritchmod.Main;
import com.eldritchmod.Ref;
import com.eldritchmod.entity.entity.EntityGhust;
import com.eldritchmod.init.ItemsRegistry;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class InGameHandler {

    @SubscribeEvent
    public static void itemRightClickHandle(PlayerInteractEvent.RightClickEmpty event){
        EntityPlayer player = event.getEntityPlayer();
        if(player.getRidingEntity() instanceof EntityGhust){
            ((EntityGhust) player.getRidingEntity()).shootFireBall();
        }
        if(player.getHeldItemMainhand().getItem() == ItemsRegistry.SemenBucket){
        }
    }

    @SubscribeEvent
    public static void entityRightClickHand(PlayerInteractEvent.EntityInteract event){
        EntityPlayer player = event.getEntityPlayer();
        ItemStack itemstack = player.getHeldItemMainhand();
        double rand = Math.random()*4;
        if(event.getTarget() instanceof EntityCow && itemstack.getItem() == Items.BUCKET && !player.capabilities.isCreativeMode && !((EntityCow)event.getTarget()).isChild()&&rand<=1.0D){
            player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            itemstack.shrink(1);

            if (itemstack.isEmpty()) {
                player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ItemsRegistry.SemenBucket));
            }
            else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemsRegistry.SemenBucket))) {
                player.dropItem(new ItemStack(ItemsRegistry.SemenBucket), false);
            }

            player.sendMessage(new TextComponentString("Uh oh, must have been a bull!"));
        }
    }

}
