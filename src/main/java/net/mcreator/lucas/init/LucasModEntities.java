/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.lucas.entity.SuperSheepEntity;
import net.mcreator.lucas.entity.SheepMob1Entity;
import net.mcreator.lucas.entity.DumbcarEntity;
import net.mcreator.lucas.LucasMod;

@EventBusSubscriber
public class LucasModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, LucasMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SheepMob1Entity>> SHEEP_MOB_1 = register("sheep_mob_1",
			EntityType.Builder.<SheepMob1Entity>of(SheepMob1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuperSheepEntity>> SUPER_SHEEP = register("super_sheep",
			EntityType.Builder.<SuperSheepEntity>of(SuperSheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(99).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DumbcarEntity>> DUMBCAR = register("dumbcar",
			EntityType.Builder.<DumbcarEntity>of(DumbcarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SheepMob1Entity.init(event);
		SuperSheepEntity.init(event);
		DumbcarEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHEEP_MOB_1.get(), SheepMob1Entity.createAttributes().build());
		event.put(SUPER_SHEEP.get(), SuperSheepEntity.createAttributes().build());
		event.put(DUMBCAR.get(), DumbcarEntity.createAttributes().build());
	}
}