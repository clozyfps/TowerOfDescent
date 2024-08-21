package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DisplayClassInfo1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7l\u2756 " + entity.getPersistentData().getString("classtype");
	}
}
