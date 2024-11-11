package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityScarecrow;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.ModelScarecrow;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.shroomoid.ShroomoidBase;
import com.thechiefpotatopeeler.eldritchmod.entity.model.ModelShroomoid;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderShroomoid extends RenderLiving<ShroomoidBase> {
    ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/shroomoid.png");
    public RenderShroomoid(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelShroomoid(), 0.6f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(ShroomoidBase entity) {
        return TEXTURE;
    }
}
