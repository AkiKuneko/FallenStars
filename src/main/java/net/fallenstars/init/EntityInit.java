package net.fallenstars.init;

import net.fallenstars.FallenStars;
import net.fallenstars.entity.EntityStarSkipper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import javax.swing.text.html.parser.Entity;


public class EntityInit
{
    public static void registerEntites()
    {
        registerEntity("starskipper", EntityStarSkipper.class,FallenStars.ENTITY_STARSK,50,16735763,16753920);
    }
    private static void registerEntity(String name, Class<EntityStarSkipper> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(FallenStars.MODID +":" + name),entity,name,id, FallenStars.instance, range, 1, true,color1,color2);
    }
}
