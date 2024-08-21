package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.layersofdescent.network.LayersofdescentModVariables;
import net.mcreator.layersofdescent.LayersofdescentMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LayerChangedProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getDimension(), event.getEntity());
	}

	public static void execute(LevelAccessor world, ResourceKey<Level> dimension, Entity entity) {
		execute(null, world, dimension, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, ResourceKey<Level> dimension, Entity entity) {
		if (dimension == null || entity == null)
			return;
		if (dimension == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("layersofdescent:limbo"))) {
			LayersofdescentMod.queueServerWork(10, () -> {
				{
					boolean _setval = true;
					entity.getCapability(LayersofdescentModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.LayerChanged = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
