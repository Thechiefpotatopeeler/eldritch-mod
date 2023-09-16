package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityPoobloom;
import com.thechiefpotatopeeler.eldritchmod.entity.model.ModelMoobloom;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoobloom extends RenderLiving<EntityPoobloom> {

//This is the secret poobloom entity.
    public static final ResourceLocation TEXTURE_POO = new ResourceLocation("eldritch:textures/entity/moobloom_poo.png");
    //public static final ResourceLocation TEXTURE_ALLIUM = new ResourceLocation("eldritch:textures/entity/moobloom_allium.png");
    //public static final ResourceLocation TEXTURE_ORCHID = new ResourceLocation("eldritch:textures/entity/moobloom_orchid.png");
    //Gives all the locations of the textures for the moobloom.

    public RenderPoobloom(RenderManager manager) {
        super(manager, new ModelMoobloom(), 0.7f); //Gives the model and the scale of the model.
    }


    @Override
	protected ResourceLocation getEntityTexture(EntityPoobloom entity) {
        return TEXTURE_POO;
	}
}