package tinmankxk.corkboard;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModOreGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkx, int chunkz, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
		if (world.provider.getDimension() == 0){
			generateNether(random, chunkx, chunkz, world, chunkGenerator, chunkProvider);
		}
	}
	private void generateNether(Random random, int chunkx, int chunkz, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
		generateOre(ModBlocks.fire_ore.getDefaultState(), world, random, chunkx * 16, chunkz * 16, 5, 16, 2 + random.nextInt(4), 6);
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;

		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
