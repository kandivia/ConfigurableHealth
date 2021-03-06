package com.kandivia.confighealth.main;

import com.kandivia.confighealth.config.ConfigHandler;
import com.kandivia.confighealth.crafting.CraftingRegister;
import com.kandivia.confighealth.event.OnEntityJoinWorld;
import com.kandivia.confighealth.event.OnMobDrop;
import com.kandivia.confighealth.items.RegisterItems;
import com.kandivia.confighealth.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MainRegistry{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent){
		ConfigHandler.init(preEvent.getSuggestedConfigurationFile());
		RegisterItems.init();
		CraftingRegister.addCraftingRecipies();
		MinecraftForge.EVENT_BUS.register(new OnEntityJoinWorld());
		if(Reference.enableHeartDrops)
			MinecraftForge.EVENT_BUS.register(new OnMobDrop());
	}	
}
