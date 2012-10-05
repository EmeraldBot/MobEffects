package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEZombieListener implements Listener {
	
	@EventHandler
	public void ZombieBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		
		if (Config.ZombieBlindnessEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.ZombieBlindnessTime, Config.ZombieBlindnessPower));
		}
	}
	
	@EventHandler
	public void ZombieConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieConfusionEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.ZombieConfusionTime, Config.ZombieConfusionPower));
		}
	}
	@EventHandler
	public void ZombieDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieDamageResistanceEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.ZombieDamageResistanceTime, Config.ZombieDamageResistancePower));
		}
	}
	@EventHandler
	public void ZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieFastDiggingEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.ZombieFastDiggingTime, Config.ZombieFastDiggingPower));
		}
	}
	
	@EventHandler
	public void ZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieFireResistanceEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.ZombieFireResistanceTime, Config.ZombieFireResistancePower));
		}
	}
	@EventHandler
	public void ZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieHarmEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.ZombieHarmTime, Config.ZombieHarmPower));
		}
	}
	@EventHandler
	public void ZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieHarmEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.ZombieHealTime, Config.ZombieHealPower));
		}
	}
	@EventHandler
	public void ZombieHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieHungerEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.ZombieHungerTime, Config.ZombieHungerPower));
		}
	}
	@EventHandler
	public void ZombieIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieIncreaseDamageEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.ZombieIncreaseDamageTime, Config.ZombieIncreaseDamagePower));
		}
	}
	@EventHandler
	public void ZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieJumpEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.ZombieJumpTime, Config.ZombieJumpPower));
		}
	}
	@EventHandler
	public void ZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombiePoisonEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.ZombiePoisonTime, Config.ZombiePoisonPower));
		}
	}
	@EventHandler
	public void ZombieRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieRegenerationEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.ZombieRegenerationTime, Config.ZombieRegenerationPower));
		}
	}
	@EventHandler
	public void ZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieSlowEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.ZombieSlowTime, Config.ZombieSlowPower));
		}
	}
	@EventHandler
	public void ZombieSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieSlowDiggingEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.ZombieSlowDiggingTime, Config.ZombieSlowDiggingPower));
		}
	}
	@EventHandler
	public void ZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieSpeedEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.ZombieSpeedTime, Config.ZombieSpeedPower));
		}
	}
	@EventHandler
	public void ZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieWaterBreathingEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.ZombieWaterBreathingTime, Config.ZombieWaterBreathingPower));
		}
	}
	@EventHandler
	public void ZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.ZombieWeaknessEnabled != false && damager instanceof Zombie && e instanceof Zombie && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.ZombieWeaknessTime, Config.ZombieWeaknessPower));
		}
	}
}
