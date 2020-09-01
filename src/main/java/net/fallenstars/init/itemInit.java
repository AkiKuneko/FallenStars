package net.fallenstars.init;

import net.fallenstars.item.ItemLunarBow;
import net.fallenstars.item.ItemMoonRecord;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;

import java.util.ArrayList;
import java.util.List;

public class itemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemRecord closetothesun_record = new ItemMoonRecord("sundisc", musicInit.closetothesun,"closetothesun_record","itemclosetothesunrecord");


    public static final ItemRecord moonlightsonata_record = new ItemMoonRecord("moondisc", musicInit.moonlightsonata,"moonlightsonata_record","itemmoonlightsonatarecord");

    public static final Item lunarbow = new ItemLunarBow("itemlunarbow");
}
