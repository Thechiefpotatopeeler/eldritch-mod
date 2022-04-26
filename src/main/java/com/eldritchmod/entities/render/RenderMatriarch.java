package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntitySpiderMatriarch;
import com.eldritchmod.entities.model.ModelMatriarch;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMatriarch extends RenderLiving<EntitySpiderMatriarch> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch_mod:textures/entity/matriarch.png");

    public RenderMatriarch(RenderManager manager) {
        super(manager, new ModelMatriarch(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySpiderMatriarch entity) {
        return TEXTURE;
    }

    @Override
    protected void applyRotations(EntitySpiderMatriarch entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}