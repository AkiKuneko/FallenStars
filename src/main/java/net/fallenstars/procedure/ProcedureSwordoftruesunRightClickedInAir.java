package net.fallenstars.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class ProcedureSwordoftruesunRightClickedInAir extends ElementsFallenStars.ModElement {
	public ProcedureSwordoftruesunRightClickedInAir(ElementsFallenStars instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SwordoftruesunRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.addEnchantment(Enchantments.FIRE_ASPECT, (int) 2);
	}
}
