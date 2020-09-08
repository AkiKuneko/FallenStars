package net.fallenstars.init;

import net.fallenstars.FallenStars;
import net.fallenstars.item.misc.ItemFallenstRecords;
import net.fallenstars.item.misc.ItemArmorBase;
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
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class itemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final ToolMaterial TOOL_SUN = EnumHelper.addToolMaterial("tool_sun",5,2000,9.0f,3.5f,19);
    public static final ToolMaterial TOOL_MOON = EnumHelper.addToolMaterial("tool_moon",5,2000,9.0f,3.5f,19);
    public static final ToolMaterial TOOL_STAR = EnumHelper.addToolMaterial("tool_moon",3,750,5.0f,3.5f,19);
    public static final ArmorMaterial ARMOR_SUN = EnumHelper.addArmorMaterial("armor_sun", FallenStars.MODID + ":sun" ,600, new int[]{5,10,7,5},19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    public static final ArmorMaterial ARMOR_MOON = EnumHelper.addArmorMaterial("armor_moon", FallenStars.MODID + ":moon" ,450, new int[]{8,15,14,10},19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemRecord thedevilspiano_record = new ItemFallenstRecords("sundisc", musicInit.thedevilspiano,"thedevilspiano_record","itemthedevilspianorecord");

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

    //Moon Armor
    public static final Item moonHelmet = new ItemArmorBase("moonhelmet", ARMOR_MOON,1, EntityEquipmentSlot.HEAD);
    public static final Item moonChestpice = new ItemArmorBase("moonchestpice",  ARMOR_MOON,1, EntityEquipmentSlot.CHEST);
    public static final Item moonLegings = new ItemArmorBase("moonleggings",ARMOR_MOON,2, EntityEquipmentSlot.LEGS);
    public static final Item moonBoots = new ItemArmorBase("moonboots",ARMOR_MOON,1, EntityEquipmentSlot.FEET);

    //Sun Items
    public static final Item sunPickaxe = new ItemSunPickaxe("sunpickaxe", TOOL_SUN);
    public static final Item sunAxe = new ItemSunAxe("sunaxe", TOOL_SUN);
    public static final Item sunShovel = new ItemSunShovel("sunshovel", TOOL_SUN);
    public static final Item sunHoe = new ItemSunHoe("sunhoe", TOOL_SUN);

    //Sun Armor
    public static final Item sunHelmet = new ItemArmorBase("sunhelmet", ARMOR_SUN,1, EntityEquipmentSlot.HEAD);
    public static final Item sunChestpice = new ItemArmorBase("sunchestpice",  ARMOR_SUN,1, EntityEquipmentSlot.CHEST);
    public static final Item sunLegings = new ItemArmorBase("sunleggings",ARMOR_SUN,2, EntityEquipmentSlot.LEGS);
    public static final Item sunBoots = new ItemArmorBase("sunboots",ARMOR_SUN,1, EntityEquipmentSlot.FEET);
}
