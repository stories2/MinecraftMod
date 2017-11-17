package init;

import items.ItemObsidianingot;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item obsidianingot;
	public static GameRegistry gameRegistry;

	public static void init() {
		obsidianingot = new ItemObsidianingot();
	}
	
	public static void register() {
		GameRegistry.register(obsidianingot);
	}
	
	public static void registerRenders() {
		 registerRender(obsidianingot);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem(); 
	}
}
