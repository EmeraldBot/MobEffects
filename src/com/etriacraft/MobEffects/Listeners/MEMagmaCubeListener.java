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
		
		if (Config.MagmaCubeBlindnessEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.MagmaCubeBlindnessTime, Config.MagmaCubeBlindnessPower));
		}
	}
	
	@EventHandler
	public void MagmaCubeConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeConfusionEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.MagmaCubeConfusionTime, Config.MagmaCubeConfusionPower));
		}
	}
	@EventHandler
	public void MagmaCubeDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeDamageResistanceEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.MagmaCubeDamageResistanceTime, Config.MagmaCubeDamageResistancePower));
		}
	}
	@EventHandler
	public void MagmaCubeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeFastDiggingEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.MagmaCubeFastDiggingTime, Config.MagmaCubeFastDiggingPower));
		}
	}
	
	@EventHandler
	public void MagmaCubeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeFireResistanceEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.MagmaCubeFireResistanceTime, Config.MagmaCubeFireResistancePower));
		}
	}
	@EventHandler
	public void MagmaCubeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeHarmEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.MagmaCubeHarmTime, Config.MagmaCubeHarmPower));
		}
	}
	@EventHandler
	public void MagmaCubeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeHarmEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.MagmaCubeHealTime, Config.MagmaCubeHealPower));
		}
	}
	@EventHandler
	public void MagmaCubeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeHungerEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.MagmaCubeHungerTime, Config.MagmaCubeHungerPower));
		}
	}
	@EventHandler
	public void MagmaCubeIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeIncreaseDamageEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.MagmaCubeIncreaseDamageTime, Config.MagmaCubeIncreaseDamagePower));
		}
	}
	@EventHandler
	public void MagmaCubeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeJumpEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.MagmaCubeJumpTime, Config.MagmaCubeJumpPower));
		}
	}
	@EventHandler
	public void MagmaCubePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubePoisonEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.MagmaCubePoisonTime, Config.MagmaCubePoisonPower));
		}
	}
	@EventHandler
	public void MagmaCubeRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeRegenerationEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.MagmaCubeRegenerationTime, Config.MagmaCubeRegenerationPower));
		}
	}
	@EventHandler
	public void MagmaCubeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeSlowEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.MagmaCubeSlowTime, Config.MagmaCubeSlowPower));
		}
	}
	@EventHandler
	public void MagmaCubeSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeSlowDiggingEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.MagmaCubeSlowDiggingTime, Config.MagmaCubeSlowDiggingPower));
		}
	}
	@EventHandler
	public void MagmaCubeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeSpeedEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.MagmaCubeSpeedTime, Config.MagmaCubeSpeedPower));
		}
	}
	@EventHandler
	public void MagmaCubeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeWaterBreathingEnabled != false && damager instanceof MagmaCube && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.MagmaCubeWaterBreathingTime, Config.MagmaCubeWaterBreathingPower));
		}
	}
	@EventHandler
	public void MagmaCubeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.MagmaCubeWeaknessEnabled != false && damager instanceof MagmaCube && e instanceof MagmaCube && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.MagmaCubeWeaknessTime, Config.MagmaCubeWeaknessPower));
		}
	}
}
