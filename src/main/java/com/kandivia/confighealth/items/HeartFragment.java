package com.kandivia.confighealth.items;

import com.kandivia.confighealth.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HeartFragment extends Item {
	public HeartFragment(){
		super();
		this.setUnlocalizedName("heart_fragment");
		this.setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}