package net.fallenstars.init;

import net.fallenstars.FallenStars;
import net.fallenstars.entity.EntityMoonHarvester;
import net.fallenstars.entity.EntitySolarInvader;
import net.fallenstars.entity.EntityStarSkipper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;



public class EntityInit
{
    public static void registerEntites()
    {
        registerEntityMoonHavester("moonharvester", EntityMoonHarvester.class, FallenStars.ENTITY_MOONHVS,50, 2980798,799098);

        registerEntityStarSkipper("starskipper", EntityStarSkipper.class, FallenStars.ENTITY_STARSK,50,16735763,16753920);

        registerEntitySolarInvader("solarinvader",EntitySolarInvader.class, FallenStars.ENTITY_SOLARINV,50, 15176960,16711680);
    }




    private static void registerEntityStarSkipper(String name, Class<EntityStarSkipper> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(FallenStars.MODID +":" + name),entity,name,id, FallenStars.instance, range, 1, true,color1,color2);
    }


    private static void registerEntityMoonHavester(String name, Class<EntityMoonHarvester> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(FallenStars.MODID +":" + name),entity,name,id, FallenStars.instance, range, 1, true,color1,color2);
    }


    private static void registerEntitySolarInvader(String name, Class<EntitySolarInvader> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(FallenStars.MODID +":" + name),entity,name,id, FallenStars.instance, range, 1, true,color1,color2);
    }
}
