// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoatman extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rightHorn;
	private final ModelRenderer rightHornTip_r1;
	private final ModelRenderer rightHornShaftTip_r1;
	private final ModelRenderer rightHornShaftBase_r1;
	private final ModelRenderer rightHornBase_r1;
	private final ModelRenderer leftHorn;
	private final ModelRenderer leftHornTip_r1;
	private final ModelRenderer leftHornShaftTip_r1;
	private final ModelRenderer leftHornShaftBase_r1;
	private final ModelRenderer leftHornBase_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftUpperLeg;
	private final ModelRenderer leftLowerLeg;
	private final ModelRenderer rightUpperLeg;
	private final ModelRenderer rightLowerLeg;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;

	public ModelGoatman() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 18, -4.0F, -1.0F, -2.0F, 8, 12, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -12.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.5F, 2.0F, -2.5F, 9, 9, 9, 0.0F, false));

		rightHorn = new ModelRenderer(this);
		rightHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(rightHorn);
		

		rightHornTip_r1 = new ModelRenderer(this);
		rightHornTip_r1.setRotationPoint(-2.0F, -3.0F, 6.0F);
		rightHorn.addChild(rightHornTip_r1);
		setRotationAngle(rightHornTip_r1, -0.48F, 0.0F, 0.0F);
		rightHornTip_r1.cubeList.add(new ModelBox(rightHornTip_r1, 28, 34, -0.5F, -0.25F, -0.25F, 1, 1, 2, 0.0F, false));

		rightHornShaftTip_r1 = new ModelRenderer(this);
		rightHornShaftTip_r1.setRotationPoint(-2.0F, -2.0F, 4.0F);
		rightHorn.addChild(rightHornShaftTip_r1);
		setRotationAngle(rightHornShaftTip_r1, 0.5236F, 0.0F, 0.0F);
		rightHornShaftTip_r1.cubeList.add(new ModelBox(rightHornShaftTip_r1, 40, 30, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

		rightHornShaftBase_r1 = new ModelRenderer(this);
		rightHornShaftBase_r1.setRotationPoint(-2.0F, -2.0F, 4.0F);
		rightHorn.addChild(rightHornShaftBase_r1);
		setRotationAngle(rightHornShaftBase_r1, -0.4363F, 0.0F, 0.0F);
		rightHornShaftBase_r1.cubeList.add(new ModelBox(rightHornShaftBase_r1, 27, 0, -1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, false));

		rightHornBase_r1 = new ModelRenderer(this);
		rightHornBase_r1.setRotationPoint(-2.0F, 2.0F, 2.0F);
		rightHorn.addChild(rightHornBase_r1);
		setRotationAngle(rightHornBase_r1, -0.0436F, 0.0F, 0.0F);
		rightHornBase_r1.cubeList.add(new ModelBox(rightHornBase_r1, 20, 18, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

		leftHorn = new ModelRenderer(this);
		leftHorn.setRotationPoint(4.0F, 0.0F, 0.0F);
		head.addChild(leftHorn);
		

		leftHornTip_r1 = new ModelRenderer(this);
		leftHornTip_r1.setRotationPoint(-2.0F, -3.0F, 6.0F);
		leftHorn.addChild(leftHornTip_r1);
		setRotationAngle(leftHornTip_r1, -0.48F, 0.0F, 0.0F);
		leftHornTip_r1.cubeList.add(new ModelBox(leftHornTip_r1, 27, 5, -0.5F, -0.25F, -0.25F, 1, 1, 2, 0.0F, false));

		leftHornShaftTip_r1 = new ModelRenderer(this);
		leftHornShaftTip_r1.setRotationPoint(-2.0F, -2.0F, 4.0F);
		leftHorn.addChild(leftHornShaftTip_r1);
		setRotationAngle(leftHornShaftTip_r1, 0.5236F, 0.0F, 0.0F);
		leftHornShaftTip_r1.cubeList.add(new ModelBox(leftHornShaftTip_r1, 12, 34, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

		leftHornShaftBase_r1 = new ModelRenderer(this);
		leftHornShaftBase_r1.setRotationPoint(-2.0F, -2.0F, 4.0F);
		leftHorn.addChild(leftHornShaftBase_r1);
		setRotationAngle(leftHornShaftBase_r1, -0.4363F, 0.0F, 0.0F);
		leftHornShaftBase_r1.cubeList.add(new ModelBox(leftHornShaftBase_r1, 0, 0, -1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, false));

		leftHornBase_r1 = new ModelRenderer(this);
		leftHornBase_r1.setRotationPoint(-2.0F, 2.0F, 2.0F);
		leftHorn.addChild(leftHornBase_r1);
		setRotationAngle(leftHornBase_r1, -0.0436F, 0.0F, 0.0F);
		leftHornBase_r1.cubeList.add(new ModelBox(leftHornBase_r1, 0, 5, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 0, 34, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 24, 18, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftUpperLeg = new ModelRenderer(this);
		leftUpperLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		setRotationAngle(leftUpperLeg, -0.2F, 0.0F, 0.0F);
		leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 36, 10, -2.0F, -0.9801F, -2.1987F, 4, 6, 4, 0.0F, false));

		leftLowerLeg = new ModelRenderer(this);
		leftLowerLeg.setRotationPoint(0.0F, 6.0F, 0.0F);
		leftUpperLeg.addChild(leftLowerLeg);
		leftLowerLeg.cubeList.add(new ModelBox(leftLowerLeg, 32, 34, -2.0F, -0.9801F, -1.1987F, 4, 7, 4, 0.0F, false));

		rightUpperLeg = new ModelRenderer(this);
		rightUpperLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		setRotationAngle(rightUpperLeg, -0.2F, 0.0F, 0.0F);
		rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 36, 0, -2.0F, -0.9801F, -2.1987F, 4, 6, 4, 0.0F, false));

		rightLowerLeg = new ModelRenderer(this);
		rightLowerLeg.setRotationPoint(0.0F, 6.0F, 0.0F);
		rightUpperLeg.addChild(rightLowerLeg);
		rightLowerLeg.cubeList.add(new ModelBox(rightLowerLeg, 16, 34, -2.0F, -0.9801F, -1.1987F, 4, 7, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 12.0F, 1.0F);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.3491F, 0.0F, 0.0F);
		tail_r1.cubeList.add(new ModelBox(tail_r1, 40, 20, -1.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
		leftUpperLeg.render(f5);
		rightUpperLeg.render(f5);
		tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}