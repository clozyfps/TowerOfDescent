
package net.mcreator.layersofdescent.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MossyStoneTilesBlock extends Block {
	public MossyStoneTilesBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}