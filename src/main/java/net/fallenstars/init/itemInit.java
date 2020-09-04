package net.fallenstars.init;

import net.fallenstars.item.misc.ItemFallenstRecords;
import net.fallenstars.item.moon.tools.ItemMoonShovel;
import net.fallenstars.item.moon.weapons.ItemLunarBow;
import net.fallenstars.item.moon.tools.ItemMoonHoe;
import net.fallenstars.item.moon.tools.ItemMoonPickaxe;
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
    public static final ToolMaterial TOOL_SUN = EnumHelper.addToolMaterial("tool_sun",5,2000,5.0f,3.5f,19);
    public static final ToolMaterial TOOL_MOON = EnumHelper.addToolMaterial("tool_sun",5,2000,5.0f,3.5f,19);

    public static final ItemRecord closetothesun_record = new ItemFallenstRecords("sundisc", musicInit.closetothesun,"closetothesun_record","itemclosetothesunrecord");


    public static final ItemRecord moonlightsonata_record = new ItemFallenstRecords("moondisc", musicInit.moonlightsonata,"moonlightsonata_record","itemmoonlightsonatarecord");

    //Moon Items
    public static final Item lunarbow = new ItemLunarBow("itemlunarbow");
    public static final Item moonPickaxe = new ItemMoonPickaxe("moonpickaxe", TOOL_MOON);
    public static final Item moonAxe = new ItemMoonHoe("moonaxe", TOOL_MOON);
    public static final Item moonShovel = new ItemMoonShovel("moonshovel", TOOL_MOON);
    public static final Item moonHoe = new ItemMoonHoe("moonhoe", TOOL_MOON);

    //Sun Items
    public static final Item sunPickaxe = new ItemSunPickaxe("sunpickaxe", TOOL_SUN);
    public static final Item sunAxe = new ItemSunAxe("sunaxe", TOOL_SUN);
    public static final Item sunShovel = new ItemSunShovel("sunshovel", TOOL_SUN);
    public static final Item sunHoe = new ItemSunHoe("sunhoe", TOOL_SUN);
}
