package com.eldritchmod.entities.render;

import com.eldritchmod.entities.EntityBlueMoobloom;
import com.eldritchmod.entities.model.ModelMoobloom;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBlueMoobloom extends RenderLiving<EntityBlueMoobloom> {


    public static final ResourceLocation TEXTURE_POPPY = new ResourceLocation("eldritch_mod:textures/entity/moobloom_poppy.png");
    //public static final ResourceLocation TEXTURE_ALLIUM = new ResourceLocation("eldritch_mod:textures/entity/moobloom_allium.png");
    //public static final ResourceLocation TEXTURE_ORCHID = new ResourceLocation("eldritch_mod:textures/entity/moobloom_orchid.png");
    //Gives all the locations of the textures for the moobloom.

    public RenderBlueMoobloom(RenderManager manager) {
        super(manager, new ModelMoobloom(), 0.7f); //Gives the model and the scale of the model.
        this.addLayer(new BlueMoobloomFlowerLayer(this));
    }


    @Override
	protected ResourceLocation getEntityTexture(EntityBlueMoobloom entity) {
        return TEXTURE_POPPY;
	}
}