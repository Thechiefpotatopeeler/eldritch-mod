package com.eldritchmod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSquid - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelBarnacle extends ModelBase {
    public ModelRenderer mouth_2;
    public ModelRenderer mouth_1;
    public ModelRenderer mouth_3;
    public ModelRenderer mouth_4;
    public ModelRenderer body_1;
    public ModelRenderer tentacle_1;
    public ModelRenderer tongue;
    public ModelRenderer tentacle_2_1;
    public ModelRenderer tentacle_2_2;
    public ModelRenderer tentacle_3_1;
    public ModelRenderer tentacle_3_3;
    public ModelRenderer tentacle_3_2;
    public ModelRenderer tentacle_4;

    public ModelBarnacle() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.mouth_4 = new ModelRenderer(this, 72, 0);
        this.mouth_4.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.mouth_4.addBox(0.0F, -22.0F, 0.0F, 6, 22, 6, 0.0F);
        this.setRotateAngle(mouth_4, -0.091106186954104F, 0.0F, 0.091106186954104F);
        this.tentacle_1 = new ModelRenderer(this, 96, 0);
        this.tentacle_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_1.addBox(3.0F, 0.0F, 3.0F, 1, 15, 1, 0.0F);
        this.tongue = new ModelRenderer(this, 100, 0);
        this.tongue.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tongue.addBox(-0.5F, -40.0F, -0.5F, 1, 30, 1, 0.0F);
        this.tentacle_2_1 = new ModelRenderer(this, 104, 0);
        this.tentacle_2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_2_1.addBox(-2.5F, 0.0F, -3.1F, 1, 9, 1, 0.0F);
        this.mouth_2 = new ModelRenderer(this, 0, 0);
        this.mouth_2.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.mouth_2.addBox(-6.0F, -22.0F, 0.0F, 6, 22, 6, 0.0F);
        this.setRotateAngle(mouth_2, -0.091106186954104F, 0.0F, -0.091106186954104F);
        this.tentacle_4 = new ModelRenderer(this, 112, 0);
        this.tentacle_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_4.addBox(3.0F, 0.0F, -1.9F, 1, 15, 1, 0.0F);
        this.setRotateAngle(tentacle_4, -0.091106186954104F, 0.0F, -0.045553093477052F);
        this.mouth_3 = new ModelRenderer(this, 48, 0);
        this.mouth_3.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.mouth_3.addBox(0.0F, -22.0F, -6.0F, 6, 22, 6, 0.0F);
        this.setRotateAngle(mouth_3, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.tentacle_2_2 = new ModelRenderer(this, 108, 0);
        this.tentacle_2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_2_2.addBox(-3.0F, 9.0F, -3.5F, 1, 9, 1, 0.0F);
        this.body_1 = new ModelRenderer(this, 0, 28);
        this.body_1.setRotationPoint(-5.5F, -10.0F, -5.5F);
        this.body_1.addBox(0.0F, 0.0F, 0.0F, 11, 10, 11, 0.0F);
        this.tentacle_3_2 = new ModelRenderer(this, 22, 0);
        this.tentacle_3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_3_2.addBox(-3.0F, 5.0F, 3.3F, 1, 5, 1, 0.0F);
        this.mouth_1 = new ModelRenderer(this, 24, 0);
        this.mouth_1.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.mouth_1.addBox(-6.0F, -22.0F, -6.0F, 6, 22, 6, 0.0F);
        this.setRotateAngle(mouth_1, 0.091106186954104F, 0.0F, -0.091106186954104F);
        this.tentacle_3_3 = new ModelRenderer(this, 18, 0);
        this.tentacle_3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_3_3.addBox(-2.0F, 10.0F, 2.0F, 1, 5, 1, 0.0F);
        this.tentacle_3_1 = new ModelRenderer(this, 0, 0);
        this.tentacle_3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle_3_1.addBox(-2.0F, 0.0F, 2.5F, 1, 5, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.mouth_4.render(f5);
        this.tentacle_1.render(f5);
        this.tongue.render(f5);
        this.tentacle_2_1.render(f5);
        this.mouth_2.render(f5);
        this.tentacle_4.render(f5);
        this.mouth_3.render(f5);
        this.tentacle_2_2.render(f5);
        this.body_1.render(f5);
        this.tentacle_3_2.render(f5);
        this.mouth_1.render(f5);
        this.tentacle_3_3.render(f5);
        this.tentacle_3_1.render(f5);
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
