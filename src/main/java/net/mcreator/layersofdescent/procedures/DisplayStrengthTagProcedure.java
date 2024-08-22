package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DisplayStrengthTagProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("strengthdisplay");
	}
}
