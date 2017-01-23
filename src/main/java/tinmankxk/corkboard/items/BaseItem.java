package tinmankxk.corkboard.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tinmankxk.corkboard.CorkBoard;

public class BaseItem extends Item implements ItemModelProvider {
	protected String name;

	public BaseItem(String name){
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item){
		CorkBoard.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public BaseItem setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
