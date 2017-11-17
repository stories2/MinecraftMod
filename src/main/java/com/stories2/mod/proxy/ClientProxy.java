package com.stories2.mod.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("[ClientProxy/Info] [init]: client proxy init called");
		
		ModItems.registerRenders();
	}

}
