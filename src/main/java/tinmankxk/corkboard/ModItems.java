package tinmankxk.corkboard;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tinmankxk.corkboard.items.BaseItem;
import tinmankxk.corkboard.items.BasePickaxe;
import tinmankxk.corkboard.items.BaseSword;
import tinmankxk.corkboard.items.ItemModelProvider;

public class ModItems {

	public static BaseItem carbonPlate;
	public static BaseItem carbonString;
	public static BaseItem coalDust;
	public static BaseItem capacitor;
	public static BaseItem resistor;
	public static BaseItem integratedCircuit;
	public static BaseItem silicon;
	public static BaseSword futureSword;
	public static BaseItem futureSwordBlade;
	public static BaseItem futureSwordGuard;
	public static BaseItem futureSwordHandle;
	public static BaseItem appleRubber;
	public static BaseItem firey_ingot;
	public static BaseSword firey_sword;
	public static BasePickaxe future_pickaxe;

	public static void init() {
		appleRubber = register(new BaseItem("apple_rubber").setCreativeTab(NoTab.NoTab));
		coalDust = register(new BaseItem("coal_dust").setCreativeTab(NoTab.NoTab));
		carbonString = register(new BaseItem("carbon_fibre").setCreativeTab(NoTab.NoTab));
		carbonPlate = register(new BaseItem("carbon_fibre_plate").setCreativeTab(NoTab.NoTab));
		silicon = register(new BaseItem("silicon").setCreativeTab(NoTab.NoTab));
		capacitor = register(new BaseItem("capacitor").setCreativeTab(NoTab.NoTab));
		resistor = register(new BaseItem("resistor").setCreativeTab(NoTab.NoTab));
		integratedCircuit = register(new BaseItem("integrated_circuit").setCreativeTab(NoTab.NoTab));
		futureSword = register(new BaseSword(ModItems.futureMaterial, "future_sword").setCreativeTab(NoTab.NoTab));
		futureSwordBlade = register(new BaseItem("future_sword_blade").setCreativeTab(NoTab.NoTab));
		futureSwordGuard = register(new BaseItem("future_sword_guard").setCreativeTab(NoTab.NoTab));
		futureSwordHandle = register(new BaseItem("future_sword_handle").setCreativeTab(NoTab.NoTab));
		future_pickaxe = register(new BasePickaxe(ModItems.futureMaterial, "future_pickaxe").setCreativeTab(NoTab.NoTab));
		firey_ingot = register(new BaseItem("firey_ingot").setCreativeTab(NoTab.NoTab));
		firey_sword = register(new BaseSword(ModItems.fireMaterial, "firey_sword").setCreativeTab(NoTab.NoTab));
	}

	private static <T extends Item> T register(T item){
		GameRegistry.register(item);
		if (item instanceof ItemModelProvider){
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

	public static final Item.ToolMaterial futureMaterial = EnumHelper.addToolMaterial("FUTURE", 10, 4096, 10, 16, 19);
	public static final Item.ToolMaterial fireMaterial = EnumHelper.addToolMaterial("FIREY", 5, 1024, 10, 12, 23);
}
