package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MESnowGolemListener implements Listener {
	
	@EventHandler
	public void SnowmanBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.SnowmanBlindnessEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.SnowmanBlindnessTime, Config.SnowmanBlindnessPower));
		}
	}
	
	@EventHandler
	public void SnowmanNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanNauseaEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.SnowmanNauseaTime, Config.SnowmanNauseaPower));
		}
	}
	@EventHandler
	public void SnowmanResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanResistanceEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.SnowmanResistanceTime, Config.SnowmanResistancePower));
		}
	}
	@EventHandler
	public void SnowmanFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanFastDiggingEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.SnowmanFastDiggingTime, Config.SnowmanFastDiggingPower));
		}
	}
	
	@EventHandler
	public void SnowmanFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanFireResistanceEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.SnowmanFireResistanceTime, Config.SnowmanFireResistancePower));
		}
	}
	@EventHandler
	public void SnowmanHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanHarmEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.SnowmanHarmTime, Config.SnowmanHarmPower));
		}
	}
	@EventHandler
	public void SnowmanHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanHarmEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.SnowmanHealTime, Config.SnowmanHealPower));
		}
	}
	@EventHandler
	public void SnowmanHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanHungerEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.SnowmanHungerTime, Config.SnowmanHungerPower));
		}
	}
	@EventHandler
	public void SnowmanStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanStrengthEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.SnowmanStrengthTime, Config.SnowmanStrengthPower));
		}
	}
	@EventHandler
	public void SnowmanJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanJumpEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.SnowmanJumpTime, Config.SnowmanJumpPower));
		}
	}
	@EventHandler
	public void SnowmanPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanPoisonEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.SnowmanPoisonTime, Config.SnowmanPoisonPower));
		}
	}
	@EventHandler
	public void SnowmanRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanRegenerationEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.SnowmanRegenerationTime, Config.SnowmanRegenerationPower));
		}
	}
	@EventHandler
	public void SnowmanSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanSlowEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SnowmanSlowTime, Config.SnowmanSlowPower));
		}
	}
	@EventHandler
	public void SnowmanMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanMiningFatigueEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.SnowmanMiningFatigueTime, Config.SnowmanMiningFatiguePower));
		}
	}
	@EventHandler
	public void SnowmanSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanSpeedEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.SnowmanSpeedTime, Config.SnowmanSpeedPower));
		}
	}
	@EventHandler
	public void SnowmanWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanWaterBreathingEnabled != false && damager instanceof Snowman && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.SnowmanWaterBreathingTime, Config.SnowmanWaterBreathingPower));
		}
	}
	@EventHandler
	public void SnowmanWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.SnowmanWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.SnowmanWeaknessEnabled != false && damager instanceof Snowman && e instanceof Snowman && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SnowmanWeaknessTime, Config.SnowmanWeaknessPower));
		}
	}
}