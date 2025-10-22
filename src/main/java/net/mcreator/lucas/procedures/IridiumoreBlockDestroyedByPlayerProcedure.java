package net.mcreator.lucas.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.ServerChatEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.lucas.init.LucasModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class IridiumoreBlockDestroyedByPlayerProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double babby = 0;
		babby = Mth.nextInt(RandomSource.create(), 1, 10);
		if (babby == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LucasModBlocks.IRIDIUMORE.get()).copy();
				_setstack.setCount(20);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("ORE++"), false);
			}
		} else if (babby == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LucasModBlocks.IRIDIUMORE.get()).copy();
				_setstack.setCount(10);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("ORE+"), false);
			}
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LucasModBlocks.IRIDIUMORE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		babby = Mth.nextInt(RandomSource.create(), 1, 10);
	}
}