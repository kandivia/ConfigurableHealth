package com.kandivia.confighealth.items;

import com.kandivia.confighealth.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HeartFull extends ItemFood {
	public HeartFull(){
		super(0, 0, false);
		this.setUnlocalizedName("heart_full");
		this.setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (playerIn.getMaxHealth() < Reference.playerTopMaxHealth)
        {
            playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        }
        return itemStackIn;
    }
	
	public ItemStack onEaten(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        if(playerIn.getMaxHealth() == (Reference.playerTopMaxHealth - 1))
        	playerIn.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(playerIn.getMaxHealth() + 1);
        else
        	playerIn.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(playerIn.getMaxHealth() + 2);
		--stack.stackSize;
        worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return stack;
    }
}