/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lucas.LucasMod;

@EventBusSubscriber
public class LucasModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LucasMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NEK_MOD = REGISTRY.register("nek_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lucas.nek_mod")).icon(() -> new ItemStack(LucasModBlocks.HELLO_BABY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LucasModBlocks.HELLO_BABY.get().asItem());
				tabData.accept(LucasModBlocks.JUMPBLOCK.get().asItem());
				tabData.accept(LucasModItems.FIREBALL_SWORD.get());
				tabData.accept(LucasModBlocks.FIREBLOCK.get().asItem());
				tabData.accept(LucasModBlocks.BIGFIRE.get().asItem());
				tabData.accept(LucasModBlocks.IRIDIUMORE.get().asItem());
				tabData.accept(LucasModItems.IR.get());
				tabData.accept(LucasModItems.SHEEP_MOB_1_SPAWN_EGG.get());
				tabData.accept(LucasModItems.SUPER_SHEEP_SPAWN_EGG.get());
				tabData.accept(LucasModBlocks.LOOCLOUD.get().asItem());
				tabData.accept(LucasModBlocks.DUMB_BUTT_LOO_PLANT.get().asItem());
				tabData.accept(LucasModItems.DUMBCAR_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LucasModBlocks.HELLO_BABY.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LucasModBlocks.JUMPBLOCK.get().asItem());
			tabData.accept(LucasModBlocks.FIREBLOCK.get().asItem());
			tabData.accept(LucasModBlocks.BIGFIRE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LucasModItems.FIREBALL_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LucasModBlocks.IRIDIUMORE.get().asItem());
			tabData.accept(LucasModItems.IR.get());
			tabData.accept(LucasModBlocks.LOOCLOUD.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(LucasModItems.SHEEP_MOB_1_SPAWN_EGG.get());
			tabData.accept(LucasModItems.SUPER_SHEEP_SPAWN_EGG.get());
			tabData.accept(LucasModItems.DUMBCAR_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LucasModBlocks.DUMB_BUTT_LOO_PLANT.get().asItem());
		}
	}
}