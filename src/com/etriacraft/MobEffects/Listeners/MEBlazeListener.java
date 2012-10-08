package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Blaze;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEBlazeListener implements Listener {
	
	@EventHandler
	public void BlazeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.BlazeBlindnessEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.BlazeBlindnessTime, Config.BlazeBlindnessPower));
		}
	}
	
	@EventHandler
	public void BlazeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeNauseaEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.BlazeNauseaTime, Config.BlazeNauseaPower));
		}
	}
	@EventHandler
	public void BlazeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeResistanceEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.BlazeResistanceTime, Config.BlazeResistancePower));
		}
	}
	@EventHandler
	public void BlazeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeFastDiggingEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.BlazeFastDiggingTime, Config.BlazeFastDiggingPower));
		}
	}
	
	@EventHandler
	public void BlazeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeFireResistanceEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.BlazeFireResistanceTime, Config.BlazeFireResistancePower));
		}
	}
	@EventHandler
	public void BlazeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeHarmEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.BlazeHarmTime, Config.BlazeHarmPower));
		}
	}
	@EventHandler
	public void BlazeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeHarmEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.BlazeHealTime, Config.BlazeHealPower));
		}
	}
	@EventHandler
	public void BlazeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeHungerEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.BlazeHungerTime, Config.BlazeHungerPower));
		}
	}
	@EventHandler
	public void BlazeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeStrengthEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.BlazeStrengthTime, Config.BlazeStrengthPower));
		}
	}
	@EventHandler
	public void BlazeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeJumpEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.BlazeJumpTime, Config.BlazeJumpPower));
		}
	}
	@EventHandler
	public void BlazePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazePoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazePoisonEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.BlazePoisonTime, Config.BlazePoisonPower));
		}
	}
	@EventHandler
	public void BlazeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeRegenerationEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.BlazeRegenerationTime, Config.BlazeRegenerationPower));
		}
	}
	@EventHandler
	public void BlazeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeSlowEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.BlazeSlowTime, Config.BlazeSlowPower));
		}
	}
	@EventHandler
	public void BlazeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeMiningFatigueEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.BlazeMiningFatigueTime, Config.BlazeMiningFatiguePower));
		}
	}
	@EventHandler
	public void BlazeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeSpeedEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.BlazeSpeedTime, Config.BlazeSpeedPower));
		}
	}
	@EventHandler
	public void BlazeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeWaterBreathingEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.BlazeWaterBreathingTime, Config.BlazeWaterBreathingPower));
		}
	}
	@EventHandler
	public void BlazeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.BlazeWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.BlazeWeaknessEnabled != false && damager instanceof Blaze && e instanceof Blaze && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.BlazeWeaknessTime, Config.BlazeWeaknessPower));
		}
	}
}