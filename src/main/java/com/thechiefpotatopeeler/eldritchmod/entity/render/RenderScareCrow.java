package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.EntityScarecrow;
import com.thechiefpotatopeeler.eldritchmod.entity.entity.ModelScarecrow;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderScareCrow extends RenderLiving<EntityScarecrow> {

    ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/scarecrow.png");
    public RenderScareCrow(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelScarecrow(), 0.6f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityScarecrow entity) {
        return TEXTURE;
    }
}
