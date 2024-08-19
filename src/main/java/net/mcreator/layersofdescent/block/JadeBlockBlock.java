
package net.mcreator.layersofdescent.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class JadeBlockBlock extends Block {
	public JadeBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(2f, 3f).lightLevel(s -> 8).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}