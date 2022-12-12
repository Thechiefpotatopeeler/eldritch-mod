package com.eldritchmod.blocks;

import com.eldritchmod.Ref;
import com.eldritchmod.data.Mana;
import com.eldritchmod.handlers.ManaProvider;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentSelector;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockGargoyleStatue extends BlockBase{

    public BlockGargoyleStatue(String name) {
    super(Material.ROCK,name, CreativeTabs.MISC);
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

    @Override
    public boolean onBlockActivated(World worldIn, net.minecraft.util.math.BlockPos pos, IBlockState state, EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            if(playerIn.getCapability(ManaProvider.MANA_CAP, null).getMagicType() == Mana.MagicUserTypes.NECROMANCER) {
                playerIn.sendMessage(new TextComponentString("This doesn't do much at the moment"));
            }
        }
        return true;
    }
}