
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.layersofdescent.LayersofdescentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LayersofdescentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LayersofdescentMod.MODID);
	public static final RegistryObject<CreativeModeTab> LOD_ITEMS = REGISTRY.register("lod_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.layersofdescent.lod_items")).icon(() -> new ItemStack(LayersofdescentModItems.SAPPHIRE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LayersofdescentModItems.JADE.get());
				tabData.accept(LayersofdescentModItems.SAPPHIRE.get());
				tabData.accept(LayersofdescentModItems.TOPAZ.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> LOD_BLOCKS = REGISTRY.register("lod_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.layersofdescent.lod_blocks")).icon(() -> new ItemStack(LayersofdescentModBlocks.MOSSY_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LayersofdescentModBlocks.JADE_BLOCK.get().asItem());
				tabData.accept(LayersofdescentModBlocks.TOPAZ_BLOCK.get().asItem());
				tabData.accept(LayersofdescentModBlocks.JADE_CLUSTER.get().asItem());
				tabData.accept(LayersofdescentModBlocks.MOSSY_STONE.get().asItem());
				tabData.accept(LayersofdescentModBlocks.TOPAZ_CLUSTER.get().asItem());
				tabData.accept(LayersofdescentModBlocks.SAPPHIRE_CLUSTER.get().asItem());
				tabData.accept(LayersofdescentModBlocks.SAPPHIRE_BLOCK.get().asItem());
				tabData.accept(LayersofdescentModBlocks.SMALL_STONE_BRICKS.get().asItem());
				tabData.accept(LayersofdescentModBlocks.STONE_PILLAR.get().asItem());
				tabData.accept(LayersofdescentModBlocks.CRACKED_SMALL_STONE_BRICKS.get().asItem());
				tabData.accept(LayersofdescentModBlocks.CRACKED_STONE_PILLAR.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LayersofdescentModItems.LIMBO.get());
		}
	}
}
