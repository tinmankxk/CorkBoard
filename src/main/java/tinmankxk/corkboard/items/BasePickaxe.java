package tinmankxk.corkboard.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import tinmankxk.corkboard.CorkBoard;

public class BasePickaxe extends ItemPickaxe implements ItemModelProvider {
	private String name;

	public BasePickaxe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		CorkBoard.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public BasePickaxe setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
}
