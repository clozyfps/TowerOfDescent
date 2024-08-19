
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.layersofdescent.LayersofdescentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LayersofdescentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LayersofdescentMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LayersofdescentModBlocks.JADE_BLOCK.get().asItem());
			tabData.accept(LayersofdescentModBlocks.JADE_CLUSTER.get().asItem());
			tabData.accept(LayersofdescentModBlocks.TOPAZ_BLOCK.get().asItem());
			tabData.accept(LayersofdescentModBlocks.TOPAZ_CLUSTER.get().asItem());
			tabData.accept(LayersofdescentModBlocks.SAPPHIRE_BLOCK.get().asItem());
			tabData.accept(LayersofdescentModBlocks.SAPPHIRE_CLUSTER.get().asItem());
			tabData.accept(LayersofdescentModBlocks.MOSSY_STONE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LayersofdescentModItems.LIMBO.get());
		}
	}
}
