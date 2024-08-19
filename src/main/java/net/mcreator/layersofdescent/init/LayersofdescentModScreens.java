
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.layersofdescent.client.gui.PreHellDialogueScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LayersofdescentModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LayersofdescentModMenus.PRE_HELL_DIALOGUE.get(), PreHellDialogueScreen::new);
		});
	}
}
