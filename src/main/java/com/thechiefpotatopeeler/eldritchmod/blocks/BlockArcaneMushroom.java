package com.thechiefpotatopeeler.eldritchmod.blocks;

import java.util.Random;

import com.thechiefpotatopeeler.eldritchmod.Main;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockArcaneMushroom extends BlockBase implements IGrowable{

    protected static final AxisAlignedBB MUSHROOM_AABB = new AxisAlignedBB(0.30000001192092896, 0.0, 0.30000001192092896, 0.699999988079071, 0.4000000059604645, 0.699999988079071);


    public BlockArcaneMushroom(String name) {
        super(Material.PLANTS, name, Main.eldritchmodmaterials,null);
        }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return true;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        //worldIn.getChunk(pos).addEntity(new EntitySpiderMatriarch(worldIn));
        for (Entity player : worldIn.getPlayers(Entity.class, (p) -> p.getDistanceSq(pos) < 50 * 50)) {
            player.sendMessage(new TextComponentString("That was a bad idea, thank god this feature is still WIP"));
        }
            
        }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public AxisAlignedBB getBoundingBox(IBlockState p_getBoundingBox_1_, IBlockAccess p_getBoundingBox_2_, BlockPos p_getBoundingBox_3_) {
        return MUSHROOM_AABB;
    }

}
