package net.fallenstars.entity.model;



import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class starskipper extends ModelBase {
	private final ModelRenderer root;

	public starskipper() {
		textureWidth = 128;
		textureHeight = 128;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.cubeList.add(new ModelBox(root, 24, 24, -3.8F, -25.7F, -3.3F, 8, 8, 8, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 0, 0, -4.9F, -16.9F, -2.2F, 10, 21, 5, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 0, 26, -3.9F, -16.6F, -1.8F, 8, 20, 4, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 48, 0, 6.0F, -15.8F, -1.8F, 4, 19, 4, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 42, 42, -9.7873F, -16.2996F, -1.8236F, 4, 19, 4, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 24, 40, 1.2F, 4.9F, -2.5F, 4, 19, 5, 0.0F, false));
		root.cubeList.add(new ModelBox(root, 30, 0, -4.8F, 4.9F, -2.3F, 4, 19, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		root.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}