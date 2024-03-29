package com.thechiefpotatopeeler.eldritchmod.blocks;

import com.thechiefpotatopeeler.eldritchmod.Ref;
import com.thechiefpotatopeeler.eldritchmod.init.ItemsRegistry;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EldritchAltar extends BlockBase{

    public EldritchAltar(String name) {
        super(Material.ROCK,name, CreativeTabs.MISC,"pickaxe");
        setHardness(2.0F);
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @Override 
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    /*@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, net.minecraft.world.IBlockAccess source, net.minecraft.util.math.BlockPos pos) {
        return new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 14, 0.0625 * 14);
    }*/

    @Override
    public boolean onBlockActivated(World worldIn, net.minecraft.util.math.BlockPos pos, IBlockState state, EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            if(playerIn.getHeldItemMainhand().getItem() == ItemsRegistry.EuphoriumDust){
                int count = playerIn.getHeldItemMainhand().getCount();
                playerIn.getHeldItemMainhand().setCount(0);
                playerIn.attackEntityFrom(Ref.MESSING_WITH_ARCANE, (float) (count * 0.5));
                playerIn.addItemStackToInventory(new ItemStack(ItemsRegistry.EldritchShard, count));
            }
            return false;
        }

        return true;
    }
}