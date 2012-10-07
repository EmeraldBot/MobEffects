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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.ZombieBlindnessEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.ZombieBlindnessTime, Config.ZombieBlindnessPower));
		}
	}
	
	@EventHandler
	public void ZombieNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieNauseaEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.ZombieNauseaTime, Config.ZombieNauseaPower));
		}
	}
	@EventHandler
	public void ZombieResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieResistanceEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.ZombieResistanceTime, Config.ZombieResistancePower));
		}
	}
	@EventHandler
	public void ZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieFastDiggingEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.ZombieFastDiggingTime, Config.ZombieFastDiggingPower));
		}
	}
	
	@EventHandler
	public void ZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieFireResistanceEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.ZombieFireResistanceTime, Config.ZombieFireResistancePower));
		}
	}
	@EventHandler
	public void ZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieHarmEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.ZombieHarmTime, Config.ZombieHarmPower));
		}
	}
	@EventHandler
	public void ZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieHarmEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.ZombieHealTime, Config.ZombieHealPower));
		}
	}
	@EventHandler
	public void ZombieHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieHungerEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.ZombieHungerTime, Config.ZombieHungerPower));
		}
	}
	@EventHandler
	public void ZombieStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieStrengthEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.ZombieStrengthTime, Config.ZombieStrengthPower));
		}
	}
	@EventHandler
	public void ZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieJumpEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.ZombieJumpTime, Config.ZombieJumpPower));
		}
	}
	@EventHandler
	public void ZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombiePoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombiePoisonEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.ZombiePoisonTime, Config.ZombiePoisonPower));
		}
	}
	@EventHandler
	public void ZombieRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieRegenerationEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.ZombieRegenerationTime, Config.ZombieRegenerationPower));
		}
	}
	@EventHandler
	public void ZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieSlowEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.ZombieSlowTime, Config.ZombieSlowPower));
		}
	}
	@EventHandler
	public void ZombieMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieMiningFatigueEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.ZombieMiningFatigueTime, Config.ZombieMiningFatiguePower));
		}
	}
	@EventHandler
	public void ZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieSpeedEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.ZombieSpeedTime, Config.ZombieSpeedPower));
		}
	}
	@EventHandler
	public void ZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieWaterBreathingEnabled != false && damager instanceof Zombie && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.ZombieWaterBreathingTime, Config.ZombieWaterBreathingPower));
		}
	}
	@EventHandler
	public void ZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.ZombieWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.ZombieWeaknessEnabled != false && damager instanceof Zombie && e instanceof Zombie && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.ZombieWeaknessTime, Config.ZombieWeaknessPower));
		}
	}
}