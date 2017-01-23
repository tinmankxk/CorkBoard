package tinmankxk.corkboard;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class NoTab
{
	public static final CreativeTabs NoTab = new CreativeTabs("nobalace") {
		@Override
		public Item getTabIconItem() { return ModItems.futureSword; }
		public String getTranslatedTabLabel()
		{
			return "CorkBoard";
		}
	};
}
