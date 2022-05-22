package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityMoobloom;
import com.eldritchmod.entities.model.ModelMoobloom;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMoobloom extends RenderLiving<EntityMoobloom> {

    public String variant;

    public static final ResourceLocation TEXTURE_DANDELION = new ResourceLocation("eldritch_mod:textures/entity/moobloom_dandelion.png");
    public static final ResourceLocation TEXTURE_POPPY = new ResourceLocation("eldritch_mod:textures/entity/moobloom_rose.png");
    public static final ResourceLocation TEXTURE_ALLIUM = new ResourceLocation("eldritch_mod:textures/entity/moobloom_allium.png");
    public static final ResourceLocation TEXTURE_ORCHID = new ResourceLocation("eldritch_mod:textures/entity/moobloom_orchid.png");
    //Gives all the locations of the textures for the moobloom.

    public RenderMoobloom(RenderManager manager) {
        super(manager, new ModelMoobloom(), 0.5f); //Gives the model and the scale of the model.

    }

    @Override
	protected ResourceLocation getEntityTexture(EntityMoobloom entity) {
        switch(variant) { //Determines which 
            case "DANDELION":
                return TEXTURE_DANDELION;
            case "POPPY":
                return TEXTURE_POPPY;
            case "ALLIUM":
                return TEXTURE_ALLIUM;
            case "BLUE_ORCHID":
                return TEXTURE_ORCHID;
            default:
                throw new IllegalArgumentException("Invalid variant: " + variant);
        }
	}
}