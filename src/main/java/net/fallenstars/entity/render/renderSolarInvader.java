package net.fallenstars.entity.render;

import net.fallenstars.FallenStars;
import net.fallenstars.entity.EntitySolarInvader;
import net.fallenstars.entity.model.solarInvader;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class renderSolarInvader extends RenderLiving<EntitySolarInvader>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(FallenStars.MODID+":textures/entity/solarinvader.png");
    public renderSolarInvader(RenderManager manager) {
        super(manager, new solarInvader(), .5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySolarInvader entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySolarInvader entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
