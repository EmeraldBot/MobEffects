package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MESilverfishListener implements Listener {
	
	@EventHandler
	public void SilverfishBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		
		if (Config.SilverfishBlindnessEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.SilverfishBlindnessTime, Config.SilverfishBlindnessPower));
		}
	}
	
	@EventHandler
	public void SilverfishConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishConfusionEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.SilverfishConfusionTime, Config.SilverfishConfusionPower));
		}
	}
	@EventHandler
	public void SilverfishDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishDamageResistanceEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.SilverfishDamageResistanceTime, Config.SilverfishDamageResistancePower));
		}
	}
	@EventHandler
	public void SilverfishFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishFastDiggingEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.SilverfishFastDiggingTime, Config.SilverfishFastDiggingPower));
		}
	}
	
	@EventHandler
	public void SilverfishFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishFireResistanceEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.SilverfishFireResistanceTime, Config.SilverfishFireResistancePower));
		}
	}
	@EventHandler
	public void SilverfishHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishHarmEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.SilverfishHarmTime, Config.SilverfishHarmPower));
		}
	}
	@EventHandler
	public void SilverfishHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishHarmEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.SilverfishHealTime, Config.SilverfishHealPower));
		}
	}
	@EventHandler
	public void SilverfishHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishHungerEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.SilverfishHungerTime, Config.SilverfishHungerPower));
		}
	}
	@EventHandler
	public void SilverfishIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishIncreaseDamageEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.SilverfishIncreaseDamageTime, Config.SilverfishIncreaseDamagePower));
		}
	}
	@EventHandler
	public void SilverfishJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishJumpEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.SilverfishJumpTime, Config.SilverfishJumpPower));
		}
	}
	@EventHandler
	public void SilverfishPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishPoisonEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.SilverfishPoisonTime, Config.SilverfishPoisonPower));
		}
	}
	@EventHandler
	public void SilverfishRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishRegenerationEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.SilverfishRegenerationTime, Config.SilverfishRegenerationPower));
		}
	}
	@EventHandler
	public void SilverfishSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishSlowEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SilverfishSlowTime, Config.SilverfishSlowPower));
		}
	}
	@EventHandler
	public void SilverfishSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishSlowDiggingEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.SilverfishSlowDiggingTime, Config.SilverfishSlowDiggingPower));
		}
	}
	@EventHandler
	public void SilverfishSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishSpeedEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.SilverfishSpeedTime, Config.SilverfishSpeedPower));
		}
	}
	@EventHandler
	public void SilverfishWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishWaterBreathingEnabled != false && damager instanceof Silverfish && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.SilverfishWaterBreathingTime, Config.SilverfishWaterBreathingPower));
		}
	}
	@EventHandler
	public void SilverfishWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SilverfishWeaknessEnabled != false && damager instanceof Silverfish && e instanceof Silverfish && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SilverfishWeaknessTime, Config.SilverfishWeaknessPower));
		}
	}
}