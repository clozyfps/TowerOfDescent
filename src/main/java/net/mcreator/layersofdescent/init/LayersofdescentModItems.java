
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.layersofdescent.item.TopazItem;
import net.mcreator.layersofdescent.item.TestItemItem;
import net.mcreator.layersofdescent.item.SapphireItem;
import net.mcreator.layersofdescent.item.LimboItem;
import net.mcreator.layersofdescent.item.JadeItem;
import net.mcreator.layersofdescent.LayersofdescentMod;

public class LayersofdescentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LayersofdescentMod.MODID);
	public static final RegistryObject<Item> JADE_BLOCK = block(LayersofdescentModBlocks.JADE_BLOCK);
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(LayersofdescentModBlocks.TOPAZ_BLOCK);
	public static final RegistryObject<Item> JADE_CLUSTER = block(LayersofdescentModBlocks.JADE_CLUSTER);
	public static final RegistryObject<Item> MOSSY_STONE = block(LayersofdescentModBlocks.MOSSY_STONE);
	public static final RegistryObject<Item> TOPAZ_CLUSTER = block(LayersofdescentModBlocks.TOPAZ_CLUSTER);
	public static final RegistryObject<Item> SAPPHIRE_CLUSTER = block(LayersofdescentModBlocks.SAPPHIRE_CLUSTER);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(LayersofdescentModBlocks.SAPPHIRE_BLOCK);
	public static final RegistryObject<Item> LIMBO = REGISTRY.register("limbo", () -> new LimboItem());
	public static final RegistryObject<Item> TEST_ITEM = REGISTRY.register("test_item", () -> new TestItemItem());
	public static final RegistryObject<Item> JADE = REGISTRY.register("jade", () -> new JadeItem());
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> STONE_PILLAR = block(LayersofdescentModBlocks.STONE_PILLAR);
	public static final RegistryObject<Item> SMALL_STONE_BRICKS = block(LayersofdescentModBlocks.SMALL_STONE_BRICKS);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
