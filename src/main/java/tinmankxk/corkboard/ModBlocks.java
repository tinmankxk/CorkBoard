package tinmankxk.corkboard;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tinmankxk.corkboard.block.BaseBlock;
import tinmankxk.corkboard.block.BaseBlockOre;
import tinmankxk.corkboard.items.ItemModelProvider;


public class ModBlocks
{
	public static BaseBlock corkboard;
	public static BaseBlock basic_tile;
	public static BaseBlock basic_brick;
	public static BaseBlockOre fire_ore;
	//public static BaseBlockClear corkboard_glass;

	//tiles
	//public static BaseBlockColored tile_time;


	public static void init()
	{
		corkboard = register(new BaseBlock(Material.WOOD, "corkboard", 4f, 5f, "axe", 2, 1f).setCreativeTab(NoTab.NoTab));
		basic_tile = register(new BaseBlock(Material.ROCK, "basic_tile", 5F, 10f, "pickaxe", 2, 16f).setCreativeTab(NoTab.NoTab));
		basic_brick = register(new BaseBlock(Material.ROCK, "basic_brick", 5f, 10f, "pickaxe", 2, 16f).setCreativeTab(NoTab.NoTab));
		//corkboard_glass = register(new BaseBlockClear(Material.WOOD, "corkboard_glass").setCreativeTab(NoTab.NoTab));
		fire_ore = register(new BaseBlockOre("fire_ore", 5f, 10f, "pickaxe").setCreativeTab(NoTab.NoTab));


		//Colours?
		//tile_time = register(new BaseBlockColored(Material.ROCK, "tile_time").setCreativeTab(NoTab.NoTab));

	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
