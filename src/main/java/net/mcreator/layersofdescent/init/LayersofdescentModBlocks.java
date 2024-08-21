
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.layersofdescent.block.TopazClusterBlock;
import net.mcreator.layersofdescent.block.TopazBlockBlock;
import net.mcreator.layersofdescent.block.StonePillarBlock;
import net.mcreator.layersofdescent.block.SmallStoneBricksBlock;
import net.mcreator.layersofdescent.block.SapphireClusterBlock;
import net.mcreator.layersofdescent.block.SapphireBlockBlock;
import net.mcreator.layersofdescent.block.MossyStoneBlock;
import net.mcreator.layersofdescent.block.LimboPortalBlock;
import net.mcreator.layersofdescent.block.JadeClusterBlock;
import net.mcreator.layersofdescent.block.JadeBlockBlock;
import net.mcreator.layersofdescent.block.CrackedStonePillarBlock;
import net.mcreator.layersofdescent.block.CrackedSmallStoneBricksBlock;
import net.mcreator.layersofdescent.block.BlooditeClusterBlock;
import net.mcreator.layersofdescent.block.BlooditeBlockBlock;
import net.mcreator.layersofdescent.LayersofdescentMod;

public class LayersofdescentModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LayersofdescentMod.MODID);
	public static final RegistryObject<Block> JADE_BLOCK = REGISTRY.register("jade_block", () -> new JadeBlockBlock());
	public static final RegistryObject<Block> TOPAZ_BLOCK = REGISTRY.register("topaz_block", () -> new TopazBlockBlock());
	public static final RegistryObject<Block> JADE_CLUSTER = REGISTRY.register("jade_cluster", () -> new JadeClusterBlock());
	public static final RegistryObject<Block> MOSSY_STONE = REGISTRY.register("mossy_stone", () -> new MossyStoneBlock());
	public static final RegistryObject<Block> TOPAZ_CLUSTER = REGISTRY.register("topaz_cluster", () -> new TopazClusterBlock());
	public static final RegistryObject<Block> SAPPHIRE_CLUSTER = REGISTRY.register("sapphire_cluster", () -> new SapphireClusterBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> LIMBO_PORTAL = REGISTRY.register("limbo_portal", () -> new LimboPortalBlock());
	public static final RegistryObject<Block> STONE_PILLAR = REGISTRY.register("stone_pillar", () -> new StonePillarBlock());
	public static final RegistryObject<Block> SMALL_STONE_BRICKS = REGISTRY.register("small_stone_bricks", () -> new SmallStoneBricksBlock());
	public static final RegistryObject<Block> CRACKED_STONE_PILLAR = REGISTRY.register("cracked_stone_pillar", () -> new CrackedStonePillarBlock());
	public static final RegistryObject<Block> CRACKED_SMALL_STONE_BRICKS = REGISTRY.register("cracked_small_stone_bricks", () -> new CrackedSmallStoneBricksBlock());
	public static final RegistryObject<Block> BLOODITE_CLUSTER = REGISTRY.register("bloodite_cluster", () -> new BlooditeClusterBlock());
	public static final RegistryObject<Block> BLOODITE_BLOCK = REGISTRY.register("bloodite_block", () -> new BlooditeBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
