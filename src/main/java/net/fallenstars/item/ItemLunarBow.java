package net.fallenstars.item;

import net.fallenstars.FallenStars;
import net.fallenstars.creativetab.TabFallenStars;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemLunarBow extends ItemBow implements IHasModel {
    public ItemLunarBow(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabFallenStars.tab);
        setMaxDamage(1000);
        setMaxStackSize(1);
        itemInit.ITEMS.add(this);
    }

    @Override
    public int getItemEnchantability() {
        return 10;
    }

    @Override
    public void registerModel() {
        FallenStars.proxy.registerItemRenderer(this, 0,"inventory");
    }
}
