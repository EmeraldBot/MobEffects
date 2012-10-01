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
