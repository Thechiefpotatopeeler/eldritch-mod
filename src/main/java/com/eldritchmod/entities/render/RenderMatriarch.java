package com.eldritchmod.entities.render;

import com.eldritchmod.entities.entity.EntitySpiderMatriarch;

import com.eldritchmod.entities.model.ModelMatriarch;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMatriarch extends RenderLiving<EntitySpiderMatriarch> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/matriarch.png");
    //Sets the location for the texture

    public RenderMatriarch(RenderManager manager) {
        super(manager, new ModelMatriarch(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySpiderMatriarch entity) {
        return TEXTURE; //Returns the texture to the renderer
    }

    @Override
    protected void applyRotations(EntitySpiderMatriarch entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}