package com.eldritchmod.entity.render;

import com.eldritchmod.entity.model.ModelAura;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class LayerPlayerAura implements LayerRenderer<EntityLivingBase> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("eldritch:textures/entity/aura.png");
    private final RenderPlayer playerRenderer;

    public LayerPlayerAura(RenderPlayer renderer) {
        this.playerRenderer = renderer;
    }

    @Override
    public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        //TODO adjust coefficients
        GlStateManager.enableLighting();
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();

        ModelAura modelAura = new ModelAura();

        this.playerRenderer.bindTexture(TEXTURE);
        GlStateManager.color(0.1F, 0.1F, 0.1F, 0.05F);
        GlStateManager.scale(2F,2F,2F);
        GlStateManager.translate(0F, -0.5F, 0F);

        GlStateManager.alphaFunc(516, 0.003921569F);
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        modelAura.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
