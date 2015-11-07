package com.kandivia.confighealth.event;

import java.util.Random;

import com.kandivia.confighealth.items.RegisterItems;
import com.kandivia.confighealth.main.Reference;

import net.minecraft.entity.monster.EntityMob;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OnMobDrop {
	Random rand = new Random();
	
	@SubscribeEvent
	public void onMobDropEvent(LivingDropsEvent event){
		if(event.entity instanceof EntityMob){
			if(event.source.getDamageType().equals("player")){
				if((rand.nextDouble() * 100) < (Reference.chanceHeartFragDrop)) {
					event.entityLiving.dropItem(RegisterItems.heart_fragment, 1);
				}
			}
		}
	}
}