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
        setMaxDamage(700);
        setMaxStackSize(1);
        itemInit.ITEMS.add(this);
        getArrowVelocity(150);
    }

    @Override
    public int getItemEnchantability() {
        return 10;
    }

    @Override
    public void registerModel() {
        FallenStars.proxy.registerItemRenderer(this, 0,"inventory");
    }

    public static float getArrowVelocity(int p_getArrowVelocity_0_) {
        float f = (float)p_getArrowVelocity_0_ / 150.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }


}
