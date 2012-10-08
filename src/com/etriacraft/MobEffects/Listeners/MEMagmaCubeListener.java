package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEMagmaCubeListener implements Listener {
	
	@EventHandler
	public void MagmaCubeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.MagmaCubeBlindnessEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.MagmaCubeBlindnessTime, Config.MagmaCubeBlindnessPower));
		}
	}
	
	@EventHandler
	public void MagmaCubeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeNauseaEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.MagmaCubeNauseaTime, Config.MagmaCubeNauseaPower));
		}
	}
	@EventHandler
	public void MagmaCubeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeResistanceEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.MagmaCubeResistanceTime, Config.MagmaCubeResistancePower));
		}
	}
	@EventHandler
	public void MagmaCubeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeFastDiggingEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.MagmaCubeFastDiggingTime, Config.MagmaCubeFastDiggingPower));
		}
	}
	
	@EventHandler
	public void MagmaCubeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeFireResistanceEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.MagmaCubeFireResistanceTime, Config.MagmaCubeFireResistancePower));
		}
	}
	@EventHandler
	public void MagmaCubeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeHarmEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.MagmaCubeHarmTime, Config.MagmaCubeHarmPower));
		}
	}
	@EventHandler
	public void MagmaCubeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeHarmEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.MagmaCubeHealTime, Config.MagmaCubeHealPower));
		}
	}
	@EventHandler
	public void MagmaCubeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeHungerEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.MagmaCubeHungerTime, Config.MagmaCubeHungerPower));
		}
	}
	@EventHandler
	public void MagmaCubeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeStrengthEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.MagmaCubeStrengthTime, Config.MagmaCubeStrengthPower));
		}
	}
	@EventHandler
	public void MagmaCubeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeJumpEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.MagmaCubeJumpTime, Config.MagmaCubeJumpPower));
		}
	}
	@EventHandler
	public void MagmaCubePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubePoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubePoisonEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.MagmaCubePoisonTime, Config.MagmaCubePoisonPower));
		}
	}
	@EventHandler
	public void MagmaCubeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeRegenerationEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.MagmaCubeRegenerationTime, Config.MagmaCubeRegenerationPower));
		}
	}
	@EventHandler
	public void MagmaCubeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeSlowEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.MagmaCubeSlowTime, Config.MagmaCubeSlowPower));
		}
	}
	@EventHandler
	public void MagmaCubeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeMiningFatigueEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.MagmaCubeMiningFatigueTime, Config.MagmaCubeMiningFatiguePower));
		}
	}
	@EventHandler
	public void MagmaCubeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeSpeedEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.MagmaCubeSpeedTime, Config.MagmaCubeSpeedPower));
		}
	}
	@EventHandler
	public void MagmaCubeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeWaterBreathingEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.MagmaCubeWaterBreathingTime, Config.MagmaCubeWaterBreathingPower));
		}
	}
	@EventHandler
	public void MagmaCubeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.MagmaCubeWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.MagmaCubeWeaknessEnabled != false && damager instanceof MagmaCube && e instanceof MagmaCube && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.MagmaCubeWeaknessTime, Config.MagmaCubeWeaknessPower));
		}
	}
}