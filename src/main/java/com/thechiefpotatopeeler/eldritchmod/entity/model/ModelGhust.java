package com.thechiefpotatopeeler.eldritchmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelGhast - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelGhust extends ModelBase {
    public ModelRenderer field_78128_a;
    public ModelRenderer field_78127_b2;
    public ModelRenderer field_78127_b1;
    public ModelRenderer field_78127_b4;
    public ModelRenderer field_78127_b3;
    public ModelRenderer field_78127_b6;
    public ModelRenderer field_78127_b5;
    public ModelRenderer field_78127_b8;
    public ModelRenderer field_78127_b7;
    public ModelRenderer field_78127_b9;

    public ModelGhust() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78127_b1 = new ModelRenderer(this, 0, 0);
        this.field_78127_b1.setRotationPoint(-3.75F, 15.0F, -5.0F);
        this.field_78127_b1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, -0.5F);
        this.setRotateAngle(field_78127_b1, 0.40002946455710037F, 0.0F, 0.0F);
        this.field_78127_b5 = new ModelRenderer(this, 0, 0);
        this.field_78127_b5.setRotationPoint(-1.25F, 15.0F, 0.0F);
        this.field_78127_b5.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, -0.5F);
        this.setRotateAngle(field_78127_b5, 0.24870941840919195F, 0.0F, 0.0F);
        this.field_78127_b2 = new ModelRenderer(this, 0, 0);
        this.field_78127_b2.setRotationPoint(1.25F, 15.0F, -5.0F);
        this.field_78127_b2.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, -0.5F);
        this.setRotateAngle(field_78127_b2, 0.5681046715241542F, 0.0F, 0.0F);
        this.field_78127_b6 = new ModelRenderer(this, 0, 0);
        this.field_78127_b6.setRotationPoint(3.75F, 15.0F, 0.0F);
        this.field_78127_b6.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, -0.5F);
        this.setRotateAngle(field_78127_b6, 0.20821777976292352F, 0.0F, 0.0F);
        this.field_78128_a = new ModelRenderer(this, 0, 0);
        this.field_78128_a.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.field_78128_a.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, -0.5F);
        this.field_78127_b9 = new ModelRenderer(this, 0, 0);
        this.field_78127_b9.setRotationPoint(6.25F, 15.0F, 5.0F);
        this.field_78127_b9.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, -0.5F);
        this.setRotateAngle(field_78127_b9, 0.5979498017332573F, 0.0F, 0.0F);
        this.field_78127_b8 = new ModelRenderer(this, 0, 0);
        this.field_78127_b8.setRotationPoint(1.25F, 15.0F, 5.0F);
        this.field_78127_b8.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, -0.5F);
        this.setRotateAngle(field_78127_b8, 0.5312782243070739F, 0.0F, 0.0F);
        this.field_78127_b7 = new ModelRenderer(this, 0, 0);
        this.field_78127_b7.setRotationPoint(-3.75F, 15.0F, 5.0F);
        this.field_78127_b7.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, -0.5F);
        this.setRotateAngle(field_78127_b7, 0.3440043955680823F, 0.0F, 0.0F);
        this.field_78127_b3 = new ModelRenderer(this, 0, 0);
        this.field_78127_b3.setRotationPoint(6.25F, 15.0F, -5.0F);
        this.field_78127_b3.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, -0.5F);
        this.setRotateAngle(field_78127_b3, 0.5818927726149095F, 0.0F, 0.0F);
        this.field_78127_b4 = new ModelRenderer(this, 0, 0);
        this.field_78127_b4.setRotationPoint(-6.25F, 15.0F, 0.0F);
        this.field_78127_b4.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, -0.5F);
        this.setRotateAngle(field_78127_b4, 0.4284783313646079F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78127_b1.render(f5);
        this.field_78127_b5.render(f5);
        this.field_78127_b2.render(f5);
        this.field_78127_b6.render(f5);
        this.field_78128_a.render(f5);
        this.field_78127_b9.render(f5);
        this.field_78127_b8.render(f5);
        this.field_78127_b7.render(f5);
        this.field_78127_b3.render(f5);
        this.field_78127_b4.render(f5);
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
