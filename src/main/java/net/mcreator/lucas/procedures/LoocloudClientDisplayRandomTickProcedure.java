package net.mcreator.lucas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.lucas.init.LucasModParticleTypes;

public class LoocloudClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 5; index0++) {
			world.addParticle((SimpleParticleType) (LucasModParticleTypes.LOO.get()), x, y, z, 0.25, (-0.3), 0.25);
			world.addParticle((SimpleParticleType) (LucasModParticleTypes.LOO.get()), x, y, z, (-0.25), (-0.3), (-0.25));
		}
	}
}