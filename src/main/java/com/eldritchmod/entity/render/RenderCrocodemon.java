package com.eldritchmod.entity.render;

import com.eldritchmod.entity.entity.EntityCrocodemon;
import com.eldritchmod.entity.model.ModelCrocodemon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCrocodemon extends RenderLiving<EntityCrocodemon> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/crocodemon.png");
    //Sets the location for the texture

    public RenderCrocodemon(RenderManager manager) {
        super(manager, new ModelCrocodemon(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCrocodemon entity) {
        return TEXTURE; //Returns the texture to the renderer
    }

    @Override
    protected void applyRotations(EntityCrocodemon entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}