package tinmankxk.corkboard.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import tinmankxk.corkboard.CorkBoard;

public class BaseSword extends ItemSword implements ItemModelProvider {
	private String name;

	public BaseSword(ToolMaterial mat, String name){
		super(mat);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item){
		CorkBoard.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public BaseSword setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
