package tinmankxk.corkboard.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tinmankxk.corkboard.CorkBoard;

public class BeginnerBlock extends Block{
	public BeginnerBlock(){
		super(Material.ROCK);
		setUnlocalizedName(CorkBoard.MODID + ".basic_time");
		setRegistryName("basic_time");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
}
