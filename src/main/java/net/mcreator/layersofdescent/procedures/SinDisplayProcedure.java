package net.mcreator.layersofdescent.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;

public class SinDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7l" + (entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).SelectedSinScreen;
	}
}
