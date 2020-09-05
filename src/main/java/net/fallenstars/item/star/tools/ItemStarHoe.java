package net.fallenstars.item.star.tools;

import net.fallenstars.FallenStars;
import net.fallenstars.creativetab.TabFallenStars;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.item.ItemHoe;

public class ItemStarHoe extends ItemHoe implements IHasModel {

    public ItemStarHoe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabFallenStars.tab);
        setMaxStackSize(1);

        itemInit.ITEMS.add(this);
    }
    @Override
    public void registerModel()
    {
        FallenStars.proxy.registerItemRenderer(this,0,"inventory");
    }
}
