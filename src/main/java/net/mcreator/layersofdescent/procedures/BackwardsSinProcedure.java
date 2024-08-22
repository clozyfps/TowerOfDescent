package net.mcreator.layersofdescent.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;

public class BackwardsSinProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Wrath")) {
			{
				String _setval = "Gluttony";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Pride")) {
			{
				String _setval = "Wrath";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Envy")) {
			{
				String _setval = "Pride";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Lust")) {
			{
				String _setval = "Envy";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Greed")) {
			{
				String _setval = "Lust";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Sloth")) {
			{
				String _setval = "Greed";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen).equals("Gluttony")) {
			{
				String _setval = "Sloth";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSinScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
