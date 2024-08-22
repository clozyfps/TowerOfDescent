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
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Wrath")) {
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A7c";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7c\u00A7l" + "Strength: " + "\u00A7n3"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7c\u00A7l" + "Agility: " + "\u00A7n3"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7l" + "Defense: " + "\u00A7n0"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A7l" + "Dexterity: " + "\u00A7n0"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A7l" + "Magic: " + "\u00A7n0"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Pride")) {
			{
				double _setval = 2;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A7b";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7b\u00A7l" + "Strength: " + "\u00A7n2"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7l" + "Agility: " + "\u00A7n0"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7b\u00A7l" + "Defense: " + "\u00A7n3"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A7l" + "Dexterity: " + "\u00A7n0"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A7l" + "Magic: " + "\u00A7n0"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Envy")) {
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A7d";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7d\u00A7l" + "Strength: " + "\u00A7n1"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7l" + "Agility: " + "\u00A7n0"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7l" + "Defense: " + "\u00A7n0"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A7l" + "Dexterity: " + "\u00A7n0"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A7d\u00A7l" + "Magic: " + "\u00A7n3"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Lust")) {
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A75";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7l" + "Strength: " + "\u00A7n0"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7l" + "Agility: " + "\u00A7n0"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7l" + "Defense: " + "\u00A7n0"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A75\u00A7l" + "Dexterity: " + "\u00A7n3"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A75\u00A7l" + "Magic: " + "\u00A7n2"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Greed")) {
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A76";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7l" + "Strength: " + "\u00A7n0"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A76\u00A7l" + "Agility: " + "\u00A7n3"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7l" + "Defense: " + "\u00A7n0"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A76\u00A7l" + "Dexterity: " + "\u00A7n3"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A7l" + "Magic: " + "\u00A7n0"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Sloth")) {
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 4;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A79";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7l" + "Strength: " + "\u00A7n0"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7l" + "Agility: " + "\u00A7n0"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A79\u00A7l" + "Defense: " + "\u00A7n4"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A7l" + "Dexterity: " + "\u00A7n0"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A79\u00A7l" + "Magic: " + "\u00A7n2"));
		}
		if (((entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LayersofdescentModVariables.PlayerVariables())).Sin).equals("Gluttony")) {
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dexterity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Defense = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\u00A7a";
				entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedColorCode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putString("strengthdisplay", ("\u00A7l" + "Strength: " + "\u00A7n0"));
			entity.getPersistentData().putString("agilitydisplay", ("\u00A7l" + "Agility: " + "\u00A7n0"));
			entity.getPersistentData().putString("defensedisplay", ("\u00A7a\u00A7l" + "Defense: " + "\u00A7n3"));
			entity.getPersistentData().putString("dexteritydisplay", ("\u00A7a\u00A7l" + "Dexterity: " + "\u00A7n2"));
			entity.getPersistentData().putString("magicdisplay", ("\u00A7l" + "Magic: " + "\u00A7n0"));
		}
	}
}
