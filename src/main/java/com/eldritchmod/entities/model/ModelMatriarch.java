package com.eldritchmod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelMatriarch extends ModelBase {
    public ModelRenderer torso_1;
    public ModelRenderer back_left_leg;
    public ModelRenderer mid_front_left_leg;
    public ModelRenderer front_left_leg;
    public ModelRenderer head;
    public ModelRenderer torso_2;
    public ModelRenderer back_right_leg;
    public ModelRenderer mid_back_right_leg;
    public ModelRenderer mid_front_right_leg;
    public ModelRenderer front_right_leg;
    public ModelRenderer mid_back_left_leg;

    public ModelMatriarch() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 32, 4);
        this.head.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 5F);
        this.mid_front_left_leg = new ModelRenderer(this, 18, 0);
        this.mid_front_left_leg.setRotationPoint(-4.0F, 15.0F, 0.0F);
        this.mid_front_left_leg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(mid_front_left_leg, 0.0F, -0.39269908169872414F, -0.5811946409141118F);
        this.torso_2 = new ModelRenderer(this, 0, 12);
        this.torso_2.setRotationPoint(0.0F, 15.0F, 9.0F);
        this.torso_2.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12, 5F);
        this.torso_1 = new ModelRenderer(this, 0, 0);
        this.torso_1.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.torso_1.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 5F);
        this.back_left_leg = new ModelRenderer(this, 18, 0);
        this.back_left_leg.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.back_left_leg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(back_left_leg, 0.0F, 0.7853981633974483F, -0.7853981633974483F);
        this.mid_front_right_leg = new ModelRenderer(this, 18, 0);
        this.mid_front_right_leg.setRotationPoint(4.0F, 15.0F, 0.0F);
        this.mid_front_right_leg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(mid_front_right_leg, 0.0F, 0.39269908169872414F, 0.5811946409141118F);
        this.mid_back_right_leg = new ModelRenderer(this, 18, 0);
        this.mid_back_right_leg.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.mid_back_right_leg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(mid_back_right_leg, 0.0F, -0.39269908169872414F, 0.5811946409141118F);
        this.front_left_leg = new ModelRenderer(this, 18, 0);
        this.front_left_leg.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.front_left_leg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(front_left_leg, 0.0F, -0.7853981633974483F, -0.7853981633974483F);
        this.front_right_leg = new ModelRenderer(this, 18, 0);
        this.front_right_leg.setRotationPoint(4.0F, 15.0F, -1.0F);
        this.front_right_leg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(front_right_leg, 0.0F, 0.7853981633974483F, 0.7853981633974483F);
        this.back_right_leg = new ModelRenderer(this, 18, 0);
        this.back_right_leg.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.back_right_leg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(back_right_leg, 0.0F, -0.7853981633974483F, 0.7853981633974483F);
        this.mid_back_left_leg = new ModelRenderer(this, 18, 0);
        this.mid_back_left_leg.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.mid_back_left_leg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 5F);
        this.setRotateAngle(mid_back_left_leg, 0.0F, 0.39269908169872414F, -0.5811946409141118F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.mid_front_left_leg.render(f5);
        this.torso_2.render(f5);
        this.torso_1.render(f5);
        this.back_left_leg.render(f5);
        this.mid_front_right_leg.render(f5);
        this.mid_back_right_leg.render(f5);
        this.front_left_leg.render(f5);
        this.front_right_leg.render(f5);
        this.back_right_leg.render(f5);
        this.mid_back_left_leg.render(f5);
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
        this.front_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.back_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.mid_front_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.mid_back_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.front_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.back_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.mid_front_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.mid_back_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
