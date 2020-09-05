package net.fallenstars.init;

import net.fallenstars.item.misc.ItemFallenstRecords;
import net.fallenstars.item.moon.tools.ItemMoonAxe;
import net.fallenstars.item.moon.tools.ItemMoonShovel;
import net.fallenstars.item.moon.weapons.ItemLunarBow;
import net.fallenstars.item.moon.tools.ItemMoonHoe;
import net.fallenstars.item.moon.tools.ItemMoonPickaxe;
import net.fallenstars.item.star.tools.ItemStarAxe;
import net.fallenstars.item.star.tools.ItemStarHoe;
import net.fallenstars.item.star.tools.ItemStarPickaxe;
import net.fallenstars.item.sun.tools.ItemSunAxe;
import net.fallenstars.item.sun.tools.ItemSunHoe;
import net.fallenstars.item.sun.tools.ItemSunPickaxe;
import net.fallenstars.item.sun.tools.ItemSunShovel;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class itemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final ToolMaterial TOOL_SUN = EnumHelper.addToolMaterial("tool_sun",5,2000,9.0f,3.5f,19);
    public static final ToolMaterial TOOL_MOON = EnumHelper.addToolMaterial("tool_moon",5,2000,9.0f,3.5f,19);
    public static final ToolMaterial TOOL_STAR = EnumHelper.addToolMaterial("tool_moon",3,2000,5.0f,3.5f,19);


    public static final ItemRecord closetothesun_record = new ItemFallenstRecords("sundisc", musicInit.closetothesun,"closetothesun_record","itemclosetothesunrecord");

    public static final ItemRecord moonlightsonata_record = new ItemFallenstRecords("moondisc", musicInit.moonlightsonata,"moonlightsonata_record","itemmoonlightsonatarecord");

    //Star Items
    public static final Item starPickaxe = new ItemStarPickaxe("starpickaxe", TOOL_STAR);
    public static final Item starAxe = new ItemStarAxe("staraxe", TOOL_STAR);
    public static final Item starShovel = new ItemStarHoe("starshovel", TOOL_STAR);
    public static final Item starHoe = new ItemStarHoe("starhoe", TOOL_STAR);

    //Moon Items
    public static final Item lunarbow = new ItemLunarBow("itemlunarbow");
    public static final Item moonPickaxe = new ItemMoonPickaxe("moonpickaxe", TOOL_MOON);
    public static final Item moonAxe = new ItemMoonAxe("moonaxe", TOOL_MOON);
    public static final Item moonShovel = new ItemMoonShovel("moonshovel", TOOL_MOON);
    public static final Item moonHoe = new ItemMoonHoe("moonhoe", TOOL_MOON);

    //Sun Items
    public static final Item sunPickaxe = new ItemSunPickaxe("sunpickaxe", TOOL_SUN);
    public static final Item sunAxe = new ItemSunAxe("sunaxe", TOOL_SUN);
    public static final Item sunShovel = new ItemSunShovel("sunshovel", TOOL_SUN);
    public static final Item sunHoe = new ItemSunHoe("sunhoe", TOOL_SUN);
}
