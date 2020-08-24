package net.fallenstars.objects.items;

import net.fallenstars.ClientProxyFallenStars;
import net.fallenstars.FallenStars;
import net.fallenstars.creativetab.TabFallenStars;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabFallenStars.tab);

        itemInit.ITEMS.add(this);
    }

    @Override
    public void registerModel()
    {
        FallenStars.proxy.registerItemRenderer(this,0,"inventory");
    }
}
