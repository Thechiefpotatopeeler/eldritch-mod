package com.thechiefpotatopeeler.eldritchmod.entity.render;

import com.thechiefpotatopeeler.eldritchmod.entity.entity.moobloom.EntityRedMoobloom;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//I half borrowed this code from Mojang, it was kinda hard to get working, so I ended up just missing a flower

@SideOnly(Side.CLIENT)
public class RedMoobloomFlowerLayer implements LayerRenderer<EntityRedMoobloom> {
    private final RenderRedMoobloom redMoobloomRenderer;

    public RedMoobloomFlowerLayer(RenderRedMoobloom redMoobloomRendererIn)
    {
        this.redMoobloomRenderer = redMoobloomRendererIn;
    }

    public void doRenderLayer( EntityRedMoobloom entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale)
    {
        if (!entitylivingbaseIn.isChild() && !entitylivingbaseIn.isInvisible())
        {
            final BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
            this.redMoobloomRenderer.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            GlStateManager.enableCull();
            GlStateManager.cullFace(GlStateManager.CullFace.FRONT);
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0F, -1.0F, 1.0F);
            GlStateManager.translate(0.2F, 0.35F, 0.5F);
            GlStateManager.rotate(42.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.pushMatrix();
            GlStateManager.translate(-0.5F, -0.5F, 0.5F);
            blockrendererdispatcher.renderBlockBrightness(Blocks.RED_FLOWER.getDefaultState(), 1.0F);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.1F, 0.0F, -0.6F);
            GlStateManager.rotate(42.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.translate(-0.5F, -0.5F, 0.5F);
            blockrendererdispatcher.renderBlockBrightness(Blocks.RED_FLOWER.getDefaultState(), 1.0F);
            GlStateManager.popMatrix();
            GlStateManager.popMatrix();
            GlStateManager.cullFace(GlStateManager.CullFace.BACK);
            GlStateManager.disableCull();
        }
    }

    public boolean shouldCombineTextures()
    {
        return true;
    }
}