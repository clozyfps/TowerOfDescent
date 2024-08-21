package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.layersofdescent.world.inventory.ClassSelectionMenu;
import net.mcreator.layersofdescent.network.LayersofdescentModVariables;
import net.mcreator.layersofdescent.LayersofdescentMod;

import io.netty.buffer.Unpooled;

public class DeathMenuTextProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer > 0) {
			{
				double _setval = (entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer - 1;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ScreenTextTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 0) {
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == (LayersofdescentModVariables.MapVariables.get(world).ScreenFullText)
					.length()) {
				{
					double _setval = 20;
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ScreenTextTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ScreenTextStage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "Seems like you died.";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("Seems like you died.")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "Too bad, so sad.";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("Too bad, so sad.")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "You'll now be sent to hell.";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("You'll now be sent to hell.")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "Oh, and I almost forgot.";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("Oh, and I almost forgot.")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "You're infected with a disease.";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("You're infected with a disease.")) {
					LayersofdescentModVariables.MapVariables.get(world).ScreenFullText = "Good luck!";
					LayersofdescentModVariables.MapVariables.get(world).syncData(world);
				} else if ((LayersofdescentModVariables.MapVariables.get(world).ScreenFullText).equals("Good luck!")) {
					LayersofdescentMod.queueServerWork(20, () -> {
						{
							String _setval = "Limbo";
							entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LayerOn = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("layersofdescent:limbo"));
							if (_player.level().dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
						if (entity instanceof Player _player)
							_player.closeContainer();
						LayersofdescentMod.queueServerWork(10, () -> {
							if (entity instanceof ServerPlayer _ent) {
								BlockPos _bpos = BlockPos.containing(x, y, z);
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("ClassSelection");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new ClassSelectionMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						});
					});
				}
			} else {
				{
					double _setval = 1;
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ScreenTextTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage + 1;
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ScreenTextStage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = LayersofdescentModVariables.MapVariables.get(world).ScreenFullText.substring(0,
							(int) (entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage);
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ScreenText = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
