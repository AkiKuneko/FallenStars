package net.fallenstars;

import net.fallenstars.entity.EntityStarSkipper;
import net.fallenstars.gen.WorldGenCustomeStructures;
import net.fallenstars.init.EntityInit;
import net.fallenstars.init.musicInit;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
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
    private Biome[] StarSkppirspawn = {
            Biomes.OCEAN, Biomes.PLAINS, Biomes.DESERT, Biomes.EXTREME_HILLS, Biomes.FOREST, Biomes.TAIGA, Biomes.SWAMPLAND, Biomes.FROZEN_OCEAN, Biomes.FROZEN_RIVER, Biomes.ICE_MOUNTAINS, Biomes.DESERT_HILLS, Biomes.FOREST_HILLS, Biomes.TAIGA_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.JUNGLE_EDGE, Biomes.DEEP_OCEAN, Biomes.STONE_BEACH, Biomes.COLD_BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.SAVANNA, Biomes.MESA, Biomes.MESA_ROCK, Biomes.MESA_CLEAR_ROCK, Biomes.MUTATED_PLAINS, Biomes.MUTATED_DESERT, Biomes.MUTATED_EXTREME_HILLS, Biomes.MUTATED_FOREST, Biomes.MUTATED_TAIGA, Biomes.MUTATED_SWAMPLAND, Biomes.MUTATED_ICE_FLATS, Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE, Biomes.MUTATED_BIRCH_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_TAIGA_COLD, Biomes.MUTATED_REDWOOD_TAIGA, Biomes.MUTATED_REDWOOD_TAIGA_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_SAVANNA, Biomes.MUTATED_SAVANNA_ROCK, Biomes.MUTATED_MESA, Biomes.MUTATED_MESA_ROCK, Biomes.MUTATED_MESA_CLEAR_ROCK,
    };

    public void preInit(FMLPreInitializationEvent event){
        musicInit.registerSounds();
        GameRegistry.registerWorldGenerator(new WorldGenCustomeStructures(), 0);
        EntityInit.registerEntites();
    }
    public void init(FMLInitializationEvent event){
        Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
        EntityRegistry.addSpawn(EntityStarSkipper.class, 20, 2, 6, EnumCreatureType.MONSTER, StarSkppirspawn);

    }
    public void postInit(FMLPostInitializationEvent event){

    }
}
