package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityDwarf;
import com.eldritchmod.entities.EntityHatchableEgg;
import com.eldritchmod.entities.model.ModelDwarf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderHatchableEgg extends RenderLiving<EntityHatchableEgg> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/egg.png");
    //Sets the location for the texture

    public RenderHatchableEgg(RenderManager manager) {
        super(manager, new ModelDwarf(), 0.5f); //Sets the model and the scale
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHatchableEgg entityHatchableEgg) {
        return TEXTURE;
    }
    @Override
    protected void applyRotations(EntityHatchableEgg entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}
