
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.layersofdescent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.layersofdescent.LayersofdescentMod;

public class LayersofdescentModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LayersofdescentMod.MODID);
	public static final RegistryObject<SoundEvent> VOICE = REGISTRY.register("voice", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("layersofdescent", "voice")));
}
