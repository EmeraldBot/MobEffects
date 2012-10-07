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
		
		if (Config.PlayerBlindnessEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.PlayerBlindnessTime, Config.PlayerBlindnessPower));
		}
	}
	
	@EventHandler
	public void PlayerNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerNauseaEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.PlayerNauseaTime, Config.PlayerNauseaPower));
		}
	}
	@EventHandler
	public void PlayerResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerResistanceEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.PlayerResistanceTime, Config.PlayerResistancePower));
		}
	}
	@EventHandler
	public void PlayerFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerFastDiggingEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.PlayerFastDiggingTime, Config.PlayerFastDiggingPower));
		}
	}
	
	@EventHandler
	public void PlayerFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerFireResistanceEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.PlayerFireResistanceTime, Config.PlayerFireResistancePower));
		}
	}
	@EventHandler
	public void PlayerHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.PlayerHarmTime, Config.PlayerHarmPower));
		}
	}
	@EventHandler
	public void PlayerHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.PlayerHealTime, Config.PlayerHealPower));
		}
	}
	@EventHandler
	public void PlayerHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerHungerEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.PlayerHungerTime, Config.PlayerHungerPower));
		}
	}
	@EventHandler
	public void PlayerStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerStrengthEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.PlayerStrengthTime, Config.PlayerStrengthPower));
		}
	}
	@EventHandler
	public void PlayerJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerJumpEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.PlayerJumpTime, Config.PlayerJumpPower));
		}
	}
	@EventHandler
	public void PlayerPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerPoisonEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.PlayerPoisonTime, Config.PlayerPoisonPower));
		}
	}
	@EventHandler
	public void PlayerRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerRegenerationEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.PlayerRegenerationTime, Config.PlayerRegenerationPower));
		}
	}
	@EventHandler
	public void PlayerSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerSlowEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.PlayerSlowTime, Config.PlayerSlowPower));
		}
	}
	@EventHandler
	public void PlayerMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerMiningFatigueEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.PlayerMiningFatigueTime, Config.PlayerMiningFatiguePower));
		}
	}
	@EventHandler
	public void PlayerSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerSpeedEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.PlayerSpeedTime, Config.PlayerSpeedPower));
		}
	}
	@EventHandler
	public void PlayerWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerWaterBreathingEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.PlayerWaterBreathingTime, Config.PlayerWaterBreathingPower));
		}
	}
	@EventHandler
	public void PlayerWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.PlayerWeaknessEnabled != false && damager instanceof Player && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.PlayerWeaknessTime, Config.PlayerWeaknessPower));
		}
	}
}
