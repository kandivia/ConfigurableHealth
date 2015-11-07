package com.kandivia.confighealth.config;

import java.io.File;

import com.kandivia.confighealth.main.Reference;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
		
	public static void init(File configFile){
		Configuration config = new Configuration(configFile);			
		try{
			config.load();
			
			//Player Config
			Reference.playerMaxHealth = config.get(Reference.CATEGORY_PLAYER, "playerMaxHealth", 20).getInt(20);
			Reference.playerStartHealth = config.get(Reference.CATEGORY_PLAYER, "playerStartHealth", 20).getInt(20);
			Reference.playerTopMaxHealth = config.get(Reference.CATEGORY_PLAYER, "playerTopMaxHealth", 40).getInt(40);
			Reference.enableHeartDrops = config.get(Reference.CATEGORY_PLAYER, "enableHeartDrops", true).getBoolean(true);
			Reference.chanceHeartFragDrop = config.get(Reference.CATEGORY_PLAYER, "chanceHeartFragDrop", 10.0).getDouble(10.0);
			
			//Passive Mob Config
			Reference.batMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"batMaxHealth", 6).getInt(6);
			Reference.batStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"batStartHealth", 6).getInt(6);
			Reference.chickenMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"chickenMaxHealth", 4).getInt(4);
			Reference.chickenStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"chickenStartHealth", 4).getInt(4);
			Reference.cowMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"cowMaxHealth", 10).getInt(10);
			Reference.cowStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"cowStartHealth", 10).getInt(10);
			Reference.mooshroomMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"mooshroomMaxHealth", 10).getInt(10);
			Reference.mooshroomStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"mooshroomStartHealth", 10).getInt(10);
			Reference.pigMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"pigMaxHealth", 10).getInt(10);
			Reference.pigStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"pigStartHealth", 10).getInt(10);
			Reference.rabbitMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"rabbitMaxHealth", 10).getInt(10);
			Reference.rabbitStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"rabbitStartHealth", 10).getInt(10);
			Reference.sheepMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"sheepMaxHealth", 8).getInt(8);
			Reference.sheepStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"sheepStartHealth", 8).getInt(8);
			Reference.squidMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"squidMaxHealth", 10).getInt(10);
			Reference.squidStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"squidStartHealth", 10).getInt(10);
			Reference.villagerMaxHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"villagerMaxHealth", 20).getInt(20);
			Reference.villagerStartHealth = config.get(Reference.CATEGORY_PASSIVEMOB,"villagerStartHealth", 20).getInt(20);
			
			//Neutral Mob Config
			Reference.caveSpiderMaxHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "caveSpiderMaxHealth", 12).getInt(12);
			Reference.caveSpiderStartHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "caveSpiderStartHealth", 12).getInt(12);
			Reference.endermanMaxHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "endermanMaxHealth", 40).getInt(40);
			Reference.endermanStartHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "endermanStartHealth", 40).getInt(40);
			Reference.spiderMaxHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "spiderMaxHealth", 16).getInt(16);
			Reference.spiderStartHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "spiderStartHealth", 16).getInt(16);
			Reference.zombiePigmanMaxHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "zombiePigmanMaxHealth", 20).getInt(20);
			Reference.zombiePigmanStartHealth = config.get(Reference.CATEGORY_NEUTRALMOB, "zombiePigmanStartHealth", 20).getInt(20);
			
			//Hostile Mob Config
			Reference.blazeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "blazeMaxHealth", 20).getInt(20);
			Reference.blazeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "blazeStartHealth", 20).getInt(20);
			Reference.creeperMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "creeperMaxHealth", 20).getInt(20);
			Reference.creeperStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "creeperStartHealth", 20).getInt(20);
			Reference.elderGuardianMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "elderGuardianMaxHealth", 80).getInt(80);
			Reference.elderGuardianStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "elderGuardianStartHealth", 80).getInt(80);
			Reference.endermiteMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "endermiteMaxHealth", 8).getInt(8);
			Reference.endermiteStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "endermiteStartHealth", 8).getInt(8);
			Reference.ghastMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "ghastMaxHealth", 10).getInt(10);
			Reference.ghastStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "ghastStartHealth", 10).getInt(10);
			Reference.guardianMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "guardianMaxHealth", 30).getInt(30);
			Reference.guardianStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "guardianStartHealth", 30).getInt(30);
			Reference.bigMagmaCubeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "bigMagmaCubeMaxHealth", 16).getInt(16);
			Reference.bigMagmaCubeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "bigMagmaCubeStartHealth", 16).getInt(16);
			Reference.smallMagmaCubeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "smallMagmaCubeMaxHealth", 4).getInt(4);
			Reference.smallMagmaCubeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "smallMagmaCubeStartHealth", 4).getInt(4);
			Reference.tinyMagmaCubeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "tinyMagmaCubeMaxHealth", 1).getInt(1);
			Reference.tinyMagmaCubeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "tinyMagmaCubeStartHealth", 1).getInt(1);
			Reference.silverfishMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "silverfishMaxHealth", 8).getInt(8);
			Reference.silverfishStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "silverfishStartHealth", 8).getInt(8);
			Reference.skeletonMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "skeletonMaxHealth", 20).getInt(20);
			Reference.skeletonStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "skeletonStartHealth", 20).getInt(20);
			Reference.bigSlimeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "bigSlimeMaxHealth", 16).getInt(16);
			Reference.bigSlimeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "bigSlimeStartHealth", 16).getInt(16);
			Reference.smallSlimeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "smallSlimeMaxHealth", 4).getInt(4);
			Reference.smallSlimeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "smallSlimeStartHealth", 4).getInt(4);
			Reference.tinySlimeMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "tinySlimeMaxHealth", 1).getInt(1);
			Reference.tinySlimeStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "tinySlimeStartHealth", 1).getInt(1);
			Reference.witchMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "witchMaxHealth", 26).getInt(26);
			Reference.witchStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "witchStartHealth", 26).getInt(26);
			Reference.witherSkeletonMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "witherSkeletonMaxHealth", 20).getInt(20);
			Reference.witherSkeletonStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "witherSkeletonStartHealth", 20).getInt(20);
			Reference.zombieMaxHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "zombieMaxHealth", 20).getInt(20);
			Reference.zombieStartHealth = config.get(Reference.CATEGORY_HOSTILEMOB, "zombieStartHealth", 20).getInt(20);
			
			//Tamable Mob Config
			Reference.ocelotMaxHealth = config.get(Reference.CATEGORY_TAMABLEMOB, "ocelotMaxHealth", 10).getInt(10);
			Reference.ocelotStartHealth = config.get(Reference.CATEGORY_TAMABLEMOB, "ocelotStartHealth", 10).getInt(10);
			Reference.wildWolfMaxHealth = config.get(Reference.CATEGORY_TAMABLEMOB, "wildWolfMaxHealth", 8).getInt(8);
			Reference.wildWolfStartHealth = config.get(Reference.CATEGORY_TAMABLEMOB, "wildWolfStartHealth", 8).getInt(8);
			
			//Utility Mob Config
			Reference.ironGolemMaxHealth = config.get(Reference.CATEGORY_UTILITYMOB, "ironGolemMaxHealth", 100).getInt(100);
			Reference.ironGolemStartHealth = config.get(Reference.CATEGORY_UTILITYMOB, "ironGolemStartHealth", 100).getInt(100);
			Reference.snowGolemMaxHealth = config.get(Reference.CATEGORY_UTILITYMOB, "snowGolemMaxHealth", 4).getInt(4);
			Reference.snowGolemStartHealth = config.get(Reference.CATEGORY_UTILITYMOB, "snowGolemStartHealth", 4).getInt(4);
			
			//Boss Mob Config
			Reference.enderDragonMaxHealth = config.get(Reference.CATEGORY_BOSSMOB, "enderDragonMaxHealth", 200).getInt(200);
			Reference.enderDragonStartHealth = config.get(Reference.CATEGORY_BOSSMOB, "enderDragonStartHealth", 200).getInt(200);
			Reference.witherMaxHealth = config.get(Reference.CATEGORY_BOSSMOB, "witherMaxHealth", 300).getInt(300);
			Reference.witherStartHealth = config.get(Reference.CATEGORY_BOSSMOB, "witherStartHealth", 300).getInt(300);
			
		} catch (Exception e){
			System.out.println("ConfigHealth: Failed to Load Config File!");			
		}finally{
			config.save();
		}				
	}
}
