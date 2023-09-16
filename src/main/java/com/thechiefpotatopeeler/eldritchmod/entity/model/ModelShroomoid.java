package com.thechiefpotatopeeler.eldritchmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelShroomoid extends ModelBase {
    public ModelRenderer rightArm;
    public ModelRenderer head;
    public ModelRenderer torso;
    public ModelRenderer leftArm;
    public ModelRenderer leftLeg;
    public ModelRenderer rightLeg;
    public ModelRenderer mushyHat;
    public ModelRenderer mushyHat1;

    public ModelShroomoid() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.torso = new ModelRenderer(this, 16, 16);
        this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leftArm = new ModelRenderer(this, 32, 48);
        this.leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.leftLeg = new ModelRenderer(this, 16, 48);
        this.leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.mushyHat1 = new ModelRenderer(this, 0, 0);
        this.mushyHat1.setRotationPoint(-7.5F, -18.0F, -7.5F);
        this.mushyHat1.addBox(0.0F, 0.0F, 0.0F, 15, 5, 15, 0.0F);
        this.mushyHat = new ModelRenderer(this, 0, 0);
        this.mushyHat.setRotationPoint(-10.0F, -13.0F, -10.0F);
        this.mushyHat.addBox(0.0F, 0.0F, 0.0F, 20, 5, 20, 0.0F);
        this.rightArm = new ModelRenderer(this, 40, 16);
        this.rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.rightLeg.render(f5);
        this.torso.render(f5);
        this.leftArm.render(f5);
        this.leftLeg.render(f5);
        this.mushyHat1.render(f5);
        this.mushyHat.render(f5);
        this.rightArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
    }
}
