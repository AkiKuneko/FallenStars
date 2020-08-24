package net.fallenstars.entity.render;

import net.fallenstars.FallenStars;
import net.fallenstars.entity.EntityStarSkipper;
import net.fallenstars.entity.model.starskipper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class renderStarSkipper extends RenderLiving<EntityStarSkipper>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(FallenStars.MODID+":textures/entity/starskipper.png");
    public renderStarSkipper(RenderManager manager) {
        super(manager, new starskipper(), .5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityStarSkipper entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityStarSkipper entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
