package com.kandivia.confighealth.proxy;

import com.kandivia.confighealth.items.RegisterItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		RegisterItems.registerRenders();
	}
}
