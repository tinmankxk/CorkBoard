package tinmankxk.corkboard.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tinmankxk.corkboard.CorkBoard;
import tinmankxk.corkboard.items.ItemModelProvider;

public class BaseBlockClear extends BaseBlock implements ItemModelProvider{

	public BaseBlockClear(Material mat, String name){
		super(mat, name);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item itemBlock){
		CorkBoard.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BaseBlockClear setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	//public boolean isFullCube(IBlockState state) {
	//	return false;
	//}

	//@Override
	//public boolean isOpaqueCube(IBlockState state) {
	//	return false;
	//}
}
