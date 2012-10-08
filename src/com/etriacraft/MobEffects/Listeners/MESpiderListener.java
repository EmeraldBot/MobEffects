package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MESpiderListener implements Listener {
	
	@EventHandler
	public void SpiderBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.SpiderBlindnessEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.SpiderBlindnessTime, Config.SpiderBlindnessPower));
		}
	}
	
	@EventHandler
	public void SpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderNauseaEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.SpiderNauseaTime, Config.SpiderNauseaPower));
		}
	}
	@EventHandler
	public void SpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderResistanceEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.SpiderResistanceTime, Config.SpiderResistancePower));
		}
	}
	@EventHandler
	public void SpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderFastDiggingEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.SpiderFastDiggingTime, Config.SpiderFastDiggingPower));
		}
	}
	
	@EventHandler
	public void SpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderFireResistanceEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.SpiderFireResistanceTime, Config.SpiderFireResistancePower));
		}
	}
	@EventHandler
	public void SpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderHarmEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.SpiderHarmTime, Config.SpiderHarmPower));
		}
	}
	@EventHandler
	public void SpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderHarmEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.SpiderHealTime, Config.SpiderHealPower));
		}
	}
	@EventHandler
	public void SpiderHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderHungerEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.SpiderHungerTime, Config.SpiderHungerPower));
		}
	}
	@EventHandler
	public void SpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderStrengthEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.SpiderStrengthTime, Config.SpiderStrengthPower));
		}
	}
	@EventHandler
	public void SpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderJumpEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.SpiderJumpTime, Config.SpiderJumpPower));
		}
	}
	@EventHandler
	public void SpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderPoisonEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.SpiderPoisonTime, Config.SpiderPoisonPower));
		}
	}
	@EventHandler
	public void SpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderRegenerationEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.SpiderRegenerationTime, Config.SpiderRegenerationPower));
		}
	}
	@EventHandler
	public void SpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderSlowEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SpiderSlowTime, Config.SpiderSlowPower));
		}
	}
	@EventHandler
	public void SpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderMiningFatigueEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.SpiderMiningFatigueTime, Config.SpiderMiningFatiguePower));
		}
	}
	@EventHandler
	public void SpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderSpeedEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.SpiderSpeedTime, Config.SpiderSpeedPower));
		}
	}
	@EventHandler
	public void SpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderWaterBreathingEnabled != false && damager instanceof Spider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.SpiderWaterBreathingTime, Config.SpiderWaterBreathingPower));
		}
	}
	@EventHandler
	public void SpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SpiderWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SpiderWeaknessEnabled != false && damager instanceof Spider && e instanceof Spider && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SpiderWeaknessTime, Config.SpiderWeaknessPower));
		}
	}
}