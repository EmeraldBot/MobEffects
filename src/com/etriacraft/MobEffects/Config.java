package com.etriacraft.MobEffects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
	public static List<String> Worlds;

	// Player Stuffs
		// Blindness
	public static boolean PlayerBlindnessEnabled = false;
	public static int PlayerBlindnessTime = 500;
	public static int PlayerBlindnessPower = 0;
		// Nausea
	public static boolean PlayerNauseaEnabled = false;
	public static int PlayerNauseaTime = 500;
	public static int PlayerNauseaPower = 0;
		// Damage Resistance
	public static boolean PlayerResistanceEnabled = false;
	public static int PlayerResistanceTime = 500;
	public static int PlayerResistancePower = 0;
		// Fast Digging
	public static boolean PlayerFastDiggingEnabled = false;
	public static int PlayerFastDiggingTime = 500;
	public static int PlayerFastDiggingPower = 0;
		// Fire Resistance
	public static boolean PlayerFireResistanceEnabled = false;
	public static int PlayerFireResistanceTime = 500;
	public static int PlayerFireResistancePower = 0;
		// Harm
	public static boolean PlayerHarmEnabled = false;
	public static int PlayerHarmTime = 500;
	public static int PlayerHarmPower = 0;
		// Heal
	public static boolean PlayerHealEnabled = false;
	public static int PlayerHealTime = 500;
	public static int PlayerHealPower = 0;
		// Hunger
	public static boolean PlayerHungerEnabled = false;
	public static int PlayerHungerTime = 500;
	public static int PlayerHungerPower = 0;
		// Increase Damage
	public static boolean PlayerStrengthEnabled = false;
	public static int PlayerStrengthTime = 500;
	public static int PlayerStrengthPower = 0;
		// Jump
	public static boolean PlayerJumpEnabled = false;
	public static int PlayerJumpTime = 500;
	public static int PlayerJumpPower = 0;
		// Poison
	public static boolean PlayerPoisonEnabled = false;
	public static int PlayerPoisonTime = 500;
	public static int PlayerPoisonPower = 0;
		// Regeneration
	public static boolean PlayerRegenerationEnabled = false;
	public static int PlayerRegenerationTime = 500;
	public static int PlayerRegenerationPower = 0;
		// Slow
	public static boolean PlayerSlowEnabled = false;
	public static int PlayerSlowTime = 500;
	public static int PlayerSlowPower = 0;
		// Slow Digging
	public static boolean PlayerMiningFatigueEnabled = false;
	public static int PlayerMiningFatigueTime = 500;
	public static int PlayerMiningFatiguePower = 0;
		// Speed
	public static boolean PlayerSpeedEnabled = false;
	public static int PlayerSpeedTime = 500;
	public static int PlayerSpeedPower = 0;
		// Water Breathing
	public static boolean PlayerWaterBreathingEnabled = false;
	public static int PlayerWaterBreathingTime = 500;
	public static int PlayerWaterBreathingPower = 0;
		// Weakness
	public static boolean PlayerWeaknessEnabled = false;
	public static int PlayerWeaknessTime = 500;
	public static int PlayerWeaknessPower = 0;
	
	// Zombie Stuffs
		// Blindness
	public static boolean ZombieBlindnessEnabled = false;
	public static int ZombieBlindnessTime = 500;
	public static int ZombieBlindnessPower = 0;
	public static double ZombieBlindnessDodgeChance = 10;
		// Nausea
	public static boolean ZombieNauseaEnabled = false;
	public static int ZombieNauseaTime = 500;
	public static int ZombieNauseaPower = 0;
	public static double ZombieNauseaDodgeChance = 10;
		// Damage Resistance
	public static boolean ZombieResistanceEnabled = false;
	public static int ZombieResistanceTime = 500;
	public static int ZombieResistancePower = 0;
	public static double ZombieResistanceDodgeChance = 0;
		// Fast Digging
	public static boolean ZombieFastDiggingEnabled = false;
	public static int ZombieFastDiggingTime = 500;
	public static int ZombieFastDiggingPower = 0;
	public static double ZombieFastDiggingDodgeChance = 10;
		// Fire Resistance
	public static boolean ZombieFireResistanceEnabled = false;
	public static int ZombieFireResistanceTime = 500;
	public static int ZombieFireResistancePower = 0;
	public static double ZombieFireResistanceDodgeChance = 10;
		// Harm
	public static boolean ZombieHarmEnabled = false;
	public static int ZombieHarmTime = 500;
	public static int ZombieHarmPower = 0;
	public static double ZombieHarmDodgeChance = 10;
		// Heal
	public static boolean ZombieHealEnabled = false;
	public static int ZombieHealTime = 500;
	public static int ZombieHealPower = 0;
	public static double ZombieHealDodgeChance = 10;
		// Hunger
	public static boolean ZombieHungerEnabled = false;
	public static int ZombieHungerTime = 500;
	public static int ZombieHungerPower = 0;
	public static double ZombieHungerDodgeChance = 10;
		// Increase Damage
	public static boolean ZombieStrengthEnabled = false;
	public static int ZombieStrengthTime = 500;
	public static int ZombieStrengthPower = 0;
	public static double ZombieStrengthDodgeChance = 10;
		// Jump
	public static boolean ZombieJumpEnabled = false;
	public static int ZombieJumpTime = 500;
	public static int ZombieJumpPower = 0;
	public static double ZombieJumpDodgeChance = 10;
		// Poison
	public static boolean ZombiePoisonEnabled = false;
	public static int ZombiePoisonTime = 500;
	public static int ZombiePoisonPower = 0;
	public static double ZombiePoisonDodgeChance = 10;
		// Regeneration
	public static boolean ZombieRegenerationEnabled = false;
	public static int ZombieRegenerationTime = 500;
	public static int ZombieRegenerationPower = 0;
	public static double ZombieRegenerationDodgeChance = 10;
		// Slow
	public static boolean ZombieSlowEnabled = false;
	public static int ZombieSlowTime = 500;
	public static int ZombieSlowPower = 0;
	public static double ZombieSlowDodgeChance = 10;
		// Slow Digging
	public static boolean ZombieMiningFatigueEnabled = false;
	public static int ZombieMiningFatigueTime = 500;
	public static int ZombieMiningFatiguePower = 0;
	public static double ZombieMiningFatigueDodgeChance = 10;
		// Speed
	public static boolean ZombieSpeedEnabled = false;
	public static int ZombieSpeedTime = 500;
	public static int ZombieSpeedPower = 0;
	public static double ZombieSpeedDodgeChance = 10;
		// Water Breathing
	public static boolean ZombieWaterBreathingEnabled = false;
	public static int ZombieWaterBreathingTime = 500;
	public static int ZombieWaterBreathingPower = 0;
	public static double ZombieWaterBreathingDodgeChance = 10;
		// Weakness
	public static boolean ZombieWeaknessEnabled = false;
	public static int ZombieWeaknessTime = 500;
	public static int ZombieWeaknessPower = 0;
	public static double ZombieWeaknessDodgeChance = 10;
	// Spider Stuffs
		// Blindness
	public static boolean SpiderBlindnessEnabled = false;
	public static int SpiderBlindnessTime = 500;
	public static int SpiderBlindnessPower = 0;
		// Nausea
	public static boolean SpiderNauseaEnabled = false;
	public static int SpiderNauseaTime = 500;
	public static int SpiderNauseaPower = 0;
		// Damage Resistance
	public static boolean SpiderResistanceEnabled = false;
	public static int SpiderResistanceTime = 500;
	public static int SpiderResistancePower = 0;
		// Fast Digging
	public static boolean SpiderFastDiggingEnabled = false;
	public static int SpiderFastDiggingTime = 500;
	public static int SpiderFastDiggingPower = 0;
		// Fire Resistance
	public static boolean SpiderFireResistanceEnabled = false;
	public static int SpiderFireResistanceTime = 500;
	public static int SpiderFireResistancePower = 0;
		// Harm
	public static boolean SpiderHarmEnabled = false;
	public static int SpiderHarmTime = 500;
	public static int SpiderHarmPower = 0;
		// Heal
	public static boolean SpiderHealEnabled = false;
	public static int SpiderHealTime = 500;
	public static int SpiderHealPower = 0;
		// Hunger
	public static boolean SpiderHungerEnabled = false;
	public static int SpiderHungerTime = 500;
	public static int SpiderHungerPower = 0;
		// Increase Damage
	public static boolean SpiderStrengthEnabled = false;
	public static int SpiderStrengthTime = 500;
	public static int SpiderStrengthPower = 0;
		// Jump
	public static boolean SpiderJumpEnabled = false;
	public static int SpiderJumpTime = 500;
	public static int SpiderJumpPower = 0;
		// Poison
	public static boolean SpiderPoisonEnabled = false;
	public static int SpiderPoisonTime = 500;
	public static int SpiderPoisonPower = 0;
		// Regeneration
	public static boolean SpiderRegenerationEnabled = false;
	public static int SpiderRegenerationTime = 500;
	public static int SpiderRegenerationPower = 0;
		// Slow
	public static boolean SpiderSlowEnabled = false;
	public static int SpiderSlowTime = 500;
	public static int SpiderSlowPower = 0;
		// Slow Digging
	public static boolean SpiderMiningFatigueEnabled = false;
	public static int SpiderMiningFatigueTime = 500;
	public static int SpiderMiningFatiguePower = 0;
		// Speed
	public static boolean SpiderSpeedEnabled = false;
	public static int SpiderSpeedTime = 500;
	public static int SpiderSpeedPower = 0;
		// Water Breathing
	public static boolean SpiderWaterBreathingEnabled = false;
	public static int SpiderWaterBreathingTime = 500;
	public static int SpiderWaterBreathingPower = 0;
		// Weakness
	public static boolean SpiderWeaknessEnabled = false;
	public static int SpiderWeaknessTime = 500;
	public static int SpiderWeaknessPower = 0;
	
	// Creeper Stuff
		// Blindness
	public static boolean CreeperBlindnessEnabled = false;
	public static int CreeperBlindnessTime = 500;
	public static int CreeperBlindnessPower = 0;
		// Nausea
	public static boolean CreeperNauseaEnabled = false;
	public static int CreeperNauseaTime = 500;
	public static int CreeperNauseaPower = 0;
		// Damage Resistance
	public static boolean CreeperResistanceEnabled = false;
	public static int CreeperResistanceTime = 500;
	public static int CreeperResistancePower = 0;
		// Fast Digging
	public static boolean CreeperFastDiggingEnabled = false;
	public static int CreeperFastDiggingTime = 500;
	public static int CreeperFastDiggingPower = 0;
		// Fire Resistance
	public static boolean CreeperFireResistanceEnabled = false;
	public static int CreeperFireResistanceTime = 500;
	public static int CreeperFireResistancePower = 0;
		// Harm
	public static boolean CreeperHarmEnabled = false;
	public static int CreeperHarmTime = 500;
	public static int CreeperHarmPower = 0;
		// Heal
	public static boolean CreeperHealEnabled = false;
	public static int CreeperHealTime = 500;
	public static int CreeperHealPower = 0;
		// Hunger
	public static boolean CreeperHungerEnabled = false;
	public static int CreeperHungerTime = 500;
	public static int CreeperHungerPower = 0;
		// Increase Damage
	public static boolean CreeperStrengthEnabled = false;
	public static int CreeperStrengthTime = 500;
	public static int CreeperStrengthPower = 0;
		// Jump
	public static boolean CreeperJumpEnabled = false;
	public static int CreeperJumpTime = 500;
	public static int CreeperJumpPower = 0;
		// Poison
	public static boolean CreeperPoisonEnabled = false;
	public static int CreeperPoisonTime = 500;
	public static int CreeperPoisonPower = 0;
		// Regeneration
	public static boolean CreeperRegenerationEnabled = false;
	public static int CreeperRegenerationTime = 500;
	public static int CreeperRegenerationPower = 0;
		// Slow
	public static boolean CreeperSlowEnabled = false;
	public static int CreeperSlowTime = 500;
	public static int CreeperSlowPower = 0;
		// Slow Digging
	public static boolean CreeperMiningFatigueEnabled = false;
	public static int CreeperMiningFatigueTime = 500;
	public static int CreeperMiningFatiguePower = 0;
		// Speed
	public static boolean CreeperSpeedEnabled = false;
	public static int CreeperSpeedTime = 500;
	public static int CreeperSpeedPower = 0;
		// Water Breathing
	public static boolean CreeperWaterBreathingEnabled = false;
	public static int CreeperWaterBreathingTime = 500;
	public static int CreeperWaterBreathingPower = 0;
		// Weakness
	public static boolean CreeperWeaknessEnabled = false;
	public static int CreeperWeaknessTime = 500;
	public static int CreeperWeaknessPower = 0;
	
	// Enderman Stuff
		// Blindness
	public static boolean EndermanBlindnessEnabled = false;
	public static int EndermanBlindnessTime = 500;
	public static int EndermanBlindnessPower = 0;
		// Nausea
	public static boolean EndermanNauseaEnabled = false;
	public static int EndermanNauseaTime = 500;
	public static int EndermanNauseaPower = 0;
		// Damage Resistance
	public static boolean EndermanResistanceEnabled = false;
	public static int EndermanResistanceTime = 500;
	public static int EndermanResistancePower = 0;
		// Fast Digging
	public static boolean EndermanFastDiggingEnabled = false;
	public static int EndermanFastDiggingTime = 500;
	public static int EndermanFastDiggingPower = 0;
		// Fire Resistance
	public static boolean EndermanFireResistanceEnabled = false;
	public static int EndermanFireResistanceTime = 500;
	public static int EndermanFireResistancePower = 0;
		// Harm
	public static boolean EndermanHarmEnabled = false;
	public static int EndermanHarmTime = 500;
	public static int EndermanHarmPower = 0;
		// Heal
	public static boolean EndermanHealEnabled = false;
	public static int EndermanHealTime = 500;
	public static int EndermanHealPower = 0;
		// Hunger
	public static boolean EndermanHungerEnabled = false;
	public static int EndermanHungerTime = 500;
	public static int EndermanHungerPower = 0;
		// Increase Damage
	public static boolean EndermanStrengthEnabled = false;
	public static int EndermanStrengthTime = 500;
	public static int EndermanStrengthPower = 0;
		// Jump
	public static boolean EndermanJumpEnabled = false;
	public static int EndermanJumpTime = 500;
	public static int EndermanJumpPower = 0;
		// Poison
	public static boolean EndermanPoisonEnabled = false;
	public static int EndermanPoisonTime = 500;
	public static int EndermanPoisonPower = 0;
		// Regeneration
	public static boolean EndermanRegenerationEnabled = false;
	public static int EndermanRegenerationTime = 500;
	public static int EndermanRegenerationPower = 0;
		// Slow
	public static boolean EndermanSlowEnabled = false;
	public static int EndermanSlowTime = 500;
	public static int EndermanSlowPower = 0;
		// Slow Digging
	public static boolean EndermanMiningFatigueEnabled = false;
	public static int EndermanMiningFatigueTime = 500;
	public static int EndermanMiningFatiguePower = 0;
		// Speed
	public static boolean EndermanSpeedEnabled = false;
	public static int EndermanSpeedTime = 500;
	public static int EndermanSpeedPower = 0;
		// Water Breathing
	public static boolean EndermanWaterBreathingEnabled = false;
	public static int EndermanWaterBreathingTime = 500;
	public static int EndermanWaterBreathingPower = 0;
		// Weakness
	public static boolean EndermanWeaknessEnabled = false;
	public static int EndermanWeaknessTime = 500;
	public static int EndermanWeaknessPower = 0;
	
	// Slime Stuff
	// Blindness
	public static boolean SlimeBlindnessEnabled = false;
	public static int SlimeBlindnessTime = 500;
	public static int SlimeBlindnessPower = 0;
	// Nausea
	public static boolean SlimeNauseaEnabled = false;
	public static int SlimeNauseaTime = 500;
	public static int SlimeNauseaPower = 0;
	// Damage Resistance
	public static boolean SlimeResistanceEnabled = false;
	public static int SlimeResistanceTime = 500;
	public static int SlimeResistancePower = 0;
	// Fast Digging
	public static boolean SlimeFastDiggingEnabled = false;
	public static int SlimeFastDiggingTime = 500;
	public static int SlimeFastDiggingPower = 0;
	// Fire Resistance
	public static boolean SlimeFireResistanceEnabled = false;
	public static int SlimeFireResistanceTime = 500;
	public static int SlimeFireResistancePower = 0;
	// Harm
	public static boolean SlimeHarmEnabled = false;
	public static int SlimeHarmTime = 500;
	public static int SlimeHarmPower = 0;
	// Heal
	public static boolean SlimeHealEnabled = false;
	public static int SlimeHealTime = 500;
	public static int SlimeHealPower = 0;
	// Hunger
	public static boolean SlimeHungerEnabled = false;
	public static int SlimeHungerTime = 500;
	public static int SlimeHungerPower = 0;
	// Increase Damage
	public static boolean SlimeStrengthEnabled = false;
	public static int SlimeStrengthTime = 500;
	public static int SlimeStrengthPower = 0;
	// Jump
	public static boolean SlimeJumpEnabled = false;
	public static int SlimeJumpTime = 500;
	public static int SlimeJumpPower = 0;
	// Poison
	public static boolean SlimePoisonEnabled = false;
	public static int SlimePoisonTime = 500;
	public static int SlimePoisonPower = 0;
	// Regeneration
	public static boolean SlimeRegenerationEnabled = false;
	public static int SlimeRegenerationTime = 500;
	public static int SlimeRegenerationPower = 0;
	// Slow
	public static boolean SlimeSlowEnabled = false;
	public static int SlimeSlowTime = 500;
	public static int SlimeSlowPower = 0;
	// Slow Digging
	public static boolean SlimeMiningFatigueEnabled = false;
	public static int SlimeMiningFatigueTime = 500;
	public static int SlimeMiningFatiguePower = 0;
	// Speed
	public static boolean SlimeSpeedEnabled = false;
	public static int SlimeSpeedTime = 500;
	public static int SlimeSpeedPower = 0;
	// Water Breathing
	public static boolean SlimeWaterBreathingEnabled = false;
	public static int SlimeWaterBreathingTime = 500;
	public static int SlimeWaterBreathingPower = 0;
	// Weakness
	public static boolean SlimeWeaknessEnabled = false;
	public static int SlimeWeaknessTime = 500;
	public static int SlimeWeaknessPower = 0;
	
	// Giants
	// Blindness
	public static boolean GiantBlindnessEnabled = false;
	public static int GiantBlindnessTime = 500;
	public static int GiantBlindnessPower = 0;
	// Nausea
	public static boolean GiantNauseaEnabled = false;
	public static int GiantNauseaTime = 500;
	public static int GiantNauseaPower = 0;
	// Damage Resistance
	public static boolean GiantResistanceEnabled = false;
	public static int GiantResistanceTime = 500;
	public static int GiantResistancePower = 0;
	// Fast Digging
	public static boolean GiantFastDiggingEnabled = false;
	public static int GiantFastDiggingTime = 500;
	public static int GiantFastDiggingPower = 0;
	// Fire Resistance
	public static boolean GiantFireResistanceEnabled = false;
	public static int GiantFireResistanceTime = 500;
	public static int GiantFireResistancePower = 0;
	// Harm
	public static boolean GiantHarmEnabled = false;
	public static int GiantHarmTime = 500;
	public static int GiantHarmPower = 0;
	// Heal
	public static boolean GiantHealEnabled = false;
	public static int GiantHealTime = 500;
	public static int GiantHealPower = 0;
	// Hunger
	public static boolean GiantHungerEnabled = false;
	public static int GiantHungerTime = 500;
	public static int GiantHungerPower = 0;
	// Increase Damage
	public static boolean GiantStrengthEnabled = false;
	public static int GiantStrengthTime = 500;
	public static int GiantStrengthPower = 0;
	// Jump
	public static boolean GiantJumpEnabled = false;
	public static int GiantJumpTime = 500;
	public static int GiantJumpPower = 0;
	// Poison
	public static boolean GiantPoisonEnabled = false;
	public static int GiantPoisonTime = 500;
	public static int GiantPoisonPower = 0;
	// Regeneration
	public static boolean GiantRegenerationEnabled = false;
	public static int GiantRegenerationTime = 500;
	public static int GiantRegenerationPower = 0;
	// Slow
	public static boolean GiantSlowEnabled = false;
	public static int GiantSlowTime = 500;
	public static int GiantSlowPower = 0;
	// Slow Digging
	public static boolean GiantMiningFatigueEnabled = false;
	public static int GiantMiningFatigueTime = 500;
	public static int GiantMiningFatiguePower = 0;
	// Speed
	public static boolean GiantSpeedEnabled = false;
	public static int GiantSpeedTime = 500;
	public static int GiantSpeedPower = 0;
	// Water Breathing
	public static boolean GiantWaterBreathingEnabled = false;
	public static int GiantWaterBreathingTime = 500;
	public static int GiantWaterBreathingPower = 0;
	// Weakness
	public static boolean GiantWeaknessEnabled = false;
	public static int GiantWeaknessTime = 500;
	public static int GiantWeaknessPower = 0;
	
	// Blaze
	// Blindness
	public static boolean BlazeBlindnessEnabled = false;
	public static int BlazeBlindnessTime = 500;
	public static int BlazeBlindnessPower = 0;
	// Nausea
	public static boolean BlazeNauseaEnabled = false;
	public static int BlazeNauseaTime = 500;
	public static int BlazeNauseaPower = 0;
	// Damage Resistance
	public static boolean BlazeResistanceEnabled = false;
	public static int BlazeResistanceTime = 500;
	public static int BlazeResistancePower = 0;
	// Fast Digging
	public static boolean BlazeFastDiggingEnabled = false;
	public static int BlazeFastDiggingTime = 500;
	public static int BlazeFastDiggingPower = 0;
	// Fire Resistance
	public static boolean BlazeFireResistanceEnabled = false;
	public static int BlazeFireResistanceTime = 500;
	public static int BlazeFireResistancePower = 0;
	// Harm
	public static boolean BlazeHarmEnabled = false;
	public static int BlazeHarmTime = 500;
	public static int BlazeHarmPower = 0;
	// Heal
	public static boolean BlazeHealEnabled = false;
	public static int BlazeHealTime = 500;
	public static int BlazeHealPower = 0;
	// Hunger
	public static boolean BlazeHungerEnabled = false;
	public static int BlazeHungerTime = 500;
	public static int BlazeHungerPower = 0;
	// Increase Damage
	public static boolean BlazeStrengthEnabled = false;
	public static int BlazeStrengthTime = 500;
	public static int BlazeStrengthPower = 0;
	// Jump
	public static boolean BlazeJumpEnabled = false;
	public static int BlazeJumpTime = 500;
	public static int BlazeJumpPower = 0;
	// Poison
	public static boolean BlazePoisonEnabled = false;
	public static int BlazePoisonTime = 500;
	public static int BlazePoisonPower = 0;
	// Regeneration
	public static boolean BlazeRegenerationEnabled = false;
	public static int BlazeRegenerationTime = 500;
	public static int BlazeRegenerationPower = 0;
	// Slow
	public static boolean BlazeSlowEnabled = false;
	public static int BlazeSlowTime = 500;
	public static int BlazeSlowPower = 0;
	// Slow Digging
	public static boolean BlazeMiningFatigueEnabled = false;
	public static int BlazeMiningFatigueTime = 500;
	public static int BlazeMiningFatiguePower = 0;
	// Speed
	public static boolean BlazeSpeedEnabled = false;
	public static int BlazeSpeedTime = 500;
	public static int BlazeSpeedPower = 0;
	// Water Breathing
	public static boolean BlazeWaterBreathingEnabled = false;
	public static int BlazeWaterBreathingTime = 500;
	public static int BlazeWaterBreathingPower = 0;
	// Weakness
	public static boolean BlazeWeaknessEnabled = false;
	public static int BlazeWeaknessTime = 500;
	public static int BlazeWeaknessPower = 0;
	// Magma Cube
	// Blindness
	public static boolean MagmaCubeBlindnessEnabled = false;
	public static int MagmaCubeBlindnessTime = 500;
	public static int MagmaCubeBlindnessPower = 0;
	// Nausea
	public static boolean MagmaCubeNauseaEnabled = false;
	public static int MagmaCubeNauseaTime = 500;
	public static int MagmaCubeNauseaPower = 0;
	// Damage Resistance
	public static boolean MagmaCubeResistanceEnabled = false;
	public static int MagmaCubeResistanceTime = 500;
	public static int MagmaCubeResistancePower = 0;
	// Fast Digging
	public static boolean MagmaCubeFastDiggingEnabled = false;
	public static int MagmaCubeFastDiggingTime = 500;
	public static int MagmaCubeFastDiggingPower = 0;
	// Fire Resistance
	public static boolean MagmaCubeFireResistanceEnabled = false;
	public static int MagmaCubeFireResistanceTime = 500;
	public static int MagmaCubeFireResistancePower = 0;
	// Harm
	public static boolean MagmaCubeHarmEnabled = false;
	public static int MagmaCubeHarmTime = 500;
	public static int MagmaCubeHarmPower = 0;
	// Heal
	public static boolean MagmaCubeHealEnabled = false;
	public static int MagmaCubeHealTime = 500;
	public static int MagmaCubeHealPower = 0;
	// Hunger
	public static boolean MagmaCubeHungerEnabled = false;
	public static int MagmaCubeHungerTime = 500;
	public static int MagmaCubeHungerPower = 0;
	// Increase Damage
	public static boolean MagmaCubeStrengthEnabled = false;
	public static int MagmaCubeStrengthTime = 500;
	public static int MagmaCubeStrengthPower = 0;
	// Jump
	public static boolean MagmaCubeJumpEnabled = false;
	public static int MagmaCubeJumpTime = 500;
	public static int MagmaCubeJumpPower = 0;
	// Poison
	public static boolean MagmaCubePoisonEnabled = false;
	public static int MagmaCubePoisonTime = 500;
	public static int MagmaCubePoisonPower = 0;
	// Regeneration
	public static boolean MagmaCubeRegenerationEnabled = false;
	public static int MagmaCubeRegenerationTime = 500;
	public static int MagmaCubeRegenerationPower = 0;
	// Slow
	public static boolean MagmaCubeSlowEnabled = false;
	public static int MagmaCubeSlowTime = 500;
	public static int MagmaCubeSlowPower = 0;
	// Slow Digging
	public static boolean MagmaCubeMiningFatigueEnabled = false;
	public static int MagmaCubeMiningFatigueTime = 500;
	public static int MagmaCubeMiningFatiguePower = 0;
	// Speed
	public static boolean MagmaCubeSpeedEnabled = false;
	public static int MagmaCubeSpeedTime = 500;
	public static int MagmaCubeSpeedPower = 0;
	// Water Breathing
	public static boolean MagmaCubeWaterBreathingEnabled = false;
	public static int MagmaCubeWaterBreathingTime = 500;
	public static int MagmaCubeWaterBreathingPower = 0;
	// Weakness
	public static boolean MagmaCubeWeaknessEnabled = false;
	public static int MagmaCubeWeaknessTime = 500;
	public static int MagmaCubeWeaknessPower = 0;
	// CaveSpiders
	// Blindness
	public static boolean CaveSpiderBlindnessEnabled = false;
	public static int CaveSpiderBlindnessTime = 500;
	public static int CaveSpiderBlindnessPower = 0;
	// Nausea
	public static boolean CaveSpiderNauseaEnabled = false;
	public static int CaveSpiderNauseaTime = 500;
	public static int CaveSpiderNauseaPower = 0;
	// Damage Resistance
	public static boolean CaveSpiderResistanceEnabled = false;
	public static int CaveSpiderResistanceTime = 500;
	public static int CaveSpiderResistancePower = 0;
	// Fast Digging
	public static boolean CaveSpiderFastDiggingEnabled = false;
	public static int CaveSpiderFastDiggingTime = 500;
	public static int CaveSpiderFastDiggingPower = 0;
	// Fire Resistance
	public static boolean CaveSpiderFireResistanceEnabled = false;
	public static int CaveSpiderFireResistanceTime = 500;
	public static int CaveSpiderFireResistancePower = 0;
	// Harm
	public static boolean CaveSpiderHarmEnabled = false;
	public static int CaveSpiderHarmTime = 500;
	public static int CaveSpiderHarmPower = 0;
	// Heal
	public static boolean CaveSpiderHealEnabled = false;
	public static int CaveSpiderHealTime = 500;
	public static int CaveSpiderHealPower = 0;
	// Hunger
	public static boolean CaveSpiderHungerEnabled = false;
	public static int CaveSpiderHungerTime = 500;
	public static int CaveSpiderHungerPower = 0;
	// Increase Damage
	public static boolean CaveSpiderStrengthEnabled = false;
	public static int CaveSpiderStrengthTime = 500;
	public static int CaveSpiderStrengthPower = 0;
	// Jump
	public static boolean CaveSpiderJumpEnabled = false;
	public static int CaveSpiderJumpTime = 500;
	public static int CaveSpiderJumpPower = 0;
	// Poison
	public static boolean CaveSpiderPoisonEnabled = false;
	public static int CaveSpiderPoisonTime = 500;
	public static int CaveSpiderPoisonPower = 0;
	// Regeneration
	public static boolean CaveSpiderRegenerationEnabled = false;
	public static int CaveSpiderRegenerationTime = 500;
	public static int CaveSpiderRegenerationPower = 0;
	// Slow
	public static boolean CaveSpiderSlowEnabled = false;
	public static int CaveSpiderSlowTime = 500;
	public static int CaveSpiderSlowPower = 0;
	// Slow Digging
	public static boolean CaveSpiderMiningFatigueEnabled = false;
	public static int CaveSpiderMiningFatigueTime = 500;
	public static int CaveSpiderMiningFatiguePower = 0;
	// Speed
	public static boolean CaveSpiderSpeedEnabled = false;
	public static int CaveSpiderSpeedTime = 500;
	public static int CaveSpiderSpeedPower = 0;
	// Water Breathing
	public static boolean CaveSpiderWaterBreathingEnabled = false;
	public static int CaveSpiderWaterBreathingTime = 500;
	public static int CaveSpiderWaterBreathingPower = 0;
	// Weakness
	public static boolean CaveSpiderWeaknessEnabled = false;
	public static int CaveSpiderWeaknessTime = 500;
	public static int CaveSpiderWeaknessPower = 0;
	// PigZombies
	// Blindness
	public static boolean PigZombieBlindnessEnabled = false;
	public static int PigZombieBlindnessTime = 500;
	public static int PigZombieBlindnessPower = 0;
	// Nausea
	public static boolean PigZombieNauseaEnabled = false;
	public static int PigZombieNauseaTime = 500;
	public static int PigZombieNauseaPower = 0;
	// Damage Resistance
	public static boolean PigZombieResistanceEnabled = false;
	public static int PigZombieResistanceTime = 500;
	public static int PigZombieResistancePower = 0;
	// Fast Digging
	public static boolean PigZombieFastDiggingEnabled = false;
	public static int PigZombieFastDiggingTime = 500;
	public static int PigZombieFastDiggingPower = 0;
	// Fire Resistance
	public static boolean PigZombieFireResistanceEnabled = false;
	public static int PigZombieFireResistanceTime = 500;
	public static int PigZombieFireResistancePower = 0;
	// Harm
	public static boolean PigZombieHarmEnabled = false;
	public static int PigZombieHarmTime = 500;
	public static int PigZombieHarmPower = 0;
	// Heal
	public static boolean PigZombieHealEnabled = false;
	public static int PigZombieHealTime = 500;
	public static int PigZombieHealPower = 0;
	// Hunger
	public static boolean PigZombieHungerEnabled = false;
	public static int PigZombieHungerTime = 500;
	public static int PigZombieHungerPower = 0;
	// Increase Damage
	public static boolean PigZombieStrengthEnabled = false;
	public static int PigZombieStrengthTime = 500;
	public static int PigZombieStrengthPower = 0;
	// Jump
	public static boolean PigZombieJumpEnabled = false;
	public static int PigZombieJumpTime = 500;
	public static int PigZombieJumpPower = 0;
	// Poison
	public static boolean PigZombiePoisonEnabled = false;
	public static int PigZombiePoisonTime = 500;
	public static int PigZombiePoisonPower = 0;
	// Regeneration
	public static boolean PigZombieRegenerationEnabled = false;
	public static int PigZombieRegenerationTime = 500;
	public static int PigZombieRegenerationPower = 0;
	// Slow
	public static boolean PigZombieSlowEnabled = false;
	public static int PigZombieSlowTime = 500;
	public static int PigZombieSlowPower = 0;
	// Slow Digging
	public static boolean PigZombieMiningFatigueEnabled = false;
	public static int PigZombieMiningFatigueTime = 500;
	public static int PigZombieMiningFatiguePower = 0;
	// Speed
	public static boolean PigZombieSpeedEnabled = false;
	public static int PigZombieSpeedTime = 500;
	public static int PigZombieSpeedPower = 0;
	// Water Breathing
	public static boolean PigZombieWaterBreathingEnabled = false;
	public static int PigZombieWaterBreathingTime = 500;
	public static int PigZombieWaterBreathingPower = 0;
	// Weakness
	public static boolean PigZombieWeaknessEnabled = false;
	public static int PigZombieWeaknessTime = 500;
	public static int PigZombieWeaknessPower = 0;
	// Silverfish Stuffs
	// Blindness
	public static boolean SilverfishBlindnessEnabled = false;
	public static int SilverfishBlindnessTime = 500;
	public static int SilverfishBlindnessPower = 0;
	// Nausea
	public static boolean SilverfishNauseaEnabled = false;
	public static int SilverfishNauseaTime = 500;
	public static int SilverfishNauseaPower = 0;
	// Damage Resistance
	public static boolean SilverfishResistanceEnabled = false;
	public static int SilverfishResistanceTime = 500;
	public static int SilverfishResistancePower = 0;
	// Fast Digging
	public static boolean SilverfishFastDiggingEnabled = false;
	public static int SilverfishFastDiggingTime = 500;
	public static int SilverfishFastDiggingPower = 0;
	// Fire Resistance
	public static boolean SilverfishFireResistanceEnabled = false;
	public static int SilverfishFireResistanceTime = 500;
	public static int SilverfishFireResistancePower = 0;
	// Harm
	public static boolean SilverfishHarmEnabled = false;
	public static int SilverfishHarmTime = 500;
	public static int SilverfishHarmPower = 0;
	// Heal
	public static boolean SilverfishHealEnabled = false;
	public static int SilverfishHealTime = 500;
	public static int SilverfishHealPower = 0;
	// Hunger
	public static boolean SilverfishHungerEnabled = false;
	public static int SilverfishHungerTime = 500;
	public static int SilverfishHungerPower = 0;
	// Increase Damage
	public static boolean SilverfishStrengthEnabled = false;
	public static int SilverfishStrengthTime = 500;
	public static int SilverfishStrengthPower = 0;
	// Jump
	public static boolean SilverfishJumpEnabled = false;
	public static int SilverfishJumpTime = 500;
	public static int SilverfishJumpPower = 0;
	// Poison
	public static boolean SilverfishPoisonEnabled = false;
	public static int SilverfishPoisonTime = 500;
	public static int SilverfishPoisonPower = 0;
	// Regeneration
	public static boolean SilverfishRegenerationEnabled = false;
	public static int SilverfishRegenerationTime = 500;
	public static int SilverfishRegenerationPower = 0;
	// Slow
	public static boolean SilverfishSlowEnabled = false;
	public static int SilverfishSlowTime = 500;
	public static int SilverfishSlowPower = 0;
	// Slow Digging
	public static boolean SilverfishMiningFatigueEnabled = false;
	public static int SilverfishMiningFatigueTime = 500;
	public static int SilverfishMiningFatiguePower = 0;
	// Speed
	public static boolean SilverfishSpeedEnabled = false;
	public static int SilverfishSpeedTime = 500;
	public static int SilverfishSpeedPower = 0;
	// Water Breathing
	public static boolean SilverfishWaterBreathingEnabled = false;
	public static int SilverfishWaterBreathingTime = 500;
	public static int SilverfishWaterBreathingPower = 0;
	// Weakness
	public static boolean SilverfishWeaknessEnabled = false;
	public static int SilverfishWeaknessTime = 500;
	public static int SilverfishWeaknessPower = 0;
	
	public void load(File file) {
		FileConfiguration config = new YamlConfiguration();
		try {
			if (file.exists());
			config.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		}
		
		// Worlds
		Worlds = config.getStringList("Worlds");
		// Player Blindness
		PlayerBlindnessEnabled = config.getBoolean("Player.Blindness.Enabled", PlayerBlindnessEnabled);
		PlayerBlindnessTime = config.getInt("Player.Blindness.Time", PlayerBlindnessTime);
		PlayerBlindnessPower = config.getInt("Player.Blindness.Power", PlayerBlindnessPower);
		
		//Player Nausea
		PlayerNauseaEnabled = config.getBoolean("Player.Nausea.Enabled", PlayerNauseaEnabled);
		PlayerNauseaTime = config.getInt("Player.Nausea.Time", PlayerNauseaTime);
		PlayerNauseaPower = config.getInt("Player.Nausea.Power", PlayerNauseaPower);
		
		// Player Damage Resistance
		PlayerResistanceEnabled = config.getBoolean("Player.Resistance.Enabled", PlayerResistanceEnabled);
		PlayerResistanceTime = config.getInt("Player.Resistance.Time", PlayerResistanceTime);
		PlayerResistancePower = config.getInt("Player.Resistance.Power", PlayerResistancePower);
		
		// Player Fast Digging
		PlayerFastDiggingEnabled = config.getBoolean("Player.FastDigging.Enabled", PlayerFastDiggingEnabled);
		PlayerFastDiggingTime = config.getInt("Player.FastDigging.Time", PlayerFastDiggingTime);
		PlayerFastDiggingPower = config.getInt("Player.FastDigging.Power", PlayerFastDiggingPower);
		
		// Player Fire Resistance
		PlayerFireResistanceEnabled = config.getBoolean("Player.FireResistance.Enabled", PlayerFireResistanceEnabled);
		PlayerFireResistanceTime = config.getInt("Player.FireResistance.Time", PlayerFireResistanceTime);
		PlayerFireResistancePower = config.getInt("Player.FireResistance.Power", PlayerFireResistancePower);
		
		// Player Harm
		PlayerHarmEnabled = config.getBoolean("Player.Harm.Enabled", PlayerHarmEnabled);
		PlayerHarmTime = config.getInt("Player.Harm.Time", PlayerHarmTime);
		PlayerHarmPower = config.getInt("Player.Harm.Powre", PlayerHarmPower);
		
		// Player Heal
		PlayerHealEnabled = config.getBoolean("Player.Heal.Enabled", PlayerHealEnabled);
		PlayerHealTime = config.getInt("Player.Heal.Time", PlayerHealTime);
		PlayerHealPower = config.getInt("Player.Heal.Power", PlayerHealPower);
		
		// Player Hunger
		PlayerHungerEnabled = config.getBoolean("Player.Hunger.Enabled", PlayerHungerEnabled);
		PlayerHungerTime = config.getInt("Player.Hunger.Time", PlayerHungerTime);
		PlayerHungerPower = config.getInt("Player.Hunger.Power", PlayerHungerPower);
		
		// Player Strength
		PlayerStrengthEnabled = config.getBoolean("Player.Strength.Enabled", PlayerStrengthEnabled);
		PlayerStrengthTime = config.getInt("Player.Strength.Time", PlayerStrengthTime);
		PlayerStrengthPower = config.getInt("Player.Strength.Power", PlayerStrengthPower);
		
		// Player Jump
		PlayerJumpEnabled = config.getBoolean("Player.Jump.Enabled", PlayerJumpEnabled);
		PlayerJumpTime = config.getInt("Player.Jump.Time", PlayerJumpTime);
		PlayerJumpPower = config.getInt("Player.Jump.Power", PlayerJumpPower);
		
		// Player Poison
		PlayerPoisonEnabled = config.getBoolean("Player.Poison.Enabled", PlayerPoisonEnabled);
		PlayerPoisonTime = config.getInt("Player.Poison.Time", PlayerPoisonTime);
		PlayerPoisonPower = config.getInt("Player.Poison.Power", PlayerPoisonPower);
		
		// Player Regeneration
		PlayerRegenerationEnabled = config.getBoolean("Player.Regeneration.Enabled", PlayerRegenerationEnabled);
		PlayerRegenerationTime = config.getInt("Player.Regeneration.Time", PlayerRegenerationTime);
		PlayerRegenerationPower = config.getInt("Player.Regeneration.Power", PlayerRegenerationPower);
		
		// Player Slow
		PlayerSlowEnabled = config.getBoolean("Player.Slow.Enabled", PlayerSlowEnabled);
		PlayerSlowTime = config.getInt("Player.Slow.Time", PlayerSlowTime);
		PlayerSlowPower = config.getInt("Player.Slow.Power", PlayerSlowPower);
		
		// Player Slow Digging
		PlayerMiningFatigueEnabled = config.getBoolean("Player.MiningFatigue.Enabled", PlayerMiningFatigueEnabled);
		PlayerMiningFatigueTime = config.getInt("Player.MiningFatigue.Time", PlayerMiningFatigueTime);
		PlayerMiningFatiguePower = config.getInt("Player.MiningFatigue.Power", PlayerMiningFatiguePower);
		
		// Player Speed
		PlayerSpeedEnabled = config.getBoolean("Player.Speed.Enabled", PlayerSpeedEnabled);
		PlayerSpeedTime = config.getInt("Player.Speed.Time", PlayerSpeedTime);
		PlayerSpeedPower = config.getInt("Player.Speed.Power", PlayerSpeedPower);
		
		// Player Water Breathing
		PlayerWaterBreathingEnabled = config.getBoolean("Player.WaterBreathing.Enabled", PlayerWaterBreathingEnabled);
		PlayerWaterBreathingTime = config.getInt("Player.WaterBreathing.Time", PlayerWaterBreathingTime);
		PlayerWaterBreathingPower = config.getInt("Player.WaterBreathing.Power", PlayerWaterBreathingPower);
		
		// Player Weakness
		PlayerWeaknessEnabled = config.getBoolean("Player.Weakness.Enabled", PlayerWeaknessEnabled);
		PlayerWeaknessTime = config.getInt("Player.Weakness.Time", PlayerWeaknessTime);
		PlayerWeaknessPower = config.getInt("Player.Weakness.Power", PlayerWeaknessPower);
		
		// Zombie Blindness
		ZombieBlindnessEnabled = config.getBoolean("Zombie.Blindness.Enabled", ZombieBlindnessEnabled);
		ZombieBlindnessTime = config.getInt("Zombie.Blindness.Time", ZombieBlindnessTime);
		ZombieBlindnessPower = config.getInt("Zombie.Blindness.Power", ZombieBlindnessPower);
		ZombieBlindnessDodgeChance = config.getDouble("Zombie.Blindness.DodgeChance", ZombieBlindnessDodgeChance);
		
		//Zombie Nausea
		ZombieNauseaEnabled = config.getBoolean("Zombie.Nausea.Enabled", ZombieNauseaEnabled);
		ZombieNauseaTime = config.getInt("Zombie.Nausea.Time", ZombieNauseaTime);
		ZombieNauseaPower = config.getInt("Zombie.Nausea.Power", ZombieNauseaPower);
		ZombieNauseaDodgeChance = config.getDouble("Zombie.Nausea.DodgeChance", ZombieNauseaDodgeChance);

		// Zombie Damage Resistance
		ZombieResistanceEnabled = config.getBoolean("Zombie.Resistance.Enabled", ZombieResistanceEnabled);
		ZombieResistanceTime = config.getInt("Zombie.Resistance.Time", ZombieResistanceTime);
		ZombieResistancePower = config.getInt("Zombie.Resistance.Power", ZombieResistancePower);
		ZombieResistanceDodgeChance = config.getDouble("Zombie.Resistance.DodgeChance", ZombieResistanceDodgeChance);

		// Zombie Fast Digging
		ZombieFastDiggingEnabled = config.getBoolean("Zombie.FastDigging.Enabled", ZombieFastDiggingEnabled);
		ZombieFastDiggingTime = config.getInt("Zombie.FastDigging.Time", ZombieFastDiggingTime);
		ZombieFastDiggingPower = config.getInt("Zombie.FastDigging.Power", ZombieFastDiggingPower);
		ZombieFastDiggingDodgeChance = config.getDouble("Zombie.FastDigging.DodgeChance", ZombieFastDiggingDodgeChance);

		// Zombie Fire Resistance
		ZombieFireResistanceEnabled = config.getBoolean("Zombie.FireResistance.Enabled", ZombieFireResistanceEnabled);
		ZombieFireResistanceTime = config.getInt("Zombie.FireResistance.Time", ZombieFireResistanceTime);
		ZombieFireResistancePower = config.getInt("Zombie.FireResistance.Power", ZombieFireResistancePower);
		ZombieFireResistanceDodgeChance = config.getDouble("Zombie.FireResistance.DogeChance", ZombieFireResistanceDodgeChance);

		// Zombie Harm
		ZombieHarmEnabled = config.getBoolean("Zombie.Harm.Enabled", ZombieHarmEnabled);
		ZombieHarmTime = config.getInt("Zombie.Harm.Time", ZombieHarmTime);
		ZombieHarmPower = config.getInt("Zombie.Harm.Power", ZombieHarmPower);
		ZombieHarmDodgeChance = config.getDouble("Zombie.Harm.DodgeChance", ZombieHarmDodgeChance);

		// Zombie Heal
		ZombieHealEnabled = config.getBoolean("Zombie.Heal.Enabled", ZombieHealEnabled);
		ZombieHealTime = config.getInt("Zombie.Heal.Time", ZombieHealTime);
		ZombieHealPower = config.getInt("Zombie.Heal.Power", ZombieHealPower);
		ZombieHealDodgeChance = config.getDouble("Zombie.Heal.DodgeChance", ZombieHealDodgeChance);

		// Zombie Hunger
		ZombieHungerEnabled = config.getBoolean("Zombie.Hunger.Enabled", ZombieHungerEnabled);
		ZombieHungerTime = config.getInt("Zombie.Hunger.Time", ZombieHungerTime);
		ZombieHungerPower = config.getInt("Zombie.Hunger.Power", ZombieHungerPower);
		ZombieHungerDodgeChance = config.getDouble("Zombie.Hunger.DodgeChance", ZombieHungerDodgeChance);

		// Zombie Strength
		ZombieStrengthEnabled = config.getBoolean("Zombie.Strength.Enabled", ZombieStrengthEnabled);
		ZombieStrengthTime = config.getInt("Zombie.IncraseDamage.Time", ZombieStrengthTime);
		ZombieStrengthPower = config.getInt("Zombie.Strength.Power", ZombieStrengthPower);
		ZombieStrengthDodgeChance = config.getDouble("Zombie.Strength.DodgeChance", ZombieStrengthDodgeChance);

		// Zombie Jump
		ZombieJumpEnabled = config.getBoolean("Zombie.Jump.Enabled", ZombieJumpEnabled);
		ZombieJumpTime = config.getInt("Zombie.Jump.Time", ZombieJumpTime);
		ZombieJumpPower = config.getInt("Zombie.Jump.Power", ZombieJumpPower);
		ZombieJumpDodgeChance = config.getDouble("Zombie.Jump.DodgeChance", ZombieJumpDodgeChance);

		// Zombie Poison
		ZombiePoisonEnabled = config.getBoolean("Zombie.Poison.Enabled", ZombiePoisonEnabled);
		ZombiePoisonTime = config.getInt("Zombie.Poison.Time", ZombiePoisonTime);
		ZombiePoisonPower = config.getInt("Zombie.Poison.Power", ZombiePoisonPower);
		ZombiePoisonDodgeChance = config.getDouble("Zombie.Poison.DodgeChance", ZombiePoisonDodgeChance);

		// Zombie Regeneration
		ZombieRegenerationEnabled = config.getBoolean("Zombie.Regeneration.Enabled", ZombieRegenerationEnabled);
		ZombieRegenerationTime = config.getInt("Zombie.Regeneration.Time", ZombieRegenerationTime);
		ZombieRegenerationPower = config.getInt("Zombie.Regeneration.Power", ZombieRegenerationPower);
		ZombieRegenerationDodgeChance = config.getDouble("Zombie.Regeneration.DodgeChance", ZombieRegenerationDodgeChance);

		// Zombie Slow
		ZombieSlowEnabled = config.getBoolean("Zombie.Slow.Enabled", ZombieSlowEnabled);
		ZombieSlowTime = config.getInt("Zombie.Slow.Time", ZombieSlowTime);
		ZombieSlowPower = config.getInt("Zombie.Slow.Power", ZombieSlowPower);
		ZombieSlowDodgeChance = config.getDouble("Zombie.Slow.DodgeChance", ZombieSlowDodgeChance);

		// Zombie Slow Digging
		ZombieMiningFatigueEnabled = config.getBoolean("Zombie.MiningFatigue.Enabled", ZombieMiningFatigueEnabled);
		ZombieMiningFatigueTime = config.getInt("Zombie.MiningFatigue.Time", ZombieMiningFatigueTime);
		ZombieMiningFatiguePower = config.getInt("Zombie.MiningFatigue.Power", ZombieMiningFatiguePower);
		ZombieMiningFatigueDodgeChance = config.getDouble("Zombie.MiningFatigue.DodgeChance", ZombieMiningFatigueDodgeChance);

		// Zombie Speed
		ZombieSpeedEnabled = config.getBoolean("Zombie.Speed.Enabled", ZombieSpeedEnabled);
		ZombieSpeedTime = config.getInt("Zombie.Speed.Time", ZombieSpeedTime);
		ZombieSpeedPower = config.getInt("Zombie.Speed.Power", ZombieSpeedPower);
		ZombieSpeedDodgeChance = config.getDouble("Zombie.Speed.DodgeChance", ZombieSpeedDodgeChance);

		// Zombie Water Breathing
		ZombieWaterBreathingEnabled = config.getBoolean("Zombie.WaterBreathing.Enabled", ZombieWaterBreathingEnabled);
		ZombieWaterBreathingTime = config.getInt("Zombie.WaterBreathing.Time", ZombieWaterBreathingTime);
		ZombieWaterBreathingPower = config.getInt("Zombie.WaterBreathing.Power", ZombieWaterBreathingPower);
		ZombieWaterBreathingDodgeChance = config.getDouble("Zombie.WaterBreathing.DodgeChance", ZombieWaterBreathingDodgeChance);
		
		// Zombie Weakness
		ZombieWeaknessEnabled = config.getBoolean("Zombie.Weakness.Enabled", ZombieWeaknessEnabled);
		ZombieWeaknessTime = config.getInt("Zombie.Weakness.Time", ZombieWeaknessTime);
		ZombieWeaknessPower = config.getInt("Zombie.Weakness.Power", ZombieWeaknessPower);
		ZombieWeaknessDodgeChance = config.getDouble("Zombie.Weakness.DodgeChance", ZombieWeaknessDodgeChance);
		
		// Spider Blindness
		SpiderBlindnessEnabled = config.getBoolean("Spider.Blindness.Enabled", SpiderBlindnessEnabled);
		SpiderBlindnessTime = config.getInt("Spider.Blindness.Time", SpiderBlindnessTime);
		SpiderBlindnessPower = config.getInt("Spider.Blindness.Power", SpiderBlindnessPower);

		//Spider Nausea
		SpiderNauseaEnabled = config.getBoolean("Spider.Nausea.Enabled", SpiderNauseaEnabled);
		SpiderNauseaTime = config.getInt("Spider.Nausea.Time", SpiderNauseaTime);
		SpiderNauseaPower = config.getInt("Spider.Nausea.Power", SpiderNauseaPower);

		// Spider Damage Resistance
		SpiderResistanceEnabled = config.getBoolean("Spider.Resistance.Enabled", SpiderResistanceEnabled);
		SpiderResistanceTime = config.getInt("Spider.Resistance.Time", SpiderResistanceTime);
		SpiderResistancePower = config.getInt("Spider.Resistance.Power", SpiderResistancePower);

		// Spider Fast Digging
		SpiderFastDiggingEnabled = config.getBoolean("Spider.FastDigging.Enabled", SpiderFastDiggingEnabled);
		SpiderFastDiggingTime = config.getInt("Spider.FastDigging.Time", SpiderFastDiggingTime);
		SpiderFastDiggingPower = config.getInt("Spider.FastDigging.Power", SpiderFastDiggingPower);

		// Spider Fire Resistance
		SpiderFireResistanceEnabled = config.getBoolean("Spider.FireResistance.Enabled", SpiderFireResistanceEnabled);
		SpiderFireResistanceTime = config.getInt("Spider.FireResistance.Time", SpiderFireResistanceTime);
		SpiderFireResistancePower = config.getInt("Spider.FireResistance.Power", SpiderFireResistancePower);

		// Spider Harm
		SpiderHarmEnabled = config.getBoolean("Spider.Harm.Enabled", SpiderHarmEnabled);
		SpiderHarmTime = config.getInt("Spider.Harm.Time", SpiderHarmTime);
		SpiderHarmPower = config.getInt("Spider.Harm.Powre", SpiderHarmPower);

		// Spider Heal
		SpiderHealEnabled = config.getBoolean("Spider.Heal.Enabled", SpiderHealEnabled);
		SpiderHealTime = config.getInt("Spider.Heal.Time", SpiderHealTime);
		SpiderHealPower = config.getInt("Spider.Heal.Power", SpiderHealPower);

		// Spider Hunger
		SpiderHungerEnabled = config.getBoolean("Spider.Hunger.Enabled", SpiderHungerEnabled);
		SpiderHungerTime = config.getInt("Spider.Hunger.Time", SpiderHungerTime);
		SpiderHungerPower = config.getInt("Spider.Hunger.Power", SpiderHungerPower);

		// Spider Strength
		SpiderStrengthEnabled = config.getBoolean("Spider.Strength.Enabled", SpiderStrengthEnabled);
		SpiderStrengthTime = config.getInt("Spider.IncraseDamage.Time", SpiderStrengthTime);
		SpiderStrengthPower = config.getInt("Spider.Strength.Power", SpiderStrengthPower);

		// Spider Jump
		SpiderJumpEnabled = config.getBoolean("Spider.Jump.Enabled", SpiderJumpEnabled);
		SpiderJumpTime = config.getInt("Spider.Jump.Time", SpiderJumpTime);
		SpiderJumpPower = config.getInt("Spider.Jump.Power", SpiderJumpPower);

		// Spider Poison
		SpiderPoisonEnabled = config.getBoolean("Spider.Poison.Enabled", SpiderPoisonEnabled);
		SpiderPoisonTime = config.getInt("Spider.Poison.Time", SpiderPoisonTime);
		SpiderPoisonPower = config.getInt("Spider.Poison.Power", SpiderPoisonPower);

		// Spider Regeneration
		SpiderRegenerationEnabled = config.getBoolean("Spider.Regeneration.Enabled", SpiderRegenerationEnabled);
		SpiderRegenerationTime = config.getInt("Spider.Regeneration.Time", SpiderRegenerationTime);
		SpiderRegenerationPower = config.getInt("Spider.Regeneration.Power", SpiderRegenerationPower);

		// Spider Slow
		SpiderSlowEnabled = config.getBoolean("Spider.Slow.Enabled", SpiderSlowEnabled);
		SpiderSlowTime = config.getInt("Spider.Slow.Time", SpiderSlowTime);
		SpiderSlowPower = config.getInt("Spider.Slow.Power", SpiderSlowPower);

		// Spider Slow Digging
		SpiderMiningFatigueEnabled = config.getBoolean("Spider.MiningFatigue.Enabled", SpiderMiningFatigueEnabled);
		SpiderMiningFatigueTime = config.getInt("Spider.MiningFatigue.Time", SpiderMiningFatigueTime);
		SpiderMiningFatiguePower = config.getInt("Spider.MiningFatigue.Power", SpiderMiningFatiguePower);

		// Spider Speed
		SpiderSpeedEnabled = config.getBoolean("Spider.Speed.Enabled", SpiderSpeedEnabled);
		SpiderSpeedTime = config.getInt("Spider.Speed.Time", SpiderSpeedTime);
		SpiderSpeedPower = config.getInt("Spider.Speed.Power", SpiderSpeedPower);

		// Spider Water Breathing
		SpiderWaterBreathingEnabled = config.getBoolean("Spider.WaterBreathing.Enabled", SpiderWaterBreathingEnabled);
		SpiderWaterBreathingTime = config.getInt("Spider.WaterBreathing.Time", SpiderWaterBreathingTime);
		SpiderWaterBreathingPower = config.getInt("Spider.WaterBreathing.Power", SpiderWaterBreathingPower);

		// Spider Weakness
		SpiderWeaknessEnabled = config.getBoolean("Spider.Weakness.Enabled", SpiderWeaknessEnabled);
		SpiderWeaknessTime = config.getInt("Spider.Weakness.Time", SpiderWeaknessTime);
		SpiderWeaknessPower = config.getInt("Spider.Weakness.Power", SpiderWeaknessPower);
		
		// Creeper Blindness
		CreeperBlindnessEnabled = config.getBoolean("Creeper.Blindness.Enabled", CreeperBlindnessEnabled);
		CreeperBlindnessTime = config.getInt("Creeper.Blindness.Time", CreeperBlindnessTime);
		CreeperBlindnessPower = config.getInt("Creeper.Blindness.Power", CreeperBlindnessPower);

		//Creeper Nausea
		CreeperNauseaEnabled = config.getBoolean("Creeper.Nausea.Enabled", CreeperNauseaEnabled);
		CreeperNauseaTime = config.getInt("Creeper.Nausea.Time", CreeperNauseaTime);
		CreeperNauseaPower = config.getInt("Creeper.Nausea.Power", CreeperNauseaPower);

		// Creeper Damage Resistance
		CreeperResistanceEnabled = config.getBoolean("Creeper.Resistance.Enabled", CreeperResistanceEnabled);
		CreeperResistanceTime = config.getInt("Creeper.Resistance.Time", CreeperResistanceTime);
		CreeperResistancePower = config.getInt("Creeper.Resistance.Power", CreeperResistancePower);

		// Creeper Fast Digging
		CreeperFastDiggingEnabled = config.getBoolean("Creeper.FastDigging.Enabled", CreeperFastDiggingEnabled);
		CreeperFastDiggingTime = config.getInt("Creeper.FastDigging.Time", CreeperFastDiggingTime);
		CreeperFastDiggingPower = config.getInt("Creeper.FastDigging.Power", CreeperFastDiggingPower);

		// Creeper Fire Resistance
		CreeperFireResistanceEnabled = config.getBoolean("Creeper.FireResistance.Enabled", CreeperFireResistanceEnabled);
		CreeperFireResistanceTime = config.getInt("Creeper.FireResistance.Time", CreeperFireResistanceTime);
		CreeperFireResistancePower = config.getInt("Creeper.FireResistance.Power", CreeperFireResistancePower);

		// Creeper Harm
		CreeperHarmEnabled = config.getBoolean("Creeper.Harm.Enabled", CreeperHarmEnabled);
		CreeperHarmTime = config.getInt("Creeper.Harm.Time", CreeperHarmTime);
		CreeperHarmPower = config.getInt("Creeper.Harm.Powre", CreeperHarmPower);

		// Creeper Heal
		CreeperHealEnabled = config.getBoolean("Creeper.Heal.Enabled", CreeperHealEnabled);
		CreeperHealTime = config.getInt("Creeper.Heal.Time", CreeperHealTime);
		CreeperHealPower = config.getInt("Creeper.Heal.Power", CreeperHealPower);

		// Creeper Hunger
		CreeperHungerEnabled = config.getBoolean("Creeper.Hunger.Enabled", CreeperHungerEnabled);
		CreeperHungerTime = config.getInt("Creeper.Hunger.Time", CreeperHungerTime);
		CreeperHungerPower = config.getInt("Creeper.Hunger.Power", CreeperHungerPower);

		// Creeper Strength
		CreeperStrengthEnabled = config.getBoolean("Creeper.Strength.Enabled", CreeperStrengthEnabled);
		CreeperStrengthTime = config.getInt("Creeper.IncraseDamage.Time", CreeperStrengthTime);
		CreeperStrengthPower = config.getInt("Creeper.Strength.Power", CreeperStrengthPower);

		// Creeper Jump
		CreeperJumpEnabled = config.getBoolean("Creeper.Jump.Enabled", CreeperJumpEnabled);
		CreeperJumpTime = config.getInt("Creeper.Jump.Time", CreeperJumpTime);
		CreeperJumpPower = config.getInt("Creeper.Jump.Power", CreeperJumpPower);

		// Creeper Poison
		CreeperPoisonEnabled = config.getBoolean("Creeper.Poison.Enabled", CreeperPoisonEnabled);
		CreeperPoisonTime = config.getInt("Creeper.Poison.Time", CreeperPoisonTime);
		CreeperPoisonPower = config.getInt("Creeper.Poison.Power", CreeperPoisonPower);

		// Creeper Regeneration
		CreeperRegenerationEnabled = config.getBoolean("Creeper.Regeneration.Enabled", CreeperRegenerationEnabled);
		CreeperRegenerationTime = config.getInt("Creeper.Regeneration.Time", CreeperRegenerationTime);
		CreeperRegenerationPower = config.getInt("Creeper.Regeneration.Power", CreeperRegenerationPower);

		// Creeper Slow
		CreeperSlowEnabled = config.getBoolean("Creeper.Slow.Enabled", CreeperSlowEnabled);
		CreeperSlowTime = config.getInt("Creeper.Slow.Time", CreeperSlowTime);
		CreeperSlowPower = config.getInt("Creeper.Slow.Power", CreeperSlowPower);

		// Creeper Slow Digging
		CreeperMiningFatigueEnabled = config.getBoolean("Creeper.MiningFatigue.Enabled", CreeperMiningFatigueEnabled);
		CreeperMiningFatigueTime = config.getInt("Creeper.MiningFatigue.Time", CreeperMiningFatigueTime);
		CreeperMiningFatiguePower = config.getInt("Creeper.MiningFatigue.Power", CreeperMiningFatiguePower);

		// Creeper Speed
		CreeperSpeedEnabled = config.getBoolean("Creeper.Speed.Enabled", CreeperSpeedEnabled);
		CreeperSpeedTime = config.getInt("Creeper.Speed.Time", CreeperSpeedTime);
		CreeperSpeedPower = config.getInt("Creeper.Speed.Power", CreeperSpeedPower);

		// Creeper Water Breathing
		CreeperWaterBreathingEnabled = config.getBoolean("Creeper.WaterBreathing.Enabled", CreeperWaterBreathingEnabled);
		CreeperWaterBreathingTime = config.getInt("Creeper.WaterBreathing.Time", CreeperWaterBreathingTime);
		CreeperWaterBreathingPower = config.getInt("Creeper.WaterBreathing.Power", CreeperWaterBreathingPower);

		// Creeper Weakness
		CreeperWeaknessEnabled = config.getBoolean("Creeper.Weakness.Enabled", CreeperWeaknessEnabled);
		CreeperWeaknessTime = config.getInt("Creeper.Weakness.Time", CreeperWeaknessTime);
		CreeperWeaknessPower = config.getInt("Creeper.Weakness.Power", CreeperWeaknessPower);
		
		// Enderman Blindness
		EndermanBlindnessEnabled = config.getBoolean("Enderman.Blindness.Enabled", EndermanBlindnessEnabled);
		EndermanBlindnessTime = config.getInt("Enderman.Blindness.Time", EndermanBlindnessTime);
		EndermanBlindnessPower = config.getInt("Enderman.Blindness.Power", EndermanBlindnessPower);

		//Enderman Nausea
		EndermanNauseaEnabled = config.getBoolean("Enderman.Nausea.Enabled", EndermanNauseaEnabled);
		EndermanNauseaTime = config.getInt("Enderman.Nausea.Time", EndermanNauseaTime);
		EndermanNauseaPower = config.getInt("Enderman.Nausea.Power", EndermanNauseaPower);

		// Enderman Damage Resistance
		EndermanResistanceEnabled = config.getBoolean("Enderman.Resistance.Enabled", EndermanResistanceEnabled);
		EndermanResistanceTime = config.getInt("Enderman.Resistance.Time", EndermanResistanceTime);
		EndermanResistancePower = config.getInt("Enderman.Resistance.Power", EndermanResistancePower);

		// Enderman Fast Digging
		EndermanFastDiggingEnabled = config.getBoolean("Enderman.FastDigging.Enabled", EndermanFastDiggingEnabled);
		EndermanFastDiggingTime = config.getInt("Enderman.FastDigging.Time", EndermanFastDiggingTime);
		EndermanFastDiggingPower = config.getInt("Enderman.FastDigging.Power", EndermanFastDiggingPower);

		// Enderman Fire Resistance
		EndermanFireResistanceEnabled = config.getBoolean("Enderman.FireResistance.Enabled", EndermanFireResistanceEnabled);
		EndermanFireResistanceTime = config.getInt("Enderman.FireResistance.Time", EndermanFireResistanceTime);
		EndermanFireResistancePower = config.getInt("Enderman.FireResistance.Power", EndermanFireResistancePower);

		// Enderman Harm
		EndermanHarmEnabled = config.getBoolean("Enderman.Harm.Enabled", EndermanHarmEnabled);
		EndermanHarmTime = config.getInt("Enderman.Harm.Time", EndermanHarmTime);
		EndermanHarmPower = config.getInt("Enderman.Harm.Powre", EndermanHarmPower);

		// Enderman Heal
		EndermanHealEnabled = config.getBoolean("Enderman.Heal.Enabled", EndermanHealEnabled);
		EndermanHealTime = config.getInt("Enderman.Heal.Time", EndermanHealTime);
		EndermanHealPower = config.getInt("Enderman.Heal.Power", EndermanHealPower);

		// Enderman Hunger
		EndermanHungerEnabled = config.getBoolean("Enderman.Hunger.Enabled", EndermanHungerEnabled);
		EndermanHungerTime = config.getInt("Enderman.Hunger.Time", EndermanHungerTime);
		EndermanHungerPower = config.getInt("Enderman.Hunger.Power", EndermanHungerPower);

		// Enderman Strength
		EndermanStrengthEnabled = config.getBoolean("Enderman.Strength.Enabled", EndermanStrengthEnabled);
		EndermanStrengthTime = config.getInt("Enderman.IncraseDamage.Time", EndermanStrengthTime);
		EndermanStrengthPower = config.getInt("Enderman.Strength.Power", EndermanStrengthPower);

		// Enderman Jump
		EndermanJumpEnabled = config.getBoolean("Enderman.Jump.Enabled", EndermanJumpEnabled);
		EndermanJumpTime = config.getInt("Enderman.Jump.Time", EndermanJumpTime);
		EndermanJumpPower = config.getInt("Enderman.Jump.Power", EndermanJumpPower);

		// Enderman Poison
		EndermanPoisonEnabled = config.getBoolean("Enderman.Poison.Enabled", EndermanPoisonEnabled);
		EndermanPoisonTime = config.getInt("Enderman.Poison.Time", EndermanPoisonTime);
		EndermanPoisonPower = config.getInt("Enderman.Poison.Power", EndermanPoisonPower);

		// Enderman Regeneration
		EndermanRegenerationEnabled = config.getBoolean("Enderman.Regeneration.Enabled", EndermanRegenerationEnabled);
		EndermanRegenerationTime = config.getInt("Enderman.Regeneration.Time", EndermanRegenerationTime);
		EndermanRegenerationPower = config.getInt("Enderman.Regeneration.Power", EndermanRegenerationPower);

		// Enderman Slow
		EndermanSlowEnabled = config.getBoolean("Enderman.Slow.Enabled", EndermanSlowEnabled);
		EndermanSlowTime = config.getInt("Enderman.Slow.Time", EndermanSlowTime);
		EndermanSlowPower = config.getInt("Enderman.Slow.Power", EndermanSlowPower);

		// Enderman Slow Digging
		EndermanMiningFatigueEnabled = config.getBoolean("Enderman.MiningFatigue.Enabled", EndermanMiningFatigueEnabled);
		EndermanMiningFatigueTime = config.getInt("Enderman.MiningFatigue.Time", EndermanMiningFatigueTime);
		EndermanMiningFatiguePower = config.getInt("Enderman.MiningFatigue.Power", EndermanMiningFatiguePower);

		// Enderman Speed
		EndermanSpeedEnabled = config.getBoolean("Enderman.Speed.Enabled", EndermanSpeedEnabled);
		EndermanSpeedTime = config.getInt("Enderman.Speed.Time", EndermanSpeedTime);
		EndermanSpeedPower = config.getInt("Enderman.Speed.Power", EndermanSpeedPower);

		// Enderman Water Breathing
		EndermanWaterBreathingEnabled = config.getBoolean("Enderman.WaterBreathing.Enabled", EndermanWaterBreathingEnabled);
		EndermanWaterBreathingTime = config.getInt("Enderman.WaterBreathing.Time", EndermanWaterBreathingTime);
		EndermanWaterBreathingPower = config.getInt("Enderman.WaterBreathing.Power", EndermanWaterBreathingPower);

		// Enderman Weakness
		EndermanWeaknessEnabled = config.getBoolean("Enderman.Weakness.Enabled", EndermanWeaknessEnabled);
		EndermanWeaknessTime = config.getInt("Enderman.Weakness.Time", EndermanWeaknessTime);
		EndermanWeaknessPower = config.getInt("Enderman.Weakness.Power", EndermanWeaknessPower);
		
		// Slime Blindness
		SlimeBlindnessEnabled = config.getBoolean("Slime.Blindness.Enabled", SlimeBlindnessEnabled);
		SlimeBlindnessTime = config.getInt("Slime.Blindness.Time", SlimeBlindnessTime);
		SlimeBlindnessPower = config.getInt("Slime.Blindness.Power", SlimeBlindnessPower);

		//Slime Nausea
		SlimeNauseaEnabled = config.getBoolean("Slime.Nausea.Enabled", SlimeNauseaEnabled);
		SlimeNauseaTime = config.getInt("Slime.Nausea.Time", SlimeNauseaTime);
		SlimeNauseaPower = config.getInt("Slime.Nausea.Power", SlimeNauseaPower);

		// Slime Damage Resistance
		SlimeResistanceEnabled = config.getBoolean("Slime.Resistance.Enabled", SlimeResistanceEnabled);
		SlimeResistanceTime = config.getInt("Slime.Resistance.Time", SlimeResistanceTime);
		SlimeResistancePower = config.getInt("Slime.Resistance.Power", SlimeResistancePower);

		// Slime Fast Digging
		SlimeFastDiggingEnabled = config.getBoolean("Slime.FastDigging.Enabled", SlimeFastDiggingEnabled);
		SlimeFastDiggingTime = config.getInt("Slime.FastDigging.Time", SlimeFastDiggingTime);
		SlimeFastDiggingPower = config.getInt("Slime.FastDigging.Power", SlimeFastDiggingPower);

		// Slime Fire Resistance
		SlimeFireResistanceEnabled = config.getBoolean("Slime.FireResistance.Enabled", SlimeFireResistanceEnabled);
		SlimeFireResistanceTime = config.getInt("Slime.FireResistance.Time", SlimeFireResistanceTime);
		SlimeFireResistancePower = config.getInt("Slime.FireResistance.Power", SlimeFireResistancePower);

		// Slime Harm
		SlimeHarmEnabled = config.getBoolean("Slime.Harm.Enabled", SlimeHarmEnabled);
		SlimeHarmTime = config.getInt("Slime.Harm.Time", SlimeHarmTime);
		SlimeHarmPower = config.getInt("Slime.Harm.Powre", SlimeHarmPower);

		// Slime Heal
		SlimeHealEnabled = config.getBoolean("Slime.Heal.Enabled", SlimeHealEnabled);
		SlimeHealTime = config.getInt("Slime.Heal.Time", SlimeHealTime);
		SlimeHealPower = config.getInt("Slime.Heal.Power", SlimeHealPower);

		// Slime Hunger
		SlimeHungerEnabled = config.getBoolean("Slime.Hunger.Enabled", SlimeHungerEnabled);
		SlimeHungerTime = config.getInt("Slime.Hunger.Time", SlimeHungerTime);
		SlimeHungerPower = config.getInt("Slime.Hunger.Power", SlimeHungerPower);

		// Slime Strength
		SlimeStrengthEnabled = config.getBoolean("Slime.Strength.Enabled", SlimeStrengthEnabled);
		SlimeStrengthTime = config.getInt("Slime.IncraseDamage.Time", SlimeStrengthTime);
		SlimeStrengthPower = config.getInt("Slime.Strength.Power", SlimeStrengthPower);

		// Slime Jump
		SlimeJumpEnabled = config.getBoolean("Slime.Jump.Enabled", SlimeJumpEnabled);
		SlimeJumpTime = config.getInt("Slime.Jump.Time", SlimeJumpTime);
		SlimeJumpPower = config.getInt("Slime.Jump.Power", SlimeJumpPower);

		// Slime Poison
		SlimePoisonEnabled = config.getBoolean("Slime.Poison.Enabled", SlimePoisonEnabled);
		SlimePoisonTime = config.getInt("Slime.Poison.Time", SlimePoisonTime);
		SlimePoisonPower = config.getInt("Slime.Poison.Power", SlimePoisonPower);

		// Slime Regeneration
		SlimeRegenerationEnabled = config.getBoolean("Slime.Regeneration.Enabled", SlimeRegenerationEnabled);
		SlimeRegenerationTime = config.getInt("Slime.Regeneration.Time", SlimeRegenerationTime);
		SlimeRegenerationPower = config.getInt("Slime.Regeneration.Power", SlimeRegenerationPower);

		// Slime Slow
		SlimeSlowEnabled = config.getBoolean("Slime.Slow.Enabled", SlimeSlowEnabled);
		SlimeSlowTime = config.getInt("Slime.Slow.Time", SlimeSlowTime);
		SlimeSlowPower = config.getInt("Slime.Slow.Power", SlimeSlowPower);

		// Slime Slow Digging
		SlimeMiningFatigueEnabled = config.getBoolean("Slime.MiningFatigue.Enabled", SlimeMiningFatigueEnabled);
		SlimeMiningFatigueTime = config.getInt("Slime.MiningFatigue.Time", SlimeMiningFatigueTime);
		SlimeMiningFatiguePower = config.getInt("Slime.MiningFatigue.Power", SlimeMiningFatiguePower);

		// Slime Speed
		SlimeSpeedEnabled = config.getBoolean("Slime.Speed.Enabled", SlimeSpeedEnabled);
		SlimeSpeedTime = config.getInt("Slime.Speed.Time", SlimeSpeedTime);
		SlimeSpeedPower = config.getInt("Slime.Speed.Power", SlimeSpeedPower);

		// Slime Water Breathing
		SlimeWaterBreathingEnabled = config.getBoolean("Slime.WaterBreathing.Enabled", SlimeWaterBreathingEnabled);
		SlimeWaterBreathingTime = config.getInt("Slime.WaterBreathing.Time", SlimeWaterBreathingTime);
		SlimeWaterBreathingPower = config.getInt("Slime.WaterBreathing.Power", SlimeWaterBreathingPower);

		// Slime Weakness
		SlimeWeaknessEnabled = config.getBoolean("Slime.Weakness.Enabled", SlimeWeaknessEnabled);
		SlimeWeaknessTime = config.getInt("Slime.Weakness.Time", SlimeWeaknessTime);
		SlimeWeaknessPower = config.getInt("Slime.Weakness.Power", SlimeWeaknessPower);
		
		// Giant Blindness
		GiantBlindnessEnabled = config.getBoolean("Giant.Blindness.Enabled", GiantBlindnessEnabled);
		GiantBlindnessTime = config.getInt("Giant.Blindness.Time", GiantBlindnessTime);
		GiantBlindnessPower = config.getInt("Giant.Blindness.Power", GiantBlindnessPower);

		//Giant Nausea
		GiantNauseaEnabled = config.getBoolean("Giant.Nausea.Enabled", GiantNauseaEnabled);
		GiantNauseaTime = config.getInt("Giant.Nausea.Time", GiantNauseaTime);
		GiantNauseaPower = config.getInt("Giant.Nausea.Power", GiantNauseaPower);

		// Giant Damage Resistance
		GiantResistanceEnabled = config.getBoolean("Giant.Resistance.Enabled", GiantResistanceEnabled);
		GiantResistanceTime = config.getInt("Giant.Resistance.Time", GiantResistanceTime);
		GiantResistancePower = config.getInt("Giant.Resistance.Power", GiantResistancePower);

		// Giant Fast Digging
		GiantFastDiggingEnabled = config.getBoolean("Giant.FastDigging.Enabled", GiantFastDiggingEnabled);
		GiantFastDiggingTime = config.getInt("Giant.FastDigging.Time", GiantFastDiggingTime);
		GiantFastDiggingPower = config.getInt("Giant.FastDigging.Power", GiantFastDiggingPower);

		// Giant Fire Resistance
		GiantFireResistanceEnabled = config.getBoolean("Giant.FireResistance.Enabled", GiantFireResistanceEnabled);
		GiantFireResistanceTime = config.getInt("Giant.FireResistance.Time", GiantFireResistanceTime);
		GiantFireResistancePower = config.getInt("Giant.FireResistance.Power", GiantFireResistancePower);

		// Giant Harm
		GiantHarmEnabled = config.getBoolean("Giant.Harm.Enabled", GiantHarmEnabled);
		GiantHarmTime = config.getInt("Giant.Harm.Time", GiantHarmTime);
		GiantHarmPower = config.getInt("Giant.Harm.Powre", GiantHarmPower);

		// Giant Heal
		GiantHealEnabled = config.getBoolean("Giant.Heal.Enabled", GiantHealEnabled);
		GiantHealTime = config.getInt("Giant.Heal.Time", GiantHealTime);
		GiantHealPower = config.getInt("Giant.Heal.Power", GiantHealPower);

		// Giant Hunger
		GiantHungerEnabled = config.getBoolean("Giant.Hunger.Enabled", GiantHungerEnabled);
		GiantHungerTime = config.getInt("Giant.Hunger.Time", GiantHungerTime);
		GiantHungerPower = config.getInt("Giant.Hunger.Power", GiantHungerPower);

		// Giant Strength
		GiantStrengthEnabled = config.getBoolean("Giant.Strength.Enabled", GiantStrengthEnabled);
		GiantStrengthTime = config.getInt("Giant.IncraseDamage.Time", GiantStrengthTime);
		GiantStrengthPower = config.getInt("Giant.Strength.Power", GiantStrengthPower);

		// Giant Jump
		GiantJumpEnabled = config.getBoolean("Giant.Jump.Enabled", GiantJumpEnabled);
		GiantJumpTime = config.getInt("Giant.Jump.Time", GiantJumpTime);
		GiantJumpPower = config.getInt("Giant.Jump.Power", GiantJumpPower);

		// Giant Poison
		GiantPoisonEnabled = config.getBoolean("Giant.Poison.Enabled", GiantPoisonEnabled);
		GiantPoisonTime = config.getInt("Giant.Poison.Time", GiantPoisonTime);
		GiantPoisonPower = config.getInt("Giant.Poison.Power", GiantPoisonPower);

		// Giant Regeneration
		GiantRegenerationEnabled = config.getBoolean("Giant.Regeneration.Enabled", GiantRegenerationEnabled);
		GiantRegenerationTime = config.getInt("Giant.Regeneration.Time", GiantRegenerationTime);
		GiantRegenerationPower = config.getInt("Giant.Regeneration.Power", GiantRegenerationPower);

		// Giant Slow
		GiantSlowEnabled = config.getBoolean("Giant.Slow.Enabled", GiantSlowEnabled);
		GiantSlowTime = config.getInt("Giant.Slow.Time", GiantSlowTime);
		GiantSlowPower = config.getInt("Giant.Slow.Power", GiantSlowPower);

		// Giant Slow Digging
		GiantMiningFatigueEnabled = config.getBoolean("Giant.MiningFatigue.Enabled", GiantMiningFatigueEnabled);
		GiantMiningFatigueTime = config.getInt("Giant.MiningFatigue.Time", GiantMiningFatigueTime);
		GiantMiningFatiguePower = config.getInt("Giant.MiningFatigue.Power", GiantMiningFatiguePower);

		// Giant Speed
		GiantSpeedEnabled = config.getBoolean("Giant.Speed.Enabled", GiantSpeedEnabled);
		GiantSpeedTime = config.getInt("Giant.Speed.Time", GiantSpeedTime);
		GiantSpeedPower = config.getInt("Giant.Speed.Power", GiantSpeedPower);

		// Giant Water Breathing
		GiantWaterBreathingEnabled = config.getBoolean("Giant.WaterBreathing.Enabled", GiantWaterBreathingEnabled);
		GiantWaterBreathingTime = config.getInt("Giant.WaterBreathing.Time", GiantWaterBreathingTime);
		GiantWaterBreathingPower = config.getInt("Giant.WaterBreathing.Power", GiantWaterBreathingPower);

		// Giant Weakness
		GiantWeaknessEnabled = config.getBoolean("Giant.Weakness.Enabled", GiantWeaknessEnabled);
		GiantWeaknessTime = config.getInt("Giant.Weakness.Time", GiantWeaknessTime);
		GiantWeaknessPower = config.getInt("Giant.Weakness.Power", GiantWeaknessPower);
		
		// Blaze Blindness
		BlazeBlindnessEnabled = config.getBoolean("Blaze.Blindness.Enabled", BlazeBlindnessEnabled);
		BlazeBlindnessTime = config.getInt("Blaze.Blindness.Time", BlazeBlindnessTime);
		BlazeBlindnessPower = config.getInt("Blaze.Blindness.Power", BlazeBlindnessPower);

		//Blaze Nausea
		BlazeNauseaEnabled = config.getBoolean("Blaze.Nausea.Enabled", BlazeNauseaEnabled);
		BlazeNauseaTime = config.getInt("Blaze.Nausea.Time", BlazeNauseaTime);
		BlazeNauseaPower = config.getInt("Blaze.Nausea.Power", BlazeNauseaPower);

		// Blaze Damage Resistance
		BlazeResistanceEnabled = config.getBoolean("Blaze.Resistance.Enabled", BlazeResistanceEnabled);
		BlazeResistanceTime = config.getInt("Blaze.Resistance.Time", BlazeResistanceTime);
		BlazeResistancePower = config.getInt("Blaze.Resistance.Power", BlazeResistancePower);

		// Blaze Fast Digging
		BlazeFastDiggingEnabled = config.getBoolean("Blaze.FastDigging.Enabled", BlazeFastDiggingEnabled);
		BlazeFastDiggingTime = config.getInt("Blaze.FastDigging.Time", BlazeFastDiggingTime);
		BlazeFastDiggingPower = config.getInt("Blaze.FastDigging.Power", BlazeFastDiggingPower);

		// Blaze Fire Resistance
		BlazeFireResistanceEnabled = config.getBoolean("Blaze.FireResistance.Enabled", BlazeFireResistanceEnabled);
		BlazeFireResistanceTime = config.getInt("Blaze.FireResistance.Time", BlazeFireResistanceTime);
		BlazeFireResistancePower = config.getInt("Blaze.FireResistance.Power", BlazeFireResistancePower);

		// Blaze Harm
		BlazeHarmEnabled = config.getBoolean("Blaze.Harm.Enabled", BlazeHarmEnabled);
		BlazeHarmTime = config.getInt("Blaze.Harm.Time", BlazeHarmTime);
		BlazeHarmPower = config.getInt("Blaze.Harm.Powre", BlazeHarmPower);

		// Blaze Heal
		BlazeHealEnabled = config.getBoolean("Blaze.Heal.Enabled", BlazeHealEnabled);
		BlazeHealTime = config.getInt("Blaze.Heal.Time", BlazeHealTime);
		BlazeHealPower = config.getInt("Blaze.Heal.Power", BlazeHealPower);

		// Blaze Hunger
		BlazeHungerEnabled = config.getBoolean("Blaze.Hunger.Enabled", BlazeHungerEnabled);
		BlazeHungerTime = config.getInt("Blaze.Hunger.Time", BlazeHungerTime);
		BlazeHungerPower = config.getInt("Blaze.Hunger.Power", BlazeHungerPower);

		// Blaze Strength
		BlazeStrengthEnabled = config.getBoolean("Blaze.Strength.Enabled", BlazeStrengthEnabled);
		BlazeStrengthTime = config.getInt("Blaze.Strength.Time", BlazeStrengthTime);
		BlazeStrengthPower = config.getInt("Blaze.Strength.Power", BlazeStrengthPower);

		// Blaze Jump
		BlazeJumpEnabled = config.getBoolean("Blaze.Jump.Enabled", BlazeJumpEnabled);
		BlazeJumpTime = config.getInt("Blaze.Jump.Time", BlazeJumpTime);
		BlazeJumpPower = config.getInt("Blaze.Jump.Power", BlazeJumpPower);

		// Blaze Poison
		BlazePoisonEnabled = config.getBoolean("Blaze.Poison.Enabled", BlazePoisonEnabled);
		BlazePoisonTime = config.getInt("Blaze.Poison.Time", BlazePoisonTime);
		BlazePoisonPower = config.getInt("Blaze.Poison.Power", BlazePoisonPower);

		// Blaze Regeneration
		BlazeRegenerationEnabled = config.getBoolean("Blaze.Regeneration.Enabled", BlazeRegenerationEnabled);
		BlazeRegenerationTime = config.getInt("Blaze.Regeneration.Time", BlazeRegenerationTime);
		BlazeRegenerationPower = config.getInt("Blaze.Regeneration.Power", BlazeRegenerationPower);

		// Blaze Slow
		BlazeSlowEnabled = config.getBoolean("Blaze.Slow.Enabled", BlazeSlowEnabled);
		BlazeSlowTime = config.getInt("Blaze.Slow.Time", BlazeSlowTime);
		BlazeSlowPower = config.getInt("Blaze.Slow.Power", BlazeSlowPower);

		// Blaze Slow Digging
		BlazeMiningFatigueEnabled = config.getBoolean("Blaze.MiningFatigue.Enabled", BlazeMiningFatigueEnabled);
		BlazeMiningFatigueTime = config.getInt("Blaze.MiningFatigue.Time", BlazeMiningFatigueTime);
		BlazeMiningFatiguePower = config.getInt("Blaze.MiningFatigue.Power", BlazeMiningFatiguePower);

		// Blaze Speed
		BlazeSpeedEnabled = config.getBoolean("Blaze.Speed.Enabled", BlazeSpeedEnabled);
		BlazeSpeedTime = config.getInt("Blaze.Speed.Time", BlazeSpeedTime);
		BlazeSpeedPower = config.getInt("Blaze.Speed.Power", BlazeSpeedPower);

		// Blaze Water Breathing
		BlazeWaterBreathingEnabled = config.getBoolean("Blaze.WaterBreathing.Enabled", BlazeWaterBreathingEnabled);
		BlazeWaterBreathingTime = config.getInt("Blaze.WaterBreathing.Time", BlazeWaterBreathingTime);
		BlazeWaterBreathingPower = config.getInt("Blaze.WaterBreathing.Power", BlazeWaterBreathingPower);

		// Blaze Weakness
		BlazeWeaknessEnabled = config.getBoolean("Blaze.Weakness.Enabled", BlazeWeaknessEnabled);
		BlazeWeaknessTime = config.getInt("Blaze.Weakness.Time", BlazeWeaknessTime);
		BlazeWeaknessPower = config.getInt("Blaze.Weakness.Power", BlazeWeaknessPower);
		
		// MagmaCube Blindness
		MagmaCubeBlindnessEnabled = config.getBoolean("MagmaCube.Blindness.Enabled", MagmaCubeBlindnessEnabled);
		MagmaCubeBlindnessTime = config.getInt("MagmaCube.Blindness.Time", MagmaCubeBlindnessTime);
		MagmaCubeBlindnessPower = config.getInt("MagmaCube.Blindness.Power", MagmaCubeBlindnessPower);

		//MagmaCube Nausea
		MagmaCubeNauseaEnabled = config.getBoolean("MagmaCube.Nausea.Enabled", MagmaCubeNauseaEnabled);
		MagmaCubeNauseaTime = config.getInt("MagmaCube.Nausea.Time", MagmaCubeNauseaTime);
		MagmaCubeNauseaPower = config.getInt("MagmaCube.Nausea.Power", MagmaCubeNauseaPower);

		// MagmaCube Damage Resistance
		MagmaCubeResistanceEnabled = config.getBoolean("MagmaCube.Resistance.Enabled", MagmaCubeResistanceEnabled);
		MagmaCubeResistanceTime = config.getInt("MagmaCube.Resistance.Time", MagmaCubeResistanceTime);
		MagmaCubeResistancePower = config.getInt("MagmaCube.Resistance.Power", MagmaCubeResistancePower);

		// MagmaCube Fast Digging
		MagmaCubeFastDiggingEnabled = config.getBoolean("MagmaCube.FastDigging.Enabled", MagmaCubeFastDiggingEnabled);
		MagmaCubeFastDiggingTime = config.getInt("MagmaCube.FastDigging.Time", MagmaCubeFastDiggingTime);
		MagmaCubeFastDiggingPower = config.getInt("MagmaCube.FastDigging.Power", MagmaCubeFastDiggingPower);

		// MagmaCube Fire Resistance
		MagmaCubeFireResistanceEnabled = config.getBoolean("MagmaCube.FireResistance.Enabled", MagmaCubeFireResistanceEnabled);
		MagmaCubeFireResistanceTime = config.getInt("MagmaCube.FireResistance.Time", MagmaCubeFireResistanceTime);
		MagmaCubeFireResistancePower = config.getInt("MagmaCube.FireResistance.Power", MagmaCubeFireResistancePower);

		// MagmaCube Harm
		MagmaCubeHarmEnabled = config.getBoolean("MagmaCube.Harm.Enabled", MagmaCubeHarmEnabled);
		MagmaCubeHarmTime = config.getInt("MagmaCube.Harm.Time", MagmaCubeHarmTime);
		MagmaCubeHarmPower = config.getInt("MagmaCube.Harm.Powre", MagmaCubeHarmPower);

		// MagmaCube Heal
		MagmaCubeHealEnabled = config.getBoolean("MagmaCube.Heal.Enabled", MagmaCubeHealEnabled);
		MagmaCubeHealTime = config.getInt("MagmaCube.Heal.Time", MagmaCubeHealTime);
		MagmaCubeHealPower = config.getInt("MagmaCube.Heal.Power", MagmaCubeHealPower);

		// MagmaCube Hunger
		MagmaCubeHungerEnabled = config.getBoolean("MagmaCube.Hunger.Enabled", MagmaCubeHungerEnabled);
		MagmaCubeHungerTime = config.getInt("MagmaCube.Hunger.Time", MagmaCubeHungerTime);
		MagmaCubeHungerPower = config.getInt("MagmaCube.Hunger.Power", MagmaCubeHungerPower);

		// MagmaCube Strength
		MagmaCubeStrengthEnabled = config.getBoolean("MagmaCube.Strength.Enabled", MagmaCubeStrengthEnabled);
		MagmaCubeStrengthTime = config.getInt("MagmaCube.Strength.Time", MagmaCubeStrengthTime);
		MagmaCubeStrengthPower = config.getInt("MagmaCube.Strength.Power", MagmaCubeStrengthPower);

		// MagmaCube Jump
		MagmaCubeJumpEnabled = config.getBoolean("MagmaCube.Jump.Enabled", MagmaCubeJumpEnabled);
		MagmaCubeJumpTime = config.getInt("MagmaCube.Jump.Time", MagmaCubeJumpTime);
		MagmaCubeJumpPower = config.getInt("MagmaCube.Jump.Power", MagmaCubeJumpPower);

		// MagmaCube Poison
		MagmaCubePoisonEnabled = config.getBoolean("MagmaCube.Poison.Enabled", MagmaCubePoisonEnabled);
		MagmaCubePoisonTime = config.getInt("MagmaCube.Poison.Time", MagmaCubePoisonTime);
		MagmaCubePoisonPower = config.getInt("MagmaCube.Poison.Power", MagmaCubePoisonPower);

		// MagmaCube Regeneration
		MagmaCubeRegenerationEnabled = config.getBoolean("MagmaCube.Regeneration.Enabled", MagmaCubeRegenerationEnabled);
		MagmaCubeRegenerationTime = config.getInt("MagmaCube.Regeneration.Time", MagmaCubeRegenerationTime);
		MagmaCubeRegenerationPower = config.getInt("MagmaCube.Regeneration.Power", MagmaCubeRegenerationPower);

		// MagmaCube Slow
		MagmaCubeSlowEnabled = config.getBoolean("MagmaCube.Slow.Enabled", MagmaCubeSlowEnabled);
		MagmaCubeSlowTime = config.getInt("MagmaCube.Slow.Time", MagmaCubeSlowTime);
		MagmaCubeSlowPower = config.getInt("MagmaCube.Slow.Power", MagmaCubeSlowPower);

		// MagmaCube Slow Digging
		MagmaCubeMiningFatigueEnabled = config.getBoolean("MagmaCube.MiningFatigue.Enabled", MagmaCubeMiningFatigueEnabled);
		MagmaCubeMiningFatigueTime = config.getInt("MagmaCube.MiningFatigue.Time", MagmaCubeMiningFatigueTime);
		MagmaCubeMiningFatiguePower = config.getInt("MagmaCube.MiningFatigue.Power", MagmaCubeMiningFatiguePower);

		// MagmaCube Speed
		MagmaCubeSpeedEnabled = config.getBoolean("MagmaCube.Speed.Enabled", MagmaCubeSpeedEnabled);
		MagmaCubeSpeedTime = config.getInt("MagmaCube.Speed.Time", MagmaCubeSpeedTime);
		MagmaCubeSpeedPower = config.getInt("MagmaCube.Speed.Power", MagmaCubeSpeedPower);

		// MagmaCube Water Breathing
		MagmaCubeWaterBreathingEnabled = config.getBoolean("MagmaCube.WaterBreathing.Enabled", MagmaCubeWaterBreathingEnabled);
		MagmaCubeWaterBreathingTime = config.getInt("MagmaCube.WaterBreathing.Time", MagmaCubeWaterBreathingTime);
		MagmaCubeWaterBreathingPower = config.getInt("MagmaCube.WaterBreathing.Power", MagmaCubeWaterBreathingPower);

		// MagmaCube Weakness
		MagmaCubeWeaknessEnabled = config.getBoolean("MagmaCube.Weakness.Enabled", MagmaCubeWeaknessEnabled);
		MagmaCubeWeaknessTime = config.getInt("MagmaCube.Weakness.Time", MagmaCubeWeaknessTime);
		MagmaCubeWeaknessPower = config.getInt("MagmaCube.Weakness.Power", MagmaCubeWeaknessPower);
		
		// CaveSpider Blindness
		CaveSpiderBlindnessEnabled = config.getBoolean("CaveSpider.Blindness.Enabled", CaveSpiderBlindnessEnabled);
		CaveSpiderBlindnessTime = config.getInt("CaveSpider.Blindness.Time", CaveSpiderBlindnessTime);
		CaveSpiderBlindnessPower = config.getInt("CaveSpider.Blindness.Power", CaveSpiderBlindnessPower);

		//CaveSpider Nausea
		CaveSpiderNauseaEnabled = config.getBoolean("CaveSpider.Nausea.Enabled", CaveSpiderNauseaEnabled);
		CaveSpiderNauseaTime = config.getInt("CaveSpider.Nausea.Time", CaveSpiderNauseaTime);
		CaveSpiderNauseaPower = config.getInt("CaveSpider.Nausea.Power", CaveSpiderNauseaPower);

		// CaveSpider Damage Resistance
		CaveSpiderResistanceEnabled = config.getBoolean("CaveSpider.Resistance.Enabled", CaveSpiderResistanceEnabled);
		CaveSpiderResistanceTime = config.getInt("CaveSpider.Resistance.Time", CaveSpiderResistanceTime);
		CaveSpiderResistancePower = config.getInt("CaveSpider.Resistance.Power", CaveSpiderResistancePower);

		// CaveSpider Fast Digging
		CaveSpiderFastDiggingEnabled = config.getBoolean("CaveSpider.FastDigging.Enabled", CaveSpiderFastDiggingEnabled);
		CaveSpiderFastDiggingTime = config.getInt("CaveSpider.FastDigging.Time", CaveSpiderFastDiggingTime);
		CaveSpiderFastDiggingPower = config.getInt("CaveSpider.FastDigging.Power", CaveSpiderFastDiggingPower);

		// CaveSpider Fire Resistance
		CaveSpiderFireResistanceEnabled = config.getBoolean("CaveSpider.FireResistance.Enabled", CaveSpiderFireResistanceEnabled);
		CaveSpiderFireResistanceTime = config.getInt("CaveSpider.FireResistance.Time", CaveSpiderFireResistanceTime);
		CaveSpiderFireResistancePower = config.getInt("CaveSpider.FireResistance.Power", CaveSpiderFireResistancePower);

		// CaveSpider Harm
		CaveSpiderHarmEnabled = config.getBoolean("CaveSpider.Harm.Enabled", CaveSpiderHarmEnabled);
		CaveSpiderHarmTime = config.getInt("CaveSpider.Harm.Time", CaveSpiderHarmTime);
		CaveSpiderHarmPower = config.getInt("CaveSpider.Harm.Powre", CaveSpiderHarmPower);

		// CaveSpider Heal
		CaveSpiderHealEnabled = config.getBoolean("CaveSpider.Heal.Enabled", CaveSpiderHealEnabled);
		CaveSpiderHealTime = config.getInt("CaveSpider.Heal.Time", CaveSpiderHealTime);
		CaveSpiderHealPower = config.getInt("CaveSpider.Heal.Power", CaveSpiderHealPower);

		// CaveSpider Hunger
		CaveSpiderHungerEnabled = config.getBoolean("CaveSpider.Hunger.Enabled", CaveSpiderHungerEnabled);
		CaveSpiderHungerTime = config.getInt("CaveSpider.Hunger.Time", CaveSpiderHungerTime);
		CaveSpiderHungerPower = config.getInt("CaveSpider.Hunger.Power", CaveSpiderHungerPower);

		// CaveSpider Strength
		CaveSpiderStrengthEnabled = config.getBoolean("CaveSpider.Strength.Enabled", CaveSpiderStrengthEnabled);
		CaveSpiderStrengthTime = config.getInt("CaveSpider.Strength.Time", CaveSpiderStrengthTime);
		CaveSpiderStrengthPower = config.getInt("CaveSpider.Strength.Power", CaveSpiderStrengthPower);

		// CaveSpider Jump
		CaveSpiderJumpEnabled = config.getBoolean("CaveSpider.Jump.Enabled", CaveSpiderJumpEnabled);
		CaveSpiderJumpTime = config.getInt("CaveSpider.Jump.Time", CaveSpiderJumpTime);
		CaveSpiderJumpPower = config.getInt("CaveSpider.Jump.Power", CaveSpiderJumpPower);

		// CaveSpider Poison
		CaveSpiderPoisonEnabled = config.getBoolean("CaveSpider.Poison.Enabled", CaveSpiderPoisonEnabled);
		CaveSpiderPoisonTime = config.getInt("CaveSpider.Poison.Time", CaveSpiderPoisonTime);
		CaveSpiderPoisonPower = config.getInt("CaveSpider.Poison.Power", CaveSpiderPoisonPower);

		// CaveSpider Regeneration
		CaveSpiderRegenerationEnabled = config.getBoolean("CaveSpider.Regeneration.Enabled", CaveSpiderRegenerationEnabled);
		CaveSpiderRegenerationTime = config.getInt("CaveSpider.Regeneration.Time", CaveSpiderRegenerationTime);
		CaveSpiderRegenerationPower = config.getInt("CaveSpider.Regeneration.Power", CaveSpiderRegenerationPower);

		// CaveSpider Slow
		CaveSpiderSlowEnabled = config.getBoolean("CaveSpider.Slow.Enabled", CaveSpiderSlowEnabled);
		CaveSpiderSlowTime = config.getInt("CaveSpider.Slow.Time", CaveSpiderSlowTime);
		CaveSpiderSlowPower = config.getInt("CaveSpider.Slow.Power", CaveSpiderSlowPower);

		// CaveSpider Slow Digging
		CaveSpiderMiningFatigueEnabled = config.getBoolean("CaveSpider.MiningFatigue.Enabled", CaveSpiderMiningFatigueEnabled);
		CaveSpiderMiningFatigueTime = config.getInt("CaveSpider.MiningFatigue.Time", CaveSpiderMiningFatigueTime);
		CaveSpiderMiningFatiguePower = config.getInt("CaveSpider.MiningFatigue.Power", CaveSpiderMiningFatiguePower);

		// CaveSpider Speed
		CaveSpiderSpeedEnabled = config.getBoolean("CaveSpider.Speed.Enabled", CaveSpiderSpeedEnabled);
		CaveSpiderSpeedTime = config.getInt("CaveSpider.Speed.Time", CaveSpiderSpeedTime);
		CaveSpiderSpeedPower = config.getInt("CaveSpider.Speed.Power", CaveSpiderSpeedPower);

		// CaveSpider Water Breathing
		CaveSpiderWaterBreathingEnabled = config.getBoolean("CaveSpider.WaterBreathing.Enabled", CaveSpiderWaterBreathingEnabled);
		CaveSpiderWaterBreathingTime = config.getInt("CaveSpider.WaterBreathing.Time", CaveSpiderWaterBreathingTime);
		CaveSpiderWaterBreathingPower = config.getInt("CaveSpider.WaterBreathing.Power", CaveSpiderWaterBreathingPower);

		// CaveSpider Weakness
		CaveSpiderWeaknessEnabled = config.getBoolean("CaveSpider.Weakness.Enabled", CaveSpiderWeaknessEnabled);
		CaveSpiderWeaknessTime = config.getInt("CaveSpider.Weakness.Time", CaveSpiderWeaknessTime);
		CaveSpiderWeaknessPower = config.getInt("CaveSpider.Weakness.Power", CaveSpiderWeaknessPower);
		
		// PigZombie Blindness
		PigZombieBlindnessEnabled = config.getBoolean("PigZombie.Blindness.Enabled", PigZombieBlindnessEnabled);
		PigZombieBlindnessTime = config.getInt("PigZombie.Blindness.Time", PigZombieBlindnessTime);
		PigZombieBlindnessPower = config.getInt("PigZombie.Blindness.Power", PigZombieBlindnessPower);

		//PigZombie Nausea
		PigZombieNauseaEnabled = config.getBoolean("PigZombie.Nausea.Enabled", PigZombieNauseaEnabled);
		PigZombieNauseaTime = config.getInt("PigZombie.Nausea.Time", PigZombieNauseaTime);
		PigZombieNauseaPower = config.getInt("PigZombie.Nausea.Power", PigZombieNauseaPower);

		// PigZombie Damage Resistance
		PigZombieResistanceEnabled = config.getBoolean("PigZombie.Resistance.Enabled", PigZombieResistanceEnabled);
		PigZombieResistanceTime = config.getInt("PigZombie.Resistance.Time", PigZombieResistanceTime);
		PigZombieResistancePower = config.getInt("PigZombie.Resistance.Power", PigZombieResistancePower);

		// PigZombie Fast Digging
		PigZombieFastDiggingEnabled = config.getBoolean("PigZombie.FastDigging.Enabled", PigZombieFastDiggingEnabled);
		PigZombieFastDiggingTime = config.getInt("PigZombie.FastDigging.Time", PigZombieFastDiggingTime);
		PigZombieFastDiggingPower = config.getInt("PigZombie.FastDigging.Power", PigZombieFastDiggingPower);

		// PigZombie Fire Resistance
		PigZombieFireResistanceEnabled = config.getBoolean("PigZombie.FireResistance.Enabled", PigZombieFireResistanceEnabled);
		PigZombieFireResistanceTime = config.getInt("PigZombie.FireResistance.Time", PigZombieFireResistanceTime);
		PigZombieFireResistancePower = config.getInt("PigZombie.FireResistance.Power", PigZombieFireResistancePower);

		// PigZombie Harm
		PigZombieHarmEnabled = config.getBoolean("PigZombie.Harm.Enabled", PigZombieHarmEnabled);
		PigZombieHarmTime = config.getInt("PigZombie.Harm.Time", PigZombieHarmTime);
		PigZombieHarmPower = config.getInt("PigZombie.Harm.Powre", PigZombieHarmPower);

		// PigZombie Heal
		PigZombieHealEnabled = config.getBoolean("PigZombie.Heal.Enabled", PigZombieHealEnabled);
		PigZombieHealTime = config.getInt("PigZombie.Heal.Time", PigZombieHealTime);
		PigZombieHealPower = config.getInt("PigZombie.Heal.Power", PigZombieHealPower);

		// PigZombie Hunger
		PigZombieHungerEnabled = config.getBoolean("PigZombie.Hunger.Enabled", PigZombieHungerEnabled);
		PigZombieHungerTime = config.getInt("PigZombie.Hunger.Time", PigZombieHungerTime);
		PigZombieHungerPower = config.getInt("PigZombie.Hunger.Power", PigZombieHungerPower);

		// PigZombie Strength
		PigZombieStrengthEnabled = config.getBoolean("PigZombie.Strength.Enabled", PigZombieStrengthEnabled);
		PigZombieStrengthTime = config.getInt("PigZombie.Strength.Time", PigZombieStrengthTime);
		PigZombieStrengthPower = config.getInt("PigZombie.Strength.Power", PigZombieStrengthPower);

		// PigZombie Jump
		PigZombieJumpEnabled = config.getBoolean("PigZombie.Jump.Enabled", PigZombieJumpEnabled);
		PigZombieJumpTime = config.getInt("PigZombie.Jump.Time", PigZombieJumpTime);
		PigZombieJumpPower = config.getInt("PigZombie.Jump.Power", PigZombieJumpPower);

		// PigZombie Poison
		PigZombiePoisonEnabled = config.getBoolean("PigZombie.Poison.Enabled", PigZombiePoisonEnabled);
		PigZombiePoisonTime = config.getInt("PigZombie.Poison.Time", PigZombiePoisonTime);
		PigZombiePoisonPower = config.getInt("PigZombie.Poison.Power", PigZombiePoisonPower);

		// PigZombie Regeneration
		PigZombieRegenerationEnabled = config.getBoolean("PigZombie.Regeneration.Enabled", PigZombieRegenerationEnabled);
		PigZombieRegenerationTime = config.getInt("PigZombie.Regeneration.Time", PigZombieRegenerationTime);
		PigZombieRegenerationPower = config.getInt("PigZombie.Regeneration.Power", PigZombieRegenerationPower);

		// PigZombie Slow
		PigZombieSlowEnabled = config.getBoolean("PigZombie.Slow.Enabled", PigZombieSlowEnabled);
		PigZombieSlowTime = config.getInt("PigZombie.Slow.Time", PigZombieSlowTime);
		PigZombieSlowPower = config.getInt("PigZombie.Slow.Power", PigZombieSlowPower);

		// PigZombie Slow Digging
		PigZombieMiningFatigueEnabled = config.getBoolean("PigZombie.MiningFatigue.Enabled", PigZombieMiningFatigueEnabled);
		PigZombieMiningFatigueTime = config.getInt("PigZombie.MiningFatigue.Time", PigZombieMiningFatigueTime);
		PigZombieMiningFatiguePower = config.getInt("PigZombie.MiningFatigue.Power", PigZombieMiningFatiguePower);

		// PigZombie Speed
		PigZombieSpeedEnabled = config.getBoolean("PigZombie.Speed.Enabled", PigZombieSpeedEnabled);
		PigZombieSpeedTime = config.getInt("PigZombie.Speed.Time", PigZombieSpeedTime);
		PigZombieSpeedPower = config.getInt("PigZombie.Speed.Power", PigZombieSpeedPower);

		// PigZombie Water Breathing
		PigZombieWaterBreathingEnabled = config.getBoolean("PigZombie.WaterBreathing.Enabled", PigZombieWaterBreathingEnabled);
		PigZombieWaterBreathingTime = config.getInt("PigZombie.WaterBreathing.Time", PigZombieWaterBreathingTime);
		PigZombieWaterBreathingPower = config.getInt("PigZombie.WaterBreathing.Power", PigZombieWaterBreathingPower);

		// PigZombie Weakness
		PigZombieWeaknessEnabled = config.getBoolean("PigZombie.Weakness.Enabled", PigZombieWeaknessEnabled);
		PigZombieWeaknessTime = config.getInt("PigZombie.Weakness.Time", PigZombieWeaknessTime);
		PigZombieWeaknessPower = config.getInt("PigZombie.Weakness.Power", PigZombieWeaknessPower);
		
		// Silverfish Blindness
		SilverfishBlindnessEnabled = config.getBoolean("Silverfish.Blindness.Enabled", SilverfishBlindnessEnabled);
		SilverfishBlindnessTime = config.getInt("Silverfish.Blindness.Time", SilverfishBlindnessTime);
		SilverfishBlindnessPower = config.getInt("Silverfish.Blindness.Power", SilverfishBlindnessPower);

		//Silverfish Nausea
		SilverfishNauseaEnabled = config.getBoolean("Silverfish.Nausea.Enabled", SilverfishNauseaEnabled);
		SilverfishNauseaTime = config.getInt("Silverfish.Nausea.Time", SilverfishNauseaTime);
		SilverfishNauseaPower = config.getInt("Silverfish.Nausea.Power", SilverfishNauseaPower);

		// Silverfish Damage Resistance
		SilverfishResistanceEnabled = config.getBoolean("Silverfish.Resistance.Enabled", SilverfishResistanceEnabled);
		SilverfishResistanceTime = config.getInt("Silverfish.Resistance.Time", SilverfishResistanceTime);
		SilverfishResistancePower = config.getInt("Silverfish.Resistance.Power", SilverfishResistancePower);

		// Silverfish Fast Digging
		SilverfishFastDiggingEnabled = config.getBoolean("Silverfish.FastDigging.Enabled", SilverfishFastDiggingEnabled);
		SilverfishFastDiggingTime = config.getInt("Silverfish.FastDigging.Time", SilverfishFastDiggingTime);
		SilverfishFastDiggingPower = config.getInt("Silverfish.FastDigging.Power", SilverfishFastDiggingPower);

		// Silverfish Fire Resistance
		SilverfishFireResistanceEnabled = config.getBoolean("Silverfish.FireResistance.Enabled", SilverfishFireResistanceEnabled);
		SilverfishFireResistanceTime = config.getInt("Silverfish.FireResistance.Time", SilverfishFireResistanceTime);
		SilverfishFireResistancePower = config.getInt("Silverfish.FireResistance.Power", SilverfishFireResistancePower);

		// Silverfish Harm
		SilverfishHarmEnabled = config.getBoolean("Silverfish.Harm.Enabled", SilverfishHarmEnabled);
		SilverfishHarmTime = config.getInt("Silverfish.Harm.Time", SilverfishHarmTime);
		SilverfishHarmPower = config.getInt("Silverfish.Harm.Powre", SilverfishHarmPower);

		// Silverfish Heal
		SilverfishHealEnabled = config.getBoolean("Silverfish.Heal.Enabled", SilverfishHealEnabled);
		SilverfishHealTime = config.getInt("Silverfish.Heal.Time", SilverfishHealTime);
		SilverfishHealPower = config.getInt("Silverfish.Heal.Power", SilverfishHealPower);

		// Silverfish Hunger
		SilverfishHungerEnabled = config.getBoolean("Silverfish.Hunger.Enabled", SilverfishHungerEnabled);
		SilverfishHungerTime = config.getInt("Silverfish.Hunger.Time", SilverfishHungerTime);
		SilverfishHungerPower = config.getInt("Silverfish.Hunger.Power", SilverfishHungerPower);

		// Silverfish Strength
		SilverfishStrengthEnabled = config.getBoolean("Silverfish.Strength.Enabled", SilverfishStrengthEnabled);
		SilverfishStrengthTime = config.getInt("Silverfish.Strength.Time", SilverfishStrengthTime);
		SilverfishStrengthPower = config.getInt("Silverfish.Strength.Power", SilverfishStrengthPower);

		// Silverfish Jump
		SilverfishJumpEnabled = config.getBoolean("Silverfish.Jump.Enabled", SilverfishJumpEnabled);
		SilverfishJumpTime = config.getInt("Silverfish.Jump.Time", SilverfishJumpTime);
		SilverfishJumpPower = config.getInt("Silverfish.Jump.Power", SilverfishJumpPower);

		// Silverfish Poison
		SilverfishPoisonEnabled = config.getBoolean("Silverfish.Poison.Enabled", SilverfishPoisonEnabled);
		SilverfishPoisonTime = config.getInt("Silverfish.Poison.Time", SilverfishPoisonTime);
		SilverfishPoisonPower = config.getInt("Silverfish.Poison.Power", SilverfishPoisonPower);

		// Silverfish Regeneration
		SilverfishRegenerationEnabled = config.getBoolean("Silverfish.Regeneration.Enabled", SilverfishRegenerationEnabled);
		SilverfishRegenerationTime = config.getInt("Silverfish.Regeneration.Time", SilverfishRegenerationTime);
		SilverfishRegenerationPower = config.getInt("Silverfish.Regeneration.Power", SilverfishRegenerationPower);

		// Silverfish Slow
		SilverfishSlowEnabled = config.getBoolean("Silverfish.Slow.Enabled", SilverfishSlowEnabled);
		SilverfishSlowTime = config.getInt("Silverfish.Slow.Time", SilverfishSlowTime);
		SilverfishSlowPower = config.getInt("Silverfish.Slow.Power", SilverfishSlowPower);

		// Silverfish Slow Digging
		SilverfishMiningFatigueEnabled = config.getBoolean("Silverfish.MiningFatigue.Enabled", SilverfishMiningFatigueEnabled);
		SilverfishMiningFatigueTime = config.getInt("Silverfish.MiningFatigue.Time", SilverfishMiningFatigueTime);
		SilverfishMiningFatiguePower = config.getInt("Silverfish.MiningFatigue.Power", SilverfishMiningFatiguePower);

		// Silverfish Speed
		SilverfishSpeedEnabled = config.getBoolean("Silverfish.Speed.Enabled", SilverfishSpeedEnabled);
		SilverfishSpeedTime = config.getInt("Silverfish.Speed.Time", SilverfishSpeedTime);
		SilverfishSpeedPower = config.getInt("Silverfish.Speed.Power", SilverfishSpeedPower);

		// Silverfish Water Breathing
		SilverfishWaterBreathingEnabled = config.getBoolean("Silverfish.WaterBreathing.Enabled", SilverfishWaterBreathingEnabled);
		SilverfishWaterBreathingTime = config.getInt("Silverfish.WaterBreathing.Time", SilverfishWaterBreathingTime);
		SilverfishWaterBreathingPower = config.getInt("Silverfish.WaterBreathing.Power", SilverfishWaterBreathingPower);

		// Silverfish Weakness
		SilverfishWeaknessEnabled = config.getBoolean("Silverfish.Weakness.Enabled", SilverfishWeaknessEnabled);
		SilverfishWeaknessTime = config.getInt("Silverfish.Weakness.Time", SilverfishWeaknessTime);
		SilverfishWeaknessPower = config.getInt("Silverfish.Weakness.Power", SilverfishWeaknessPower);
	
	// Set Defaults
		if (!config.contains("Worlds")) {
			final String[] def_worlds = {"world", "world_nether", "world_the_end"};
			config.set("Worlds", def_worlds);
		}
		// Blaze
		config.set("Blaze.Blindness.Enabled", BlazeBlindnessEnabled);
		config.set("Blaze.Blindness.Power", BlazeBlindnessPower);
		config.set("Blaze.Blindness.Time", BlazeBlindnessTime);
		config.set("Blaze.FastDigging.Enabled", BlazeFastDiggingEnabled);
		config.set("Blaze.FastDigging.Power", BlazeFastDiggingPower);
		config.set("Blaze.FastDigging.Time", BlazeFastDiggingTime);
		config.set("Blaze.Harm.Enabled", BlazeHarmEnabled);
		config.set("Blaze.Harm.Power", BlazeHarmPower);
		config.set("Blaze.Harm.Time", BlazeHarmTime);
		config.set("Blaze.Heal.Enabled", BlazeHealEnabled);
		config.set("Blaze.Heal.Power", BlazeHealPower);
		config.set("Blaze.Heal.Time", BlazeHealTime);
		config.set("Blaze.Jump.Enabled", BlazeJumpEnabled);
		config.set("Blaze.Jump.Power", BlazeJumpPower);
		config.set("Blaze.Jump.Time", BlazeJumpTime);
		config.set("Blaze.MiningFatigue.Enabled", BlazeMiningFatigueEnabled);
		config.set("Blaze.MiningFatigue.Power", BlazeMiningFatiguePower);
		config.set("Blaze.MiningFatigue.Time", BlazeMiningFatigueTime);
		config.set("Blaze.Nausea.Enabled", BlazeNauseaEnabled);
		config.set("Blaze.Nausea.Power", BlazeNauseaPower);
		config.set("Blaze.Nausea.Time", BlazeNauseaTime);
		config.set("Blaze.Resistance.Enabled", BlazeResistanceEnabled);
		config.set("Blaze.Resistance.Power", BlazeResistancePower);
		config.set("Blaze.Resistance.Time", BlazeResistanceTime);
		config.set("Blaze.Slow.Enabled", BlazeSlowEnabled);
		config.set("Blaze.Slow.Power", BlazeSlowPower);
		config.set("Blaze.Slow.Time", BlazeSlowTime);
		config.set("Blaze.Speed.Enabled", BlazeSpeedEnabled);
		config.set("Blaze.Speed.Power", BlazeSpeedPower);
		config.set("Blaze.Speed.Time", BlazeSpeedTime);
		config.set("Blaze.Strength.Enabled", BlazeStrengthEnabled);
		config.set("Blaze.Strength.Power", BlazeStrengthPower);
		config.set("Blaze.Strength.Time", BlazeStrengthTime);
		config.set("Blaze.WaterBreathing.Enabled", BlazeWaterBreathingEnabled);
		config.set("Blaze.WaterBreathing.Power", BlazeWaterBreathingPower);
		config.set("Blaze.WaterBreathing.Time", BlazeWaterBreathingTime);
		config.set("Blaze.Weakness.Enabled", BlazeWeaknessEnabled);
		config.set("Blaze.Weakness.Power", BlazeWeaknessPower);
		config.set("Blaze.Weakness.Time", BlazeWeaknessTime);
		// Cave Spiders
		config.set("CaveSpider.Blindness.Enabled", CaveSpiderBlindnessEnabled);
		config.set("CaveSpider.Blindness.Power", CaveSpiderBlindnessPower);
		config.set("CaveSpider.Blindness.Time", CaveSpiderBlindnessTime);
		config.set("CaveSpider.FastDigging.Enabled", CaveSpiderFastDiggingEnabled);
		config.set("CaveSpider.FastDigging.Power", CaveSpiderFastDiggingPower);
		config.set("CaveSpider.FastDigging.Time", CaveSpiderFastDiggingTime);
		config.set("CaveSpider.Harm.Enabled", CaveSpiderHarmEnabled);
		config.set("CaveSpider.Harm.Power", CaveSpiderHarmPower);
		config.set("CaveSpider.Harm.Time", CaveSpiderHarmTime);
		config.set("CaveSpider.Heal.Enabled", CaveSpiderHealEnabled);
		config.set("CaveSpider.Heal.Power", CaveSpiderHealPower);
		config.set("CaveSpider.Heal.Time", CaveSpiderHealTime);
		config.set("CaveSpider.Jump.Enabled", CaveSpiderJumpEnabled);
		config.set("CaveSpider.Jump.Power", CaveSpiderJumpPower);
		config.set("CaveSpider.Jump.Time", CaveSpiderJumpTime);
		config.set("CaveSpider.MiningFatigue.Enabled", CaveSpiderMiningFatigueEnabled);
		config.set("CaveSpider.MiningFatigue.Power", CaveSpiderMiningFatiguePower);
		config.set("CaveSpider.MiningFatigue.Time", CaveSpiderMiningFatigueTime);
		config.set("CaveSpider.Nausea.Enabled", CaveSpiderNauseaEnabled);
		config.set("CaveSpider.Nausea.Power", CaveSpiderNauseaPower);
		config.set("CaveSpider.Nausea.Time", CaveSpiderNauseaTime);
		config.set("CaveSpider.Resistance.Enabled", CaveSpiderResistanceEnabled);
		config.set("CaveSpider.Resistance.Power", CaveSpiderResistancePower);
		config.set("CaveSpider.Resistance.Time", CaveSpiderResistanceTime);
		config.set("CaveSpider.Slow.Enabled", CaveSpiderSlowEnabled);
		config.set("CaveSpider.Slow.Power", CaveSpiderSlowPower);
		config.set("CaveSpider.Slow.Time", CaveSpiderSlowTime);
		config.set("CaveSpider.Speed.Enabled", CaveSpiderSpeedEnabled);
		config.set("CaveSpider.Speed.Power", CaveSpiderSpeedPower);
		config.set("CaveSpider.Speed.Time", CaveSpiderSpeedTime);
		config.set("CaveSpider.Strength.Enabled", CaveSpiderStrengthEnabled);
		config.set("CaveSpider.Strength.Power", CaveSpiderStrengthPower);
		config.set("CaveSpider.Strength.Time", CaveSpiderStrengthTime);
		config.set("CaveSpider.WaterBreathing.Enabled", CaveSpiderWaterBreathingEnabled);
		config.set("CaveSpider.WaterBreathing.Power", CaveSpiderWaterBreathingPower);
		config.set("CaveSpider.WaterBreathing.Time", CaveSpiderWaterBreathingTime);
		config.set("CaveSpider.Weakness.Enabled", CaveSpiderWeaknessEnabled);
		config.set("CaveSpider.Weakness.Power", CaveSpiderWeaknessPower);
		config.set("CaveSpider.Weakness.Time", CaveSpiderWeaknessTime);
		// Creeper
		config.set("Creeper.Blindness.Enabled", CreeperBlindnessEnabled);
		config.set("Creeper.Blindness.Power", CreeperBlindnessPower);
		config.set("Creeper.Blindness.Time", CreeperBlindnessTime);
		config.set("Creeper.FastDigging.Enabled", CreeperFastDiggingEnabled);
		config.set("Creeper.FastDigging.Power", CreeperFastDiggingPower);
		config.set("Creeper.FastDigging.Time", CreeperFastDiggingTime);
		config.set("Creeper.FireResistance.Enabled", CreeperFireResistanceEnabled);
		config.set("Creeper.FireResistance.Power", CreeperFireResistancePower);
		config.set("Creeper.FireResistance.Time", CreeperFireResistanceTime);
		config.set("Creeper.Harm.Enabled", CreeperHarmEnabled);
		config.set("Creeper.Harm.Power", CreeperHarmPower);
		config.set("Creeper.Harm.Time", CreeperHarmTime);
		config.set("Creeper.Heal.Enabled", CreeperHealEnabled);
		config.set("Creeper.Heal.Power", CreeperHealPower);
		config.set("Creeper.Heal.Time", CreeperHealTime);
		config.set("Creeper.Hunger.Enabled", CreeperHungerEnabled);
		config.set("Creeper.Hunger.Power", CreeperHungerPower);
		config.set("Creeper.Hunger.Time", CreeperHungerTime);
		config.set("Creeper.Jump.Enabled", CreeperJumpEnabled);
		config.set("Creeper.Jump.Power", CreeperJumpPower);
		config.set("Creeper.Jump.Time", CreeperJumpTime);
		config.set("Creeper.MiningFatigue.Enabled", CreeperMiningFatigueEnabled);
		config.set("Creeper.MiningFatigue.Power", CreeperMiningFatiguePower);
		config.set("Creeper.MiningFatigue.Time", CreeperMiningFatigueTime);
		config.set("Creeper.Nausea.Enabled", CreeperNauseaEnabled);
		config.set("Creeper.Nausea.Power", CreeperNauseaPower);
		config.set("Creeper.Nausea.Time", CreeperNauseaTime);
		config.set("Creeper.Poison.Enabled", CreeperPoisonEnabled);
		config.set("Creeper.Poison.Power", CreeperPoisonPower);
		config.set("Creeper.Poison.Time", CreeperPoisonTime);
		config.set("Creeper.Regeneration.Enabled", CreeperRegenerationEnabled);
		config.set("Creeper.Regeneration.Power", CreeperRegenerationPower);
		config.set("Creeper.Regeneration.Time", CreeperRegenerationTime);
		config.set("Creeper.Resistance.Enabled", CreeperResistanceEnabled);
		config.set("Creeper.Resistance.Power", CreeperResistancePower);
		config.set("Creeper.Resistance.Time", CreeperResistanceTime);
		config.set("Creeper.Slow.Enabled", CreeperSlowEnabled);
		config.set("Creeper.Slow.Power", CreeperSlowPower);
		config.set("Creeper.Slow.Time", CreeperSlowTime);
		config.set("Creeper.Speed.Enabled", CreeperSpeedEnabled);
		config.set("Creeper.Speed.Power", CreeperSpeedPower);
		config.set("Creeper.Speed.Time", CreeperSpeedTime);
		config.set("Creeper.Strength.Enabled", CreeperStrengthEnabled);
		config.set("Creeper.Strength.Power", CreeperStrengthPower);
		config.set("Creeper.Strength.Time", CreeperStrengthTime);
		config.set("Creeper.WaterBreathing.Enabled", CreeperWaterBreathingEnabled);
		config.set("Creeper.WaterBreathing.Power", CreeperWaterBreathingPower);
		config.set("Creeper.WaterBreathing.Time", CreeperWaterBreathingTime);
		config.set("Creeper.Weakness.Enabled", CreeperWeaknessEnabled);
		config.set("Creeper.Weakness.Power", CreeperWeaknessPower);
		config.set("Creeper.Weakness.Time", CreeperWeaknessTime);
		// Enders
		config.set("Enderman.Blindness.Enabled", EndermanBlindnessEnabled);
		config.set("Enderman.Blindness.Power", EndermanBlindnessPower);
		config.set("Enderman.Blindness.Time", EndermanBlindnessTime);
		config.set("Enderman.FastDigging.Enabled", EndermanFastDiggingEnabled);
		config.set("Enderman.FastDigging.Power", EndermanFastDiggingPower);
		config.set("Enderman.FastDigging.Time", EndermanFastDiggingTime);
		config.set("Enderman.FireResistance.Enabled", EndermanFireResistanceEnabled);
		config.set("Enderman.FireResistance.Power", EndermanFireResistancePower);
		config.set("Enderman.FireResistance.Time", EndermanFireResistanceTime);
		config.set("Enderman.Harm.Enabled", EndermanHarmEnabled);
		config.set("Enderman.Harm.Power", EndermanHarmPower);
		config.set("Enderman.Harm.Time", EndermanHarmTime);
		config.set("Enderman.Heal.Enabled", EndermanHealEnabled);
		config.set("Enderman.Heal.Power", EndermanHealPower);
		config.set("Enderman.Heal.Time", EndermanHealTime);
		config.set("Enderman.Hunger.Enabled", EndermanHungerEnabled);
		config.set("Enderman.Hunger.Power", EndermanHungerPower);
		config.set("Enderman.Hunger.Time", EndermanHungerTime);
		config.set("Enderman.Jump.Enabled", EndermanJumpEnabled);
		config.set("Enderman.Jump.Power", EndermanJumpPower);
		config.set("Enderman.Jump.Time", EndermanJumpTime);
		config.set("Enderman.MiningFatigue.Enabled", EndermanMiningFatigueEnabled);
		config.set("Enderman.MiningFatigue.Power", EndermanMiningFatiguePower);
		config.set("Enderman.MiningFatigue.Time", EndermanMiningFatigueTime);
		config.set("Enderman.Nausea.Enabled", EndermanNauseaEnabled);
		config.set("Enderman.Nausea.Power", EndermanNauseaPower);
		config.set("Enderman.Nausea.Time", EndermanNauseaTime);
		config.set("Enderman.Poison.Enabled", EndermanPoisonEnabled);
		config.set("Enderman.Poison.Power", EndermanPoisonPower);
		config.set("Enderman.Poison.Time", EndermanPoisonTime);
		config.set("Enderman.Regeneration.Enabled", EndermanRegenerationEnabled);
		config.set("Enderman.Regeneration.Power", EndermanRegenerationPower);
		config.set("Enderman.Regeneration.Time", EndermanRegenerationTime);
		config.set("Enderman.Resistance.Enabled", EndermanResistanceEnabled);
		config.set("Enderman.Resistance.Power", EndermanResistancePower);
		config.set("Enderman.Resistance.Time", EndermanResistanceTime);
		config.set("Enderman.Slow.Enabled", EndermanSlowEnabled);
		config.set("Enderman.Slow.Power", EndermanSlowPower);
		config.set("Enderman.Slow.Time", EndermanSlowTime);
		config.set("Enderman.Speed.Enabled", EndermanSpeedEnabled);
		config.set("Enderman.Speed.Power", EndermanSpeedPower);
		config.set("Enderman.Speed.Time", EndermanSpeedTime);
		config.set("Enderman.Strength.Enabled", EndermanStrengthEnabled);
		config.set("Enderman.Strength.Power", EndermanStrengthPower);
		config.set("Enderman.Strength.Time", EndermanStrengthTime);
		config.set("Enderman.WaterBreathing.Enabled", EndermanWaterBreathingEnabled);
		config.set("Enderman.WaterBreathing.Power", EndermanWaterBreathingPower);
		config.set("Enderman.WaterBreathing.Time", EndermanWaterBreathingTime);
		config.set("Enderman.Weakness.Enabled", EndermanWeaknessEnabled);
		config.set("Enderman.Weakness.Power", EndermanWeaknessPower);
		config.set("Enderman.Weakness.Time", EndermanWeaknessTime);
		// Giant
		config.set("Giant.Blindness.Enabled", GiantBlindnessEnabled);
		config.set("Giant.Blindness.Power", GiantBlindnessPower);
		config.set("Giant.Blindness.Time", GiantBlindnessTime);
		config.set("Giant.FastDigging.Enabled", GiantFastDiggingEnabled);
		config.set("Giant.FastDigging.Power", GiantFastDiggingPower);
		config.set("Giant.FastDigging.Time", GiantFastDiggingTime);
		config.set("Giant.Harm.Enabled", GiantHarmEnabled);
		config.set("Giant.Harm.Power", GiantHarmPower);
		config.set("Giant.Harm.Time", GiantHarmTime);
		config.set("Giant.Heal.Enabled", GiantHealEnabled);
		config.set("Giant.Heal.Power", GiantHealPower);
		config.set("Giant.Heal.Time", GiantHealTime);
		config.set("Giant.Jump.Enabled", GiantJumpEnabled);
		config.set("Giant.Jump.Power", GiantJumpPower);
		config.set("Giant.Jump.Time", GiantJumpTime);
		config.set("Giant.MiningFatigue.Enabled", GiantMiningFatigueEnabled);
		config.set("Giant.MiningFatigue.Power", GiantMiningFatiguePower);
		config.set("Giant.MiningFatigue.Time", GiantMiningFatigueTime);
		config.set("Giant.Nausea.Enabled", GiantNauseaEnabled);
		config.set("Giant.Nausea.Power", GiantNauseaPower);
		config.set("Giant.Nausea.Time", GiantNauseaTime);
		config.set("Giant.Resistance.Enabled", GiantResistanceEnabled);
		config.set("Giant.Resistance.Power", GiantResistancePower);
		config.set("Giant.Resistance.Time", GiantResistanceTime);
		config.set("Giant.Slow.Enabled", GiantSlowEnabled);
		config.set("Giant.Slow.Power", GiantSlowPower);
		config.set("Giant.Slow.Time", GiantSlowTime);
		config.set("Giant.Speed.Enabled", GiantSpeedEnabled);
		config.set("Giant.Speed.Power", GiantSpeedPower);
		config.set("Giant.Speed.Time", GiantSpeedTime);
		config.set("Giant.Strength.Enabled", GiantStrengthEnabled);
		config.set("Giant.Strength.Power", GiantStrengthPower);
		config.set("Giant.Strength.Time", GiantStrengthTime);
		config.set("Giant.WaterBreathing.Enabled", GiantWaterBreathingEnabled);
		config.set("Giant.WaterBreathing.Power", GiantWaterBreathingPower);
		config.set("Giant.WaterBreathing.Time", GiantWaterBreathingTime);
		config.set("Giant.Weakness.Enabled", GiantWeaknessEnabled);
		config.set("Giant.Weakness.Power", GiantWeaknessPower);
		config.set("Giant.Weakness.Time", GiantWeaknessTime);
		// MagmaCube
		config.set("MagmaCube.Blindness.Enabled", MagmaCubeBlindnessEnabled);
		config.set("MagmaCube.Blindness.Power", MagmaCubeBlindnessPower);
		config.set("MagmaCube.Blindness.Time", MagmaCubeBlindnessTime);
		config.set("MagmaCube.FastDigging.Enabled", MagmaCubeFastDiggingEnabled);
		config.set("MagmaCube.FastDigging.Power", MagmaCubeFastDiggingPower);
		config.set("MagmaCube.FastDigging.Time", MagmaCubeFastDiggingTime);
		config.set("MagmaCube.Harm.Enabled", MagmaCubeHarmEnabled);
		config.set("MagmaCube.Harm.Power", MagmaCubeHarmPower);
		config.set("MagmaCube.Harm.Time", MagmaCubeHarmTime);
		config.set("MagmaCube.Heal.Enabled", MagmaCubeHealEnabled);
		config.set("MagmaCube.Heal.Power", MagmaCubeHealPower);
		config.set("MagmaCube.Heal.Time", MagmaCubeHealTime);
		config.set("MagmaCube.Jump.Enabled", MagmaCubeJumpEnabled);
		config.set("MagmaCube.Jump.Power", MagmaCubeJumpPower);
		config.set("MagmaCube.Jump.Time", MagmaCubeJumpTime);
		config.set("MagmaCube.MiningFatigue.Enabled", MagmaCubeMiningFatigueEnabled);
		config.set("MagmaCube.MiningFatigue.Power", MagmaCubeMiningFatiguePower);
		config.set("MagmaCube.MiningFatigue.Time", MagmaCubeMiningFatigueTime);
		config.set("MagmaCube.Nausea.Enabled", MagmaCubeNauseaEnabled);
		config.set("MagmaCube.Nausea.Power", MagmaCubeNauseaPower);
		config.set("MagmaCube.Nausea.Time", MagmaCubeNauseaTime);
		config.set("MagmaCube.Resistance.Enabled", MagmaCubeResistanceEnabled);
		config.set("MagmaCube.Resistance.Power", MagmaCubeResistancePower);
		config.set("MagmaCube.Resistance.Time", MagmaCubeResistanceTime);
		config.set("MagmaCube.Slow.Enabled", MagmaCubeSlowEnabled);
		config.set("MagmaCube.Slow.Power", MagmaCubeSlowPower);
		config.set("MagmaCube.Slow.Time", MagmaCubeSlowTime);
		config.set("MagmaCube.Speed.Enabled", MagmaCubeSpeedEnabled);
		config.set("MagmaCube.Speed.Power", MagmaCubeSpeedPower);
		config.set("MagmaCube.Speed.Time", MagmaCubeSpeedTime);
		config.set("MagmaCube.Strength.Enabled", MagmaCubeStrengthEnabled);
		config.set("MagmaCube.Strength.Power", MagmaCubeStrengthPower);
		config.set("MagmaCube.Strength.Time", MagmaCubeStrengthTime);
		config.set("MagmaCube.WaterBreathing.Enabled", MagmaCubeWaterBreathingEnabled);
		config.set("MagmaCube.WaterBreathing.Power", MagmaCubeWaterBreathingPower);
		config.set("MagmaCube.WaterBreathing.Time", MagmaCubeWaterBreathingTime);
		config.set("MagmaCube.Weakness.Enabled", MagmaCubeWeaknessEnabled);
		config.set("MagmaCube.Weakness.Power", MagmaCubeWeaknessPower);
		config.set("MagmaCube.Weakness.Time", MagmaCubeWeaknessTime);
		// Pig Zombie
		config.set("PigZombie.Blindness.Enabled", PigZombieBlindnessEnabled);
		config.set("PigZombie.Blindness.Power", PigZombieBlindnessPower);
		config.set("PigZombie.Blindness.Time", PigZombieBlindnessTime);
		config.set("PigZombie.FastDigging.Enabled", PigZombieFastDiggingEnabled);
		config.set("PigZombie.FastDigging.Power", PigZombieFastDiggingPower);
		config.set("PigZombie.FastDigging.Time", PigZombieFastDiggingTime);
		config.set("PigZombie.Harm.Enabled", PigZombieHarmEnabled);
		config.set("PigZombie.Harm.Power", PigZombieHarmPower);
		config.set("PigZombie.Harm.Time", PigZombieHarmTime);
		config.set("PigZombie.Heal.Enabled", PigZombieHealEnabled);
		config.set("PigZombie.Heal.Power", PigZombieHealPower);
		config.set("PigZombie.Heal.Time", PigZombieHealTime);
		config.set("PigZombie.Jump.Enabled", PigZombieJumpEnabled);
		config.set("PigZombie.Jump.Power", PigZombieJumpPower);
		config.set("PigZombie.Jump.Time", PigZombieJumpTime);
		config.set("PigZombie.MiningFatigue.Enabled", PigZombieMiningFatigueEnabled);
		config.set("PigZombie.MiningFatigue.Power", PigZombieMiningFatiguePower);
		config.set("PigZombie.MiningFatigue.Time", PigZombieMiningFatigueTime);
		config.set("PigZombie.Nausea.Enabled", PigZombieNauseaEnabled);
		config.set("PigZombie.Nausea.Power", PigZombieNauseaPower);
		config.set("PigZombie.Nausea.Time", PigZombieNauseaTime);
		config.set("PigZombie.Resistance.Enabled", PigZombieResistanceEnabled);
		config.set("PigZombie.Resistance.Power", PigZombieResistancePower);
		config.set("PigZombie.Resistance.Time", PigZombieResistanceTime);
		config.set("PigZombie.Slow.Enabled", PigZombieSlowEnabled);
		config.set("PigZombie.Slow.Power", PigZombieSlowPower);
		config.set("PigZombie.Slow.Time", PigZombieSlowTime);
		config.set("PigZombie.Speed.Enabled", PigZombieSpeedEnabled);
		config.set("PigZombie.Speed.Power", PigZombieSpeedPower);
		config.set("PigZombie.Speed.Time", PigZombieSpeedTime);
		config.set("PigZombie.Strength.Enabled", PigZombieStrengthEnabled);
		config.set("PigZombie.Strength.Power", PigZombieStrengthPower);
		config.set("PigZombie.Strength.Time", PigZombieStrengthTime);
		config.set("PigZombie.WaterBreathing.Enabled", PigZombieWaterBreathingEnabled);
		config.set("PigZombie.WaterBreathing.Power", PigZombieWaterBreathingPower);
		config.set("PigZombie.WaterBreathing.Time", PigZombieWaterBreathingTime);
		config.set("PigZombie.Weakness.Enabled", PigZombieWeaknessEnabled);
		config.set("PigZombie.Weakness.Power", PigZombieWeaknessPower);
		config.set("PigZombie.Weakness.Time", PigZombieWeaknessTime);
		// Player
		config.set("Player.Blindness.Enabled", PlayerBlindnessEnabled);
		config.set("Player.Blindness.Power", PlayerBlindnessPower);
		config.set("Player.Blindness.Time", PlayerBlindnessTime);
		config.set("Player.FastDigging.Enabled", PlayerFastDiggingEnabled);
		config.set("Player.FastDigging.Power", PlayerFastDiggingPower);
		config.set("Player.FastDigging.Time", PlayerFastDiggingTime);
		config.set("Player.Harm.Enabled", PlayerHarmEnabled);
		config.set("Player.Harm.Power", PlayerHarmPower);
		config.set("Player.Harm.Time", PlayerHarmTime);
		config.set("Player.Heal.Enabled", PlayerHealEnabled);
		config.set("Player.Heal.Power", PlayerHealPower);
		config.set("Player.Heal.Time", PlayerHealTime);
		config.set("Player.Jump.Enabled", PlayerJumpEnabled);
		config.set("Player.Jump.Power", PlayerJumpPower);
		config.set("Player.Jump.Time", PlayerJumpTime);
		config.set("Player.MiningFatigue.Enabled", PlayerMiningFatigueEnabled);
		config.set("Player.MiningFatigue.Power", PlayerMiningFatiguePower);
		config.set("Player.MiningFatigue.Time", PlayerMiningFatigueTime);
		config.set("Player.Nausea.Enabled", PlayerNauseaEnabled);
		config.set("Player.Nausea.Power", PlayerNauseaPower);
		config.set("Player.Nausea.Time", PlayerNauseaTime);
		config.set("Player.Resistance.Enabled", PlayerResistanceEnabled);
		config.set("Player.Resistance.Power", PlayerResistancePower);
		config.set("Player.Resistance.Time", PlayerResistanceTime);
		config.set("Player.Slow.Enabled", PlayerSlowEnabled);
		config.set("Player.Slow.Power", PlayerSlowPower);
		config.set("Player.Slow.Time", PlayerSlowTime);
		config.set("Player.Speed.Enabled", PlayerSpeedEnabled);
		config.set("Player.Speed.Power", PlayerSpeedPower);
		config.set("Player.Speed.Time", PlayerSpeedTime);
		config.set("Player.Strength.Enabled", PlayerStrengthEnabled);
		config.set("Player.Strength.Power", PlayerStrengthPower);
		config.set("Player.Strength.Time", PlayerStrengthTime);
		config.set("Player.WaterBreathing.Enabled", PlayerWaterBreathingEnabled);
		config.set("Player.WaterBreathing.Power", PlayerWaterBreathingPower);
		config.set("Player.WaterBreathing.Time", PlayerWaterBreathingTime);
		config.set("Player.Weakness.Enabled", PlayerWeaknessEnabled);
		config.set("Player.Weakness.Power", PlayerWeaknessPower);
		config.set("Player.Weakness.Time", PlayerWeaknessTime);
		// Silverfish
		config.set("Silverfish.Blindness.Enabled", SilverfishBlindnessEnabled);
		config.set("Silverfish.Blindness.Power", SilverfishBlindnessPower);
		config.set("Silverfish.Blindness.Time", SilverfishBlindnessTime);
		config.set("Silverfish.FastDigging.Enabled", SilverfishFastDiggingEnabled);
		config.set("Silverfish.FastDigging.Power", SilverfishFastDiggingPower);
		config.set("Silverfish.FastDigging.Time", SilverfishFastDiggingTime);
		config.set("Silverfish.Harm.Enabled", SilverfishHarmEnabled);
		config.set("Silverfish.Harm.Power", SilverfishHarmPower);
		config.set("Silverfish.Harm.Time", SilverfishHarmTime);
		config.set("Silverfish.Heal.Enabled", SilverfishHealEnabled);
		config.set("Silverfish.Heal.Power", SilverfishHealPower);
		config.set("Silverfish.Heal.Time", SilverfishHealTime);
		config.set("Silverfish.Jump.Enabled", SilverfishJumpEnabled);
		config.set("Silverfish.Jump.Power", SilverfishJumpPower);
		config.set("Silverfish.Jump.Time", SilverfishJumpTime);
		config.set("Silverfish.MiningFatigue.Enabled", SilverfishMiningFatigueEnabled);
		config.set("Silverfish.MiningFatigue.Power", SilverfishMiningFatiguePower);
		config.set("Silverfish.MiningFatigue.Time", SilverfishMiningFatigueTime);
		config.set("Silverfish.Nausea.Enabled", SilverfishNauseaEnabled);
		config.set("Silverfish.Nausea.Power", SilverfishNauseaPower);
		config.set("Silverfish.Nausea.Time", SilverfishNauseaTime);
		config.set("Silverfish.Resistance.Enabled", SilverfishResistanceEnabled);
		config.set("Silverfish.Resistance.Power", SilverfishResistancePower);
		config.set("Silverfish.Resistance.Time", SilverfishResistanceTime);
		config.set("Silverfish.Slow.Enabled", SilverfishSlowEnabled);
		config.set("Silverfish.Slow.Power", SilverfishSlowPower);
		config.set("Silverfish.Slow.Time", SilverfishSlowTime);
		config.set("Silverfish.Speed.Enabled", SilverfishSpeedEnabled);
		config.set("Silverfish.Speed.Power", SilverfishSpeedPower);
		config.set("Silverfish.Speed.Time", SilverfishSpeedTime);
		config.set("Silverfish.Strength.Enabled", SilverfishStrengthEnabled);
		config.set("Silverfish.Strength.Power", SilverfishStrengthPower);
		config.set("Silverfish.Strength.Time", SilverfishStrengthTime);
		config.set("Silverfish.WaterBreathing.Enabled", SilverfishWaterBreathingEnabled);
		config.set("Silverfish.WaterBreathing.Power", SilverfishWaterBreathingPower);
		config.set("Silverfish.WaterBreathing.Time", SilverfishWaterBreathingTime);
		config.set("Silverfish.Weakness.Enabled", SilverfishWeaknessEnabled);
		config.set("Silverfish.Weakness.Power", SilverfishWeaknessPower);
		config.set("Silverfish.Weakness.Time", SilverfishWeaknessTime);
		// Slime
		config.set("Slime.Blindness.Enabled", SlimeBlindnessEnabled);
		config.set("Slime.Blindness.Power", SlimeBlindnessPower);
		config.set("Slime.Blindness.Time", SlimeBlindnessTime);
		config.set("Slime.FastDigging.Enabled", SlimeFastDiggingEnabled);
		config.set("Slime.FastDigging.Power", SlimeFastDiggingPower);
		config.set("Slime.FastDigging.Time", SlimeFastDiggingTime);
		config.set("Slime.Harm.Enabled", SlimeHarmEnabled);
		config.set("Slime.Harm.Power", SlimeHarmPower);
		config.set("Slime.Harm.Time", SlimeHarmTime);
		config.set("Slime.Heal.Enabled", SlimeHealEnabled);
		config.set("Slime.Heal.Power", SlimeHealPower);
		config.set("Slime.Heal.Time", SlimeHealTime);
		config.set("Slime.Jump.Enabled", SlimeJumpEnabled);
		config.set("Slime.Jump.Power", SlimeJumpPower);
		config.set("Slime.Jump.Time", SlimeJumpTime);
		config.set("Slime.MiningFatigue.Enabled", SlimeMiningFatigueEnabled);
		config.set("Slime.MiningFatigue.Power", SlimeMiningFatiguePower);
		config.set("Slime.MiningFatigue.Time", SlimeMiningFatigueTime);
		config.set("Slime.Nausea.Enabled", SlimeNauseaEnabled);
		config.set("Slime.Nausea.Power", SlimeNauseaPower);
		config.set("Slime.Nausea.Time", SlimeNauseaTime);
		config.set("Slime.Resistance.Enabled", SlimeResistanceEnabled);
		config.set("Slime.Resistance.Power", SlimeResistancePower);
		config.set("Slime.Resistance.Time", SlimeResistanceTime);
		config.set("Slime.Slow.Enabled", SlimeSlowEnabled);
		config.set("Slime.Slow.Power", SlimeSlowPower);
		config.set("Slime.Slow.Time", SlimeSlowTime);
		config.set("Slime.Speed.Enabled", SlimeSpeedEnabled);
		config.set("Slime.Speed.Power", SlimeSpeedPower);
		config.set("Slime.Speed.Time", SlimeSpeedTime);
		config.set("Slime.Strength.Enabled", SlimeStrengthEnabled);
		config.set("Slime.Strength.Power", SlimeStrengthPower);
		config.set("Slime.Strength.Time", SlimeStrengthTime);
		config.set("Slime.WaterBreathing.Enabled", SlimeWaterBreathingEnabled);
		config.set("Slime.WaterBreathing.Power", SlimeWaterBreathingPower);
		config.set("Slime.WaterBreathing.Time", SlimeWaterBreathingTime);
		config.set("Slime.Weakness.Enabled", SlimeWeaknessEnabled);
		config.set("Slime.Weakness.Power", SlimeWeaknessPower);
		config.set("Slime.Weakness.Time", SlimeWeaknessTime);
		// Spider
		config.set("Spider.Blindness.Enabled", SpiderBlindnessEnabled);
		config.set("Spider.Blindness.Power", SpiderBlindnessPower);
		config.set("Spider.Blindness.Time", SpiderBlindnessTime);
		config.set("Spider.FastDigging.Enabled", SpiderFastDiggingEnabled);
		config.set("Spider.FastDigging.Power", SpiderFastDiggingPower);
		config.set("Spider.FastDigging.Time", SpiderFastDiggingTime);
		config.set("Spider.FireResistance.Enabled", SpiderFireResistanceEnabled);
		config.set("Spider.FireResistance.Power", SpiderFireResistancePower);
		config.set("Spider.FireResistance.Time", SpiderFireResistanceTime);
		config.set("Spider.Harm.Enabled", SpiderHarmEnabled);
		config.set("Spider.Harm.Power", SpiderHarmPower);
		config.set("Spider.Harm.Time", SpiderHarmTime);
		config.set("Spider.Heal.Enabled", SpiderHealEnabled);
		config.set("Spider.Heal.Power", SpiderHealPower);
		config.set("Spider.Heal.Time", SpiderHealTime);
		config.set("Spider.Hunger.Enabled", SpiderHungerEnabled);
		config.set("Spider.Hunger.Power", SpiderHungerPower);
		config.set("Spider.Hunger.Time", SpiderHungerTime);
		config.set("Spider.Jump.Enabled", SpiderJumpEnabled);
		config.set("Spider.Jump.Power", SpiderJumpPower);
		config.set("Spider.Jump.Time", SpiderJumpTime);
		config.set("Spider.MiningFatigue.Enabled", SpiderMiningFatigueEnabled);
		config.set("Spider.MiningFatigue.Power", SpiderMiningFatiguePower);
		config.set("Spider.MiningFatigue.Time", SpiderMiningFatigueTime);
		config.set("Spider.Nausea.Enabled", SpiderNauseaEnabled);
		config.set("Spider.Nausea.Power", SpiderNauseaPower);
		config.set("Spider.Nausea.Time", SpiderNauseaTime);
		config.set("Spider.Poison.Enabled", SpiderPoisonEnabled);
		config.set("Spider.Poison.Power", SpiderPoisonPower);
		config.set("Spider.Poison.Time", SpiderPoisonTime);
		config.set("Spider.Regeneration.Enabled", SpiderRegenerationEnabled);
		config.set("Spider.Regeneration.Power", SpiderRegenerationPower);
		config.set("Spider.Regeneration.Time", SpiderRegenerationTime);
		config.set("Spider.Resistance.Enabled", SpiderResistanceEnabled);
		config.set("Spider.Resistance.Power", SpiderResistancePower);
		config.set("Spider.Resistance.Time", SpiderResistanceTime);
		config.set("Spider.Slow.Enabled", SpiderSlowEnabled);
		config.set("Spider.Slow.Power", SpiderSlowPower);
		config.set("Spider.Slow.Time", SpiderSlowTime);
		config.set("Spider.Speed.Enabled", SpiderSpeedEnabled);
		config.set("Spider.Speed.Power", SpiderSpeedPower);
		config.set("Spider.Speed.Time", SpiderSpeedTime);
		config.set("Spider.Strength.Enabled", SpiderStrengthEnabled);
		config.set("Spider.Strength.Power", SpiderStrengthPower);
		config.set("Spider.Strength.Time", SpiderStrengthTime);
		config.set("Spider.WaterBreathing.Enabled", SpiderWaterBreathingEnabled);
		config.set("Spider.WaterBreathing.Power", SpiderWaterBreathingPower);
		config.set("Spider.WaterBreathing.Time", SpiderWaterBreathingTime);
		config.set("Spider.Weakness.Enabled", SpiderWeaknessEnabled);
		config.set("Spider.Weakness.Power", SpiderWeaknessPower);
		config.set("Spider.Weakness.Time", SpiderWeaknessTime);
		// Zombies
		config.set("Zombie.Blindness.Enabled", ZombieBlindnessEnabled);
		config.set("Zombie.Blindness.Power", ZombieBlindnessPower);
		config.set("Zombie.Blindness.Time", ZombieBlindnessTime);
		config.set("Zombie.Blindness.DodgeChance", ZombieBlindnessDodgeChance);
		config.set("Zombie.FastDigging.Enabled", ZombieFastDiggingEnabled);
		config.set("Zombie.FastDigging.Power", ZombieFastDiggingPower);
		config.set("Zombie.FastDigging.Time", ZombieFastDiggingTime);
		config.set("Zombie.FastDigging.DodgeChance", ZombieFastDiggingDodgeChance);
		config.set("Zombie.FireResistance.Enabled", ZombieFireResistanceEnabled);
		config.set("Zombie.FireResistance.Power", ZombieFireResistancePower);
		config.set("Zombie.FireResistance.Time", ZombieFireResistanceTime);
		config.set("Zombie.FireResistance.DodgeChance", ZombieFireResistanceDodgeChance);
		config.set("Zombie.Harm.Enabled", ZombieHarmEnabled);
		config.set("Zombie.Harm.Power", ZombieHarmPower);
		config.set("Zombie.Harm.Time", ZombieHarmTime);
		config.set("Zombie.Harm.DodgeChance", ZombieHarmDodgeChance);
		config.set("Zombie.Heal.Enabled", ZombieHealEnabled);
		config.set("Zombie.Heal.Power", ZombieHealPower);
		config.set("Zombie.Heal.Time", ZombieHealTime);
		config.set("Zombie.Heal.DodgeChance", ZombieHealDodgeChance);
		config.set("Zombie.Hunger.Enabled", ZombieHungerEnabled);
		config.set("Zombie.Hunger.Power", ZombieHungerPower);
		config.set("Zombie.Hunger.Time", ZombieHungerTime);
		config.set("Zombie.Hunger.DodgeChance", ZombieHungerDodgeChance);
		config.set("Zombie.Jump.Enabled", ZombieJumpEnabled);
		config.set("Zombie.Jump.Power", ZombieJumpPower);
		config.set("Zombie.Jump.Time", ZombieJumpTime);
		config.set("Zombie.Jump.DodgeChance", ZombieJumpDodgeChance);
		config.set("Zombie.MiningFatigue.Enabled", ZombieMiningFatigueEnabled);
		config.set("Zombie.MiningFatigue.Power", ZombieMiningFatiguePower);
		config.set("Zombie.MiningFatigue.Time", ZombieMiningFatigueTime);
		config.set("Zombie.MiningFatigue.DodgeChannce", ZombieMiningFatigueDodgeChance);
		config.set("Zombie.Nausea.Enabled", ZombieNauseaEnabled);
		config.set("Zombie.Nausea.Power", ZombieNauseaPower);
		config.set("Zombie.Nausea.Time", ZombieNauseaTime);
		config.set("Zombie.Nausea.DodgeChance", ZombieNauseaDodgeChance);
		config.set("Zombie.Poison.Enabled", ZombiePoisonEnabled);
		config.set("Zombie.Poison.Power", ZombiePoisonPower);
		config.set("Zombie.Poison.Time", ZombiePoisonTime);
		config.set("Zombie.Poison.DodgeChance", ZombiePoisonDodgeChance);
		config.set("Zombie.Regeneration.Enabled", ZombieRegenerationEnabled);
		config.set("Zombie.Regeneration.Power", ZombieRegenerationPower);
		config.set("Zombie.Regeneration.Time", ZombieRegenerationTime);
		config.set("Zombie.Regeneration.DodgeChance", ZombieRegenerationDodgeChance);
		config.set("Zombie.Resistance.Enabled", ZombieResistanceEnabled);
		config.set("Zombie.Resistance.Power", ZombieResistancePower);
		config.set("Zombie.Resistance.Time", ZombieResistanceTime);
		config.set("Zombie.Resistance.DodgeChance", ZombieResistanceDodgeChance);
		config.set("Zombie.Slow.Enabled", ZombieSlowEnabled);
		config.set("Zombie.Slow.Power", ZombieSlowPower);
		config.set("Zombie.Slow.Time", ZombieSlowTime);
		config.set("Zombie.Slow.DodgeChance", ZombieSlowDodgeChance);
		config.set("Zombie.Speed.Enabled", ZombieSpeedEnabled);
		config.set("Zombie.Speed.Power", ZombieSpeedPower);
		config.set("Zombie.Speed.Time", ZombieSpeedTime);
		config.set("Zombie.Speed.DodgeChance", ZombieSpeedDodgeChance);
		config.set("Zombie.Strength.Enabled", ZombieStrengthEnabled);
		config.set("Zombie.Strength.Power", ZombieStrengthPower);
		config.set("Zombie.Strength.Time", ZombieStrengthTime);
		config.set("Zombie.Strength.DodgeChance", ZombieStrengthDodgeChance);
		config.set("Zombie.WaterBreathing.Enabled", ZombieWaterBreathingEnabled);
		config.set("Zombie.WaterBreathing.Power", ZombieWaterBreathingPower);
		config.set("Zombie.WaterBreathing.Time", ZombieWaterBreathingTime);
		config.set("Zombie.WaterBreathing.DodgeChance", ZombieWaterBreathingDodgeChance);;
		config.set("Zombie.Weakness.Enabled", ZombieWeaknessEnabled);
		config.set("Zombie.Weakness.Power", ZombieWeaknessPower);
		config.set("Zombie.Weakness.Time", ZombieWeaknessTime);
		config.set("Zombie.Weakness.DodgeChance", ZombieWeaknessDodgeChance);
	
	try {
		config.save(file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
