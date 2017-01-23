package tinmankxk.corkboard.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BaseItemOre extends BaseItem implements ItemOreDict {
	private String oreName;

	public BaseItemOre(String name, String oreName){
		super(name);
		this.oreName = oreName;
	}

	@Override
	public void initOreDict(){
		OreDictionary.registerOre(oreName, this);
	}

	@Override
	public BaseItemOre setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
