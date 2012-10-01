package com.etriacraft.MobEffects;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
	// Player Stuffs
		// Blindness
	public static boolean PlayerBlindnessEnabled = true;
	public static int PlayerBlindnessTime = 500;
	public static int PlayerBlindnessPower = 1;
		// Confusion
	public static boolean PlayerConfusionEnabled = true;
	public static int PlayerConfusionTime = 500;
	public static int PlayerConfusionPower = 1;
		// Damage Resistance
	public static boolean PlayerDamageResistanceEnabled = true;
	public static int PlayerDamageResistanceTime = 500;
	public static int PlayerDamageResistancePower = 1;
		// Fast Digging
	public static boolean PlayerFastDiggingEnabled = true;
	public static int PlayerFastDiggingTime = 500;
	public static int PlayerFastDiggingPower = 1;
		// Fire Resistance
	public static boolean PlayerFireResistanceEnabled = true;
	public static int PlayerFireResistanceTime = 500;
	public static int PlayerFireResistancePower = 1;
		// Harm
	public static boolean PlayerHarmEnabled = true;
	public static int PlayerHarmTime = 500;
	public static int PlayerHarmPower = 1;
		// Heal
	public static boolean PlayerHealEnabled = true;
	public static int PlayerHealTime = 500;
	public static int PlayerHealPower = 1;
		// Hunger
	public static boolean PlayerHungerEnabled = true;
	public static int PlayerHungerTime = 500;
	public static int PlayerHungerPower = 1;
		// Increase Damage
	public static boolean PlayerIncreaseDamageEnabled = true;
	public static int PlayerIncreaseDamageTime = 500;
	public static int PlayerIncreaseDamagePower = 1;
		// Jump
	public static boolean PlayerJumpEnabled = true;
	public static int PlayerJumpTime = 500;
	public static int PlayerJumpPower = 1;
		// Poison
	public static boolean PlayerPoisonEnabled = true;
	public static int PlayerPoisonTime = 500;
	public static int PlayerPoisonPower = 1;
		// Regeneration
	public static boolean PlayerRegenerationEnabled = true;
	public static int PlayerRegenerationTime = 500;
	public static int PlayerRegenerationPower = 1;
		// Slow
	public static boolean PlayerSlowEnabled = true;
	public static int PlayerSlowTime = 500;
	public static int PlayerSlowPower = 1;
		// Slow Digging
	public static boolean PlayerSlowDiggingEnabled = true;
	public static int PlayerSlowDiggingTime = 500;
	public static int PlayerSlowDiggingPower = 1;
		// Speed
	public static boolean PlayerSpeedEnabled = true;
	public static int PlayerSpeedTime = 500;
	public static int PlayerSpeedPower = 1;
		// Water Breathing
	public static boolean PlayerWaterBreathingEnabled = true;
	public static int PlayerWaterBreathingTime = 500;
	public static int PlayerWaterBreathingPower = 100;
		// Weakness
	public static boolean PlayerWeaknessEnabled = true;
	public static int PlayerWeaknessTime = 500;
	public static int PlayerWeaknessPower = 100;
	
	// Zombie Stuffs
	public static boolean ZombiesEnabled = true;
	public static int ZombiePoisonTime = 500;
	public static int ZombiePoisonPower = 1;
	
	// Enders
	public static boolean EndermanEnabled = true;
	public static int EndermanBlindTime = 500;
	public static int EndermanBlindPower = 1;
	
	// Spiders
	public static boolean SpiderEnabled = true;
	public static int SpiderWeakTime = 500;
	public static int SpiderWeakPower = 1;
	public static int SpiderSlowTime = 500;
	public static int SpiderSlowPower = 1;
	
	// Creepers
	public static boolean CreeperEnabled = true;
	public static int CreeperConfusionTime = 500;
	public static int CreeperConfusionPower = 1;
	public static int CreeperPoisonTime = 500;
	public static int CreeperPoisonPower = 1;
	
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
		PlayerDamageResistanceEnabled = config.getBoolean("Player.Damage_Resistance.Enabled", PlayerDamageResistanceEnabled);
		PlayerDamageResistanceTime = config.getInt("Player.Damage_Resistance.Time", PlayerDamageResistanceTime);
		PlayerDamageResistancePower = config.getInt("Player.Damage_Resistance.Power", PlayerDamageResistancePower);
		
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
		
		// Player FastDamage
		PlayerIncreaseDamageEnabled = config.getBoolean("Player.FastDamage.Enabled", PlayerIncreaseDamageEnabled);
		PlayerIncreaseDamageTime = config.getInt("Player.FastDamage.Time", PlayerIncreaseDamageTime);
		PlayerIncreaseDamagePower = config.getInt("Player.FastDamage.Power", PlayerIncreaseDamagePower);
		
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
		
		// Zombies
		ZombiesEnabled = config.getBoolean("Zombies.Enabled", ZombiesEnabled);
		ZombiePoisonTime = config.getInt("Zombies.Poison.Time", ZombiePoisonTime);
		ZombiePoisonPower = config.getInt("Zombies.Poison.Power", ZombiePoisonPower);
		
		// Enders
		EndermanEnabled = config.getBoolean("Enderman.Enabled", EndermanEnabled);
		EndermanBlindTime = config.getInt("Enderman.Blindness.Time", EndermanBlindTime);
		EndermanBlindPower = config.getInt("Enderman.Blindness.Power", EndermanBlindPower);
		
		// Spiders
		SpiderEnabled = config.getBoolean("Spider.Enabled", SpiderEnabled);
		SpiderWeakTime = config.getInt("Spider.Weakness.Time", SpiderWeakTime);
		SpiderWeakPower = config.getInt("Spider.Weakness.Power", SpiderWeakPower);
		SpiderSlowTime = config.getInt("Spider.Slow.Time", SpiderSlowTime);
		SpiderSlowPower = config.getInt("Spider.Slow.Power", SpiderSlowPower);
		
		// Creepers
		CreeperEnabled = config.getBoolean("Creeper.Enabled", CreeperEnabled);
		CreeperConfusionTime = config.getInt("Creeper.Confusion.Time", CreeperConfusionTime);
		CreeperConfusionPower = config.getInt("Creeper.Confusion.Power", CreeperConfusionPower);
		CreeperPoisonTime = config.getInt("Creeper.Poison.Time", CreeperPoisonTime);
		CreeperPoisonPower = config.getInt("Creeper.Poison.Power", CreeperPoisonPower);
	
	// Set Defaults
		config.set("Player.Blindness.Enabled", PlayerBlindnessEnabled);
		config.set("Player.Blindness.Time", PlayerBlindnessTime);
		config.set("Player.Blindness.Power", PlayerBlindnessPower);
		config.set("Player.Confusion.Enabled", PlayerConfusionEnabled);
		config.set("Player.Confusion.Time", PlayerConfusionTime);
		config.set("Player.Confusion.Power", PlayerConfusionPower);
		config.set("Player.Damage_Resistance.Enabled", PlayerDamageResistanceEnabled);
		config.set("Player.Damage_Resistance.Time", PlayerDamageResistanceTime);
		config.set("Player.Damage_Resistance.Power", PlayerDamageResistancePower);
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
	config.set("Zombies.Enabled", ZombiesEnabled);
	config.set("Zombies.Poison.Time", ZombiePoisonTime);
	config.set("Zombies.Poison.Power", ZombiePoisonPower);
	config.set("Enderman.Enabled", EndermanEnabled);
	config.set("Enderman.Blindness.Time", EndermanBlindTime);
	config.set("Enderman.Blindness.Power", EndermanBlindPower);
	config.set("Spider.Enabled", SpiderEnabled);
	config.set("Spider.Weakness.Time", SpiderWeakTime);
	config.set("Spider.Weakness.Power", SpiderWeakPower);
	config.set("Spider.Slow.Time", SpiderSlowTime);
	config.set("Spider.Slow.Power", SpiderSlowPower);
	config.set("Creeper.Enabled", CreeperEnabled);
	config.set("Crepeer.Confusion.Time", CreeperConfusionTime);
	config.set("Creeper.Confusion.Power", CreeperConfusionPower);
	config.set("Creeper.Poison.Time", CreeperPoisonTime);
	config.set("Creeper.Poison.Power", CreeperPoisonPower);
	
	try {
		config.save(file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
