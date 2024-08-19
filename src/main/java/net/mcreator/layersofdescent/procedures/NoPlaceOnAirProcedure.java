package net.mcreator.layersofdescent.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NoPlaceOnAirProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			return false;
		}
		return true;
	}
}
