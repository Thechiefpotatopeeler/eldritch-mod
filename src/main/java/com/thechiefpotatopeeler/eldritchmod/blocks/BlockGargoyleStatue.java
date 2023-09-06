package com.thechiefpotatopeeler.eldritchmod.blocks;

import com.thechiefpotatopeeler.eldritchmod.data.Mana;
import com.thechiefpotatopeeler.eldritchmod.data.ManaProvider;
import com.thechiefpotatopeeler.eldritchmod.tileentities.TileEntityGargoyleStatue;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockGargoyleStatue extends BlockBase implements ITileEntityProvider{

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockGargoyleStatue(String name) {
    super(Material.ROCK,name, CreativeTabs.MISC);
        setHardness(2.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING);
    }
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer).getOpposite());
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();

    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
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

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityGargoyleStatue();
    }
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(this);
    }
}