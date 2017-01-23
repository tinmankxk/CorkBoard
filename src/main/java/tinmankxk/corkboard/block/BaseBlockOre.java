package tinmankxk.corkboard.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlockOre extends BaseBlock {

	public BaseBlockOre(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(10f);
	}

	@Override
	public BaseBlockOre setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
