package com.eldritchmod.entity.render;

import com.eldritchmod.entity.entity.EntityBarnacle;

import com.eldritchmod.entity.model.ModelBarnacle;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBarnacle extends RenderLiving<EntityBarnacle> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/barnacle.png");
    //Sets the location for the texture

    public RenderBarnacle(RenderManager manager) {
        super(manager, new ModelBarnacle(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBarnacle entity) {
        return TEXTURE; //Returns the texture to the renderer
    }
}