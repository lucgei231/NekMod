/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lucas.client.renderer.SuperSheepRenderer;
import net.mcreator.lucas.client.renderer.SheepMob1Renderer;
import net.mcreator.lucas.client.renderer.DumbcarRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class LucasModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LucasModEntities.SHEEP_MOB_1.get(), SheepMob1Renderer::new);
		event.registerEntityRenderer(LucasModEntities.SUPER_SHEEP.get(), SuperSheepRenderer::new);
		event.registerEntityRenderer(LucasModEntities.DUMBCAR.get(), DumbcarRenderer::new);
	}
}