package com.thechiefpotatopeeler.eldritchmod.entity.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHatchableEgg extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelHatchableEgg() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 18, -3.0F, -2.0F, -3.0F, 6, 2, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -4.0F, -4.0F, 8, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 10, -3.0F, -6.0F, -3.0F, 6, 2, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 10, -2.0F, -8.0F, -2.0F, 4, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}