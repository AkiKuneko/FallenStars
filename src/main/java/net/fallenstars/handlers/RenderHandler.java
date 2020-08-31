package net.fallenstars.handlers;

import net.fallenstars.entity.EntityMoonHarvester;
import net.fallenstars.entity.EntityStarSkipper;
import net.fallenstars.entity.render.renderMoonHarvester;
import net.fallenstars.entity.render.renderStarSkipper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityStarSkipper.class, new IRenderFactory<EntityStarSkipper>()
        {

            @Override
            public Render<? super EntityStarSkipper> createRenderFor(RenderManager manager) {
                return new renderStarSkipper(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityMoonHarvester.class, new IRenderFactory<EntityMoonHarvester>() {
            @Override
            public Render<? super EntityMoonHarvester> createRenderFor(RenderManager manager) {
                return new renderMoonHarvester(manager);
            }
        });
    }
}
