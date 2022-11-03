package com.eldritchmod.blocks;

import java.util.Random;

import com.eldritchmod.Main;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
public class EuphoriumOre extends BlockBase {

    public EuphoriumOre(String name) {
        super(Material.ROCK, name, Main.eldritchmodmaterials);
        createItemBlock(); 
        this.setHardness(3.0F); 
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        //System.out.println("Poonis spoondis willy wonkledis fjkdsljkl;asdjkl;dsjkl;asdjkfdsjk MArissa's tea party is pooing on the moon\nfdjkls Each peachj poobleombleding plubm, I piepoeoedededed Tomb bumb thumb, Tom thub here tyhjre, Tom Thumb everywhere, Tom Thumb in a trewe, Tom thumb in my fdjnklsdklfsjklpoopoopoopeepepepepepeppepepepepepepepfgvsadklhjn;akdlfdswjaljkl;akjl;fdsa");
        return Item.getByNameOrId("eldritch_mod:euphorium_dust");
    }

    @Override
    public int getHarvestLevel(IBlockState state) {
        return 3;
    }
    @Override
    public String getHarvestTool(IBlockState state) {
        return "pickaxe";
    }
}