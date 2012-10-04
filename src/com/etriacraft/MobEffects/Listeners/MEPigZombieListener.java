package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEPigZombieListener implements Listener {
	
	@EventHandler
	public void PigZombieBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		
		if (Config.PigZombieBlindnessEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.PigZombieBlindnessTime, Config.PigZombieBlindnessPower));
		}
	}
	
	@EventHandler
	public void PigZombieConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieConfusionEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.PigZombieConfusionTime, Config.PigZombieConfusionPower));
		}
	}
	@EventHandler
	public void PigZombieDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieDamageResistanceEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.PigZombieDamageResistanceTime, Config.PigZombieDamageResistancePower));
		}
	}
	@EventHandler
	public void PigZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieFastDiggingEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.PigZombieFastDiggingTime, Config.PigZombieFastDiggingPower));
		}
	}
	
	@EventHandler
	public void PigZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieFireResistanceEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.PigZombieFireResistanceTime, Config.PigZombieFireResistancePower));
		}
	}
	@EventHandler
	public void PigZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieHarmEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.PigZombieHarmTime, Config.PigZombieHarmPower));
		}
	}
	@EventHandler
	public void PigZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieHarmEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.PigZombieHealTime, Config.PigZombieHealPower));
		}
	}
	@EventHandler
	public void PigZombieHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieHungerEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.PigZombieHungerTime, Config.PigZombieHungerPower));
		}
	}
	@EventHandler
	public void PigZombieIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieIncreaseDamageEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.PigZombieIncreaseDamageTime, Config.PigZombieIncreaseDamagePower));
		}
	}
	@EventHandler
	public void PigZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieJumpEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.PigZombieJumpTime, Config.PigZombieJumpPower));
		}
	}
	@EventHandler
	public void PigZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombiePoisonEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.PigZombiePoisonTime, Config.PigZombiePoisonPower));
		}
	}
	@EventHandler
	public void PigZombieRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieRegenerationEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.PigZombieRegenerationTime, Config.PigZombieRegenerationPower));
		}
	}
	@EventHandler
	public void PigZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieSlowEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.PigZombieSlowTime, Config.PigZombieSlowPower));
		}
	}
	@EventHandler
	public void PigZombieSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieSlowDiggingEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.PigZombieSlowDiggingTime, Config.PigZombieSlowDiggingPower));
		}
	}
	@EventHandler
	public void PigZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieSpeedEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.PigZombieSpeedTime, Config.PigZombieSpeedPower));
		}
	}
	@EventHandler
	public void PigZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieWaterBreathingEnabled != false && damager instanceof PigZombie && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.PigZombieWaterBreathingTime, Config.PigZombieWaterBreathingPower));
		}
	}
	@EventHandler
	public void PigZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PigZombieWeaknessEnabled != false && damager instanceof PigZombie && e instanceof PigZombie) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.PigZombieWeaknessTime, Config.PigZombieWeaknessPower));
		}
	}
}
