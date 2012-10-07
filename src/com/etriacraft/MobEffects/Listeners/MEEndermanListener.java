package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.Config;

public class MEEndermanListener implements Listener {
	
	@EventHandler
	public void EndermanBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		
		if (Config.EndermanBlindnessEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.EndermanBlindnessTime, Config.EndermanBlindnessPower));
		}
	}
	
	@EventHandler
	public void EndermanNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanNauseaEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.EndermanNauseaTime, Config.EndermanNauseaPower));
		}
	}
	@EventHandler
	public void EndermanResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanResistanceEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.EndermanResistanceTime, Config.EndermanResistancePower));
		}
	}
	@EventHandler
	public void EndermanFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanFastDiggingEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.EndermanFastDiggingTime, Config.EndermanFastDiggingPower));
		}
	}
	
	@EventHandler
	public void EndermanFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanFireResistanceEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.EndermanFireResistanceTime, Config.EndermanFireResistancePower));
		}
	}
	@EventHandler
	public void EndermanHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanHarmEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.EndermanHarmTime, Config.EndermanHarmPower));
		}
	}
	@EventHandler
	public void EndermanHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanHarmEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.EndermanHealTime, Config.EndermanHealPower));
		}
	}
	@EventHandler
	public void EndermanHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanHungerEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.EndermanHungerTime, Config.EndermanHungerPower));
		}
	}
	@EventHandler
	public void EndermanStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanStrengthEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.EndermanStrengthTime, Config.EndermanStrengthPower));
		}
	}
	@EventHandler
	public void EndermanJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanJumpEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.EndermanJumpTime, Config.EndermanJumpPower));
		}
	}
	@EventHandler
	public void EndermanPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanPoisonEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.EndermanPoisonTime, Config.EndermanPoisonPower));
		}
	}
	@EventHandler
	public void EndermanRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanRegenerationEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.EndermanRegenerationTime, Config.EndermanRegenerationPower));
		}
	}
	@EventHandler
	public void EndermanSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanSlowEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.EndermanSlowTime, Config.EndermanSlowPower));
		}
	}
	@EventHandler
	public void EndermanMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanMiningFatigueEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.EndermanMiningFatigueTime, Config.EndermanMiningFatiguePower));
		}
	}
	@EventHandler
	public void EndermanSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanSpeedEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.EndermanSpeedTime, Config.EndermanSpeedPower));
		}
	}
	@EventHandler
	public void EndermanWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanWaterBreathingEnabled != false && damager instanceof Enderman && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.EndermanWaterBreathingTime, Config.EndermanWaterBreathingPower));
		}
	}
	@EventHandler
	public void EndermanWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.EndermanWeaknessEnabled != false && damager instanceof Enderman && e instanceof Enderman && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.EndermanWeaknessTime, Config.EndermanWeaknessPower));
		}
	}
}
