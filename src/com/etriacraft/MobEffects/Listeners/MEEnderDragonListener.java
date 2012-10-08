package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEEnderDragonListener implements Listener {
	
	@EventHandler
	public void EnderDragonBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.EnderDragonBlindnessEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.EnderDragonBlindnessTime, Config.EnderDragonBlindnessPower));
		}
	}
	
	@EventHandler
	public void EnderDragonNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonNauseaEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.EnderDragonNauseaTime, Config.EnderDragonNauseaPower));
		}
	}
	@EventHandler
	public void EnderDragonResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonResistanceEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.EnderDragonResistanceTime, Config.EnderDragonResistancePower));
		}
	}
	@EventHandler
	public void EnderDragonFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonFastDiggingEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.EnderDragonFastDiggingTime, Config.EnderDragonFastDiggingPower));
		}
	}
	
	@EventHandler
	public void EnderDragonFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonFireResistanceEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.EnderDragonFireResistanceTime, Config.EnderDragonFireResistancePower));
		}
	}
	@EventHandler
	public void EnderDragonHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonHarmEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.EnderDragonHarmTime, Config.EnderDragonHarmPower));
		}
	}
	@EventHandler
	public void EnderDragonHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonHarmEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.EnderDragonHealTime, Config.EnderDragonHealPower));
		}
	}
	@EventHandler
	public void EnderDragonHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonHungerEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.EnderDragonHungerTime, Config.EnderDragonHungerPower));
		}
	}
	@EventHandler
	public void EnderDragonStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonStrengthEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.EnderDragonStrengthTime, Config.EnderDragonStrengthPower));
		}
	}
	@EventHandler
	public void EnderDragonJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonJumpEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.EnderDragonJumpTime, Config.EnderDragonJumpPower));
		}
	}
	@EventHandler
	public void EnderDragonPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonPoisonEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.EnderDragonPoisonTime, Config.EnderDragonPoisonPower));
		}
	}
	@EventHandler
	public void EnderDragonRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonRegenerationEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.EnderDragonRegenerationTime, Config.EnderDragonRegenerationPower));
		}
	}
	@EventHandler
	public void EnderDragonSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonSlowEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.EnderDragonSlowTime, Config.EnderDragonSlowPower));
		}
	}
	@EventHandler
	public void EnderDragonMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonMiningFatigueEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.EnderDragonMiningFatigueTime, Config.EnderDragonMiningFatiguePower));
		}
	}
	@EventHandler
	public void EnderDragonSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonSpeedEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.EnderDragonSpeedTime, Config.EnderDragonSpeedPower));
		}
	}
	@EventHandler
	public void EnderDragonWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonWaterBreathingEnabled != false && damager instanceof EnderDragon && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.EnderDragonWaterBreathingTime, Config.EnderDragonWaterBreathingPower));
		}
	}
	@EventHandler
	public void EnderDragonWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.EnderDragonWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.EnderDragonWeaknessEnabled != false && damager instanceof EnderDragon && e instanceof EnderDragon && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.EnderDragonWeaknessTime, Config.EnderDragonWeaknessPower));
		}
	}
}