package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.eventbus.api.Event;

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

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (().equals("Nether Weaver")) {entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lMage Class");entity.getPersistentData().putString("classdesc", "\u00A7lRanged Class with support abilities as well as offensive fire magic.");}if (().equals("Doom Singer")) {entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lBard Class");entity.getPersistentData().putString("classdesc", "\u00A7lPlays musical instruments to channel their power.");}if (().equals("Hell Cleaver")) {entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lBarbarian Class");entity.getPersistentData().putString("classdesc", "\u00A7lClose-ranged Class with offensive power and no magic abilities.");}if (().equals("Infernal Shade")) {entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lRogue Class");entity.getPersistentData().putString("classdesc", "\u00A7lClose-ranged Class with stealth abilities and debuff abilities focused on taking advantage of their enemies.");}if (().equals("Pyric Strider")) {entity.getPersistentData().putString("classtype", "\u00A7n\u00A7lArcher Class");entity.getPersistentData().putString("classdesc", "\u00A7lRanged Class with offensive and defensive abilities focused on firing at range.");}
}
}
