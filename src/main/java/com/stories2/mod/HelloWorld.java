package com.stories2.mod;

import com.stories2.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions =  Reference.ACCEPTED_VERSIONS)
public class HelloWorld {

	@Instance
	public static HelloWorld instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy; 

	@EventHandler
	public void preInit(FMLPreInitializationEvent initEvent) {
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent initEvent) {
		
	}
}
