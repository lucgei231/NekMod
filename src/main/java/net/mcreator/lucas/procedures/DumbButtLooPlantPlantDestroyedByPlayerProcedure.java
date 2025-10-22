package net.mcreator.lucas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.lucas.network.LucasModVariables;
import net.mcreator.lucas.init.LucasModBlocks;

public class DumbButtLooPlantPlantDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double dabooby = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable = LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable + 1;
		LucasModVariables.MapVariables.get(world).markSyncDirty();
		if (LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"w @p warning! do not break plant! [1]");
			world.setBlock(BlockPos.containing(x, y, z), LucasModBlocks.DUMB_BUTT_LOO_PLANT.get().defaultBlockState(), 3);
		}
		if (LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable == 2) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"w @p warning! do not break plant! [2]");
			world.setBlock(BlockPos.containing(x, y, z), LucasModBlocks.DUMB_BUTT_LOO_PLANT.get().defaultBlockState(), 3);
		}
		if (LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable == 3) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"w @p Releasing pickaxes and clouds. [3]");
			for (int index0 = 0; index0 < 5; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			posX = 0;
			posZ = 0;
			for (int index1 = 0; index1 < 5; index1++) {
				for (int index2 = 0; index2 < 5; index2++) {
					world.setBlock(BlockPos.containing(x + posX, y + 20, z + posZ), LucasModBlocks.LOOCLOUD.get().defaultBlockState(), 3);
					posX = posX + 1;
					posZ = 0;
				}
				posX = 0;
				posZ = posZ + 1;
			}
			LucasModVariables.MapVariables.get(world).dumbuttlooplantvariable = 0;
			LucasModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}