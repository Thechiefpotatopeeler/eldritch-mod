package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityBarnacle;
import com.eldritchmod.entities.model.ModelBarnacle;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBarnacle extends RenderLiving<EntityBarnacle> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch_mod:textures/entity/barnacle.png");
    //Sets the location for the texture

    public RenderBarnacle(RenderManager manager) {
        super(manager, new ModelBarnacle(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBarnacle entity) {
        return TEXTURE; //Returns the texture to the renderer
    }
}