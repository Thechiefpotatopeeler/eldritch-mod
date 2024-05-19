package com.thechiefpotatopeeler.eldritchmod.handlers;

import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityGhust;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityScarecrow;
import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
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

    @SubscribeEvent
    public static void blockPlaced(BlockEvent.PlaceEvent event){
        if(!(event.getPlacedBlock().getBlock() == Blocks.PUMPKIN && event.getPlacedAgainst().getBlock()==Blocks.HAY_BLOCK)){
            return;
        }
        BlockPos pos = event.getPos();
        World world = event.getWorld();
        if(world.getBlockState(pos.up()).getBlock() == Blocks.AIR){
            System.out.println(pos.toString());
            if(world.getBlockState(pos.down()).getBlock() == Blocks.HAY_BLOCK){
                if(world.getBlockState(pos.down(2)).getBlock() == Blocks.OAK_FENCE){
                    world.setBlockToAir(pos);
                    world.setBlockToAir(pos.down());
                    world.setBlockToAir(pos.down(2));
                    EntityScarecrow scarecrow = new EntityScarecrow(world);
                    scarecrow.setPosition(pos.getX()+0.5D, pos.getY()-1.0D, pos.getZ()+0.5D);
                    world.spawnEntity(scarecrow);
                }
            }
        }
    }
}
