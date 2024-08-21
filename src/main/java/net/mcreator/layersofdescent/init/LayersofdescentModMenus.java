
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.layersofdescent.world.inventory.SinSelectionMenu;
import net.mcreator.layersofdescent.world.inventory.PreHellDialogueMenu;
import net.mcreator.layersofdescent.world.inventory.ClassSelectionMenu;
import net.mcreator.layersofdescent.LayersofdescentMod;

public class LayersofdescentModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LayersofdescentMod.MODID);
	public static final RegistryObject<MenuType<PreHellDialogueMenu>> PRE_HELL_DIALOGUE = REGISTRY.register("pre_hell_dialogue", () -> IForgeMenuType.create(PreHellDialogueMenu::new));
	public static final RegistryObject<MenuType<ClassSelectionMenu>> CLASS_SELECTION = REGISTRY.register("class_selection", () -> IForgeMenuType.create(ClassSelectionMenu::new));
	public static final RegistryObject<MenuType<SinSelectionMenu>> SIN_SELECTION = REGISTRY.register("sin_selection", () -> IForgeMenuType.create(SinSelectionMenu::new));
}
