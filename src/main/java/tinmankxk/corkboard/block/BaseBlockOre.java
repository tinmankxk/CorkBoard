package tinmankxk.corkboard.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlockOre extends BaseBlock {

	public BaseBlockOre(String name, Float hrd, Float blst, String tool){
		super(Material.ROCK, name, hrd, blst, tool, 3, 14f);
	}

	@Override
	public BaseBlockOre setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
