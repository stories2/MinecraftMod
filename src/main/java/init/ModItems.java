package init;

import com.stories2.mod.Reference;

import items.ItemObsidianingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory")); 
	}
}
