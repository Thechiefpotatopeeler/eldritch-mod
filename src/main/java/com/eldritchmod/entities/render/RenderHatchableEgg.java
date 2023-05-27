package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityDwarf;
import com.eldritchmod.entities.EntityHatchableEgg;
import com.eldritchmod.entities.model.ModelDwarf;
import com.eldritchmod.entities.model.ModelHatchableEgg;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderHatchableEgg extends RenderLiving<EntityHatchableEgg> {
    public static final ResourceLocation TEXTURE_UNCRACKED = new ResourceLocation("eldritch:textures/entity/egg_spider.png");
    public static final ResourceLocation TEXTURE_HALF_CRACKED = new ResourceLocation("eldritch:textures/entity/egg_spider_half.png");

    public static final ResourceLocation TEXTURE_CRACKED = new ResourceLocation("eldritch:textures/entity/egg_spider_cracked.png");
    //Sets the location for the texture

    public RenderHatchableEgg(RenderManager manager) {
        super(manager, new ModelHatchableEgg(), 0.5f); //Sets the model and the scale
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHatchableEgg entityHatchableEgg) {
        switch (entityHatchableEgg.getHatchedness()){
            case 1:
                return TEXTURE_HALF_CRACKED;
            case 2:
                return TEXTURE_CRACKED;
            default:
                return TEXTURE_UNCRACKED;
        }
    }
    @Override
    protected void applyRotations(EntityHatchableEgg entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}
