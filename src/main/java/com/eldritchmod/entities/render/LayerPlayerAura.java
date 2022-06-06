package com.eldritchmod.entities.render;


import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class LayerPlayerAura implements LayerRenderer<EntityLivingBase> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("eldritchmod:textures/entity/aura.png");

    private final RenderPlayer playerRenderer;
    public LayerPlayerAura(RenderPlayer renderer) {
        this.playerRenderer = renderer;
    }

	@Override
    public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount,
            float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        //System.out.println("magic user type is"+magicUserType.getType());
        this.playerRenderer.bindTexture(TEXTURE);
        GlStateManager.pushMatrix();
        this.playerRenderer.getMainModel().bipedBody.renderWithRotation(0.0001f);
        GlStateManager.popMatrix();
        
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
    
}