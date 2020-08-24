package net.fallenstars.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class ProcedureSunsteelSwordRightClickedInAir extends ElementsFallenStars.ModElement {
	public ProcedureSunsteelSwordRightClickedInAir(ElementsFallenStars instance) {
		super(instance, 28);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SunsteelSwordRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.addEnchantment(Enchantments.FIRE_ASPECT, (int) 1);
	}
}
