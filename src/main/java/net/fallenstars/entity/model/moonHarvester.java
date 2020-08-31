package net.fallenstars.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class moonHarvester extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer BodyInner;
	private final ModelRenderer BodyOuter;
	private final ModelRenderer LegRight;
	private final ModelRenderer LegLeft;
	private final ModelRenderer ArmRight;
	private final ModelRenderer ArmLeft;

	public moonHarvester() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -18.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 24, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		BodyInner = new ModelRenderer(this);
		BodyInner.setRotationPoint(0.0F, 26.0F, 0.0F);
		BodyInner.cubeList.add(new ModelBox(BodyInner, 0, 40, -3.0F, -41.0F, -2.0F, 6, 15, 4, 0.0F, false));

		BodyOuter = new ModelRenderer(this);
		BodyOuter.setRotationPoint(0.0F, -7.0F, 0.0F);
		BodyOuter.cubeList.add(new ModelBox(BodyOuter, 0, 0, -5.0F, -9.0F, -3.0F, 10, 18, 6, 0.0F, false));

		LegRight = new ModelRenderer(this);
		LegRight.setRotationPoint(3.0F, 3.5F, 0.0F);
		LegRight.cubeList.add(new ModelBox(LegRight, 32, 0, -2.0F, -0.5F, -2.0F, 4, 21, 4, 0.0F, false));

		LegLeft = new ModelRenderer(this);
		LegLeft.setRotationPoint(-3.0F, 4.5F, 0.0F);
		LegLeft.cubeList.add(new ModelBox(LegLeft, 32, 32, -2.0F, -1.5F, -2.0F, 4, 21, 4, 0.0F, false));

		ArmRight = new ModelRenderer(this);
		ArmRight.setRotationPoint(-7.5F, -15.0F, 0.0F);
		ArmRight.cubeList.add(new ModelBox(ArmRight, 48, 0, -1.5F, -1.0F, -2.0F, 3, 20, 4, 0.0F, false));

		ArmLeft = new ModelRenderer(this);
		ArmLeft.setRotationPoint(7.5F, -15.0F, 0.0F);
		ArmLeft.cubeList.add(new ModelBox(ArmLeft, 48, 48, -1.5F, -1.0F, -2.0F, 3, 20, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		BodyInner.render(f5);
		BodyOuter.render(f5);
		LegRight.render(f5);
		LegLeft.render(f5);
		ArmRight.render(f5);
		ArmLeft.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
	{
		this.LegLeft.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f)*0.95f*limbSwingAmount;
		this.LegRight.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f+(float)Math.PI)*0.95f*limbSwingAmount;

		this.ArmLeft.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f)*0.6f*limbSwingAmount;
		this.ArmRight.rotateAngleX= MathHelper.cos(limbSwing * 0.6662f+(float)Math.PI)*0.6f*limbSwingAmount;

		this.Head.rotateAngleY = netHeadYaw * 0.017453292f;
		this.Head.rotateAngleX = headPitch * 0.017453292f;

	}
}