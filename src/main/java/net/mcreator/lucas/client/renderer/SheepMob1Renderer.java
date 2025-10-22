package net.mcreator.lucas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lucas.entity.SheepMob1Entity;
import net.mcreator.lucas.client.model.Modelsupersheep;

public class SheepMob1Renderer extends MobRenderer<SheepMob1Entity, Modelsupersheep<SheepMob1Entity>> {
	public SheepMob1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelsupersheep<SheepMob1Entity>(context.bakeLayer(Modelsupersheep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SheepMob1Entity entity) {
		return ResourceLocation.parse("lucas:textures/entities/supersheeptexture.png");
	}
}