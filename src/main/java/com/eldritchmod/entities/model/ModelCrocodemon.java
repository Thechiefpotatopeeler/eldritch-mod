package com.eldritchmod.entities.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCrocodemon extends ModelBase {
	private final ModelRenderer TORSO;
	private final ModelRenderer LEFT_ARM;
	private final ModelRenderer RIGHT_ARM;
	private final ModelRenderer RIGHT_LEG;
	private final ModelRenderer LEFT_LEG;
	private final ModelRenderer JAW_BOTTOM;
	private final ModelRenderer JAW_BOTTOM_r1;
	private final ModelRenderer HEAD_TOP;

	public ModelCrocodemon() {
		textureWidth = 128;
		textureHeight = 128;

		TORSO = new ModelRenderer(this);
		TORSO.setRotationPoint(0.0F, 24.0F, 0.0F);
		TORSO.cubeList.add(new ModelBox(TORSO, 0, 36, -6.0F, -28.0F, 3.0F, 12, 16, 6, 0.0F, false));
		TORSO.cubeList.add(new ModelBox(TORSO, 0, 0, -2.0F, -30.0F, 5.0F, 4, 2, 4, 0.0F, false));

		LEFT_ARM = new ModelRenderer(this);
		LEFT_ARM.setRotationPoint(6.0F, -1.0F, 6.0F);
		LEFT_ARM.cubeList.add(new ModelBox(LEFT_ARM, 56, 18, 0.0F, -1.0F, -3.0F, 4, 12, 6, 0.0F, false));

		RIGHT_ARM = new ModelRenderer(this);
		RIGHT_ARM.setRotationPoint(-6.0F, -1.0F, 6.0F);
		RIGHT_ARM.cubeList.add(new ModelBox(RIGHT_ARM, 54, 50, -4.0F, -1.0F, -3.0F, 4, 12, 6, 0.0F, false));

		RIGHT_LEG = new ModelRenderer(this);
		RIGHT_LEG.setRotationPoint(-2.0F, 12.0F, 6.0F);
		RIGHT_LEG.cubeList.add(new ModelBox(RIGHT_LEG, 48, 0, -4.0F, 0.0F, -3.0F, 6, 12, 6, 0.0F, false));
		RIGHT_LEG.cubeList.add(new ModelBox(RIGHT_LEG, 24, 60, -4.0F, 10.0F, -9.0F, 6, 2, 6, 0.0F, false));

		LEFT_LEG = new ModelRenderer(this);
		LEFT_LEG.setRotationPoint(2.0F, 12.0F, 6.0F);
		LEFT_LEG.cubeList.add(new ModelBox(LEFT_LEG, 36, 38, -2.0F, 0.0F, -3.0F, 6, 12, 6, 0.0F, false));
		LEFT_LEG.cubeList.add(new ModelBox(LEFT_LEG, 0, 60, -2.0F, 10.0F, -9.0F, 6, 2, 6, 0.0F, false));

		JAW_BOTTOM = new ModelRenderer(this);
		JAW_BOTTOM.setRotationPoint(0.0F, -4.0F, 3.0F);
		

		JAW_BOTTOM_r1 = new ModelRenderer(this);
		JAW_BOTTOM_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		JAW_BOTTOM.addChild(JAW_BOTTOM_r1);
		setRotationAngle(JAW_BOTTOM_r1, 0.1309F, 0.0F, 0.0F);
		JAW_BOTTOM_r1.cubeList.add(new ModelBox(JAW_BOTTOM_r1, 0, 0, -4.0F, 0.0F, -14.0F, 8, 2, 16, 0.0F, false));

		HEAD_TOP = new ModelRenderer(this);
		HEAD_TOP.setRotationPoint(0.0F, 24.0F, 0.0F);
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 0, 18, -4.0F, -30.0F, -11.0F, 8, 2, 16, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 30, 18, -2.0F, -32.0F, -11.0F, 4, 2, 18, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 24, 46, 2.0F, -28.0F, -9.0F, 0, 2, 12, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 0, 46, -2.0F, -28.0F, -9.0F, 0, 2, 12, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 0, 26, -2.0F, -30.0F, -13.0F, 4, 2, 2, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 0, 18, 2.0F, -34.0F, -1.0F, 2, 4, 4, 0.0F, false));
		HEAD_TOP.cubeList.add(new ModelBox(HEAD_TOP, 0, 6, -4.0F, -34.0F, -1.0F, 2, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		TORSO.render(f5);
		LEFT_ARM.render(f5);
		RIGHT_ARM.render(f5);
		RIGHT_LEG.render(f5);
		LEFT_LEG.render(f5);
		JAW_BOTTOM.render(f5);
		HEAD_TOP.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.LEFT_ARM.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
		this.RIGHT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
		this.LEFT_LEG.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
		this.RIGHT_ARM.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount;
		this.JAW_BOTTOM.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
	}
}