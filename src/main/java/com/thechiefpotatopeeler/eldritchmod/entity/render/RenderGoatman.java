package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityGoatman;
import com.thechiefpotatopeeler.eldritchmod.entity.model.ModelGoatman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderGoatman extends RenderLiving<EntityGoatman> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/goatman.png");
    //Sets the location for the texture

    public RenderGoatman(RenderManager manager) {
        super(manager, new ModelGoatman(), 0.5f); //Sets the model and the scale
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityGoatman entity) {
        return TEXTURE;
    }
}
