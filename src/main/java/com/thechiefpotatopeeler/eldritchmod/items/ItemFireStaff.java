package com.thechiefpotatopeeler.eldritchmod.items;

import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemFireStaff extends ItemBase{
    public ItemFireStaff(String name, CreativeTabs tab) {
        super(name, tab);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) return EnumActionResult.SUCCESS;
        worldIn.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 4.0F, false).getPlayerKnockbackMap().put(player, new Vec3d(hitX, hitY, hitZ));
        player.getPositionVector().add(new Vec3d(hitX, hitY, hitZ));
        player.getCapability(ManaProvider.MANA_CAP, null).consume(10, player);
        return EnumActionResult.SUCCESS;
    }

}
