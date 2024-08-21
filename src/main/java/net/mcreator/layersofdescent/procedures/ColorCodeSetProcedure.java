package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ColorCodeSetProcedure {
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
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Nether Weaver")) {
			{
				String _setval = "\u00A7c";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lMage Class");
			entity.getPersistentData().putString("classdesc", "\u00A7lRanged Class with support abilities as well as offensive fire magic.");
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Doom Singer")) {
			{
				String _setval = "\u00A74";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lBard Class");
			entity.getPersistentData().putString("classdesc", "\u00A7lPlays musical instruments to channel their power.");
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Hell Cleaver")) {
			{
				String _setval = "\u00A76";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lBarbarian Class");
			entity.getPersistentData().putString("classdesc", "\u00A7lClose-ranged Class with offensive power and no magic abilities.");
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Infernal Shade")) {
			{
				String _setval = "\u00A7c";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lRogue Class");
			entity.getPersistentData().putString("classdesc", "\u00A7lClose-ranged Class with stealth abilities and debuff abilities focused on taking advantage of their enemies.");
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Pyric Strider")) {
			{
				String _setval = "\u00A7c";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lArcher Class");
			entity.getPersistentData().putString("classdesc", "\u00A7lRanged Class with offensive and defensive abilities focused on firing at range.");
		}
	}
}
