package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MESlimeListener implements Listener {
	
	@EventHandler
	public void SlimeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		
		if (Config.SlimeBlindnessEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.SlimeBlindnessTime, Config.SlimeBlindnessPower));
		}
	}
	
	@EventHandler
	public void SlimeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeNauseaEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.SlimeNauseaTime, Config.SlimeNauseaPower));
		}
	}
	@EventHandler
	public void SlimeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeResistanceEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.SlimeResistanceTime, Config.SlimeResistancePower));
		}
	}
	@EventHandler
	public void SlimeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeFastDiggingEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.SlimeFastDiggingTime, Config.SlimeFastDiggingPower));
		}
	}
	
	@EventHandler
	public void SlimeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeFireResistanceEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.SlimeFireResistanceTime, Config.SlimeFireResistancePower));
		}
	}
	@EventHandler
	public void SlimeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeHarmEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.SlimeHarmTime, Config.SlimeHarmPower));
		}
	}
	@EventHandler
	public void SlimeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeHarmEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.SlimeHealTime, Config.SlimeHealPower));
		}
	}
	@EventHandler
	public void SlimeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeHungerEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.SlimeHungerTime, Config.SlimeHungerPower));
		}
	}
	@EventHandler
	public void SlimeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeStrengthEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.SlimeStrengthTime, Config.SlimeStrengthPower));
		}
	}
	@EventHandler
	public void SlimeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeJumpEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.SlimeJumpTime, Config.SlimeJumpPower));
		}
	}
	@EventHandler
	public void SlimePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimePoisonEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.SlimePoisonTime, Config.SlimePoisonPower));
		}
	}
	@EventHandler
	public void SlimeRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeRegenerationEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.SlimeRegenerationTime, Config.SlimeRegenerationPower));
		}
	}
	@EventHandler
	public void SlimeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeSlowEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SlimeSlowTime, Config.SlimeSlowPower));
		}
	}
	@EventHandler
	public void SlimeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeMiningFatigueEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.SlimeMiningFatigueTime, Config.SlimeMiningFatiguePower));
		}
	}
	@EventHandler
	public void SlimeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeSpeedEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.SlimeSpeedTime, Config.SlimeSpeedPower));
		}
	}
	@EventHandler
	public void SlimeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeWaterBreathingEnabled != false && damager instanceof Slime && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.SlimeWaterBreathingTime, Config.SlimeWaterBreathingPower));
		}
	}
	@EventHandler
	public void SlimeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.SlimeWeaknessEnabled != false && damager instanceof Slime && e instanceof Slime && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SlimeWeaknessTime, Config.SlimeWeaknessPower));
		}
	}
}