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
		
		if (Config.GiantBlindnessEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.GiantBlindnessTime, Config.GiantBlindnessPower));
		}
	}
	
	@EventHandler
	public void GiantConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantConfusionEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.GiantConfusionTime, Config.GiantConfusionPower));
		}
	}
	@EventHandler
	public void GiantDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantDamageResistanceEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.GiantDamageResistanceTime, Config.GiantDamageResistancePower));
		}
	}
	@EventHandler
	public void GiantFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantFastDiggingEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.GiantFastDiggingTime, Config.GiantFastDiggingPower));
		}
	}
	
	@EventHandler
	public void GiantFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantFireResistanceEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.GiantFireResistanceTime, Config.GiantFireResistancePower));
		}
	}
	@EventHandler
	public void GiantHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantHarmEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.GiantHarmTime, Config.GiantHarmPower));
		}
	}
	@EventHandler
	public void GiantHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantHarmEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.GiantHealTime, Config.GiantHealPower));
		}
	}
	@EventHandler
	public void GiantHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantHungerEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.GiantHungerTime, Config.GiantHungerPower));
		}
	}
	@EventHandler
	public void GiantIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantIncreaseDamageEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.GiantIncreaseDamageTime, Config.GiantIncreaseDamagePower));
		}
	}
	@EventHandler
	public void GiantJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantJumpEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.GiantJumpTime, Config.GiantJumpPower));
		}
	}
	@EventHandler
	public void GiantPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantPoisonEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.GiantPoisonTime, Config.GiantPoisonPower));
		}
	}
	@EventHandler
	public void GiantRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantRegenerationEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.GiantRegenerationTime, Config.GiantRegenerationPower));
		}
	}
	@EventHandler
	public void GiantSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantSlowEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.GiantSlowTime, Config.GiantSlowPower));
		}
	}
	@EventHandler
	public void GiantSlowDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantSlowDiggingEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Config.GiantSlowDiggingTime, Config.GiantSlowDiggingPower));
		}
	}
	@EventHandler
	public void GiantSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantSpeedEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Config.GiantSpeedTime, Config.GiantSpeedPower));
		}
	}
	@EventHandler
	public void GiantWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantWaterBreathingEnabled != false && damager instanceof Giant && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Config.GiantWaterBreathingTime, Config.GiantWaterBreathingPower));
		}
	}
	@EventHandler
	public void GiantWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.GiantWeaknessEnabled != false && damager instanceof Giant && e instanceof Giant) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.GiantWeaknessTime, Config.GiantWeaknessPower));
		}
	}
}
