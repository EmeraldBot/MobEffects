package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.IronGolem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEIronGolemListener implements Listener {
	
	@EventHandler
	public void IronGolemBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.IronGolemBlindnessEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.IronGolemBlindnessTime, Config.IronGolemBlindnessPower));
		}
	}
	
	@EventHandler
	public void IronGolemNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemNauseaEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.IronGolemNauseaTime, Config.IronGolemNauseaPower));
		}
	}
	@EventHandler
	public void IronGolemResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemResistanceEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.IronGolemResistanceTime, Config.IronGolemResistancePower));
		}
	}
	@EventHandler
	public void IronGolemFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemFastDiggingEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.IronGolemFastDiggingTime, Config.IronGolemFastDiggingPower));
		}
	}
	
	@EventHandler
	public void IronGolemFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemFireResistanceEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.IronGolemFireResistanceTime, Config.IronGolemFireResistancePower));
		}
	}
	@EventHandler
	public void IronGolemHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemHarmEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.IronGolemHarmTime, Config.IronGolemHarmPower));
		}
	}
	@EventHandler
	public void IronGolemHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemHarmEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.IronGolemHealTime, Config.IronGolemHealPower));
		}
	}
	@EventHandler
	public void IronGolemHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemHungerEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.IronGolemHungerTime, Config.IronGolemHungerPower));
		}
	}
	@EventHandler
	public void IronGolemStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemStrengthEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.IronGolemStrengthTime, Config.IronGolemStrengthPower));
		}
	}
	@EventHandler
	public void IronGolemJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemJumpEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.IronGolemJumpTime, Config.IronGolemJumpPower));
		}
	}
	@EventHandler
	public void IronGolemPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemPoisonEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.IronGolemPoisonTime, Config.IronGolemPoisonPower));
		}
	}
	@EventHandler
	public void IronGolemRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemRegenerationEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.IronGolemRegenerationTime, Config.IronGolemRegenerationPower));
		}
	}
	@EventHandler
	public void IronGolemSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemSlowEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.IronGolemSlowTime, Config.IronGolemSlowPower));
		}
	}
	@EventHandler
	public void IronGolemMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemMiningFatigueEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.IronGolemMiningFatigueTime, Config.IronGolemMiningFatiguePower));
		}
	}
	@EventHandler
	public void IronGolemSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemSpeedEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.IronGolemSpeedTime, Config.IronGolemSpeedPower));
		}
	}
	@EventHandler
	public void IronGolemWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemWaterBreathingEnabled != false && damager instanceof IronGolem && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.IronGolemWaterBreathingTime, Config.IronGolemWaterBreathingPower));
		}
	}
	@EventHandler
	public void IronGolemWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.IronGolemWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.IronGolemWeaknessEnabled != false && damager instanceof IronGolem && e instanceof IronGolem && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.IronGolemWeaknessTime, Config.IronGolemWeaknessPower));
		}
	}
}
