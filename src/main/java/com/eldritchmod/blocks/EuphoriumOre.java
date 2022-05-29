package com.eldritchmod.blocks;

import java.util.Random;

import com.eldritchmod.Main;
import com.eldritchmod.items.EuphoriumDust;
import com.eldritchmod.items.ItemBase;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
public class EuphoriumOre extends BlockBase {

    public EuphoriumOre(String name) {
        super(Material.ROCK, name);
        setCreativeTab(Main.eldritchmodmaterials);
        createItemBlock();      
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        System.out.println("Poonis spoondis willy wonkledis fjkdsljkl;asdjkl;dsjkl;asdjkfdsjk MArissa's tea party is pooing on the moon\nfdjkls Each peachj poobleombleding plubm, I piepoeoedededed Tomb bumb thumb, Tom thub here tyhjre, Tom Thumb everywhere, Tom Thumb in a trewe, Tom thumb in my fdjnklsdklfsjklpoopoopoopeepepepepepeppepepepepepepepfgvsadklhjn;akdlfdswjaljkl;akjl;fdsa");
        return Item.getByNameOrId("euphorium_dust");
    }
}