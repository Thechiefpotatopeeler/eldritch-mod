package com.eldritchmod.entity.render;

import com.eldritchmod.entity.entity.moobloom.EntityYellowMoobloom;
import com.eldritchmod.entity.model.ModelMoobloom;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYellowMoobloom extends RenderLiving<EntityYellowMoobloom> {

    public String variant;

    public static final ResourceLocation TEXTURE_DANDELION = new ResourceLocation("eldritch:textures/entity/moobloom_dandelion.png");
    //public static final ResourceLocation TEXTURE_POPPY = new ResourceLocation("eldritch:textures/entity/moobloom_rose.png");
    //public static final ResourceLocation TEXTURE_ALLIUM = new ResourceLocation("eldritch:textures/entity/moobloom_allium.png");
    //public static final ResourceLocation TEXTURE_ORCHID = new ResourceLocation("eldritch:textures/entity/moobloom_orchid.png");
    //Gives all the locations of the textures for the moobloom.

    public RenderYellowMoobloom(RenderManager manager) {
        super(manager, new ModelMoobloom(), 0.7f); //Gives the model and the scale of the model.
        this.addLayer(new YellowMoobloomFlowerLayer(this));
    }


    @Override
	protected ResourceLocation getEntityTexture(EntityYellowMoobloom entity) {
        return TEXTURE_DANDELION;
	}
}