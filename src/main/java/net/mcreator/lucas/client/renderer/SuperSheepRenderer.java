package net.mcreator.lucas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lucas.entity.SuperSheepEntity;
import net.mcreator.lucas.client.model.Modelsupersheep;

public class SuperSheepRenderer extends MobRenderer<SuperSheepEntity, Modelsupersheep<SuperSheepEntity>> {
	public SuperSheepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsupersheep<SuperSheepEntity>(context.bakeLayer(Modelsupersheep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuperSheepEntity entity) {
		return ResourceLocation.parse("lucas:textures/entities/supersheeptexturenew.png");
	}
}