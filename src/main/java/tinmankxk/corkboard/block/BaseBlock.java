package tinmankxk.corkboard.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tinmankxk.corkboard.CorkBoard;
import tinmankxk.corkboard.ModBlocks;
import tinmankxk.corkboard.items.ItemModelProvider;

public class BaseBlock extends Block implements ItemModelProvider {

	protected String name;

	public BaseBlock(Material mat, String name, Float hrd, Float blst, String tool, int hvstlvl, float glow){
		super(mat);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hrd);
		setResistance(blst);
		setHarvestLevel(tool, hvstlvl);
		setLightLevel(glow);
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

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	{
		net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
		switch (plantType)
		{
			case Desert: return this == ModBlocks.corkboard;
			case Nether: return this == ModBlocks.corkboard;
			case Beach:
				boolean isBeach = this == ModBlocks.corkboard;
				boolean hasWater = this == ModBlocks.corkboard == true;
				return isBeach && hasWater;
		}
		return false;
	}

	@Override
	public boolean isFertile(World world, BlockPos pos)
	{
		if (this == ModBlocks.corkboard)
		{
			return true;
		}
		return false;
	}
}
