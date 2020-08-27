package net.fallenstars.objects.blocks;

import net.fallenstars.FallenStars;
import net.fallenstars.creativetab.TabFallenStars;
import net.fallenstars.init.blockInit;
import net.fallenstars.init.itemInit;
import net.fallenstars.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TabFallenStars.tab);

        blockInit.BLOCKS.add(this);
        itemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModel()
    {
        FallenStars.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }
}
