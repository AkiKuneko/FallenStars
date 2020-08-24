package net.fallenstars.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.fallenstars.ElementsFallenStars;

@ElementsFallenStars.ModElement.Tag
public class ProcedureSunoreEntityCollidesInTheBlock extends ElementsFallenStars.ModElement {
	public ProcedureSunoreEntityCollidesInTheBlock(ElementsFallenStars instance) {
		super(instance, 19);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SunoreEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 1);
	}
}
