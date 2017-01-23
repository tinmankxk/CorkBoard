package tinmankxk.corkboard;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init()
	{
		//Items
		GameRegistry.addSmelting(Items.APPLE, new ItemStack(ModItems.appleRubber), 1f);
		GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(ModItems.coalDust), 1f);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbonString, 2), "SCS", "CTC", "SCS", 'S', Items.STRING, 'T', Items.STICK, 'C', ModItems.coalDust);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbonPlate), "DDD", 'D', ModItems.carbonString);
		GameRegistry.addSmelting(Items.FLINT, new ItemStack(ModItems.silicon), 1f);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.capacitor), "SSS", "TRT", 'S', ModItems.silicon, 'T', Blocks.REDSTONE_TORCH, 'R', Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.resistor), "SSS", "TRT", 'S', ModItems.silicon, 'T', Blocks.REDSTONE_TORCH, 'R', Items.REPEATER);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.integratedCircuit), "SDS", "CRC", "PPP", 'S', ModItems.silicon, 'D', ModItems.coalDust, 'D', Items.REDSTONE, 'P', ModItems.carbonPlate, 'C', ModItems.capacitor, 'R', ModItems.resistor);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.futureSwordBlade), " P ", "PIP", "PDP", 'P', ModItems.carbonPlate, 'I', ModItems.integratedCircuit, 'D', Items.DIAMOND_SWORD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.futureSwordGuard), "P  ", "GI ", "PGP", 'P', ModItems.carbonPlate, 'G', Items.GOLD_INGOT, 'I', ModItems.integratedCircuit);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.futureSwordHandle), "PGP", "PSP", "PGP", 'P', ModItems.carbonPlate, 'G', Items.GOLD_INGOT, 'S', ModItems.integratedCircuit);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.futureSword), "B", "G", "H", 'B', ModItems.futureSwordBlade, 'G', ModItems.futureSwordGuard, 'H', ModItems.futureSwordHandle);
		GameRegistry.addSmelting(ModBlocks.fire_ore, new ItemStack(ModItems.firey_ingot), 1F);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.firey_sword), "F", "F", "S", 'F', ModItems.firey_ingot, 'S', Items.IRON_SWORD);


		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.corkboard), "PPP", "PAP", "PPP", 'P', Blocks.PLANKS, 'A', ModItems.appleRubber);
		//GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.corkboard_glass, 8), "GGG", "GCG", "GGG", 'G', Blocks.GLASS, 'C', ModBlocks.corkboard);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.basic_tile), " T ", "TST", " T ",  'T', Blocks.STONE_SLAB, 'S', Blocks.STONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.basic_brick), "TT", "TT", 'T', ModBlocks.basic_tile);

		/**
		//Coulours!!
		//Color Tile
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_1, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 15));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_2, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_3, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 13));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_4, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 12));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_5, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 11));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_6, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 10));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_7, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 9));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_8, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 8));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_9, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 7));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_10, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_11, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_12, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_13, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_14, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_15, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tile_time_16, 8), "TTT", "TDT", "TTT",  'T', ModBlocks.basic_tile, 'D', new ItemStack(Items.DYE, 1, 0));
		//ColorBrick
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_1), "TT", "TT", 'T', ModBlocks.tile_time_1);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_2), "TT", "TT", 'T', ModBlocks.tile_time_2);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_3), "TT", "TT", 'T', ModBlocks.tile_time_3);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_4), "TT", "TT", 'T', ModBlocks.tile_time_4);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_5), "TT", "TT", 'T', ModBlocks.tile_time_5);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_6), "TT", "TT", 'T', ModBlocks.tile_time_6);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_7), "TT", "TT", 'T', ModBlocks.tile_time_7);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_8), "TT", "TT", 'T', ModBlocks.tile_time_8);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_9), "TT", "TT", 'T', ModBlocks.tile_time_9);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_10), "TT", "TT", 'T', ModBlocks.tile_time_10);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_11), "TT", "TT", 'T', ModBlocks.tile_time_11);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_12), "TT", "TT", 'T', ModBlocks.tile_time_12);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_13), "TT", "TT", 'T', ModBlocks.tile_time_13);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_14), "TT", "TT", 'T', ModBlocks.tile_time_14);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_15), "TT", "TT", 'T', ModBlocks.tile_time_15);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brick_time_16), "TT", "TT", 'T', ModBlocks.tile_time_16);
		*/
	}
}
