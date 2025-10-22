/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lucas.item.LightningswordItem;
import net.mcreator.lucas.item.IrItem;
import net.mcreator.lucas.LucasMod;

public class LucasModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LucasMod.MODID);
	public static final DeferredItem<Item> HELLO_BABY = block(LucasModBlocks.HELLO_BABY);
	public static final DeferredItem<Item> JUMPBLOCK = block(LucasModBlocks.JUMPBLOCK);
	public static final DeferredItem<Item> FIREBALL_SWORD = REGISTRY.register("fireball_sword", LightningswordItem::new);
	public static final DeferredItem<Item> FIREBLOCK = block(LucasModBlocks.FIREBLOCK);
	public static final DeferredItem<Item> BIGFIRE = block(LucasModBlocks.BIGFIRE);
	public static final DeferredItem<Item> IRIDIUMORE = block(LucasModBlocks.IRIDIUMORE);
	public static final DeferredItem<Item> IR = REGISTRY.register("ir", IrItem::new);
	public static final DeferredItem<Item> SHEEP_MOB_1_SPAWN_EGG = REGISTRY.register("sheep_mob_1_spawn_egg", () -> new DeferredSpawnEggItem(LucasModEntities.SHEEP_MOB_1, -65332, -3342388, new Item.Properties()));
	public static final DeferredItem<Item> SUPER_SHEEP_SPAWN_EGG = REGISTRY.register("super_sheep_spawn_egg", () -> new DeferredSpawnEggItem(LucasModEntities.SUPER_SHEEP, -1, -16711834, new Item.Properties()));
	public static final DeferredItem<Item> LOOCLOUD = block(LucasModBlocks.LOOCLOUD);
	public static final DeferredItem<Item> DUMB_BUTT_LOO_PLANT = block(LucasModBlocks.DUMB_BUTT_LOO_PLANT);
	public static final DeferredItem<Item> DUMBCAR_SPAWN_EGG = REGISTRY.register("dumbcar_spawn_egg", () -> new DeferredSpawnEggItem(LucasModEntities.DUMBCAR, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}