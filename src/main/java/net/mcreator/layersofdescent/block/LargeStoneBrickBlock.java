
package net.mcreator.layersofdescent.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LargeStoneBrickBlock extends Block {
	public LargeStoneBrickBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1.8f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}