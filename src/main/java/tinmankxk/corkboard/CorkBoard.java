package tinmankxk.corkboard;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tinmankxk.corkboard.proxy.CommonProxy;

@Mod(
		modid = CorkBoard.MODID,
		name = CorkBoard.MODNAME,
		version = CorkBoard.VERSION,
		dependencies = "",
		useMetadata = true)
public class CorkBoard {
	public static final String MODID = "corkboard";
	public static final String MODNAME = "corkboard";
	public static final String VERSION = "0.0.1beta";

	@SidedProxy(clientSide = CorkBoard.clientprox, serverSide = CorkBoard.serverprox)
	public static CommonProxy proxy;

	@Mod.Instance
	public static CorkBoard instance;


	public static final String clientprox = "tinmankxk.corkboard.proxy.ClientProxy";
	public static final String serverprox = "tinmankxk.corkboard.proxy.ServerProxy";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
		ModBlocks.init();
		ModItems.init();
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new ModOreGen(), 3);
	}


	@Mod.EventHandler
	public void init(FMLInitializationEvent event2) {
		proxy.init(event2);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event3) {
		proxy.postInit(event3);
	}

}
