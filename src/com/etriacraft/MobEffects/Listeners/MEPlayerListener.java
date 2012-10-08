package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEPlayerListener implements Listener {
	
	@EventHandler
	public void PlayerBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerBlindnessDodgeChance / 100) {
			dodged = true;
		} if (Config.PlayerBlindnessEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.PlayerBlindnessTime, Config.PlayerBlindnessPower));
		}
	}
	
	@EventHandler
	public void PlayerNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerNauseaDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerNauseaEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.PlayerNauseaTime, Config.PlayerNauseaPower));
		}
	}
	@EventHandler
	public void PlayerResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerResistanceEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.PlayerResistanceTime, Config.PlayerResistancePower));
		}
	}
	@EventHandler
	public void PlayerFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerFastDiggingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerFastDiggingEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.PlayerFastDiggingTime, Config.PlayerFastDiggingPower));
		}
	}
	
	@EventHandler
	public void PlayerFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerFireResistanceDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerFireResistanceEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.PlayerFireResistanceTime, Config.PlayerFireResistancePower));
		}
	}
	@EventHandler
	public void PlayerHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerHarmDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.PlayerHarmTime, Config.PlayerHarmPower));
		}
	}
	@EventHandler
	public void PlayerHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerHealDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.PlayerHealTime, Config.PlayerHealPower));
		}
	}
	@EventHandler
	public void PlayerHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerHungerDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerHungerEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.PlayerHungerTime, Config.PlayerHungerPower));
		}
	}
	@EventHandler
	public void PlayerStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerStrengthDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerStrengthEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.PlayerStrengthTime, Config.PlayerStrengthPower));
		}
	}
	@EventHandler
	public void PlayerJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerJumpDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerJumpEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.PlayerJumpTime, Config.PlayerJumpPower));
		}
	}
	@EventHandler
	public void PlayerPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerPoisonDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerPoisonEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.PlayerPoisonTime, Config.PlayerPoisonPower));
		}
	}
	@EventHandler
	public void PlayerRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerRegenerationDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerRegenerationEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.PlayerRegenerationTime, Config.PlayerRegenerationPower));
		}
	}
	@EventHandler
	public void PlayerSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerSlowDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerSlowEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.PlayerSlowTime, Config.PlayerSlowPower));
		}
	}
	@EventHandler
	public void PlayerMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerMiningFatigueDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerMiningFatigueEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.PlayerMiningFatigueTime, Config.PlayerMiningFatiguePower));
		}
	}
	@EventHandler
	public void PlayerSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerSpeedDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerSpeedEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.PlayerSpeedTime, Config.PlayerSpeedPower));
		}
	}
	@EventHandler
	public void PlayerWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerWaterBreathingDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerWaterBreathingEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.PlayerWaterBreathingTime, Config.PlayerWaterBreathingPower));
		}
	}
	@EventHandler
	public void PlayerWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= Config.PlayerWeaknessDodgeChance / 100) {
			dodged = true;
		}
		if (Config.PlayerWeaknessEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.PlayerWeaknessTime, Config.PlayerWeaknessPower));
		}
	}
}