package net.mcreator.layersofdescent.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayAgilityTagProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("agilitydisplay");
	}
}
