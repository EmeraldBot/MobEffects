package com.etriacraft.MobEffects;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
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
	
	// Set Defaults
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
	
	try {
		config.save(file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
