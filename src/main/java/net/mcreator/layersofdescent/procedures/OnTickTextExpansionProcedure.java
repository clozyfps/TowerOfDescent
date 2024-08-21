package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnTickTextExpansionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("layersofdescent:pre_dimension"))) {
			{
				double _setval = (entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer + 1;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ScreenTextTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!(entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextPauseTime) {
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 1) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "S";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "Se";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "See";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "Seem";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "Seems";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "Seems l";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "Seems li";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "Seems lik";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "Seems like";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 10) {
					{
						String _setval = "Seems like y";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 11) {
					{
						String _setval = "Seems like yo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 12) {
					{
						String _setval = "Seems like you";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 13) {
					{
						String _setval = "Seems like you d";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 14) {
					{
						String _setval = "Seems like you di";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 15) {
					{
						String _setval = "Seems like you die";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 16) {
					{
						String _setval = "Seems like you died";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 17) {
					{
						String _setval = "Seems like you died.";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 37) {
					{
						double _setval = 2;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 2) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "T";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "To";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "Too";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "Too b";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "Too ba";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "Too bad";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "Too bad t";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "Too bad to";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "Too bad too";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 10) {
					{
						String _setval = "Too bad too s";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 11) {
					{
						String _setval = "Too bad too sa";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 12) {
					{
						String _setval = "Too bad too sad";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 13) {
					{
						String _setval = "Too bad too sad.";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 33) {
					{
						double _setval = 3;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 3) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "Y";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "Yo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "You";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "You'";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "You'l";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "You'll";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "You'll n";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "You'll no";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "You'll now";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 10) {
					{
						String _setval = "You'll now b";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 11) {
					{
						String _setval = "You'll now be";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 12) {
					{
						String _setval = "You'll now be s";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 13) {
					{
						String _setval = "You'll now be se";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 14) {
					{
						String _setval = "You'll now be sen";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 15) {
					{
						String _setval = "You'll now be sent";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 16) {
					{
						String _setval = "You'll now be sent t";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 17) {
					{
						String _setval = "You'll now be sent to";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 18) {
					{
						String _setval = "You'll now be sent to h";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 19) {
					{
						String _setval = "You'll now be sent to he";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 20) {
					{
						String _setval = "You'll now be sent to hel";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 21) {
					{
						String _setval = "You'll now be sent to hell";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 22) {
					{
						String _setval = "You'll now be sent to hell.";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 42) {
					{
						double _setval = 4;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 4) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "O";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "Oh";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "Oh a";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "Oh a";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "Oh an";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "Oh and";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "Oh and I";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "Oh and I a";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "Oh and I al";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 10) {
					{
						String _setval = "Oh and I alm";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 11) {
					{
						String _setval = "Oh and I almo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 12) {
					{
						String _setval = "Oh and I almos";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 13) {
					{
						String _setval = "Oh and I almost";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 14) {
					{
						String _setval = "Oh and I almost f";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 15) {
					{
						String _setval = "Oh and I almost fo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 16) {
					{
						String _setval = "Oh and I almost for";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 17) {
					{
						String _setval = "Oh and I almost forg";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 18) {
					{
						String _setval = "Oh and I almost forgo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 19) {
					{
						String _setval = "Oh and I almost forgot";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 20) {
					{
						String _setval = "Oh and I almost forgot.";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 40) {
					{
						double _setval = 5;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 5) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "Y";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "Yo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "You";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "You'";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "You'r";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "You're";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "You're i";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "You're in";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "You're inf";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 10) {
					{
						String _setval = "You're infe";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 11) {
					{
						String _setval = "You're infec";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 12) {
					{
						String _setval = "You're infect";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 13) {
					{
						String _setval = "You're infecte";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 14) {
					{
						String _setval = "You're infected";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 15) {
					{
						String _setval = "You're infected w";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 16) {
					{
						String _setval = "You're infected wi";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 17) {
					{
						String _setval = "You're infected wit";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 18) {
					{
						String _setval = "You're infected with";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 19) {
					{
						String _setval = "You're infected with a";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 20) {
					{
						String _setval = "You're infected with a d";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 21) {
					{
						String _setval = "You're infected with a di";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 22) {
					{
						String _setval = "You're infected with a dis";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 23) {
					{
						String _setval = "You're infected with a dise";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 24) {
					{
						String _setval = "You're infected with a disea";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 25) {
					{
						String _setval = "You're infected with a diseas";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 26) {
					{
						String _setval = "You're infected with a disease";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 27) {
					{
						String _setval = "You're infected with a disease.";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 47) {
					{
						double _setval = 6;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextStage == 6) {
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 1) {
					{
						String _setval = "G";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 2) {
					{
						String _setval = "Go";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 3) {
					{
						String _setval = "Goo";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 4) {
					{
						String _setval = "Good";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 5) {
					{
						String _setval = "Good l";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 6) {
					{
						String _setval = "Good lu";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 7) {
					{
						String _setval = "Good luc";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 8) {
					{
						String _setval = "Good luck";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 9) {
					{
						String _setval = "Good luck!";
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenText = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).ScreenTextTimer == 29) {
					{
						double _setval = 0;
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
					{
						boolean _setval = false;
						entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ScreenTextPauseTime = _setval;
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
				}
			}
		}
	}
}
