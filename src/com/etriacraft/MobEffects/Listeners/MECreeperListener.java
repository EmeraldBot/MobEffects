package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MECreeperListener implements Listener {
	
	@EventHandler
	public void CreeperBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		
		if (Config.CreeperBlindnessEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.CreeperBlindnessTime, Config.CreeperBlindnessPower));
		}
	}
	
	@EventHandler
	public void CreeperNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperNauseaEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.CreeperNauseaTime, Config.CreeperNauseaPower));
		}
	}
	@EventHandler
	public void CreeperResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperResistanceEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.CreeperResistanceTime, Config.CreeperResistancePower));
		}
	}
	@EventHandler
	public void CreeperFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperFastDiggingEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.CreeperFastDiggingTime, Config.CreeperFastDiggingPower));
		}
	}
	
	@EventHandler
	public void CreeperFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperFireResistanceEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.CreeperFireResistanceTime, Config.CreeperFireResistancePower));
		}
	}
	@EventHandler
	public void CreeperHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperHarmEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.CreeperHarmTime, Config.CreeperHarmPower));
		}
	}
	@EventHandler
	public void CreeperHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperHarmEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.CreeperHealTime, Config.CreeperHealPower));
		}
	}
	@EventHandler
	public void CreeperHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperHungerEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.CreeperHungerTime, Config.CreeperHungerPower));
		}
	}
	@EventHandler
	public void CreeperStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperStrengthEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.CreeperStrengthTime, Config.CreeperStrengthPower));
		}
	}
	@EventHandler
	public void CreeperJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperJumpEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.CreeperJumpTime, Config.CreeperJumpPower));
		}
	}
	@EventHandler
	public void CreeperPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperPoisonEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.CreeperPoisonTime, Config.CreeperPoisonPower));
		}
	}
	@EventHandler
	public void CreeperRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperRegenerationEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.CreeperRegenerationTime, Config.CreeperRegenerationPower));
		}
	}
	@EventHandler
	public void CreeperSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperSlowEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.CreeperSlowTime, Config.CreeperSlowPower));
		}
	}
	@EventHandler
	public void CreeperMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperMiningFatigueEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.CreeperMiningFatigueTime, Config.CreeperMiningFatiguePower));
		}
	}
	@EventHandler
	public void CreeperSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperSpeedEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.CreeperSpeedTime, Config.CreeperSpeedPower));
		}
	}
	@EventHandler
	public void CreeperWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperWaterBreathingEnabled != false && damager instanceof Creeper && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.CreeperWaterBreathingTime, Config.CreeperWaterBreathingPower));
		}
	}
	@EventHandler
	public void CreeperWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.CreeperWeaknessEnabled != false && damager instanceof Creeper && e instanceof Creeper && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.CreeperWeaknessTime, Config.CreeperWeaknessPower));
		}
	}
}
