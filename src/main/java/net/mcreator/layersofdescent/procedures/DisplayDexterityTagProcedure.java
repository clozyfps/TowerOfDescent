package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DisplayDexterityTagProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("dexteritydisplay");
	}
}
