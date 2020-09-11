package net.fallenstars.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class ProcedureSunglassesHelmetTickEvent extends ElementsFallenStars.ModElement {
	public ProcedureSunglassesHelmetTickEvent(ElementsFallenStars instance) {
		super(instance, 30);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SunglassesHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,225, 0));
	}
}
