package tinmankxk.corkboard.block;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tinmankxk.corkboard.CorkBoard;
import tinmankxk.corkboard.items.ItemModelProvider;

import java.util.List;

public class BaseBlockColored extends BlockColored implements ItemModelProvider {

	protected String name;
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	private static final PropertyInteger META = PropertyInteger.create("meta", 0, EnumDyeColor.values().length);


	public BaseBlockColored(Material mat, String name){
		super(mat);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
	}

	public int damageDropped(IBlockState ibs){
		return ((EnumDyeColor)ibs.getValue(COLOR)).getMetadata();
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itt, CreativeTabs tabs, List<ItemStack> list){
		for (EnumDyeColor enumDyeColor : EnumDyeColor.values()){
			list.add(new ItemStack(itt, 1, enumDyeColor.getMetadata()));
		}
	}

	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(meta));
	}

	public int getMetaFromState(IBlockState state)
	{
		return ((EnumDyeColor)state.getValue(COLOR)).getMetadata();
	}

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {COLOR});
	}


	@Override
	public void registerItemModel(Item itemBlock){
		CorkBoard.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BaseBlockColored setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

	//@Override
	//protected PropertyInteger getMetaProperty(){
	//	return META;
	//}
}
