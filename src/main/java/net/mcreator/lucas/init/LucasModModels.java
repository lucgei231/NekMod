/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lucas.client.model.Modelsupersheep;
import net.mcreator.lucas.client.model.Modeldumbcar;

@EventBusSubscriber(Dist.CLIENT)
public class LucasModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldumbcar.LAYER_LOCATION, Modeldumbcar::createBodyLayer);
		event.registerLayerDefinition(Modelsupersheep.LAYER_LOCATION, Modelsupersheep::createBodyLayer);
	}
}