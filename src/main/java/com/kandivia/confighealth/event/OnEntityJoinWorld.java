package com.kandivia.confighealth.event;

import com.kandivia.confighealth.main.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnEntityJoinWorld {
	@SubscribeEvent
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.entity instanceof EntityLivingBase){
			EntityLivingBase entity = (EntityLivingBase) event.entity;
			NBTTagCompound entityData = entity.getEntityData();
			
			if (!entityData.hasKey("hasHealthSet")) {				
				 if (!event.world.isRemote) {
					 if (event.entity instanceof EntityZombie){
						 setEntityHealth(entity, Reference.zombieMaxHealth, Reference.zombieStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySkeleton){
						 if(((EntitySkeleton) entity).getSkeletonType() ==1){
							 setEntityHealth(entity, Reference.witherSkeletonMaxHealth, Reference.witherSkeletonStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 							 
						 }
						 else{
							 setEntityHealth(entity, Reference.skeletonMaxHealth, Reference.skeletonStartHealth);
							 entityData.setBoolean("hasHealthSet", true);
						 }
					 }
					 
					 else if(entity instanceof EntityCreeper){
						 setEntityHealth(entity, Reference.creeperMaxHealth, Reference.creeperStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySpider){
						 setEntityHealth(entity, Reference.spiderMaxHealth, Reference.spiderStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySlime){
						 if(((EntitySlime) entity).getSlimeSize() == 1){
							 setEntityHealth(entity, Reference.tinySlimeMaxHealth, Reference.tinySlimeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 } else if(((EntitySlime) entity).getSlimeSize() == 2){
							 setEntityHealth(entity, Reference.smallSlimeMaxHealth, Reference.smallSlimeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 } else if(((EntitySlime) entity).getSlimeSize() == 4){
							 setEntityHealth(entity, Reference.bigSlimeMaxHealth, Reference.bigSlimeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 }
					 }
					 
					 else if(entity instanceof EntityWitch){
						 setEntityHealth(entity, Reference.witchMaxHealth, Reference.witchStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityCaveSpider){
						 setEntityHealth(entity, Reference.caveSpiderMaxHealth, Reference.caveSpiderStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityEnderman){
						 setEntityHealth(entity, Reference.endermanMaxHealth, Reference.endermanStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityPigZombie){
						 setEntityHealth(entity, Reference.zombiePigmanMaxHealth, Reference.zombiePigmanStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityBlaze){
						 setEntityHealth(entity, Reference.blazeMaxHealth, Reference.blazeStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityGuardian){
						 if(((EntityGuardian) entity).isElder()){
							 setEntityHealth(entity, Reference.elderGuardianMaxHealth, Reference.elderGuardianStartHealth);
							 entityData.setBoolean("hasHealthSet", true);
						 } else{
							 setEntityHealth(entity, Reference.guardianMaxHealth, Reference.guardianStartHealth);
							 entityData.setBoolean("hasHealthSet", true);
						 }
					 }
					 
					 else if(entity instanceof EntityMagmaCube){
						 if(((EntityMagmaCube) entity).getSlimeSize() == 1){
							 setEntityHealth(entity, Reference.tinyMagmaCubeMaxHealth, Reference.tinyMagmaCubeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 } else if(((EntityMagmaCube) entity).getSlimeSize() == 2){
							 setEntityHealth(entity, Reference.smallMagmaCubeMaxHealth, Reference.smallMagmaCubeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 } else if(((EntityMagmaCube) entity).getSlimeSize() == 4){
							 setEntityHealth(entity, Reference.bigMagmaCubeMaxHealth, Reference.bigMagmaCubeStartHealth);
							 entityData.setBoolean("hasHealthSet", true);							 
						 }
					 }
					 
					 else if(entity instanceof EntityChicken){
						 setEntityHealth(entity, Reference.chickenMaxHealth, Reference.chickenStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityCow){
						 setEntityHealth(entity, Reference.cowMaxHealth, Reference.cowStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityPig){
						 setEntityHealth(entity, Reference.pigMaxHealth, Reference.pigStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityRabbit){
						 if(((EntityRabbit) entity).getRabbitType() == 99){
							 setEntityHealth(entity, Reference.killerBunnyMaxHealth, Reference.killerBunnyStartHealth);
							 entityData.setBoolean("hasHealthSet", true);
						 } else{
							 setEntityHealth(entity, Reference.rabbitMaxHealth, Reference.rabbitStartHealth);
							 entityData.setBoolean("hasHealthSet", true);
						 }
					 }
					 
					 else if(entity instanceof EntitySheep){
						 setEntityHealth(entity, Reference.sheepMaxHealth, Reference.sheepStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySquid){
						 setEntityHealth(entity, Reference.squidMaxHealth, Reference.squidStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityVillager){
						 setEntityHealth(entity, Reference.villagerMaxHealth, Reference.villagerStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityBat){
						 setEntityHealth(entity, Reference.batMaxHealth, Reference.batStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySilverfish){
						 setEntityHealth(entity, Reference.silverfishMaxHealth, Reference.silverfishStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityEndermite){
						 setEntityHealth(entity, Reference.endermiteMaxHealth, Reference.endermiteStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityPlayer){
						 setEntityHealth(entity, Reference.playerMaxHealth, Reference.playerStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityGhast){
						 setEntityHealth(entity, Reference.ghastMaxHealth, Reference.ghastStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityOcelot){
						 setEntityHealth(entity, Reference.ocelotMaxHealth, Reference.ocelotStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityWolf){
						 setEntityHealth(entity, Reference.wildWolfMaxHealth, Reference.wildWolfStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityMooshroom){
						 setEntityHealth(entity, Reference.mooshroomMaxHealth, Reference.mooshroomStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityIronGolem){
						 setEntityHealth(entity, Reference.ironGolemMaxHealth, Reference.ironGolemStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntitySnowman){
						 setEntityHealth(entity, Reference.snowGolemMaxHealth, Reference.snowGolemStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityWither){
						 setEntityHealth(entity, Reference.witherMaxHealth, Reference.witherStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
					 
					 else if(entity instanceof EntityDragon){
						 setEntityHealth(entity, Reference.enderDragonMaxHealth, Reference.enderDragonStartHealth);
						 entityData.setBoolean("hasHealthSet", true);
					 }
				 }				
				 if (event.world.isRemote) {
					 event.world.updateEntity(entity);
				 }
			}		
		}
	}
	
	public void setEntityHealth(EntityLivingBase entity, int maxHealth, int startHealth){
		entity.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(maxHealth);
		entity.setHealth(startHealth);
	}
}