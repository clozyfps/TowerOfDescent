package net.mcreator.layersofdescent.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayClassInfo1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7l\u2756 " + entity.getPersistentData().getString("classtype");
	}
}
