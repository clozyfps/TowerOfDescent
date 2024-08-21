package net.mcreator.layersofdescent.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;

public class ForwardClassProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Nether Weaver")) {
			{
				String _setval = "Doom Singer";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedClassScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Doom Singer")) {
			{
				String _setval = "Hell Cleaver";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedClassScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Hell Cleaver")) {
			{
				String _setval = "Infernal Shade";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedClassScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Infernal Shade")) {
			{
				String _setval = "Pyric Strider";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedClassScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedClassScreen).equals("Pyric Strider")) {
			{
				String _setval = "Nether Weaver";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedClassScreen = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
