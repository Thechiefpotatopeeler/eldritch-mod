package com.eldritchmod.entities.render;

import com.eldritchmod.data.IMagicUserType;
import com.eldritchmod.data.MagicUserType;
import com.eldritchmod.handlers.MagicUserTypeProvider;

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
        IMagicUserType magicUserType = entitylivingbaseIn.getCapability(MagicUserTypeProvider.MAGIC_USER_TYPE_CAP, null);
        if (magicUserType.getType()==MagicUserType.MagicUserTypes.ELDRITCH_WIZARD) {
            this.playerRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            this.playerRenderer.getMainModel().bipedBody.renderWithRotation(0.0001f);
            GlStateManager.popMatrix();
            System.out.println("We made it this farfdjsklijklfjkdiljksdfjlkpopopoopopoopoopoppopopoopopopopopopopoppepepep[epeppepepeppepepepepeepepepepeepeepfdsdjfjlsk;ajfjkdlajklp;");
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
    
}