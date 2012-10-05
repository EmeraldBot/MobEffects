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
		
		if (Config.BlazeBlindnessEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.BlazeBlindnessTime, Config.BlazeBlindnessPower));
		}
	}
	
	@EventHandler
	public void BlazeConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeConfusionEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.BlazeConfusionTime, Config.BlazeConfusionPower));
		}
	}
	@EventHandler
	public void BlazeDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeDamageResistanceEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.BlazeDamageResistanceTime, Config.BlazeDamageResistancePower));
		}
	}
	@EventHandler
	public void BlazeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeFastDiggingEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.BlazeFastDiggingTime, Config.BlazeFastDiggingPower));
		}
	}
	
	@EventHandler
	public void BlazeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeFireResistanceEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.BlazeFireResistanceTime, Config.BlazeFireResistancePower));
		}
	}
	@EventHandler
	public void BlazeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeHarmEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.BlazeHarmTime, Config.BlazeHarmPower));
		}
	}
	@EventHandler
	public void BlazeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeHarmEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.BlazeHealTime, Config.BlazeHealPower));
		}
	}
	@EventHandler
	public void BlazeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeHungerEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.BlazeHungerTime, Config.BlazeHungerPower));
		}
	}
	@EventHandler
	public void BlazeIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeIncreaseDamageEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.BlazeIncreaseDamageTime, Config.BlazeIncreaseDamagePower));
		}
	}
	@EventHandler
	public void BlazeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeJumpEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.BlazeJumpTime, Config.BlazeJumpPower));
		}
	}
	@EventHandler
	public void BlazePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazePoisonEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.BlazePoisonTime, Config.BlazePoisonPower));
		}
	}
	@EventHandler
	public void BlazeRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeRegenerationEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.BlazeRegenerationTime, Config.BlazeRegenerationPower));
		}
	}
	@EventHandler
	public void BlazeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeSlowEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.BlazeSlowTime, Config.BlazeSlowPower));
		}
	}
	@EventHandler
	public void BlazeSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeSlowDiggingEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.BlazeSlowDiggingTime, Config.BlazeSlowDiggingPower));
		}
	}
	@EventHandler
	public void BlazeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeSpeedEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.BlazeSpeedTime, Config.BlazeSpeedPower));
		}
	}
	@EventHandler
	public void BlazeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeWaterBreathingEnabled != false && damager instanceof Blaze && e instanceof Player && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.BlazeWaterBreathingTime, Config.BlazeWaterBreathingPower));
		}
	}
	@EventHandler
	public void BlazeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		if (Config.BlazeWeaknessEnabled != false && damager instanceof Blaze && e instanceof Blaze && Config.Worlds.contains(world)) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.BlazeWeaknessTime, Config.BlazeWeaknessPower));
		}
	}
}
