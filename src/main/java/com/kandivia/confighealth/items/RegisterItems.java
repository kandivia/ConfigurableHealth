package com.kandivia.confighealth.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

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
}