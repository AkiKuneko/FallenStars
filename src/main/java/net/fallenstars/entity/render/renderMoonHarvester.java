package net.fallenstars.entity.render;

import net.fallenstars.FallenStars;
import net.fallenstars.entity.EntityMoonHarvester;;
import net.fallenstars.entity.model.moonHarvester;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class renderMoonHarvester extends RenderLiving<EntityMoonHarvester>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(FallenStars.MODID+":textures/entity/moonharvister.png");
    public renderMoonHarvester(RenderManager manager) {
        super(manager, new moonHarvester(), .5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityMoonHarvester entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityMoonHarvester entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
