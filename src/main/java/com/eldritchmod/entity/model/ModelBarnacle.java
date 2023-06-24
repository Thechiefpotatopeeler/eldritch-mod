package com.eldritchmod.entity.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarnacle extends ModelBase {
	private final ModelRenderer All;
	private final ModelRenderer mouth_2;
	private final ModelRenderer tentacle_4;
	private final ModelRenderer tentacle_3_2;
	private final ModelRenderer tentacle_3_3;
	private final ModelRenderer tentacle_3_1;
	private final ModelRenderer tentacle_2_2;
	private final ModelRenderer tentacle_2_1;
	private final ModelRenderer tongue;
	private final ModelRenderer body_1;
	private final ModelRenderer mouth_4;
	private final ModelRenderer tentacle_1;
	private final ModelRenderer mouth_3;
	private final ModelRenderer mouth_1;

	public ModelBarnacle() {
		textureWidth = 128;
		textureHeight = 128;

		All = new ModelRenderer(this);
		All.setRotationPoint(0.0F, 18.0F, -6.0F);
		setRotationAngle(All, -1.5708F, 0.0F, 0.0F);
		

		mouth_2 = new ModelRenderer(this);
		mouth_2.setRotationPoint(0.0F, -10.0F, 0.0F);
		All.addChild(mouth_2);
		setRotationAngle(mouth_2, -0.0911F, 0.0F, -0.0911F);
		mouth_2.cubeList.add(new ModelBox(mouth_2, 42, 43, -6.0F, -22.0F, 0.0F, 6, 22, 6, 0.0F, false));

		tentacle_4 = new ModelRenderer(this);
		tentacle_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_4);
		setRotationAngle(tentacle_4, -0.0911F, 0.0F, -0.0456F);
		tentacle_4.cubeList.add(new ModelBox(tentacle_4, 44, 0, 3.0F, 0.0F, -1.9F, 1, 15, 1, 0.0F, false));

		tentacle_3_2 = new ModelRenderer(this);
		tentacle_3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_3_2);
		tentacle_3_2.cubeList.add(new ModelBox(tentacle_3_2, 22, 21, -3.0F, 5.0F, 3.3F, 1, 5, 1, 0.0F, false));

		tentacle_3_3 = new ModelRenderer(this);
		tentacle_3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_3_3);
		tentacle_3_3.cubeList.add(new ModelBox(tentacle_3_3, 18, 21, -2.0F, 10.0F, 2.0F, 1, 5, 1, 0.0F, false));

		tentacle_3_1 = new ModelRenderer(this);
		tentacle_3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_3_1);
		tentacle_3_1.cubeList.add(new ModelBox(tentacle_3_1, 0, 21, -2.0F, 0.0F, 2.5F, 1, 5, 1, 0.0F, false));

		tentacle_2_2 = new ModelRenderer(this);
		tentacle_2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_2_2);
		tentacle_2_2.cubeList.add(new ModelBox(tentacle_2_2, 0, 0, -3.0F, 9.0F, -3.5F, 1, 9, 1, 0.0F, false));

		tentacle_2_1 = new ModelRenderer(this);
		tentacle_2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_2_1);
		tentacle_2_1.cubeList.add(new ModelBox(tentacle_2_1, 4, 0, -2.5F, 0.0F, -3.1F, 1, 9, 1, 0.0F, false));

		tongue = new ModelRenderer(this);
		tongue.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tongue);
		tongue.cubeList.add(new ModelBox(tongue, 0, 49, -0.5F, -40.0F, -0.5F, 1, 30, 1, 0.0F, false));

		body_1 = new ModelRenderer(this);
		body_1.setRotationPoint(-5.5F, -10.0F, -5.5F);
		All.addChild(body_1);
		body_1.cubeList.add(new ModelBox(body_1, 0, 0, 0.0F, 0.0F, 0.0F, 11, 10, 11, 0.0F, false));

		mouth_4 = new ModelRenderer(this);
		mouth_4.setRotationPoint(0.0F, -10.0F, 0.0F);
		All.addChild(mouth_4);
		setRotationAngle(mouth_4, -0.0911F, 0.0F, 0.0911F);
		mouth_4.cubeList.add(new ModelBox(mouth_4, 48, 0, 0.0F, -22.0F, 0.0F, 6, 22, 6, 0.0F, false));

		tentacle_1 = new ModelRenderer(this);
		tentacle_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		All.addChild(tentacle_1);
		tentacle_1.cubeList.add(new ModelBox(tentacle_1, 4, 49, 3.0F, 0.0F, 3.0F, 1, 15, 1, 0.0F, false));

		mouth_3 = new ModelRenderer(this);
		mouth_3.setRotationPoint(0.0F, -10.0F, 0.0F);
		All.addChild(mouth_3);
		setRotationAngle(mouth_3, 0.0911F, 0.0F, 0.0911F);
		mouth_3.cubeList.add(new ModelBox(mouth_3, 24, 21, 0.0F, -22.0F, -6.0F, 6, 22, 6, 0.0F, false));

		mouth_1 = new ModelRenderer(this);
		mouth_1.setRotationPoint(0.0F, -10.0F, 0.0F);
		All.addChild(mouth_1);
		setRotationAngle(mouth_1, 0.0911F, 0.0F, -0.0911F);
		mouth_1.cubeList.add(new ModelBox(mouth_1, 0, 21, -6.0F, -22.0F, -6.0F, 6, 22, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		All.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}