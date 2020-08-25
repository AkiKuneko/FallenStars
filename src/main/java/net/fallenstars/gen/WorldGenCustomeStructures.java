package net.fallenstars.gen;

import net.minecraft.block.Block;
import net.fallenstars.gen.generators.WorldGenStructure;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;


public class WorldGenCustomeStructures implements IWorldGenerator
{
    public static final WorldGenStructure SUNTEMPLE = new WorldGenStructure("suntemple");

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension()){
            case 1:
                break;
            case 0:
                generateStructure(SUNTEMPLE,world,random,chunkX,chunkZ,250, Blocks.GRASS);
                break;
            case -1:
                break;
        }
    }

    private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock)
    {
        int x=(chunkX*16)+random.nextInt(15);
        int z=(chunkZ*16)+random.nextInt(15);
        int y=calculateGenerationHight(world,x,z,topBlock);
        BlockPos pos = new BlockPos(x,y,z);

        if(random.nextInt(chance)==0)
        {
            generator.generate(world,random,pos);
        }

    }
    private static int calculateGenerationHight(World world, int x, int z, Block topBlock){
        int y = 255;
        boolean foundGround = false;

        while(!foundGround&&y-- >=0){
            Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
            foundGround = block == topBlock;
        }
        return y;
    }
}
