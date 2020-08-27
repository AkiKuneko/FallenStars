package net.fallenstars.init;

import net.fallenstars.item.ItemMoonRecord;
import net.fallenstars.objects.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;

import java.util.ArrayList;
import java.util.List;

public class itemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemRecord moonlightsonata_record = new ItemMoonRecord("moondisc", musicInit.moonlightsonata,"moonlightsonata_record","itemmoonlightsonatarecord");
}
