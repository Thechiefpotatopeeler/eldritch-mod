package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityThundercock;
import com.thechiefpotatopeeler.eldritchmod.entity.model.ModelThundercock;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThundercock extends RenderLiving<EntityThundercock> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/thundercock.png");
    //Sets the location for the texture

    public RenderThundercock(RenderManager manager) {
        super(manager, new ModelThundercock(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityThundercock entity) {
        return TEXTURE; //Returns the texture to the renderer
    }

    @Override
    protected void applyRotations(EntityThundercock entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}