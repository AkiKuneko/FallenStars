package net.fallenstars.item.misc;

import net.fallenstars.FallenStars;
import net.fallenstars.creativetab.TabFallenStars;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmorBase extends ItemArmor implements IHasModel {

    public ItemArmorBase(String name, ArmorMaterial armorMaterial, int renderIndexIn, EntityEquipmentSlot equipmentSlot) {
        super(armorMaterial, renderIndexIn, equipmentSlot);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabFallenStars.tab);
        setMaxStackSize(1);

        itemInit.ITEMS.add(this);
    }

    @Override
    public void registerModel() {
        FallenStars.proxy.registerItemRenderer(this,0,"inventory");
    }
}
