package net.fallenstars.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.fallenstars.item.wand.ItemStarwand1;
import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class TabFallenStars extends ElementsFallenStars.ModElement {
	public TabFallenStars(ElementsFallenStars instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfallenstars") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemStarwand1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}