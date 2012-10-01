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
	
	// Enders
	public static boolean EndermanEnabled = true;
	public static int EndermanBlindTime = 500;
	public static int EndermanBlindPower = 1;
	
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
		
		// Enders
		EndermanEnabled = config.getBoolean("Enderman.Enabled", EndermanEnabled);
		EndermanBlindTime = config.getInt("Enderman.Blindness.Time", EndermanBlindTime);
		EndermanBlindPower = config.getInt("Enderman.Blindness.Power", EndermanBlindPower);
		
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
	config.set("Enderman.Enabled", EndermanEnabled);
	config.set("Enderman.Blindness.Time", EndermanBlindTime);
	config.set("Enderman.Blindness.Power", EndermanBlindPower);
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
