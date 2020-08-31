package net.fallenstars;

import net.fallenstars.entity.EntityMoonHarvester;
import net.fallenstars.entity.EntityStarSkipper;
import net.fallenstars.gen.WorldGenCustomeStructures;
import net.fallenstars.init.EntityInit;
import net.fallenstars.init.musicInit;
import net.fallenstars.item.ItemMoonRecord;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Iterator;

public class commonProxy {
    public void registerItemRenderer(Item item, int meta, String id){};
    private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
        Iterator<Biome> itr = in.iterator();
        ArrayList<Biome> ls = new ArrayList<Biome>();
        while (itr.hasNext())
            ls.add(itr.next());
        return ls.toArray(new Biome[ls.size()]);
    }

    public void preInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new WorldGenCustomeStructures(), 0);
        EntityInit.registerEntites();
    }
    public void init(FMLInitializationEvent event){
        Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
        EntityRegistry.addSpawn(EntityStarSkipper.class, 20, 2, 6, EnumCreatureType.MONSTER, spawnBiomes);
        EntityRegistry.addSpawn(EntityMoonHarvester.class, 20, 2, 6, EnumCreatureType.MONSTER, spawnBiomes);

    }
    public void postInit(FMLPostInitializationEvent event){

    }
}
