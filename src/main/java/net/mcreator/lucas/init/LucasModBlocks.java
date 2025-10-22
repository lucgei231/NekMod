/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.lucas.block.*;
import net.mcreator.lucas.LucasMod;

public class LucasModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LucasMod.MODID);
	public static final DeferredBlock<Block> HELLO_BABY = REGISTRY.register("hello_baby", HelloBabyBlock::new);
	public static final DeferredBlock<Block> JUMPBLOCK = REGISTRY.register("jumpblock", JumpblockBlock::new);
	public static final DeferredBlock<Block> FIREBLOCK = REGISTRY.register("fireblock", FireblockBlock::new);
	public static final DeferredBlock<Block> BIGFIRE = REGISTRY.register("bigfire", BigfireBlock::new);
	public static final DeferredBlock<Block> IRIDIUMORE = REGISTRY.register("iridiumore", IridiumoreBlock::new);
	public static final DeferredBlock<Block> LOOCLOUD = REGISTRY.register("loocloud", LoocloudBlock::new);
	public static final DeferredBlock<Block> DUMB_BUTT_LOO_PLANT = REGISTRY.register("dumb_butt_loo_plant", DumbButtLooPlantBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}