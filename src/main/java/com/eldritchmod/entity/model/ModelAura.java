package com.eldritchmod.entity.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAura extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelAura() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 52, -8.0F, -17.0F, -8.0F, 16, 12, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 68, 78, -4.0F, -3.0F, 4.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 62, -4.0F, -21.0F, -6.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 72, 24, -6.0F, -15.0F, -10.0F, 12, 8, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 60, 54, 8.0F, -15.0F, -6.0F, 2, 8, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 24, -10.0F, -15.0F, -6.0F, 2, 8, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 2, -10.0F, -17.0F, -4.0F, 2, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 58, -4.0F, -7.0F, -10.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 74, 8.0F, -7.0F, -4.0F, 2, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 44, 14, -6.0F, -21.0F, -4.0F, 12, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 70, 44, -6.0F, -15.0F, 8.0F, 12, 8, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 54, -4.0F, -7.0F, 8.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 44, 0, -6.0F, -3.0F, -4.0F, 12, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 66, -6.0F, -19.0F, -8.0F, 12, 16, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 66, -6.0F, -19.0F, 6.0F, 12, 16, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 52, -8.0F, -17.0F, 6.0F, 16, 12, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 28, -8.0F, -17.0F, -6.0F, 2, 12, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, 6.0F, -17.0F, -6.0F, 2, 12, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 14, -8.0F, -19.0F, -6.0F, 16, 2, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -5.0F, -6.0F, 16, 2, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 24, -10.0F, -7.0F, -4.0F, 2, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 16, -4.0F, -17.0F, 8.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 28, 8.0F, -17.0F, -4.0F, 2, 2, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 12, -4.0F, -17.0F, -10.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 68, 74, -4.0F, -21.0F, 4.0F, 8, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 10, -4.0F, -3.0F, -6.0F, 8, 2, 2, 0.0F, false));
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