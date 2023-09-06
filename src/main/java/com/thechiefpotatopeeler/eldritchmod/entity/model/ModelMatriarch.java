package com.thechiefpotatopeeler.eldritchmod.entity.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMatriarch extends ModelBase {
	private final ModelRenderer torso;
	private final ModelRenderer leg1;
	private final ModelRenderer leg5;
	private final ModelRenderer leg7;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg2;
	private final ModelRenderer leg4;
	private final ModelRenderer leg6;
	private final ModelRenderer leg8;
	private final ModelRenderer leg3;

	public ModelMatriarch() {
		textureWidth = 64;
		textureHeight = 32;

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 15.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -3.0F, -3.0F, -3.0F, 6, 6, 6, 2.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-5.0F, 16.0F, 3.0F);
		setRotationAngle(leg1, 0.0F, 0.7854F, -0.7854F);
		leg1.cubeList.add(new ModelBox(leg1, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(-5.0F, 16.0F, -1.0F);
		setRotationAngle(leg5, 0.0F, -0.3927F, -0.5812F);
		leg5.cubeList.add(new ModelBox(leg5, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(-5.0F, 16.0F, -2.0F);
		setRotationAngle(leg7, 0.0F, -0.7854F, -0.7854F);
		leg7.cubeList.add(new ModelBox(leg7, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -4.0F);
		head.cubeList.add(new ModelBox(head, 32, 4, -4.0F, -4.0F, -8.0F, 8, 8, 8, 2.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.5F);
		body.cubeList.add(new ModelBox(body, 0, 12, -5.0F, -4.0F, -6.0F, 10, 8, 12, 2.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(5.0F, 16.0F, 3.0F);
		setRotationAngle(leg2, 0.0F, -0.7854F, 0.7854F);
		leg2.cubeList.add(new ModelBox(leg2, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(5.0F, 16.0F, 2.0F);
		setRotationAngle(leg4, 0.0F, -0.3927F, 0.5812F);
		leg4.cubeList.add(new ModelBox(leg4, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(5.0F, 16.0F, -1.0F);
		setRotationAngle(leg6, 0.0F, 0.3927F, 0.5812F);
		leg6.cubeList.add(new ModelBox(leg6, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(5.0F, 16.0F, -2.0F);
		setRotationAngle(leg8, 0.0F, 0.7854F, 0.7854F);
		leg8.cubeList.add(new ModelBox(leg8, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-5.0F, 16.0F, 2.0F);
		setRotationAngle(leg3, 0.0F, 0.3927F, -0.5812F);
		leg3.cubeList.add(new ModelBox(leg3, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 2.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		leg1.render(f5);
		leg5.render(f5);
		leg7.render(f5);
		head.render(f5);
		body.render(f5);
		leg2.render(f5);
		leg4.render(f5);
		leg6.render(f5);
		leg8.render(f5);
		leg3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float p_setRotationAngles_1_, float p_setRotationAngles_2_, float p_setRotationAngles_3_, float p_setRotationAngles_4_, float p_setRotationAngles_5_, float p_setRotationAngles_6_, Entity p_setRotationAngles_7_) {
		this.head.rotateAngleY = p_setRotationAngles_4_ * 0.017453292F;
		this.head.rotateAngleX = p_setRotationAngles_5_ * 0.017453292F;
		float lvt_8_1_ = 0.7853982F;
		this.leg1.rotateAngleZ = -0.7853982F;
		this.leg2.rotateAngleZ = 0.7853982F;
		this.leg3.rotateAngleZ = -0.58119464F;
		this.leg4.rotateAngleZ = 0.58119464F;
		this.leg5.rotateAngleZ = -0.58119464F;
		this.leg6.rotateAngleZ = 0.58119464F;
		this.leg7.rotateAngleZ = -0.7853982F;
		this.leg8.rotateAngleZ = 0.7853982F;
		float lvt_9_1_ = -0.0F;
		float lvt_10_1_ = 0.3926991F;
		this.leg1.rotateAngleY = 0.7853982F;
		this.leg2.rotateAngleY = -0.7853982F;
		this.leg3.rotateAngleY = 0.3926991F;
		this.leg4.rotateAngleY = -0.3926991F;
		this.leg5.rotateAngleY = -0.3926991F;
		this.leg6.rotateAngleY = 0.3926991F;
		this.leg7.rotateAngleY = -0.7853982F;
		this.leg8.rotateAngleY = 0.7853982F;
		float lvt_11_1_ = -(MathHelper.cos(p_setRotationAngles_1_ * 0.6662F * 2.0F + 0.0F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_12_1_ = -(MathHelper.cos(p_setRotationAngles_1_ * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_13_1_ = -(MathHelper.cos(p_setRotationAngles_1_ * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_14_1_ = -(MathHelper.cos(p_setRotationAngles_1_ * 0.6662F * 2.0F + 4.712389F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_15_1_ = Math.abs(MathHelper.sin(p_setRotationAngles_1_ * 0.6662F + 0.0F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_16_1_ = Math.abs(MathHelper.sin(p_setRotationAngles_1_ * 0.6662F + 3.1415927F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_17_1_ = Math.abs(MathHelper.sin(p_setRotationAngles_1_ * 0.6662F + 1.5707964F) * 0.4F) * p_setRotationAngles_2_;
		float lvt_18_1_ = Math.abs(MathHelper.sin(p_setRotationAngles_1_ * 0.6662F + 4.712389F) * 0.4F) * p_setRotationAngles_2_;
		ModelRenderer var10000 = this.leg1;
		var10000.rotateAngleY += lvt_11_1_;
		var10000 = this.leg2;
		var10000.rotateAngleY += -lvt_11_1_;
		var10000 = this.leg3;
		var10000.rotateAngleY += lvt_12_1_;
		var10000 = this.leg4;
		var10000.rotateAngleY += -lvt_12_1_;
		var10000 = this.leg5;
		var10000.rotateAngleY += lvt_13_1_;
		var10000 = this.leg6;
		var10000.rotateAngleY += -lvt_13_1_;
		var10000 = this.leg7;
		var10000.rotateAngleY += lvt_14_1_;
		var10000 = this.leg8;
		var10000.rotateAngleY += -lvt_14_1_;
		var10000 = this.leg1;
		var10000.rotateAngleZ += lvt_15_1_;
		var10000 = this.leg2;
		var10000.rotateAngleZ += -lvt_15_1_;
		var10000 = this.leg3;
		var10000.rotateAngleZ += lvt_16_1_;
		var10000 = this.leg4;
		var10000.rotateAngleZ += -lvt_16_1_;
		var10000 = this.leg5;
		var10000.rotateAngleZ += lvt_17_1_;
		var10000 = this.leg6;
		var10000.rotateAngleZ += -lvt_17_1_;
		var10000 = this.leg7;
		var10000.rotateAngleZ += lvt_18_1_;
		var10000 = this.leg8;
		var10000.rotateAngleZ += -lvt_18_1_;
	}
}