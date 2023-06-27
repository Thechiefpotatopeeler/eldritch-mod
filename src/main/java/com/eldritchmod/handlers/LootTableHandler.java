package com.eldritchmod.handlers;

import com.eldritchmod.init.ItemsRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LootTableHandler {

    public static final ResourceLocation MATRIARCH=LootTableList.register(new ResourceLocation("eldritch:matriarch"));

    @SubscribeEvent
    public static void overrideLoot(LivingDropsEvent event){
        EntityLivingBase entity = event.getEntityLiving();
        if(entity instanceof EntityDragon) {
            EntityItem item = new EntityItem(entity.world, entity.posX, entity.posY, entity.posZ, new ItemStack(ItemsRegistry.DragonScale, entity.getRNG().nextInt(128)+128));
            event.getDrops().add(item);
        }
    }
    
}