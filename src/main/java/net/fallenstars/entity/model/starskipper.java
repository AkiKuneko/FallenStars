package net.fallenstars.entity.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class starskipper extends ModelBase {
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Head;
	private final ModelRenderer body;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public starskipper() {
		textureWidth = 128;
		textureHeight = 128;

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(8.0F, -16.3F, 0.2F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 0, -2.0F, 0.0004F, -2.0F, 4, 19, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-7.7873F, -16.3F, 0.1764F);
		RightArm.cubeList.add(new ModelBox(RightArm, 42, 42, -2.0F, 0.0004F, -2.0F, 4, 19, 4, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.2F, -17.7F, 0.7F);
		Head.cubeList.add(new ModelBox(Head, 24, 24, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.1F, -6.5F, 0.25F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -10.4F, -2.45F, 10, 21, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 26, -4.0F, -10.1F, -2.05F, 8, 20, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.8F, 5.4F, 0.2F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 30, 0, -2.0F, -0.5F, -2.5F, 4, 19, 5, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.2F, 5.4F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 40, -2.0F, -0.5F, -2.5F, 4, 19, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftArm.render(f5);
		RightArm.render(f5);
		Head.render(f5);
		body.render(f5);
		RightLeg.render(f5);
		LeftLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
	{
		this.LeftLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f)*1.4f*limbSwingAmount;
		this.RightLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f+(float)Math.PI)*1.4f*limbSwingAmount;

		this.LeftArm.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f)*0.7f*limbSwingAmount;
		this.RightArm.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f+(float)Math.PI)*0.7f*limbSwingAmount;

		this.Head.rotateAngleY = netHeadYaw * 0.017453292f;
		this.Head.rotateAngleX = headPitch * 0.017453292f;

	}
}