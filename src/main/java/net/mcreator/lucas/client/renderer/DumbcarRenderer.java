package net.mcreator.lucas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lucas.entity.DumbcarEntity;
import net.mcreator.lucas.client.model.Modeldumbcar;

public class DumbcarRenderer extends MobRenderer<DumbcarEntity, Modeldumbcar<DumbcarEntity>> {
	public DumbcarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldumbcar<DumbcarEntity>(context.bakeLayer(Modeldumbcar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DumbcarEntity entity) {
		return ResourceLocation.parse("lucas:textures/entities/dumbcartexture.png");
	}
}