package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.CaveSpider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MECaveSpiderListener implements Listener {
	
	@EventHandler
	public void CaveSpiderBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.CaveSpiderBlindnessEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.CaveSpiderBlindnessTime, Config.CaveSpiderBlindnessPower));
		}
	}
	
	@EventHandler
	public void CaveSpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderNauseaEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.CaveSpiderNauseaTime, Config.CaveSpiderNauseaPower));
		}
	}
	@EventHandler
	public void CaveSpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderResistanceEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.CaveSpiderResistanceTime, Config.CaveSpiderResistancePower));
		}
	}
	@EventHandler
	public void CaveSpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderFastDiggingEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.CaveSpiderFastDiggingTime, Config.CaveSpiderFastDiggingPower));
		}
	}
	
	@EventHandler
	public void CaveSpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderFireResistanceEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.CaveSpiderFireResistanceTime, Config.CaveSpiderFireResistancePower));
		}
	}
	@EventHandler
	public void CaveSpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderHarmEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.CaveSpiderHarmTime, Config.CaveSpiderHarmPower));
		}
	}
	@EventHandler
	public void CaveSpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderHarmEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.CaveSpiderHealTime, Config.CaveSpiderHealPower));
		}
	}
	@EventHandler
	public void CaveSpiderHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderHungerEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.CaveSpiderHungerTime, Config.CaveSpiderHungerPower));
		}
	}
	@EventHandler
	public void CaveSpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderStrengthEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.CaveSpiderStrengthTime, Config.CaveSpiderStrengthPower));
		}
	}
	@EventHandler
	public void CaveSpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderJumpEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.CaveSpiderJumpTime, Config.CaveSpiderJumpPower));
		}
	}
	@EventHandler
	public void CaveSpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderPoisonEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.CaveSpiderPoisonTime, Config.CaveSpiderPoisonPower));
		}
	}
	@EventHandler
	public void CaveSpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderRegenerationEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.CaveSpiderRegenerationTime, Config.CaveSpiderRegenerationPower));
		}
	}
	@EventHandler
	public void CaveSpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderSlowEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.CaveSpiderSlowTime, Config.CaveSpiderSlowPower));
		}
	}
	@EventHandler
	public void CaveSpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderMiningFatigueEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.CaveSpiderMiningFatigueTime, Config.CaveSpiderMiningFatiguePower));
		}
	}
	@EventHandler
	public void CaveSpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderSpeedEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.CaveSpiderSpeedTime, Config.CaveSpiderSpeedPower));
		}
	}
	@EventHandler
	public void CaveSpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderWaterBreathingEnabled != false && damager instanceof CaveSpider && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.CaveSpiderWaterBreathingTime, Config.CaveSpiderWaterBreathingPower));
		}
	}
	@EventHandler
	public void CaveSpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.CaveSpiderWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.CaveSpiderWeaknessEnabled != false && damager instanceof CaveSpider && e instanceof CaveSpider && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.CaveSpiderWeaknessTime, Config.CaveSpiderWeaknessPower));
		}
	}
}