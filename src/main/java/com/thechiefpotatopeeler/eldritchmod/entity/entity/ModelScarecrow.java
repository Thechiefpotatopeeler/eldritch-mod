package com.thechiefpotatopeeler.eldritchmod.entity.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScarecrow extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leg;

	public ModelScarecrow() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 28, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 32, 28, -4.0F, -8.0F, -4.0F, 8, 4, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -8.0F, -4.0F, -8.0F, 16, 0, 16, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 28, 40, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(9.0F, 2.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 0, 16, -23.0F, -2.0F, -2.0F, 28, 4, 4, 0.0F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 0, 24, -21.0F, -1.0F, -1.0F, 24, 2, 2, 0.0F, false));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 12.0F, 0.0F);
		leg.cubeList.add(new ModelBox(leg, 0, 0, -1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leftArm.render(f5);
		leg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}