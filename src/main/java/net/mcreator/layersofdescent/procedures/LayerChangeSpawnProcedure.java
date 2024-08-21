package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.layersofdescent.LayersofdescentMod;

import java.util.Map;

public class LayerChangeSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean SpawnFound = false;
		SpawnFound = false;
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			int horizontalRadiusSphere = (int) 50 - 1;
			int verticalRadiusSphere = (int) 50 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.BEDROCK)
									&& world.isEmptyBlock(BlockPos.containing(x + xi, y + i + 1, z + zi)) && world.isEmptyBlock(BlockPos.containing(x + xi, y + i + 2, z + zi)) && SpawnFound == false) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x + xi, (y + i + 1), z + zi), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											("spawnpoint " + entity.getDisplayName().getString()));
								{
									Entity _ent = entity;
									_ent.teleportTo(x + xi, (y + i + 1), z + zi);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x + xi, (y + i + 1), z + zi, _ent.getYRot(), _ent.getXRot());
								}
								SpawnFound = true;
								LayersofdescentMod.LOGGER.warn("spawn position was unsafe");
								LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()).toString()));
								LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()));
								LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()).toString()));
							}
						}
					}
				}
			}
			if (SpawnFound == false) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockState _bs = Blocks.STONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("spawnpoint " + entity.getDisplayName().getString()));
			}
		} else {
			SpawnFound = true;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("spawnpoint " + entity.getDisplayName().getString()));
			LayersofdescentMod.LOGGER.debug("spawn position was safe");
			LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()).toString()));
			LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()));
			LayersofdescentMod.LOGGER.debug((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()).toString()));
		}
	}
}
