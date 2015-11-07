package com.kandivia.confighealth.items;

import com.kandivia.confighealth.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems {
	public static Item heart_full, heart_fragment;
	
	public static void init(){
		initItem();
		registerItem();
	}
	
	public static void initItem(){
		heart_full = new HeartFull();
		heart_fragment = new HeartFragment();
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(heart_full, heart_full.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(heart_fragment, heart_fragment.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(heart_full);
		registerRender(heart_fragment);
	}
	
	public static void registerRender(Item item){
		ModelResourceLocation loc = new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, loc);			
	}

}
