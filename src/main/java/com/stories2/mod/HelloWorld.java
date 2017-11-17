package com.stories2.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions =  Reference.ACCEPTED_VERSIONS)
public class HelloWorld {

	@Instance
	public static HelloWorld instance;

}
