package com.kandivia.confighealth.crafting;

import com.kandivia.confighealth.items.RegisterItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegister {
	private static ItemStack heartFrag = new ItemStack(RegisterItems.heart_fragment);
    private static ItemStack heartFull = new ItemStack(RegisterItems.heart_full);
	
	public static void addCraftingRecipies()
	{
		GameRegistry.addShapedRecipe(heartFull, "xxx", "xxx", "xxx", 'x', heartFrag);		
	}
}
