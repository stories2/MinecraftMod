package com.stories2.mod;

public class Reference {

	public static final String
//		com.stories2.mod
		MOD_ID = "sm",
		NAME = "Tutorial of create minecraft mod",
		VERSION = "0.0.1",
		ACCEPTED_VERSIONS =  "[1.11.2]",
//		com.stories2.mod.proxy
		CLIENT_PROXY_CLASS = "com.stories2.mod.proxy.ClientProxy",
		COMMON_PROXY_CLASS = "com.stories2.mod.proxy.CommonProxy",
		SERVER_PROXY_CLASS = "com.stories2.mod.proxy.ServerProxy";
	
	public static enum 
//		items
		TestingItems {
			OBSIDIANINGOT("obsidianingot", "ItemObsidianingot");
		
			private String 
				unlocalizedName,
				registryName;
		
			TestingItems(String unlocalizedName, String registryName) {
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			
			public String getUnlocalizedName() {
				return this.unlocalizedName;
			}
			
			public String getRegistryName() {
				return this.registryName;
			}
	}
}
