package net.fallenstars.handlers;

import net.fallenstars.FallenStars;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
    public static final ResourceLocation STARSKIPER = LootTableList.register(new ResourceLocation(FallenStars.MODID, "starskipper"));
    public static final ResourceLocation MOONHARVESTER = LootTableList.register(new ResourceLocation(FallenStars.MODID, "moonharvester"));
    public static final ResourceLocation SOLARINVADER = LootTableList.register(new ResourceLocation(FallenStars.MODID, "solarinvader"));

}
