package com.eldritchmod.entities.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelThundercock extends ModelBase {
	private final ModelRenderer adamsApple;
	private final ModelRenderer rightWing;
	private final ModelRenderer beak;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftWing;
	private final ModelRenderer headWhole;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer crest;
	private final ModelRenderer tail;

	public ModelThundercock() {
		textureWidth = 256;
		textureHeight = 256;

		adamsApple = new ModelRenderer(this);
		adamsApple.setRotationPoint(0.0F, -12.0F, -16.0F);
		adamsApple.cubeList.add(new ModelBox(adamsApple, 48, 110, -4.0F, -8.0F, -12.0F, 8, 8, 8, 0.0F, false));

		rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(-16.0F, -20.0F, 0.0F);
		rightWing.cubeList.add(new ModelBox(rightWing, 56, 56, 0.0F, 0.0F, -12.0F, 4, 16, 24, 0.0F, false));

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, -12.0F, -16.0F);
		beak.cubeList.add(new ModelBox(beak, 84, 96, -8.0F, -16.0F, -16.0F, 16, 8, 8, 0.0F, false));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(4.0F, 4.0F, 4.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 96, 0, -4.0F, 0.0F, -12.0F, 12, 20, 12, 0.0F, false));

		leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(16.0F, -20.0F, 0.0F);
		leftWing.cubeList.add(new ModelBox(leftWing, 56, 56, -4.0F, 0.0F, -12.0F, 4, 16, 24, 0.0F, false));

		headWhole = new ModelRenderer(this);
		headWhole.setRotationPoint(0.0F, -12.0F, -16.0F);
		headWhole.cubeList.add(new ModelBox(headWhole, 88, 44, -8.0F, -24.0F, -8.0F, 16, 24, 12, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -8.0F, 0.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, -16.0F, -12.0F, 24, 32, 24, 0.0F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-8.0F, 4.0F, 4.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 96, 0, -4.0F, 0.0F, -12.0F, 12, 20, 12, 0.0F, false));

		crest = new ModelRenderer(this);
		crest.setRotationPoint(0.0F, 24.0F, 0.0F);
		crest.cubeList.add(new ModelBox(crest, 48, 78, 0.0F, -72.0F, -27.0F, 0, 14, 18, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -16.0F, 14.0F);
		setRotationAngle(tail, 0.1309F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 32, 32, 0.0F, -16.0F, 0.0F, 0, 16, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		adamsApple.render(f5);
		rightWing.render(f5);
		beak.render(f5);
		leftLeg.render(f5);
		leftWing.render(f5);
		headWhole.render(f5);
		body.render(f5);
		rightLeg.render(f5);
		crest.render(f5);
		tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}