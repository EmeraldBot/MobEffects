package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEWolfListener implements Listener {
	
	@EventHandler
	public void WolfBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.WolfBlindnessEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.WolfBlindnessTime, Config.WolfBlindnessPower));
		}
	}
	
	@EventHandler
	public void WolfNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfNauseaEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.WolfNauseaTime, Config.WolfNauseaPower));
		}
	}
	@EventHandler
	public void WolfResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfResistanceEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.WolfResistanceTime, Config.WolfResistancePower));
		}
	}
	@EventHandler
	public void WolfFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfFastDiggingEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.WolfFastDiggingTime, Config.WolfFastDiggingPower));
		}
	}
	
	@EventHandler
	public void WolfFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfFireResistanceEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.WolfFireResistanceTime, Config.WolfFireResistancePower));
		}
	}
	@EventHandler
	public void WolfHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfHarmEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.WolfHarmTime, Config.WolfHarmPower));
		}
	}
	@EventHandler
	public void WolfHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfHarmEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.WolfHealTime, Config.WolfHealPower));
		}
	}
	@EventHandler
	public void WolfHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfHungerEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.WolfHungerTime, Config.WolfHungerPower));
		}
	}
	@EventHandler
	public void WolfStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfStrengthEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.WolfStrengthTime, Config.WolfStrengthPower));
		}
	}
	@EventHandler
	public void WolfJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfJumpEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.WolfJumpTime, Config.WolfJumpPower));
		}
	}
	@EventHandler
	public void WolfPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfPoisonEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.WolfPoisonTime, Config.WolfPoisonPower));
		}
	}
	@EventHandler
	public void WolfRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfRegenerationEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.WolfRegenerationTime, Config.WolfRegenerationPower));
		}
	}
	@EventHandler
	public void WolfSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfSlowEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.WolfSlowTime, Config.WolfSlowPower));
		}
	}
	@EventHandler
	public void WolfMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfMiningFatigueEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.WolfMiningFatigueTime, Config.WolfMiningFatiguePower));
		}
	}
	@EventHandler
	public void WolfSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfSpeedEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.WolfSpeedTime, Config.WolfSpeedPower));
		}
	}
	@EventHandler
	public void WolfWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfWaterBreathingEnabled != false && damager instanceof Wolf && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.WolfWaterBreathingTime, Config.WolfWaterBreathingPower));
		}
	}
	@EventHandler
	public void WolfWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.WolfWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.WolfWeaknessEnabled != false && damager instanceof Wolf && e instanceof Wolf && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.WolfWeaknessTime, Config.WolfWeaknessPower));
		}
	}
}