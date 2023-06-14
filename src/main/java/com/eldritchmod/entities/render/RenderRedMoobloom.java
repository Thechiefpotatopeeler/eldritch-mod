package com.eldritchmod.entities.render;

import com.eldritchmod.entities.entity.moobloom.EntityRedMoobloom;
import com.eldritchmod.entities.model.ModelMoobloom;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRedMoobloom extends RenderLiving<EntityRedMoobloom> {


    public static final ResourceLocation TEXTURE_POPPY = new ResourceLocation("eldritch:textures/entity/moobloom_poppy.png");
    //public static final ResourceLocation TEXTURE_ALLIUM = new ResourceLocation("eldritch:textures/entity/moobloom_allium.png");
    //public static final ResourceLocation TEXTURE_ORCHID = new ResourceLocation("eldritch:textures/entity/moobloom_orchid.png");
    //Gives all the locations of the textures for the moobloom.

    public RenderRedMoobloom(RenderManager manager) {
        super(manager, new ModelMoobloom(), 0.7f); //Gives the model and the scale of the model.
        this.addLayer(new RedMoobloomFlowerLayer(this));
    }


    @Override
	protected ResourceLocation getEntityTexture(EntityRedMoobloom entity) {
        return TEXTURE_POPPY;
	}
}