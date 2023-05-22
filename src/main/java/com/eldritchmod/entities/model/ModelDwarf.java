package com.eldritchmod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelDwarf extends ModelBase {
    public ModelRenderer Arm_1;
    public ModelRenderer Leg_1;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer Arm_2;
    public ModelRenderer Leg_2;
    public ModelRenderer Head_l2;
    public ModelRenderer Arm_1_l2;
    public ModelRenderer Arm_2_l2;
    public ModelRenderer Body_l2;
    public ModelRenderer Leg_1_l2;
    public ModelRenderer Leg_2_l2;

    public ModelDwarf() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Leg_2 = new ModelRenderer(this, 108, 9);
        this.Leg_2.setRotationPoint(1.9F, 16.0F, 0.0F);
        this.Leg_2.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.Head_l2 = new ModelRenderer(this, 8, 12);
        this.Head_l2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Head_l2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
        this.Leg_2_l2 = new ModelRenderer(this, 88, 27);
        this.Leg_2_l2.setRotationPoint(1.9F, 16.0F, 0.0F);
        this.Leg_2_l2.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.25F);
        this.Arm_1_l2 = new ModelRenderer(this, 92, 14);
        this.Arm_1_l2.setRotationPoint(-5.0F, 8.0F, 0.0F);
        this.Arm_1_l2.addBox(-3.0F, -2.0F, -2.0F, 4, 9, 4, 0.25F);
        this.Leg_1_l2 = new ModelRenderer(this, 108, 21);
        this.Leg_1_l2.setRotationPoint(-1.9F, 16.0F, 0.0F);
        this.Leg_1_l2.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.25F);
        this.Leg_1 = new ModelRenderer(this, 16, 0);
        this.Leg_1.setRotationPoint(-1.9F, 16.0F, 0.0F);
        this.Leg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.Arm_2 = new ModelRenderer(this, 96, 0);
        this.Arm_2.setRotationPoint(5.0F, 8.0F, 0.0F);
        this.Arm_2.addBox(-1.0F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
        this.Body = new ModelRenderer(this, 64, 0);
        this.Body.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -5.0F, 8, 10, 8, 0.0F);
        this.Body_l2 = new ModelRenderer(this, 56, 18);
        this.Body_l2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body_l2.addBox(-4.0F, 0.0F, -5.0F, 8, 10, 8, 0.25F);
        this.Arm_2_l2 = new ModelRenderer(this, 40, 16);
        this.Arm_2_l2.setRotationPoint(5.0F, 8.0F, 0.0F);
        this.Arm_2_l2.addBox(-1.0F, -2.0F, -2.0F, 4, 9, 4, 0.25F);
        this.Arm_1 = new ModelRenderer(this, 0, 0);
        this.Arm_1.setRotationPoint(-5.0F, 8.0F, 0.0F);
        this.Arm_1.addBox(-3.0F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.Leg_2.render(f5);
        this.Head_l2.render(f5);
        this.Leg_2_l2.render(f5);
        this.Arm_1_l2.render(f5);
        this.Leg_1_l2.render(f5);
        this.Leg_1.render(f5);
        this.Arm_2.render(f5);
        this.Body.render(f5);
        this.Body_l2.render(f5);
        this.Arm_2_l2.render(f5);
        this.Arm_1.render(f5);
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
        this.Arm_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
        this.Leg_2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
        this.Leg_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
        this.Arm_2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
        this.Body.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
        this.Body.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
        copyModelAngles(this.Arm_1, this.Arm_1_l2);
        copyModelAngles(this.Arm_2, this.Arm_2_l2);
        copyModelAngles(this.Leg_1, this.Leg_1_l2);
        copyModelAngles(this.Leg_2, this.Leg_2_l2);
        copyModelAngles(this.Body, this.Body_l2);
    }
}
