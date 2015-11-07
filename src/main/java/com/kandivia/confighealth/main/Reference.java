package com.kandivia.confighealth.main;

public class Reference {
	public static final String MOD_ID = "confighealth";
	public static final String MOD_NAME = "Configurable Health";
	public static final String VERSION = "2.1";
	public static final String CLIENT_PROXY_CLASS = "com.kandivia.confighealth.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.kandivia.confighealth.proxy.CommonProxy";
	
	//Config Category
	public static final String CATEGORY_PLAYER = "Player Config";
	public static final String CATEGORY_PASSIVEMOB = "Passive Mob Config";
	public static final String CATEGORY_NEUTRALMOB = "Neutral Mob Config";
	public static final String CATEGORY_HOSTILEMOB = "Hostile Mob Config";
	public static final String CATEGORY_TAMABLEMOB = "Tamable Mob Config";
	public static final String CATEGORY_UTILITYMOB = "Utility Mob Config";
	public static final String CATEGORY_BOSSMOB = "Boss Mob Config";
	
	//Player Config
	public static int 
		playerMaxHealth, playerStartHealth, playerTopMaxHealth;
	
	public static boolean enableHeartDrops;
	public static double chanceHeartFragDrop;
	
	//Passive Mob Config
	public static int 
		batMaxHealth, batStartHealth,
		chickenMaxHealth, chickenStartHealth,
		cowMaxHealth, cowStartHealth,
		mooshroomMaxHealth, mooshroomStartHealth,
		pigMaxHealth, pigStartHealth,
		rabbitMaxHealth, rabbitStartHealth,
		sheepMaxHealth, sheepStartHealth,
		squidMaxHealth, squidStartHealth,
		villagerMaxHealth, villagerStartHealth;
	
	//Neutral Mob Config
	public static int 
		caveSpiderMaxHealth, caveSpiderStartHealth,
		endermanMaxHealth, endermanStartHealth,
		spiderMaxHealth, spiderStartHealth,
		zombiePigmanMaxHealth, zombiePigmanStartHealth;
	
	//Hostile Mob Config
	public static int 
		blazeMaxHealth, blazeStartHealth,
		creeperMaxHealth, creeperStartHealth,
		elderGuardianMaxHealth, elderGuardianStartHealth,
		endermiteMaxHealth, endermiteStartHealth,
		ghastMaxHealth, ghastStartHealth,
		guardianMaxHealth, guardianStartHealth,
		killerBunnyMaxHealth, killerBunnyStartHealth,
		bigMagmaCubeMaxHealth, bigMagmaCubeStartHealth,
		smallMagmaCubeMaxHealth, smallMagmaCubeStartHealth,
		tinyMagmaCubeMaxHealth, tinyMagmaCubeStartHealth,
		silverfishMaxHealth, silverfishStartHealth,
		skeletonMaxHealth, skeletonStartHealth,
		bigSlimeMaxHealth, bigSlimeStartHealth,
		smallSlimeMaxHealth, smallSlimeStartHealth,
		tinySlimeMaxHealth, tinySlimeStartHealth,
		witchMaxHealth, witchStartHealth,
		witherSkeletonMaxHealth, witherSkeletonStartHealth,
		zombieMaxHealth, zombieStartHealth;
	
	//Tamable Mob Config
	public static int 
		ocelotMaxHealth, ocelotStartHealth,
		wildWolfMaxHealth, wildWolfStartHealth;
	
	//Utility Mob Config
	public static int 
		ironGolemMaxHealth, ironGolemStartHealth,
		snowGolemMaxHealth, snowGolemStartHealth;
	
	//Boss Mob Config
	public static int 
		enderDragonMaxHealth, enderDragonStartHealth,
		witherMaxHealth, witherStartHealth;

}
