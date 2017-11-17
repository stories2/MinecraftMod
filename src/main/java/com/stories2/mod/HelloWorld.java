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
		System.out.println("[HelloWorld/Info] [preInit]: hello pre init event");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		System.out.println("[HelloWorld/Info] [Init]: hello init event");
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent initEvent) {
		System.out.println("[HelloWorld/Info] [PostInit]: hello post init event");
	}
}
