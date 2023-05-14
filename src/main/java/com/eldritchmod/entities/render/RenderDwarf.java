package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityDwarf;
import com.eldritchmod.entities.model.ModelDwarf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderDwarf extends RenderLiving<EntityDwarf> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/dwarf.png");
    //Sets the location for the texture

    public RenderDwarf(RenderManager manager) {
        super(manager, new ModelDwarf(), 0.5f); //Sets the model and the scale
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityDwarf entity) {
        return TEXTURE; //Returns the texture to the renderer
    }

    @Override
    protected void applyRotations(EntityDwarf entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);//No clue what this does but it works
    }
}
