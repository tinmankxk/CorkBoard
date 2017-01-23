package tinmankxk.corkboard.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import tinmankxk.corkboard.CorkBoard;
import tinmankxk.corkboard.items.ItemModelProvider;

public class BaseBlock extends Block implements ItemModelProvider {

	protected String name;

	public BaseBlock(Material mat, String name){
		super(mat);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item itemBlock){
		CorkBoard.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BaseBlock setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

	protected PropertyInteger getMetaProperty(){
		return null;
	}
}
