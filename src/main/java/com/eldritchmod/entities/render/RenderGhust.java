package com.eldritchmod.entities.render;

import com.eldritchmod.entities.entity.EntityGhust;
import com.eldritchmod.entities.model.ModelGhust;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGhust extends RenderLiving<EntityGhust> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/ghust.png");
    //Sets the location for the texture

    public RenderGhust(RenderManager manager) {
        super(manager, new ModelGhust(), 0.5f); //Sets the model and the scale
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityGhust entity) {
        return TEXTURE; //Returns the texture to the renderer
    }

    @Override
    protected void applyRotations(EntityGhust entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}
