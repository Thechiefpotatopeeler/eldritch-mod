package com.eldritchmod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelMatriarch extends ModelBase {
    public ModelRenderer torso_1;
    public ModelRenderer leg_1;
    public ModelRenderer leg_3;
    public ModelRenderer leg_4;
    public ModelRenderer head;
    public ModelRenderer torso_2;
    public ModelRenderer leg_5;
    public ModelRenderer leg_6;
    public ModelRenderer leg_7;
    public ModelRenderer leg_8;
    public ModelRenderer leg_2;

    public ModelMatriarch() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 32, 4);
        this.head.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 2.0F);
        this.leg_3 = new ModelRenderer(this, 18, 0);
        this.leg_3.setRotationPoint(-4.0F, 15.0F, 0.0F);
        this.leg_3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_3, 0.0F, -0.39269908169872414F, -0.5811946409141118F);
        this.torso_2 = new ModelRenderer(this, 0, 12);
        this.torso_2.setRotationPoint(0.0F, 15.0F, 9.0F);
        this.torso_2.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12, 2.0F);
        this.torso_1 = new ModelRenderer(this, 0, 0);
        this.torso_1.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.torso_1.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 2.0F);
        this.leg_1 = new ModelRenderer(this, 18, 0);
        this.leg_1.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.leg_1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_1, 0.0F, 0.7853981633974483F, -0.7853981633974483F);
        this.leg_7 = new ModelRenderer(this, 18, 0);
        this.leg_7.setRotationPoint(4.0F, 15.0F, 0.0F);
        this.leg_7.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_7, 0.0F, 0.39269908169872414F, 0.5811946409141118F);
        this.leg_6 = new ModelRenderer(this, 18, 0);
        this.leg_6.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.leg_6.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_6, 0.0F, -0.39269908169872414F, 0.5811946409141118F);
        this.leg_4 = new ModelRenderer(this, 18, 0);
        this.leg_4.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.leg_4.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_4, 0.0F, -0.7853981633974483F, -0.7853981633974483F);
        this.leg_8 = new ModelRenderer(this, 18, 0);
        this.leg_8.setRotationPoint(4.0F, 15.0F, -1.0F);
        this.leg_8.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_8, 0.0F, 0.7853981633974483F, 0.7853981633974483F);
        this.leg_5 = new ModelRenderer(this, 18, 0);
        this.leg_5.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.leg_5.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_5, 0.0F, -0.7853981633974483F, 0.7853981633974483F);
        this.leg_2 = new ModelRenderer(this, 18, 0);
        this.leg_2.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.leg_2.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F);
        this.setRotateAngle(leg_2, 0.0F, 0.39269908169872414F, -0.5811946409141118F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.leg_3.render(f5);
        this.torso_2.render(f5);
        this.torso_1.render(f5);
        this.leg_1.render(f5);
        this.leg_7.render(f5);
        this.leg_6.render(f5);
        this.leg_4.render(f5);
        this.leg_8.render(f5);
        this.leg_5.render(f5);
        this.leg_2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
