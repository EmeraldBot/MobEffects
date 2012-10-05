package com.etriacraft.MobEffects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bukkit.configuration.Configuration;
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
		// Confusion
	public static boolean PlayerConfusionEnabled = false;
	public static int PlayerConfusionTime = 500;
	public static int PlayerConfusionPower = 0;
		// Damage Resistance
	public static boolean PlayerDamageResistanceEnabled = false;
	public static int PlayerDamageResistanceTime = 500;
	public static int PlayerDamageResistancePower = 0;
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
	public static boolean PlayerIncreaseDamageEnabled = false;
	public static int PlayerIncreaseDamageTime = 500;
	public static int PlayerIncreaseDamagePower = 0;
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
	public static boolean PlayerSlowDiggingEnabled = false;
	public static int PlayerSlowDiggingTime = 500;
	public static int PlayerSlowDiggingPower = 0;
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
		// Confusion
	public static boolean ZombieConfusionEnabled = false;
	public static int ZombieConfusionTime = 500;
	public static int ZombieConfusionPower = 0;
		// Damage Resistance
	public static boolean ZombieDamageResistanceEnabled = false;
	public static int ZombieDamageResistanceTime = 500;
	public static int ZombieDamageResistancePower = 0;
		// Fast Digging
	public static boolean ZombieFastDiggingEnabled = false;
	public static int ZombieFastDiggingTime = 500;
	public static int ZombieFastDiggingPower = 0;
		// Fire Resistance
	public static boolean ZombieFireResistanceEnabled = false;
	public static int ZombieFireResistanceTime = 500;
	public static int ZombieFireResistancePower = 0;
		// Harm
	public static boolean ZombieHarmEnabled = false;
	public static int ZombieHarmTime = 500;
	public static int ZombieHarmPower = 0;
		// Heal
	public static boolean ZombieHealEnabled = false;
	public static int ZombieHealTime = 500;
	public static int ZombieHealPower = 0;
		// Hunger
	public static boolean ZombieHungerEnabled = false;
	public static int ZombieHungerTime = 500;
	public static int ZombieHungerPower = 0;
		// Increase Damage
	public static boolean ZombieIncreaseDamageEnabled = false;
	public static int ZombieIncreaseDamageTime = 500;
	public static int ZombieIncreaseDamagePower = 0;
		// Jump
	public static boolean ZombieJumpEnabled = false;
	public static int ZombieJumpTime = 500;
	public static int ZombieJumpPower = 0;
		// Poison
	public static boolean ZombiePoisonEnabled = false;
	public static int ZombiePoisonTime = 500;
	public static int ZombiePoisonPower = 0;
		// Regeneration
	public static boolean ZombieRegenerationEnabled = false;
	public static int ZombieRegenerationTime = 500;
	public static int ZombieRegenerationPower = 0;
		// Slow
	public static boolean ZombieSlowEnabled = false;
	public static int ZombieSlowTime = 500;
	public static int ZombieSlowPower = 0;
		// Slow Digging
	public static boolean ZombieSlowDiggingEnabled = false;
	public static int ZombieSlowDiggingTime = 500;
	public static int ZombieSlowDiggingPower = 0;
		// Speed
	public static boolean ZombieSpeedEnabled = false;
	public static int ZombieSpeedTime = 500;
	public static int ZombieSpeedPower = 0;
		// Water Breathing
	public static boolean ZombieWaterBreathingEnabled = false;
	public static int ZombieWaterBreathingTime = 500;
	public static int ZombieWaterBreathingPower = 0;
		// Weakness
	public static boolean ZombieWeaknessEnabled = false;
	public static int ZombieWeaknessTime = 500;
	public static int ZombieWeaknessPower = 0;
	// Spider Stuffs
		// Blindness
	public static boolean SpiderBlindnessEnabled = false;
	public static int SpiderBlindnessTime = 500;
	public static int SpiderBlindnessPower = 0;
		// Confusion
	public static boolean SpiderConfusionEnabled = false;
	public static int SpiderConfusionTime = 500;
	public static int SpiderConfusionPower = 0;
		// Damage Resistance
	public static boolean SpiderDamageResistanceEnabled = false;
	public static int SpiderDamageResistanceTime = 500;
	public static int SpiderDamageResistancePower = 0;
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
	public static boolean SpiderIncreaseDamageEnabled = false;
	public static int SpiderIncreaseDamageTime = 500;
	public static int SpiderIncreaseDamagePower = 0;
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
	public static boolean SpiderSlowDiggingEnabled = false;
	public static int SpiderSlowDiggingTime = 500;
	public static int SpiderSlowDiggingPower = 0;
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
		// Confusion
	public static boolean CreeperConfusionEnabled = false;
	public static int CreeperConfusionTime = 500;
	public static int CreeperConfusionPower = 0;
		// Damage Resistance
	public static boolean CreeperDamageResistanceEnabled = false;
	public static int CreeperDamageResistanceTime = 500;
	public static int CreeperDamageResistancePower = 0;
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
	public static boolean CreeperIncreaseDamageEnabled = false;
	public static int CreeperIncreaseDamageTime = 500;
	public static int CreeperIncreaseDamagePower = 0;
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
	public static boolean CreeperSlowDiggingEnabled = false;
	public static int CreeperSlowDiggingTime = 500;
	public static int CreeperSlowDiggingPower = 0;
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
		// Confusion
	public static boolean EndermanConfusionEnabled = false;
	public static int EndermanConfusionTime = 500;
	public static int EndermanConfusionPower = 0;
		// Damage Resistance
	public static boolean EndermanDamageResistanceEnabled = false;
	public static int EndermanDamageResistanceTime = 500;
	public static int EndermanDamageResistancePower = 0;
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
	public static boolean EndermanIncreaseDamageEnabled = false;
	public static int EndermanIncreaseDamageTime = 500;
	public static int EndermanIncreaseDamagePower = 0;
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
	public static boolean EndermanSlowDiggingEnabled = false;
	public static int EndermanSlowDiggingTime = 500;
	public static int EndermanSlowDiggingPower = 0;
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
	// Confusion
	public static boolean SlimeConfusionEnabled = false;
	public static int SlimeConfusionTime = 500;
	public static int SlimeConfusionPower = 0;
	// Damage Resistance
	public static boolean SlimeDamageResistanceEnabled = false;
	public static int SlimeDamageResistanceTime = 500;
	public static int SlimeDamageResistancePower = 0;
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
	public static boolean SlimeIncreaseDamageEnabled = false;
	public static int SlimeIncreaseDamageTime = 500;
	public static int SlimeIncreaseDamagePower = 0;
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
	public static boolean SlimeSlowDiggingEnabled = false;
	public static int SlimeSlowDiggingTime = 500;
	public static int SlimeSlowDiggingPower = 0;
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
	// Confusion
	public static boolean GiantConfusionEnabled = false;
	public static int GiantConfusionTime = 500;
	public static int GiantConfusionPower = 0;
	// Damage Resistance
	public static boolean GiantDamageResistanceEnabled = false;
	public static int GiantDamageResistanceTime = 500;
	public static int GiantDamageResistancePower = 0;
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
	public static boolean GiantIncreaseDamageEnabled = false;
	public static int GiantIncreaseDamageTime = 500;
	public static int GiantIncreaseDamagePower = 0;
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
	public static boolean GiantSlowDiggingEnabled = false;
	public static int GiantSlowDiggingTime = 500;
	public static int GiantSlowDiggingPower = 0;
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
	// Confusion
	public static boolean BlazeConfusionEnabled = false;
	public static int BlazeConfusionTime = 500;
	public static int BlazeConfusionPower = 0;
	// Damage Resistance
	public static boolean BlazeDamageResistanceEnabled = false;
	public static int BlazeDamageResistanceTime = 500;
	public static int BlazeDamageResistancePower = 0;
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
	public static boolean BlazeIncreaseDamageEnabled = false;
	public static int BlazeIncreaseDamageTime = 500;
	public static int BlazeIncreaseDamagePower = 0;
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
	public static boolean BlazeSlowDiggingEnabled = false;
	public static int BlazeSlowDiggingTime = 500;
	public static int BlazeSlowDiggingPower = 0;
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
	// Confusion
	public static boolean MagmaCubeConfusionEnabled = false;
	public static int MagmaCubeConfusionTime = 500;
	public static int MagmaCubeConfusionPower = 0;
	// Damage Resistance
	public static boolean MagmaCubeDamageResistanceEnabled = false;
	public static int MagmaCubeDamageResistanceTime = 500;
	public static int MagmaCubeDamageResistancePower = 0;
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
	public static boolean MagmaCubeIncreaseDamageEnabled = false;
	public static int MagmaCubeIncreaseDamageTime = 500;
	public static int MagmaCubeIncreaseDamagePower = 0;
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
	public static boolean MagmaCubeSlowDiggingEnabled = false;
	public static int MagmaCubeSlowDiggingTime = 500;
	public static int MagmaCubeSlowDiggingPower = 0;
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
	// Confusion
	public static boolean CaveSpiderConfusionEnabled = false;
	public static int CaveSpiderConfusionTime = 500;
	public static int CaveSpiderConfusionPower = 0;
	// Damage Resistance
	public static boolean CaveSpiderDamageResistanceEnabled = false;
	public static int CaveSpiderDamageResistanceTime = 500;
	public static int CaveSpiderDamageResistancePower = 0;
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
	public static boolean CaveSpiderIncreaseDamageEnabled = false;
	public static int CaveSpiderIncreaseDamageTime = 500;
	public static int CaveSpiderIncreaseDamagePower = 0;
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
	public static boolean CaveSpiderSlowDiggingEnabled = false;
	public static int CaveSpiderSlowDiggingTime = 500;
	public static int CaveSpiderSlowDiggingPower = 0;
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
	// Confusion
	public static boolean PigZombieConfusionEnabled = false;
	public static int PigZombieConfusionTime = 500;
	public static int PigZombieConfusionPower = 0;
	// Damage Resistance
	public static boolean PigZombieDamageResistanceEnabled = false;
	public static int PigZombieDamageResistanceTime = 500;
	public static int PigZombieDamageResistancePower = 0;
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
	public static boolean PigZombieIncreaseDamageEnabled = false;
	public static int PigZombieIncreaseDamageTime = 500;
	public static int PigZombieIncreaseDamagePower = 0;
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
	public static boolean PigZombieSlowDiggingEnabled = false;
	public static int PigZombieSlowDiggingTime = 500;
	public static int PigZombieSlowDiggingPower = 0;
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
		
		//Player Confusion
		PlayerConfusionEnabled = config.getBoolean("Player.Confusion.Enabled", PlayerConfusionEnabled);
		PlayerConfusionTime = config.getInt("Player.Confusion.Time", PlayerConfusionTime);
		PlayerConfusionPower = config.getInt("Player.Confusion.Power", PlayerConfusionPower);
		
		// Player Damage Resistance
		PlayerDamageResistanceEnabled = config.getBoolean("Player.DamageResistance.Enabled", PlayerDamageResistanceEnabled);
		PlayerDamageResistanceTime = config.getInt("Player.DamageResistance.Time", PlayerDamageResistanceTime);
		PlayerDamageResistancePower = config.getInt("Player.DamageResistance.Power", PlayerDamageResistancePower);
		
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
		
		// Player IncreaseDamage
		PlayerIncreaseDamageEnabled = config.getBoolean("Player.IncreaseDamage.Enabled", PlayerIncreaseDamageEnabled);
		PlayerIncreaseDamageTime = config.getInt("Player.IncreaseDamage.Time", PlayerIncreaseDamageTime);
		PlayerIncreaseDamagePower = config.getInt("Player.IncreaseDamage.Power", PlayerIncreaseDamagePower);
		
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
		PlayerSlowDiggingEnabled = config.getBoolean("Player.SlowDigging.Enabled", PlayerSlowDiggingEnabled);
		PlayerSlowDiggingTime = config.getInt("Player.SlowDigging.Time", PlayerSlowDiggingTime);
		PlayerSlowDiggingPower = config.getInt("Player.SlowDigging.Power", PlayerSlowDiggingPower);
		
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

		//Zombie Confusion
		ZombieConfusionEnabled = config.getBoolean("Zombie.Confusion.Enabled", ZombieConfusionEnabled);
		ZombieConfusionTime = config.getInt("Zombie.Confusion.Time", ZombieConfusionTime);
		ZombieConfusionPower = config.getInt("Zombie.Confusion.Power", ZombieConfusionPower);

		// Zombie Damage Resistance
		ZombieDamageResistanceEnabled = config.getBoolean("Zombie.DamageResistance.Enabled", ZombieDamageResistanceEnabled);
		ZombieDamageResistanceTime = config.getInt("Zombie.DamageResistance.Time", ZombieDamageResistanceTime);
		ZombieDamageResistancePower = config.getInt("Zombie.DamageResistance.Power", ZombieDamageResistancePower);

		// Zombie Fast Digging
		ZombieFastDiggingEnabled = config.getBoolean("Zombie.FastDigging.Enabled", ZombieFastDiggingEnabled);
		ZombieFastDiggingTime = config.getInt("Zombie.FastDigging.Time", ZombieFastDiggingTime);
		ZombieFastDiggingPower = config.getInt("Zombie.FastDigging.Power", ZombieFastDiggingPower);

		// Zombie Fire Resistance
		ZombieFireResistanceEnabled = config.getBoolean("Zombie.FireResistance.Enabled", ZombieFireResistanceEnabled);
		ZombieFireResistanceTime = config.getInt("Zombie.FireResistance.Time", ZombieFireResistanceTime);
		ZombieFireResistancePower = config.getInt("Zombie.FireResistance.Power", ZombieFireResistancePower);

		// Zombie Harm
		ZombieHarmEnabled = config.getBoolean("Zombie.Harm.Enabled", ZombieHarmEnabled);
		ZombieHarmTime = config.getInt("Zombie.Harm.Time", ZombieHarmTime);
		ZombieHarmPower = config.getInt("Zombie.Harm.Powre", ZombieHarmPower);

		// Zombie Heal
		ZombieHealEnabled = config.getBoolean("Zombie.Heal.Enabled", ZombieHealEnabled);
		ZombieHealTime = config.getInt("Zombie.Heal.Time", ZombieHealTime);
		ZombieHealPower = config.getInt("Zombie.Heal.Power", ZombieHealPower);

		// Zombie Hunger
		ZombieHungerEnabled = config.getBoolean("Zombie.Hunger.Enabled", ZombieHungerEnabled);
		ZombieHungerTime = config.getInt("Zombie.Hunger.Time", ZombieHungerTime);
		ZombieHungerPower = config.getInt("Zombie.Hunger.Power", ZombieHungerPower);

		// Zombie IncreaseDamage
		ZombieIncreaseDamageEnabled = config.getBoolean("Zombie.IncreaseDamage.Enabled", ZombieIncreaseDamageEnabled);
		ZombieIncreaseDamageTime = config.getInt("Zombie.IncraseDamage.Time", ZombieIncreaseDamageTime);
		ZombieIncreaseDamagePower = config.getInt("Zombie.IncreaseDamage.Power", ZombieIncreaseDamagePower);

		// Zombie Jump
		ZombieJumpEnabled = config.getBoolean("Zombie.Jump.Enabled", ZombieJumpEnabled);
		ZombieJumpTime = config.getInt("Zombie.Jump.Time", ZombieJumpTime);
		ZombieJumpPower = config.getInt("Zombie.Jump.Power", ZombieJumpPower);

		// Zombie Poison
		ZombiePoisonEnabled = config.getBoolean("Zombie.Poison.Enabled", ZombiePoisonEnabled);
		ZombiePoisonTime = config.getInt("Zombie.Poison.Time", ZombiePoisonTime);
		ZombiePoisonPower = config.getInt("Zombie.Poison.Power", ZombiePoisonPower);

		// Zombie Regeneration
		ZombieRegenerationEnabled = config.getBoolean("Zombie.Regeneration.Enabled", ZombieRegenerationEnabled);
		ZombieRegenerationTime = config.getInt("Zombie.Regeneration.Time", ZombieRegenerationTime);
		ZombieRegenerationPower = config.getInt("Zombie.Regeneration.Power", ZombieRegenerationPower);

		// Zombie Slow
		ZombieSlowEnabled = config.getBoolean("Zombie.Slow.Enabled", ZombieSlowEnabled);
		ZombieSlowTime = config.getInt("Zombie.Slow.Time", ZombieSlowTime);
		ZombieSlowPower = config.getInt("Zombie.Slow.Power", ZombieSlowPower);

		// Zombie Slow Digging
		ZombieSlowDiggingEnabled = config.getBoolean("Zombie.SlowDigging.Enabled", ZombieSlowDiggingEnabled);
		ZombieSlowDiggingTime = config.getInt("Zombie.SlowDigging.Time", ZombieSlowDiggingTime);
		ZombieSlowDiggingPower = config.getInt("Zombie.SlowDigging.Power", ZombieSlowDiggingPower);

		// Zombie Speed
		ZombieSpeedEnabled = config.getBoolean("Zombie.Speed.Enabled", ZombieSpeedEnabled);
		ZombieSpeedTime = config.getInt("Zombie.Speed.Time", ZombieSpeedTime);
		ZombieSpeedPower = config.getInt("Zombie.Speed.Power", ZombieSpeedPower);

		// Zombie Water Breathing
		ZombieWaterBreathingEnabled = config.getBoolean("Zombie.WaterBreathing.Enabled", ZombieWaterBreathingEnabled);
		ZombieWaterBreathingTime = config.getInt("Zombie.WaterBreathing.Time", ZombieWaterBreathingTime);
		ZombieWaterBreathingPower = config.getInt("Zombie.WaterBreathing.Power", ZombieWaterBreathingPower);
		
		// Zombie Weakness
		ZombieWeaknessEnabled = config.getBoolean("Zombie.Weakness.Enabled", ZombieWeaknessEnabled);
		ZombieWeaknessTime = config.getInt("Zombie.Weakness.Time", ZombieWeaknessTime);
		ZombieWeaknessPower = config.getInt("Zombie.Weakness.Power", ZombieWeaknessPower);
		
		// Spider Blindness
		SpiderBlindnessEnabled = config.getBoolean("Spider.Blindness.Enabled", SpiderBlindnessEnabled);
		SpiderBlindnessTime = config.getInt("Spider.Blindness.Time", SpiderBlindnessTime);
		SpiderBlindnessPower = config.getInt("Spider.Blindness.Power", SpiderBlindnessPower);

		//Spider Confusion
		SpiderConfusionEnabled = config.getBoolean("Spider.Confusion.Enabled", SpiderConfusionEnabled);
		SpiderConfusionTime = config.getInt("Spider.Confusion.Time", SpiderConfusionTime);
		SpiderConfusionPower = config.getInt("Spider.Confusion.Power", SpiderConfusionPower);

		// Spider Damage Resistance
		SpiderDamageResistanceEnabled = config.getBoolean("Spider.DamageResistance.Enabled", SpiderDamageResistanceEnabled);
		SpiderDamageResistanceTime = config.getInt("Spider.DamageResistance.Time", SpiderDamageResistanceTime);
		SpiderDamageResistancePower = config.getInt("Spider.DamageResistance.Power", SpiderDamageResistancePower);

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

		// Spider IncreaseDamage
		SpiderIncreaseDamageEnabled = config.getBoolean("Spider.IncreaseDamage.Enabled", SpiderIncreaseDamageEnabled);
		SpiderIncreaseDamageTime = config.getInt("Spider.IncraseDamage.Time", SpiderIncreaseDamageTime);
		SpiderIncreaseDamagePower = config.getInt("Spider.IncreaseDamage.Power", SpiderIncreaseDamagePower);

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
		SpiderSlowDiggingEnabled = config.getBoolean("Spider.SlowDigging.Enabled", SpiderSlowDiggingEnabled);
		SpiderSlowDiggingTime = config.getInt("Spider.SlowDigging.Time", SpiderSlowDiggingTime);
		SpiderSlowDiggingPower = config.getInt("Spider.SlowDigging.Power", SpiderSlowDiggingPower);

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

		//Creeper Confusion
		CreeperConfusionEnabled = config.getBoolean("Creeper.Confusion.Enabled", CreeperConfusionEnabled);
		CreeperConfusionTime = config.getInt("Creeper.Confusion.Time", CreeperConfusionTime);
		CreeperConfusionPower = config.getInt("Creeper.Confusion.Power", CreeperConfusionPower);

		// Creeper Damage Resistance
		CreeperDamageResistanceEnabled = config.getBoolean("Creeper.DamageResistance.Enabled", CreeperDamageResistanceEnabled);
		CreeperDamageResistanceTime = config.getInt("Creeper.DamageResistance.Time", CreeperDamageResistanceTime);
		CreeperDamageResistancePower = config.getInt("Creeper.DamageResistance.Power", CreeperDamageResistancePower);

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

		// Creeper IncreaseDamage
		CreeperIncreaseDamageEnabled = config.getBoolean("Creeper.IncreaseDamage.Enabled", CreeperIncreaseDamageEnabled);
		CreeperIncreaseDamageTime = config.getInt("Creeper.IncraseDamage.Time", CreeperIncreaseDamageTime);
		CreeperIncreaseDamagePower = config.getInt("Creeper.IncreaseDamage.Power", CreeperIncreaseDamagePower);

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
		CreeperSlowDiggingEnabled = config.getBoolean("Creeper.SlowDigging.Enabled", CreeperSlowDiggingEnabled);
		CreeperSlowDiggingTime = config.getInt("Creeper.SlowDigging.Time", CreeperSlowDiggingTime);
		CreeperSlowDiggingPower = config.getInt("Creeper.SlowDigging.Power", CreeperSlowDiggingPower);

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

		//Enderman Confusion
		EndermanConfusionEnabled = config.getBoolean("Enderman.Confusion.Enabled", EndermanConfusionEnabled);
		EndermanConfusionTime = config.getInt("Enderman.Confusion.Time", EndermanConfusionTime);
		EndermanConfusionPower = config.getInt("Enderman.Confusion.Power", EndermanConfusionPower);

		// Enderman Damage Resistance
		EndermanDamageResistanceEnabled = config.getBoolean("Enderman.DamageResistance.Enabled", EndermanDamageResistanceEnabled);
		EndermanDamageResistanceTime = config.getInt("Enderman.DamageResistance.Time", EndermanDamageResistanceTime);
		EndermanDamageResistancePower = config.getInt("Enderman.DamageResistance.Power", EndermanDamageResistancePower);

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

		// Enderman IncreaseDamage
		EndermanIncreaseDamageEnabled = config.getBoolean("Enderman.IncreaseDamage.Enabled", EndermanIncreaseDamageEnabled);
		EndermanIncreaseDamageTime = config.getInt("Enderman.IncraseDamage.Time", EndermanIncreaseDamageTime);
		EndermanIncreaseDamagePower = config.getInt("Enderman.IncreaseDamage.Power", EndermanIncreaseDamagePower);

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
		EndermanSlowDiggingEnabled = config.getBoolean("Enderman.SlowDigging.Enabled", EndermanSlowDiggingEnabled);
		EndermanSlowDiggingTime = config.getInt("Enderman.SlowDigging.Time", EndermanSlowDiggingTime);
		EndermanSlowDiggingPower = config.getInt("Enderman.SlowDigging.Power", EndermanSlowDiggingPower);

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

		//Slime Confusion
		SlimeConfusionEnabled = config.getBoolean("Slime.Confusion.Enabled", SlimeConfusionEnabled);
		SlimeConfusionTime = config.getInt("Slime.Confusion.Time", SlimeConfusionTime);
		SlimeConfusionPower = config.getInt("Slime.Confusion.Power", SlimeConfusionPower);

		// Slime Damage Resistance
		SlimeDamageResistanceEnabled = config.getBoolean("Slime.DamageResistance.Enabled", SlimeDamageResistanceEnabled);
		SlimeDamageResistanceTime = config.getInt("Slime.DamageResistance.Time", SlimeDamageResistanceTime);
		SlimeDamageResistancePower = config.getInt("Slime.DamageResistance.Power", SlimeDamageResistancePower);

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

		// Slime IncreaseDamage
		SlimeIncreaseDamageEnabled = config.getBoolean("Slime.IncreaseDamage.Enabled", SlimeIncreaseDamageEnabled);
		SlimeIncreaseDamageTime = config.getInt("Slime.IncraseDamage.Time", SlimeIncreaseDamageTime);
		SlimeIncreaseDamagePower = config.getInt("Slime.IncreaseDamage.Power", SlimeIncreaseDamagePower);

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
		SlimeSlowDiggingEnabled = config.getBoolean("Slime.SlowDigging.Enabled", SlimeSlowDiggingEnabled);
		SlimeSlowDiggingTime = config.getInt("Slime.SlowDigging.Time", SlimeSlowDiggingTime);
		SlimeSlowDiggingPower = config.getInt("Slime.SlowDigging.Power", SlimeSlowDiggingPower);

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

		//Giant Confusion
		GiantConfusionEnabled = config.getBoolean("Giant.Confusion.Enabled", GiantConfusionEnabled);
		GiantConfusionTime = config.getInt("Giant.Confusion.Time", GiantConfusionTime);
		GiantConfusionPower = config.getInt("Giant.Confusion.Power", GiantConfusionPower);

		// Giant Damage Resistance
		GiantDamageResistanceEnabled = config.getBoolean("Giant.DamageResistance.Enabled", GiantDamageResistanceEnabled);
		GiantDamageResistanceTime = config.getInt("Giant.DamageResistance.Time", GiantDamageResistanceTime);
		GiantDamageResistancePower = config.getInt("Giant.DamageResistance.Power", GiantDamageResistancePower);

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

		// Giant IncreaseDamage
		GiantIncreaseDamageEnabled = config.getBoolean("Giant.IncreaseDamage.Enabled", GiantIncreaseDamageEnabled);
		GiantIncreaseDamageTime = config.getInt("Giant.IncraseDamage.Time", GiantIncreaseDamageTime);
		GiantIncreaseDamagePower = config.getInt("Giant.IncreaseDamage.Power", GiantIncreaseDamagePower);

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
		GiantSlowDiggingEnabled = config.getBoolean("Giant.SlowDigging.Enabled", GiantSlowDiggingEnabled);
		GiantSlowDiggingTime = config.getInt("Giant.SlowDigging.Time", GiantSlowDiggingTime);
		GiantSlowDiggingPower = config.getInt("Giant.SlowDigging.Power", GiantSlowDiggingPower);

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

		//Blaze Confusion
		BlazeConfusionEnabled = config.getBoolean("Blaze.Confusion.Enabled", BlazeConfusionEnabled);
		BlazeConfusionTime = config.getInt("Blaze.Confusion.Time", BlazeConfusionTime);
		BlazeConfusionPower = config.getInt("Blaze.Confusion.Power", BlazeConfusionPower);

		// Blaze Damage Resistance
		BlazeDamageResistanceEnabled = config.getBoolean("Blaze.DamageResistance.Enabled", BlazeDamageResistanceEnabled);
		BlazeDamageResistanceTime = config.getInt("Blaze.DamageResistance.Time", BlazeDamageResistanceTime);
		BlazeDamageResistancePower = config.getInt("Blaze.DamageResistance.Power", BlazeDamageResistancePower);

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

		// Blaze IncreaseDamage
		BlazeIncreaseDamageEnabled = config.getBoolean("Blaze.IncreaseDamage.Enabled", BlazeIncreaseDamageEnabled);
		BlazeIncreaseDamageTime = config.getInt("Blaze.IncreaseDamage.Time", BlazeIncreaseDamageTime);
		BlazeIncreaseDamagePower = config.getInt("Blaze.IncreaseDamage.Power", BlazeIncreaseDamagePower);

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
		BlazeSlowDiggingEnabled = config.getBoolean("Blaze.SlowDigging.Enabled", BlazeSlowDiggingEnabled);
		BlazeSlowDiggingTime = config.getInt("Blaze.SlowDigging.Time", BlazeSlowDiggingTime);
		BlazeSlowDiggingPower = config.getInt("Blaze.SlowDigging.Power", BlazeSlowDiggingPower);

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

		//MagmaCube Confusion
		MagmaCubeConfusionEnabled = config.getBoolean("MagmaCube.Confusion.Enabled", MagmaCubeConfusionEnabled);
		MagmaCubeConfusionTime = config.getInt("MagmaCube.Confusion.Time", MagmaCubeConfusionTime);
		MagmaCubeConfusionPower = config.getInt("MagmaCube.Confusion.Power", MagmaCubeConfusionPower);

		// MagmaCube Damage Resistance
		MagmaCubeDamageResistanceEnabled = config.getBoolean("MagmaCube.DamageResistance.Enabled", MagmaCubeDamageResistanceEnabled);
		MagmaCubeDamageResistanceTime = config.getInt("MagmaCube.DamageResistance.Time", MagmaCubeDamageResistanceTime);
		MagmaCubeDamageResistancePower = config.getInt("MagmaCube.DamageResistance.Power", MagmaCubeDamageResistancePower);

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

		// MagmaCube IncreaseDamage
		MagmaCubeIncreaseDamageEnabled = config.getBoolean("MagmaCube.IncreaseDamage.Enabled", MagmaCubeIncreaseDamageEnabled);
		MagmaCubeIncreaseDamageTime = config.getInt("MagmaCube.IncreaseDamage.Time", MagmaCubeIncreaseDamageTime);
		MagmaCubeIncreaseDamagePower = config.getInt("MagmaCube.IncreaseDamage.Power", MagmaCubeIncreaseDamagePower);

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
		MagmaCubeSlowDiggingEnabled = config.getBoolean("MagmaCube.SlowDigging.Enabled", MagmaCubeSlowDiggingEnabled);
		MagmaCubeSlowDiggingTime = config.getInt("MagmaCube.SlowDigging.Time", MagmaCubeSlowDiggingTime);
		MagmaCubeSlowDiggingPower = config.getInt("MagmaCube.SlowDigging.Power", MagmaCubeSlowDiggingPower);

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

		//CaveSpider Confusion
		CaveSpiderConfusionEnabled = config.getBoolean("CaveSpider.Confusion.Enabled", CaveSpiderConfusionEnabled);
		CaveSpiderConfusionTime = config.getInt("CaveSpider.Confusion.Time", CaveSpiderConfusionTime);
		CaveSpiderConfusionPower = config.getInt("CaveSpider.Confusion.Power", CaveSpiderConfusionPower);

		// CaveSpider Damage Resistance
		CaveSpiderDamageResistanceEnabled = config.getBoolean("CaveSpider.DamageResistance.Enabled", CaveSpiderDamageResistanceEnabled);
		CaveSpiderDamageResistanceTime = config.getInt("CaveSpider.DamageResistance.Time", CaveSpiderDamageResistanceTime);
		CaveSpiderDamageResistancePower = config.getInt("CaveSpider.DamageResistance.Power", CaveSpiderDamageResistancePower);

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

		// CaveSpider IncreaseDamage
		CaveSpiderIncreaseDamageEnabled = config.getBoolean("CaveSpider.IncreaseDamage.Enabled", CaveSpiderIncreaseDamageEnabled);
		CaveSpiderIncreaseDamageTime = config.getInt("CaveSpider.IncreaseDamage.Time", CaveSpiderIncreaseDamageTime);
		CaveSpiderIncreaseDamagePower = config.getInt("CaveSpider.IncreaseDamage.Power", CaveSpiderIncreaseDamagePower);

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
		CaveSpiderSlowDiggingEnabled = config.getBoolean("CaveSpider.SlowDigging.Enabled", CaveSpiderSlowDiggingEnabled);
		CaveSpiderSlowDiggingTime = config.getInt("CaveSpider.SlowDigging.Time", CaveSpiderSlowDiggingTime);
		CaveSpiderSlowDiggingPower = config.getInt("CaveSpider.SlowDigging.Power", CaveSpiderSlowDiggingPower);

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

		//PigZombie Confusion
		PigZombieConfusionEnabled = config.getBoolean("PigZombie.Confusion.Enabled", PigZombieConfusionEnabled);
		PigZombieConfusionTime = config.getInt("PigZombie.Confusion.Time", PigZombieConfusionTime);
		PigZombieConfusionPower = config.getInt("PigZombie.Confusion.Power", PigZombieConfusionPower);

		// PigZombie Damage Resistance
		PigZombieDamageResistanceEnabled = config.getBoolean("PigZombie.DamageResistance.Enabled", PigZombieDamageResistanceEnabled);
		PigZombieDamageResistanceTime = config.getInt("PigZombie.DamageResistance.Time", PigZombieDamageResistanceTime);
		PigZombieDamageResistancePower = config.getInt("PigZombie.DamageResistance.Power", PigZombieDamageResistancePower);

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

		// PigZombie IncreaseDamage
		PigZombieIncreaseDamageEnabled = config.getBoolean("PigZombie.IncreaseDamage.Enabled", PigZombieIncreaseDamageEnabled);
		PigZombieIncreaseDamageTime = config.getInt("PigZombie.IncreaseDamage.Time", PigZombieIncreaseDamageTime);
		PigZombieIncreaseDamagePower = config.getInt("PigZombie.IncreaseDamage.Power", PigZombieIncreaseDamagePower);

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
		PigZombieSlowDiggingEnabled = config.getBoolean("PigZombie.SlowDigging.Enabled", PigZombieSlowDiggingEnabled);
		PigZombieSlowDiggingTime = config.getInt("PigZombie.SlowDigging.Time", PigZombieSlowDiggingTime);
		PigZombieSlowDiggingPower = config.getInt("PigZombie.SlowDigging.Power", PigZombieSlowDiggingPower);

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
	
	// Set Defaults
		if (!config.contains("Worlds")) {
			final String[] def_worlds = {"world", "world_nether", "world_the_end"};
			config.set("Worlds", def_worlds);
		}
		config.set("Player.Blindness.Enabled", PlayerBlindnessEnabled);
		config.set("Player.Blindness.Time", PlayerBlindnessTime);
		config.set("Player.Blindness.Power", PlayerBlindnessPower);
		config.set("Player.Confusion.Enabled", PlayerConfusionEnabled);
		config.set("Player.Confusion.Time", PlayerConfusionTime);
		config.set("Player.Confusion.Power", PlayerConfusionPower);
		config.set("Player.DamageResistance.Enabled", PlayerDamageResistanceEnabled);
		config.set("Player.DamageResistance.Time", PlayerDamageResistanceTime);
		config.set("Player.DamageResistance.Power", PlayerDamageResistancePower);
		config.set("Player.FastDigging.Enabled", PlayerFastDiggingEnabled);
		config.set("Player.FastDigging.Time", PlayerFastDiggingTime);
		config.set("Player.FastDigging.Power", PlayerFastDiggingPower);
		config.set("Player.Harm.Enabled", PlayerHarmEnabled);
		config.set("Player.Harm.Time", PlayerHarmTime);
		config.set("Player.Harm.Power", PlayerHarmPower);
		config.set("Player.Heal.Enabled", PlayerHealEnabled);
		config.set("Player.Heal.Time", PlayerHealTime);
		config.set("Player.Heal.Power", PlayerHealPower);
		config.set("Player.IncreaseDamage.Enabled", PlayerIncreaseDamageEnabled);
		config.set("Player.IncreaseDamage.Time", PlayerIncreaseDamageTime);
		config.set("Player.IncreaseDamage.Power", PlayerIncreaseDamagePower);
		config.set("Player.Jump.Enabled", PlayerJumpEnabled);
		config.set("Player.Jump.Time", PlayerJumpTime);
		config.set("Player.Jump.Power", PlayerJumpPower);
		config.set("Player.Slow.Enabled", PlayerSlowEnabled);
		config.set("Player.Slow.Time", PlayerSlowTime);
		config.set("Player.Slow.Power", PlayerSlowPower);
		config.set("Player.SlowDigging.Enabled", PlayerSlowDiggingEnabled);
		config.set("Player.SlowDigging.Time", PlayerSlowDiggingTime);
		config.set("Player.SlowDigging.Power", PlayerSlowDiggingPower);
		config.set("Player.Speed.Enabled", PlayerSpeedEnabled);
		config.set("Player.Speed.Time", PlayerSpeedTime);
		config.set("Player.Speed.Power", PlayerSpeedPower);
		config.set("Player.WaterBreathing.Enabled", PlayerWaterBreathingEnabled);
		config.set("Player.WaterBreathing.Time", PlayerWaterBreathingTime);
		config.set("Player.WaterBreathing.Power", PlayerWaterBreathingPower);
		config.set("Player.Weakness.Enabled", PlayerWeaknessEnabled);
		config.set("Player.Weakness.Time", PlayerWeaknessTime);
		config.set("Player.Weakness.Power", PlayerWeaknessPower);
		// Zombies
		config.set("Zombie.Blindness.Enabled", ZombieBlindnessEnabled);
		config.set("Zombie.Blindness.Time", ZombieBlindnessTime);
		config.set("Zombie.Blindness.Power", ZombieBlindnessPower);
		config.set("Zombie.Confusion.Enabled", ZombieConfusionEnabled);
		config.set("Zombie.Confusion.Time", ZombieConfusionTime);
		config.set("Zombie.Confusion.Power", ZombieConfusionPower);
		config.set("Zombie.DamageResistance.Enabled", ZombieDamageResistanceEnabled);
		config.set("Zombie.DamageResistance.Time", ZombieDamageResistanceTime);
		config.set("Zombie.DamageResistance.Power", ZombieDamageResistancePower);
		config.set("Zombie.FastDigging.Enabled", ZombieFastDiggingEnabled);
		config.set("Zombie.FastDigging.Time", ZombieFastDiggingTime);
		config.set("Zombie.FastDigging.Power", ZombieFastDiggingPower);
		config.set("Zombie.FireResistance.Enabled", ZombieFireResistanceEnabled);
		config.set("Zombie.FireResistance.Time", ZombieFireResistanceTime);
		config.set("Zombie.FireResistance.Power", ZombieFireResistancePower);
		config.set("Zombie.Harm.Enabled", ZombieHarmEnabled);
		config.set("Zombie.Harm.Time", ZombieHarmTime);
		config.set("Zombie.Harm.Power", ZombieHarmPower);
		config.set("Zombie.Heal.Enabled", ZombieHealEnabled);
		config.set("Zombie.Heal.Time", ZombieHealTime);
		config.set("Zombie.Heal.Power", ZombieHealPower);
		config.set("Zombie.Hunger.Enabled", ZombieHungerEnabled);
		config.set("Zombie.Hunger.Time", ZombieHungerTime);
		config.set("Zombie.Hunger.Power", ZombieHungerPower);
		config.set("Zombie.IncreaseDamage.Enabled", ZombieIncreaseDamageEnabled);
		config.set("Zombie.IncreaseDamage.Time", ZombieIncreaseDamageTime);
		config.set("Zombie.IncreaseDamage.Power", ZombieIncreaseDamagePower);
		config.set("Zombie.Jump.Enabled", ZombieJumpEnabled);
		config.set("Zombie.Jump.Time", ZombieJumpTime);
		config.set("Zombie.Jump.Power", ZombieJumpPower);
		config.set("Zombie.Poison.Enabled", ZombiePoisonEnabled);
		config.set("Zombie.Poison.Time", ZombiePoisonTime);
		config.set("Zombie.Poison.Power", ZombiePoisonPower);
		config.set("Zombie.Regeneration.Enabled", ZombieRegenerationEnabled);
		config.set("Zombie.Regeneration.Time", ZombieRegenerationTime);
		config.set("Zombie.Regeneration.Power", ZombieRegenerationPower);
		config.set("Zombie.Slow.Enabled", ZombieSlowEnabled);
		config.set("Zombie.Slow.Time", ZombieSlowTime);
		config.set("Zombie.Slow.Power", ZombieSlowPower);
		config.set("Zombie.SlowDigging.Enabled", ZombieSlowDiggingEnabled);
		config.set("Zombie.SlowDigging.Time", ZombieSlowDiggingTime);
		config.set("Zombie.SlowDigging.Power", ZombieSlowDiggingPower);
		config.set("Zombie.Speed.Enabled", ZombieSpeedEnabled);
		config.set("Zombie.Speed.Time", ZombieSpeedTime);
		config.set("Zombie.Speed.Power", ZombieSpeedPower);
		config.set("Zombie.WaterBreathing.Enabled", ZombieWaterBreathingEnabled);
		config.set("Zombie.WaterBreathing.Time", ZombieWaterBreathingTime);
		config.set("Zombie.WaterBreathing.Power", ZombieWaterBreathingPower);
		config.set("Zombie.Weakness.Enabled", ZombieWeaknessEnabled);
		config.set("Zombie.Weakness.Time", ZombieWeaknessTime);
		config.set("Zombie.Weakness.Power", ZombieWeaknessPower);
		// Spiders
		config.set("Spider.Blindness.Enabled", SpiderBlindnessEnabled);
		config.set("Spider.Blindness.Time", SpiderBlindnessTime);
		config.set("Spider.Blindness.Power", SpiderBlindnessPower);
		config.set("Spider.Confusion.Enabled", SpiderConfusionEnabled);
		config.set("Spider.Confusion.Time", SpiderConfusionTime);
		config.set("Spider.Confusion.Power", SpiderConfusionPower);
		config.set("Spider.DamageResistance.Enabled", SpiderDamageResistanceEnabled);
		config.set("Spider.DamageResistance.Time", SpiderDamageResistanceTime);
		config.set("Spider.DamageResistance.Power", SpiderDamageResistancePower);
		config.set("Spider.FastDigging.Enabled", SpiderFastDiggingEnabled);
		config.set("Spider.FastDigging.Time", SpiderFastDiggingTime);
		config.set("Spider.FastDigging.Power", SpiderFastDiggingPower);
		config.set("Spider.FireResistance.Enabled", SpiderFireResistanceEnabled);
		config.set("Spider.FireResistance.Time", SpiderFireResistanceTime);
		config.set("Spider.FireResistance.Power", SpiderFireResistancePower);
		config.set("Spider.Harm.Enabled", SpiderHarmEnabled);
		config.set("Spider.Harm.Time", SpiderHarmTime);
		config.set("Spider.Harm.Power", SpiderHarmPower);
		config.set("Spider.Heal.Enabled", SpiderHealEnabled);
		config.set("Spider.Heal.Time", SpiderHealTime);
		config.set("Spider.Heal.Power", SpiderHealPower);
		config.set("Spider.Hunger.Enabled", SpiderHungerEnabled);
		config.set("Spider.Hunger.Time", SpiderHungerTime);
		config.set("Spider.Hunger.Power", SpiderHungerPower);
		config.set("Spider.IncreaseDamage.Enabled", SpiderIncreaseDamageEnabled);
		config.set("Spider.IncreaseDamage.Time", SpiderIncreaseDamageTime);
		config.set("Spider.IncreaseDamage.Power", SpiderIncreaseDamagePower);
		config.set("Spider.Jump.Enabled", SpiderJumpEnabled);
		config.set("Spider.Jump.Time", SpiderJumpTime);
		config.set("Spider.Jump.Power", SpiderJumpPower);
		config.set("Spider.Poison.Enabled", SpiderPoisonEnabled);
		config.set("Spider.Poison.Time", SpiderPoisonTime);
		config.set("Spider.Poison.Power", SpiderPoisonPower);
		config.set("Spider.Regeneration.Enabled", SpiderRegenerationEnabled);
		config.set("Spider.Regeneration.Time", SpiderRegenerationTime);
		config.set("Spider.Regeneration.Power", SpiderRegenerationPower);
		config.set("Spider.Slow.Enabled", SpiderSlowEnabled);
		config.set("Spider.Slow.Time", SpiderSlowTime);
		config.set("Spider.Slow.Power", SpiderSlowPower);
		config.set("Spider.SlowDigging.Enabled", SpiderSlowDiggingEnabled);
		config.set("Spider.SlowDigging.Time", SpiderSlowDiggingTime);
		config.set("Spider.SlowDigging.Power", SpiderSlowDiggingPower);
		config.set("Spider.Speed.Enabled", SpiderSpeedEnabled);
		config.set("Spider.Speed.Time", SpiderSpeedTime);
		config.set("Spider.Speed.Power", SpiderSpeedPower);
		config.set("Spider.WaterBreathing.Enabled", SpiderWaterBreathingEnabled);
		config.set("Spider.WaterBreathing.Time", SpiderWaterBreathingTime);
		config.set("Spider.WaterBreathing.Power", SpiderWaterBreathingPower);
		config.set("Spider.Weakness.Enabled", SpiderWeaknessEnabled);
		config.set("Spider.Weakness.Time", SpiderWeaknessTime);
		config.set("Spider.Weakness.Power", SpiderWeaknessPower);
		// Creeper
		config.set("Creeper.Blindness.Enabled", CreeperBlindnessEnabled);
		config.set("Creeper.Blindness.Time", CreeperBlindnessTime);
		config.set("Creeper.Blindness.Power", CreeperBlindnessPower);
		config.set("Creeper.Confusion.Enabled", CreeperConfusionEnabled);
		config.set("Creeper.Confusion.Time", CreeperConfusionTime);
		config.set("Creeper.Confusion.Power", CreeperConfusionPower);
		config.set("Creeper.DamageResistance.Enabled", CreeperDamageResistanceEnabled);
		config.set("Creeper.DamageResistance.Time", CreeperDamageResistanceTime);
		config.set("Creeper.DamageResistance.Power", CreeperDamageResistancePower);
		config.set("Creeper.FastDigging.Enabled", CreeperFastDiggingEnabled);
		config.set("Creeper.FastDigging.Time", CreeperFastDiggingTime);
		config.set("Creeper.FastDigging.Power", CreeperFastDiggingPower);
		config.set("Creeper.FireResistance.Enabled", CreeperFireResistanceEnabled);
		config.set("Creeper.FireResistance.Time", CreeperFireResistanceTime);
		config.set("Creeper.FireResistance.Power", CreeperFireResistancePower);
		config.set("Creeper.Harm.Enabled", CreeperHarmEnabled);
		config.set("Creeper.Harm.Time", CreeperHarmTime);
		config.set("Creeper.Harm.Power", CreeperHarmPower);
		config.set("Creeper.Heal.Enabled", CreeperHealEnabled);
		config.set("Creeper.Heal.Time", CreeperHealTime);
		config.set("Creeper.Heal.Power", CreeperHealPower);
		config.set("Creeper.Hunger.Enabled", CreeperHungerEnabled);
		config.set("Creeper.Hunger.Time", CreeperHungerTime);
		config.set("Creeper.Hunger.Power", CreeperHungerPower);
		config.set("Creeper.IncreaseDamage.Enabled", CreeperIncreaseDamageEnabled);
		config.set("Creeper.IncreaseDamage.Time", CreeperIncreaseDamageTime);
		config.set("Creeper.IncreaseDamage.Power", CreeperIncreaseDamagePower);
		config.set("Creeper.Jump.Enabled", CreeperJumpEnabled);
		config.set("Creeper.Jump.Time", CreeperJumpTime);
		config.set("Creeper.Jump.Power", CreeperJumpPower);
		config.set("Creeper.Poison.Enabled", CreeperPoisonEnabled);
		config.set("Creeper.Poison.Time", CreeperPoisonTime);
		config.set("Creeper.Poison.Power", CreeperPoisonPower);
		config.set("Creeper.Regeneration.Enabled", CreeperRegenerationEnabled);
		config.set("Creeper.Regeneration.Time", CreeperRegenerationTime);
		config.set("Creeper.Regeneration.Power", CreeperRegenerationPower);
		config.set("Creeper.Slow.Enabled", CreeperSlowEnabled);
		config.set("Creeper.Slow.Time", CreeperSlowTime);
		config.set("Creeper.Slow.Power", CreeperSlowPower);
		config.set("Creeper.SlowDigging.Enabled", CreeperSlowDiggingEnabled);
		config.set("Creeper.SlowDigging.Time", CreeperSlowDiggingTime);
		config.set("Creeper.SlowDigging.Power", CreeperSlowDiggingPower);
		config.set("Creeper.Speed.Enabled", CreeperSpeedEnabled);
		config.set("Creeper.Speed.Time", CreeperSpeedTime);
		config.set("Creeper.Speed.Power", CreeperSpeedPower);
		config.set("Creeper.WaterBreathing.Enabled", CreeperWaterBreathingEnabled);
		config.set("Creeper.WaterBreathing.Time", CreeperWaterBreathingTime);
		config.set("Creeper.WaterBreathing.Power", CreeperWaterBreathingPower);
		config.set("Creeper.Weakness.Enabled", CreeperWeaknessEnabled);
		config.set("Creeper.Weakness.Time", CreeperWeaknessTime);
		config.set("Creeper.Weakness.Power", CreeperWeaknessPower);
		// Enderman
		config.set("Enderman.Blindness.Enabled", EndermanBlindnessEnabled);
		config.set("Enderman.Blindness.Time", EndermanBlindnessTime);
		config.set("Enderman.Blindness.Power", EndermanBlindnessPower);
		config.set("Enderman.Confusion.Enabled", EndermanConfusionEnabled);
		config.set("Enderman.Confusion.Time", EndermanConfusionTime);
		config.set("Enderman.Confusion.Power", EndermanConfusionPower);
		config.set("Enderman.DamageResistance.Enabled", EndermanDamageResistanceEnabled);
		config.set("Enderman.DamageResistance.Time", EndermanDamageResistanceTime);
		config.set("Enderman.DamageResistance.Power", EndermanDamageResistancePower);
		config.set("Enderman.FastDigging.Enabled", EndermanFastDiggingEnabled);
		config.set("Enderman.FastDigging.Time", EndermanFastDiggingTime);
		config.set("Enderman.FastDigging.Power", EndermanFastDiggingPower);
		config.set("Enderman.FireResistance.Enabled", EndermanFireResistanceEnabled);
		config.set("Enderman.FireResistance.Time", EndermanFireResistanceTime);
		config.set("Enderman.FireResistance.Power", EndermanFireResistancePower);
		config.set("Enderman.Harm.Enabled", EndermanHarmEnabled);
		config.set("Enderman.Harm.Time", EndermanHarmTime);
		config.set("Enderman.Harm.Power", EndermanHarmPower);
		config.set("Enderman.Heal.Enabled", EndermanHealEnabled);
		config.set("Enderman.Heal.Time", EndermanHealTime);
		config.set("Enderman.Heal.Power", EndermanHealPower);
		config.set("Enderman.Hunger.Enabled", EndermanHungerEnabled);
		config.set("Enderman.Hunger.Time", EndermanHungerTime);
		config.set("Enderman.Hunger.Power", EndermanHungerPower);
		config.set("Enderman.IncreaseDamage.Enabled", EndermanIncreaseDamageEnabled);
		config.set("Enderman.IncreaseDamage.Time", EndermanIncreaseDamageTime);
		config.set("Enderman.IncreaseDamage.Power", EndermanIncreaseDamagePower);
		config.set("Enderman.Jump.Enabled", EndermanJumpEnabled);
		config.set("Enderman.Jump.Time", EndermanJumpTime);
		config.set("Enderman.Jump.Power", EndermanJumpPower);
		config.set("Enderman.Poison.Enabled", EndermanPoisonEnabled);
		config.set("Enderman.Poison.Time", EndermanPoisonTime);
		config.set("Enderman.Poison.Power", EndermanPoisonPower);
		config.set("Enderman.Regeneration.Enabled", EndermanRegenerationEnabled);
		config.set("Enderman.Regeneration.Time", EndermanRegenerationTime);
		config.set("Enderman.Regeneration.Power", EndermanRegenerationPower);
		config.set("Enderman.Slow.Enabled", EndermanSlowEnabled);
		config.set("Enderman.Slow.Time", EndermanSlowTime);
		config.set("Enderman.Slow.Power", EndermanSlowPower);
		config.set("Enderman.SlowDigging.Enabled", EndermanSlowDiggingEnabled);
		config.set("Enderman.SlowDigging.Time", EndermanSlowDiggingTime);
		config.set("Enderman.SlowDigging.Power", EndermanSlowDiggingPower);
		config.set("Enderman.Speed.Enabled", EndermanSpeedEnabled);
		config.set("Enderman.Speed.Time", EndermanSpeedTime);
		config.set("Enderman.Speed.Power", EndermanSpeedPower);
		config.set("Enderman.WaterBreathing.Enabled", EndermanWaterBreathingEnabled);
		config.set("Enderman.WaterBreathing.Time", EndermanWaterBreathingTime);
		config.set("Enderman.WaterBreathing.Power", EndermanWaterBreathingPower);
		config.set("Enderman.Weakness.Enabled", EndermanWeaknessEnabled);
		config.set("Enderman.Weakness.Time", EndermanWeaknessTime);
		config.set("Enderman.Weakness.Power", EndermanWeaknessPower);
		// Slimes
		config.set("Slime.Blindness.Enabled", SlimeBlindnessEnabled);
		config.set("Slime.Blindness.Time", SlimeBlindnessTime);
		config.set("Slime.Blindness.Power", SlimeBlindnessPower);
		config.set("Slime.Confusion.Enabled", SlimeConfusionEnabled);
		config.set("Slime.Confusion.Time", SlimeConfusionTime);
		config.set("Slime.Confusion.Power", SlimeConfusionPower);
		config.set("Slime.DamageResistance.Enabled", SlimeDamageResistanceEnabled);
		config.set("Slime.DamageResistance.Time", SlimeDamageResistanceTime);
		config.set("Slime.DamageResistance.Power", SlimeDamageResistancePower);
		config.set("Slime.FastDigging.Enabled", SlimeFastDiggingEnabled);
		config.set("Slime.FastDigging.Time", SlimeFastDiggingTime);
		config.set("Slime.FastDigging.Power", SlimeFastDiggingPower);
		config.set("Slime.Harm.Enabled", SlimeHarmEnabled);
		config.set("Slime.Harm.Time", SlimeHarmTime);
		config.set("Slime.Harm.Power", SlimeHarmPower);
		config.set("Slime.Heal.Enabled", SlimeHealEnabled);
		config.set("Slime.Heal.Time", SlimeHealTime);
		config.set("Slime.Heal.Power", SlimeHealPower);
		config.set("Slime.IncreaseDamage.Enabled", SlimeIncreaseDamageEnabled);
		config.set("Slime.IncreaseDamage.Time", SlimeIncreaseDamageTime);
		config.set("Slime.IncreaseDamage.Power", SlimeIncreaseDamagePower);
		config.set("Slime.Jump.Enabled", SlimeJumpEnabled);
		config.set("Slime.Jump.Time", SlimeJumpTime);
		config.set("Slime.Jump.Power", SlimeJumpPower);
		config.set("Slime.Slow.Enabled", SlimeSlowEnabled);
		config.set("Slime.Slow.Time", SlimeSlowTime);
		config.set("Slime.Slow.Power", SlimeSlowPower);
		config.set("Slime.SlowDigging.Enabled", SlimeSlowDiggingEnabled);
		config.set("Slime.SlowDigging.Time", SlimeSlowDiggingTime);
		config.set("Slime.SlowDigging.Power", SlimeSlowDiggingPower);
		config.set("Slime.Speed.Enabled", SlimeSpeedEnabled);
		config.set("Slime.Speed.Time", SlimeSpeedTime);
		config.set("Slime.Speed.Power", SlimeSpeedPower);
		config.set("Slime.WaterBreathing.Enabled", SlimeWaterBreathingEnabled);
		config.set("Slime.WaterBreathing.Time", SlimeWaterBreathingTime);
		config.set("Slime.WaterBreathing.Power", SlimeWaterBreathingPower);
		config.set("Slime.Weakness.Enabled", SlimeWeaknessEnabled);
		config.set("Slime.Weakness.Time", SlimeWeaknessTime);
		config.set("Slime.Weakness.Power", SlimeWeaknessPower);
		// Giants
		config.set("Giant.Blindness.Enabled", GiantBlindnessEnabled);
		config.set("Giant.Blindness.Time", GiantBlindnessTime);
		config.set("Giant.Blindness.Power", GiantBlindnessPower);
		config.set("Giant.Confusion.Enabled", GiantConfusionEnabled);
		config.set("Giant.Confusion.Time", GiantConfusionTime);
		config.set("Giant.Confusion.Power", GiantConfusionPower);
		config.set("Giant.DamageResistance.Enabled", GiantDamageResistanceEnabled);
		config.set("Giant.DamageResistance.Time", GiantDamageResistanceTime);
		config.set("Giant.DamageResistance.Power", GiantDamageResistancePower);
		config.set("Giant.FastDigging.Enabled", GiantFastDiggingEnabled);
		config.set("Giant.FastDigging.Time", GiantFastDiggingTime);
		config.set("Giant.FastDigging.Power", GiantFastDiggingPower);
		config.set("Giant.Harm.Enabled", GiantHarmEnabled);
		config.set("Giant.Harm.Time", GiantHarmTime);
		config.set("Giant.Harm.Power", GiantHarmPower);
		config.set("Giant.Heal.Enabled", GiantHealEnabled);
		config.set("Giant.Heal.Time", GiantHealTime);
		config.set("Giant.Heal.Power", GiantHealPower);
		config.set("Giant.IncreaseDamage.Enabled", GiantIncreaseDamageEnabled);
		config.set("Giant.IncreaseDamage.Time", GiantIncreaseDamageTime);
		config.set("Giant.IncreaseDamage.Power", GiantIncreaseDamagePower);
		config.set("Giant.Jump.Enabled", GiantJumpEnabled);
		config.set("Giant.Jump.Time", GiantJumpTime);
		config.set("Giant.Jump.Power", GiantJumpPower);
		config.set("Giant.Slow.Enabled", GiantSlowEnabled);
		config.set("Giant.Slow.Time", GiantSlowTime);
		config.set("Giant.Slow.Power", GiantSlowPower);
		config.set("Giant.SlowDigging.Enabled", GiantSlowDiggingEnabled);
		config.set("Giant.SlowDigging.Time", GiantSlowDiggingTime);
		config.set("Giant.SlowDigging.Power", GiantSlowDiggingPower);
		config.set("Giant.Speed.Enabled", GiantSpeedEnabled);
		config.set("Giant.Speed.Time", GiantSpeedTime);
		config.set("Giant.Speed.Power", GiantSpeedPower);
		config.set("Giant.WaterBreathing.Enabled", GiantWaterBreathingEnabled);
		config.set("Giant.WaterBreathing.Time", GiantWaterBreathingTime);
		config.set("Giant.WaterBreathing.Power", GiantWaterBreathingPower);
		config.set("Giant.Weakness.Enabled", GiantWeaknessEnabled);
		config.set("Giant.Weakness.Time", GiantWeaknessTime);
		config.set("Giant.Weakness.Power", GiantWeaknessPower);
		// Blaze
		config.set("Blaze.Blindness.Enabled", BlazeBlindnessEnabled);
		config.set("Blaze.Blindness.Time", BlazeBlindnessTime);
		config.set("Blaze.Blindness.Power", BlazeBlindnessPower);
		config.set("Blaze.Confusion.Enabled", BlazeConfusionEnabled);
		config.set("Blaze.Confusion.Time", BlazeConfusionTime);
		config.set("Blaze.Confusion.Power", BlazeConfusionPower);
		config.set("Blaze.DamageResistance.Enabled", BlazeDamageResistanceEnabled);
		config.set("Blaze.DamageResistance.Time", BlazeDamageResistanceTime);
		config.set("Blaze.DamageResistance.Power", BlazeDamageResistancePower);
		config.set("Blaze.FastDigging.Enabled", BlazeFastDiggingEnabled);
		config.set("Blaze.FastDigging.Time", BlazeFastDiggingTime);
		config.set("Blaze.FastDigging.Power", BlazeFastDiggingPower);
		config.set("Blaze.Harm.Enabled", BlazeHarmEnabled);
		config.set("Blaze.Harm.Time", BlazeHarmTime);
		config.set("Blaze.Harm.Power", BlazeHarmPower);
		config.set("Blaze.Heal.Enabled", BlazeHealEnabled);
		config.set("Blaze.Heal.Time", BlazeHealTime);
		config.set("Blaze.Heal.Power", BlazeHealPower);
		config.set("Blaze.IncreaseDamage.Enabled", BlazeIncreaseDamageEnabled);
		config.set("Blaze.IncreaseDamage.Time", BlazeIncreaseDamageTime);
		config.set("Blaze.IncreaseDamage.Power", BlazeIncreaseDamagePower);
		config.set("Blaze.Jump.Enabled", BlazeJumpEnabled);
		config.set("Blaze.Jump.Time", BlazeJumpTime);
		config.set("Blaze.Jump.Power", BlazeJumpPower);
		config.set("Blaze.Slow.Enabled", BlazeSlowEnabled);
		config.set("Blaze.Slow.Time", BlazeSlowTime);
		config.set("Blaze.Slow.Power", BlazeSlowPower);
		config.set("Blaze.SlowDigging.Enabled", BlazeSlowDiggingEnabled);
		config.set("Blaze.SlowDigging.Time", BlazeSlowDiggingTime);
		config.set("Blaze.SlowDigging.Power", BlazeSlowDiggingPower);
		config.set("Blaze.Speed.Enabled", BlazeSpeedEnabled);
		config.set("Blaze.Speed.Time", BlazeSpeedTime);
		config.set("Blaze.Speed.Power", BlazeSpeedPower);
		config.set("Blaze.WaterBreathing.Enabled", BlazeWaterBreathingEnabled);
		config.set("Blaze.WaterBreathing.Time", BlazeWaterBreathingTime);
		config.set("Blaze.WaterBreathing.Power", BlazeWaterBreathingPower);
		config.set("Blaze.Weakness.Enabled", BlazeWeaknessEnabled);
		config.set("Blaze.Weakness.Time", BlazeWeaknessTime);
		config.set("Blaze.Weakness.Power", BlazeWeaknessPower);
		// Magma Cube
		config.set("MagmaCube.Blindness.Enabled", MagmaCubeBlindnessEnabled);
		config.set("MagmaCube.Blindness.Time", MagmaCubeBlindnessTime);
		config.set("MagmaCube.Blindness.Power", MagmaCubeBlindnessPower);
		config.set("MagmaCube.Confusion.Enabled", MagmaCubeConfusionEnabled);
		config.set("MagmaCube.Confusion.Time", MagmaCubeConfusionTime);
		config.set("MagmaCube.Confusion.Power", MagmaCubeConfusionPower);
		config.set("MagmaCube.DamageResistance.Enabled", MagmaCubeDamageResistanceEnabled);
		config.set("MagmaCube.DamageResistance.Time", MagmaCubeDamageResistanceTime);
		config.set("MagmaCube.DamageResistance.Power", MagmaCubeDamageResistancePower);
		config.set("MagmaCube.FastDigging.Enabled", MagmaCubeFastDiggingEnabled);
		config.set("MagmaCube.FastDigging.Time", MagmaCubeFastDiggingTime);
		config.set("MagmaCube.FastDigging.Power", MagmaCubeFastDiggingPower);
		config.set("MagmaCube.Harm.Enabled", MagmaCubeHarmEnabled);
		config.set("MagmaCube.Harm.Time", MagmaCubeHarmTime);
		config.set("MagmaCube.Harm.Power", MagmaCubeHarmPower);
		config.set("MagmaCube.Heal.Enabled", MagmaCubeHealEnabled);
		config.set("MagmaCube.Heal.Time", MagmaCubeHealTime);
		config.set("MagmaCube.Heal.Power", MagmaCubeHealPower);
		config.set("MagmaCube.IncreaseDamage.Enabled", MagmaCubeIncreaseDamageEnabled);
		config.set("MagmaCube.IncreaseDamage.Time", MagmaCubeIncreaseDamageTime);
		config.set("MagmaCube.IncreaseDamage.Power", MagmaCubeIncreaseDamagePower);
		config.set("MagmaCube.Jump.Enabled", MagmaCubeJumpEnabled);
		config.set("MagmaCube.Jump.Time", MagmaCubeJumpTime);
		config.set("MagmaCube.Jump.Power", MagmaCubeJumpPower);
		config.set("MagmaCube.Slow.Enabled", MagmaCubeSlowEnabled);
		config.set("MagmaCube.Slow.Time", MagmaCubeSlowTime);
		config.set("MagmaCube.Slow.Power", MagmaCubeSlowPower);
		config.set("MagmaCube.SlowDigging.Enabled", MagmaCubeSlowDiggingEnabled);
		config.set("MagmaCube.SlowDigging.Time", MagmaCubeSlowDiggingTime);
		config.set("MagmaCube.SlowDigging.Power", MagmaCubeSlowDiggingPower);
		config.set("MagmaCube.Speed.Enabled", MagmaCubeSpeedEnabled);
		config.set("MagmaCube.Speed.Time", MagmaCubeSpeedTime);
		config.set("MagmaCube.Speed.Power", MagmaCubeSpeedPower);
		config.set("MagmaCube.WaterBreathing.Enabled", MagmaCubeWaterBreathingEnabled);
		config.set("MagmaCube.WaterBreathing.Time", MagmaCubeWaterBreathingTime);
		config.set("MagmaCube.WaterBreathing.Power", MagmaCubeWaterBreathingPower);
		config.set("MagmaCube.Weakness.Enabled", MagmaCubeWeaknessEnabled);
		config.set("MagmaCube.Weakness.Time", MagmaCubeWeaknessTime);
		config.set("MagmaCube.Weakness.Power", MagmaCubeWeaknessPower);
		// Cave Spiders
		config.set("CaveSpider.Blindness.Enabled", CaveSpiderBlindnessEnabled);
		config.set("CaveSpider.Blindness.Time", CaveSpiderBlindnessTime);
		config.set("CaveSpider.Blindness.Power", CaveSpiderBlindnessPower);
		config.set("CaveSpider.Confusion.Enabled", CaveSpiderConfusionEnabled);
		config.set("CaveSpider.Confusion.Time", CaveSpiderConfusionTime);
		config.set("CaveSpider.Confusion.Power", CaveSpiderConfusionPower);
		config.set("CaveSpider.DamageResistance.Enabled", CaveSpiderDamageResistanceEnabled);
		config.set("CaveSpider.DamageResistance.Time", CaveSpiderDamageResistanceTime);
		config.set("CaveSpider.DamageResistance.Power", CaveSpiderDamageResistancePower);
		config.set("CaveSpider.FastDigging.Enabled", CaveSpiderFastDiggingEnabled);
		config.set("CaveSpider.FastDigging.Time", CaveSpiderFastDiggingTime);
		config.set("CaveSpider.FastDigging.Power", CaveSpiderFastDiggingPower);
		config.set("CaveSpider.Harm.Enabled", CaveSpiderHarmEnabled);
		config.set("CaveSpider.Harm.Time", CaveSpiderHarmTime);
		config.set("CaveSpider.Harm.Power", CaveSpiderHarmPower);
		config.set("CaveSpider.Heal.Enabled", CaveSpiderHealEnabled);
		config.set("CaveSpider.Heal.Time", CaveSpiderHealTime);
		config.set("CaveSpider.Heal.Power", CaveSpiderHealPower);
		config.set("CaveSpider.IncreaseDamage.Enabled", CaveSpiderIncreaseDamageEnabled);
		config.set("CaveSpider.IncreaseDamage.Time", CaveSpiderIncreaseDamageTime);
		config.set("CaveSpider.IncreaseDamage.Power", CaveSpiderIncreaseDamagePower);
		config.set("CaveSpider.Jump.Enabled", CaveSpiderJumpEnabled);
		config.set("CaveSpider.Jump.Time", CaveSpiderJumpTime);
		config.set("CaveSpider.Jump.Power", CaveSpiderJumpPower);
		config.set("CaveSpider.Slow.Enabled", CaveSpiderSlowEnabled);
		config.set("CaveSpider.Slow.Time", CaveSpiderSlowTime);
		config.set("CaveSpider.Slow.Power", CaveSpiderSlowPower);
		config.set("CaveSpider.SlowDigging.Enabled", CaveSpiderSlowDiggingEnabled);
		config.set("CaveSpider.SlowDigging.Time", CaveSpiderSlowDiggingTime);
		config.set("CaveSpider.SlowDigging.Power", CaveSpiderSlowDiggingPower);
		config.set("CaveSpider.Speed.Enabled", CaveSpiderSpeedEnabled);
		config.set("CaveSpider.Speed.Time", CaveSpiderSpeedTime);
		config.set("CaveSpider.Speed.Power", CaveSpiderSpeedPower);
		config.set("CaveSpider.WaterBreathing.Enabled", CaveSpiderWaterBreathingEnabled);
		config.set("CaveSpider.WaterBreathing.Time", CaveSpiderWaterBreathingTime);
		config.set("CaveSpider.WaterBreathing.Power", CaveSpiderWaterBreathingPower);
		config.set("CaveSpider.Weakness.Enabled", CaveSpiderWeaknessEnabled);
		config.set("CaveSpider.Weakness.Time", CaveSpiderWeaknessTime);
		config.set("CaveSpider.Weakness.Power", CaveSpiderWeaknessPower);
		// PigZombie
		config.set("PigZombie.Blindness.Enabled", PigZombieBlindnessEnabled);
		config.set("PigZombie.Blindness.Time", PigZombieBlindnessTime);
		config.set("PigZombie.Blindness.Power", PigZombieBlindnessPower);
		config.set("PigZombie.Confusion.Enabled", PigZombieConfusionEnabled);
		config.set("PigZombie.Confusion.Time", PigZombieConfusionTime);
		config.set("PigZombie.Confusion.Power", PigZombieConfusionPower);
		config.set("PigZombie.DamageResistance.Enabled", PigZombieDamageResistanceEnabled);
		config.set("PigZombie.DamageResistance.Time", PigZombieDamageResistanceTime);
		config.set("PigZombie.DamageResistance.Power", PigZombieDamageResistancePower);
		config.set("PigZombie.FastDigging.Enabled", PigZombieFastDiggingEnabled);
		config.set("PigZombie.FastDigging.Time", PigZombieFastDiggingTime);
		config.set("PigZombie.FastDigging.Power", PigZombieFastDiggingPower);
		config.set("PigZombie.Harm.Enabled", PigZombieHarmEnabled);
		config.set("PigZombie.Harm.Time", PigZombieHarmTime);
		config.set("PigZombie.Harm.Power", PigZombieHarmPower);
		config.set("PigZombie.Heal.Enabled", PigZombieHealEnabled);
		config.set("PigZombie.Heal.Time", PigZombieHealTime);
		config.set("PigZombie.Heal.Power", PigZombieHealPower);
		config.set("PigZombie.IncreaseDamage.Enabled", PigZombieIncreaseDamageEnabled);
		config.set("PigZombie.IncreaseDamage.Time", PigZombieIncreaseDamageTime);
		config.set("PigZombie.IncreaseDamage.Power", PigZombieIncreaseDamagePower);
		config.set("PigZombie.Jump.Enabled", PigZombieJumpEnabled);
		config.set("PigZombie.Jump.Time", PigZombieJumpTime);
		config.set("PigZombie.Jump.Power", PigZombieJumpPower);
		config.set("PigZombie.Slow.Enabled", PigZombieSlowEnabled);
		config.set("PigZombie.Slow.Time", PigZombieSlowTime);
		config.set("PigZombie.Slow.Power", PigZombieSlowPower);
		config.set("PigZombie.SlowDigging.Enabled", PigZombieSlowDiggingEnabled);
		config.set("PigZombie.SlowDigging.Time", PigZombieSlowDiggingTime);
		config.set("PigZombie.SlowDigging.Power", PigZombieSlowDiggingPower);
		config.set("PigZombie.Speed.Enabled", PigZombieSpeedEnabled);
		config.set("PigZombie.Speed.Time", PigZombieSpeedTime);
		config.set("PigZombie.Speed.Power", PigZombieSpeedPower);
		config.set("PigZombie.WaterBreathing.Enabled", PigZombieWaterBreathingEnabled);
		config.set("PigZombie.WaterBreathing.Time", PigZombieWaterBreathingTime);
		config.set("PigZombie.WaterBreathing.Power", PigZombieWaterBreathingPower);
		config.set("PigZombie.Weakness.Enabled", PigZombieWeaknessEnabled);
		config.set("PigZombie.Weakness.Time", PigZombieWeaknessTime);
		config.set("PigZombie.Weakness.Power", PigZombieWeaknessPower);
	
	try {
		config.save(file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
