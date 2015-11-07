package com.kandivia.confighealth.crafting;

import com.kandivia.confighealth.items.RegisterItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class CraftingRegister {
	private static ItemStack heartFrag = new ItemStack(RegisterItems.heart_fragment);
    private static ItemStack heartFull = new ItemStack(RegisterItems.heart_full);
	
	public static void addCraftingRecipies()
	{
		GameRegistry.addShapedRecipe(heartFull, "xxx", "xxx", "xxx", 'x', heartFrag);		
	}
}