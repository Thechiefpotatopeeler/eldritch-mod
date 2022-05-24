package com.eldritchmod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelMoobloom extends ModelBase {
    public ModelRenderer TORSO;
    public ModelRenderer UDDER;
    public ModelRenderer BACK_LEFT_LEG;
    public ModelRenderer FRONT_LEFT_LEG;
    public ModelRenderer BACK_RIGHT_LEG;
    public ModelRenderer FRONT_RIGHT_LEG;
    public ModelRenderer HEAD;
    public ModelRenderer LEFT_HORN;
    public ModelRenderer LEFT_HORN_1;

    public ModelMoobloom() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.FRONT_RIGHT_LEG = new ModelRenderer(this, 0, 16);
        this.FRONT_RIGHT_LEG.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.FRONT_RIGHT_LEG.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.HEAD = new ModelRenderer(this, 0, 0);
        this.HEAD.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.HEAD.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.LEFT_HORN_1 = new ModelRenderer(this, 22, 0);
        this.LEFT_HORN_1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.LEFT_HORN_1.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.FRONT_LEFT_LEG = new ModelRenderer(this, 0, 16);
        this.FRONT_LEFT_LEG.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.FRONT_LEFT_LEG.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BACK_LEFT_LEG = new ModelRenderer(this, 0, 16);
        this.BACK_LEFT_LEG.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.BACK_LEFT_LEG.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.TORSO = new ModelRenderer(this, 18, 4);
        this.TORSO.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.TORSO.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(TORSO, 1.5707963267948966F, 0.0F, 0.0F);
        this.BACK_RIGHT_LEG = new ModelRenderer(this, 0, 16);
        this.BACK_RIGHT_LEG.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.BACK_RIGHT_LEG.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LEFT_HORN = new ModelRenderer(this, 22, 0);
        this.LEFT_HORN.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.LEFT_HORN.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.UDDER = new ModelRenderer(this, 52, 0);
        this.UDDER.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.UDDER.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(UDDER, 1.5707963267948966F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FRONT_RIGHT_LEG.render(f5);
        this.HEAD.render(f5);
        this.LEFT_HORN_1.render(f5);
        this.FRONT_LEFT_LEG.render(f5);
        this.BACK_LEFT_LEG.render(f5);
        this.TORSO.render(f5);
        this.BACK_RIGHT_LEG.render(f5);
        this.LEFT_HORN.render(f5);
        this.UDDER.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.FRONT_LEFT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.BACK_RIGHT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.BACK_LEFT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.FRONT_RIGHT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    }

}
