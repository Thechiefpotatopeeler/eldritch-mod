package com.eldritchmod.entities.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrocodemon extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Jaw_Bottom_r1;
	private final ModelRenderer Body;

	public ModelCrocodemon() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -3.0F, 2.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 18, -4.0F, -3.0F, -13.0F, 8, 2, 16, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 18, -2.0F, -5.0F, -13.0F, 4, 2, 18, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 46, 2.0F, -1.0F, -11.0F, 0, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 46, -2.0F, -1.0F, -11.0F, 0, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -3.0F, 3.0F, 4, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 26, -2.0F, -3.0F, -15.0F, 4, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 18, 2.0F, -7.0F, -3.0F, 2, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 6, -4.0F, -7.0F, -3.0F, 2, 4, 4, 0.0F, false));

		Jaw_Bottom_r1 = new ModelRenderer(this);
		Jaw_Bottom_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(Jaw_Bottom_r1);
		setRotationAngle(Jaw_Bottom_r1, 0.1745F, 0.0F, 0.0F);
		Jaw_Bottom_r1.cubeList.add(new ModelBox(Jaw_Bottom_r1, 0, 0, -4.0F, 0.0F, -14.0F, 8, 2, 16, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 15.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 36, -6.0F, -19.0F, 3.0F, 12, 16, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 56, 18, 6.0F, -17.0F, 3.0F, 4, 12, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 50, -10.0F, -17.0F, 3.0F, 4, 12, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 48, 0, -6.0F, -3.0F, 3.0F, 6, 12, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 38, 0.0F, -3.0F, 3.0F, 6, 12, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 60, -6.0F, 7.0F, -3.0F, 6, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 60, 0.0F, 7.0F, -3.0F, 6, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}