package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Giant;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEGiantListener implements Listener {
	
	@EventHandler
	public void GiantBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.GiantBlindnessEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.GiantBlindnessTime, Config.GiantBlindnessPower));
		}
	}
	
	@EventHandler
	public void GiantNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantNauseaEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.GiantNauseaTime, Config.GiantNauseaPower));
		}
	}
	@EventHandler
	public void GiantResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantResistanceEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.GiantResistanceTime, Config.GiantResistancePower));
		}
	}
	@EventHandler
	public void GiantFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantFastDiggingEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.GiantFastDiggingTime, Config.GiantFastDiggingPower));
		}
	}
	
	@EventHandler
	public void GiantFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantFireResistanceEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.GiantFireResistanceTime, Config.GiantFireResistancePower));
		}
	}
	@EventHandler
	public void GiantHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantHarmEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.GiantHarmTime, Config.GiantHarmPower));
		}
	}
	@EventHandler
	public void GiantHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantHarmEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.GiantHealTime, Config.GiantHealPower));
		}
	}
	@EventHandler
	public void GiantHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantHungerEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.GiantHungerTime, Config.GiantHungerPower));
		}
	}
	@EventHandler
	public void GiantStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantStrengthEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.GiantStrengthTime, Config.GiantStrengthPower));
		}
	}
	@EventHandler
	public void GiantJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantJumpEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.GiantJumpTime, Config.GiantJumpPower));
		}
	}
	@EventHandler
	public void GiantPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantPoisonEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.GiantPoisonTime, Config.GiantPoisonPower));
		}
	}
	@EventHandler
	public void GiantRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantRegenerationEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.GiantRegenerationTime, Config.GiantRegenerationPower));
		}
	}
	@EventHandler
	public void GiantSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantSlowEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.GiantSlowTime, Config.GiantSlowPower));
		}
	}
	@EventHandler
	public void GiantMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantMiningFatigueEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.GiantMiningFatigueTime, Config.GiantMiningFatiguePower));
		}
	}
	@EventHandler
	public void GiantSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantSpeedEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.GiantSpeedTime, Config.GiantSpeedPower));
		}
	}
	@EventHandler
	public void GiantWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantWaterBreathingEnabled != false && damager instanceof Giant && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.GiantWaterBreathingTime, Config.GiantWaterBreathingPower));
		}
	}
	@EventHandler
	public void GiantWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.GiantWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.GiantWeaknessEnabled != false && damager instanceof Giant && e instanceof Giant && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.GiantWeaknessTime, Config.GiantWeaknessPower));
		}
	}
}