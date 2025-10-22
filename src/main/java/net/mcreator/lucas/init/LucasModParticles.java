/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lucas.client.particle.LooParticle;

@EventBusSubscriber(Dist.CLIENT)
public class LucasModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(LucasModParticleTypes.LOO.get(), LooParticle::provider);
	}
}