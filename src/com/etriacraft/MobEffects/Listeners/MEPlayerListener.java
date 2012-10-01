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
		
		if (Config.PlayerBlindnessEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.PlayerBlindnessTime, Config.PlayerBlindnessPower));
		}
	}
	
	@EventHandler
	public void PlayerConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerConfusionEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.PlayerConfusionTime, Config.PlayerConfusionPower));
		}
	}
	@EventHandler
	public void PlayerDamageResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerDamageResistanceEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Config.PlayerDamageResistanceTime, Config.PlayerDamageResistancePower));
		}
	}
	@EventHandler
	public void PlayerFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerFastDiggingEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Config.PlayerFastDiggingTime, Config.PlayerFastDiggingPower));
		}
	}
	
	@EventHandler
	public void PlayerFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerFireResistanceEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Config.PlayerFireResistanceTime, Config.PlayerFireResistancePower));
		}
	}
	@EventHandler
	public void PlayerHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Config.PlayerHarmTime, Config.PlayerHarmPower));
		}
	}
	@EventHandler
	public void PlayerHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerHarmEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Config.PlayerHealTime, Config.PlayerHealPower));
		}
	}
	@EventHandler
	public void PlayerHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerHungerEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Config.PlayerHungerTime, Config.PlayerHungerPower));
		}
	}
	@EventHandler
	public void PlayerIncreaseDamage(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerIncreaseDamageEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Config.PlayerIncreaseDamageTime, Config.PlayerIncreaseDamagePower));
		}
	}
	@EventHandler
	public void PlayerJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerJumpEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Config.PlayerJumpTime, Config.PlayerJumpPower));
		}
	}
	@EventHandler
	public void PlayerPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerPoisonEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.PlayerPoisonTime, Config.PlayerPoisonPower));
		}
	}
	@EventHandler
	public void PlayerRegeneratoin(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerRegenerationEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Config.PlayerRegenerationTime, Config.PlayerRegenerationPower));
		}
	}
	@EventHandler
	public void PlayerSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		if (Config.PlayerSlowEnabled != false && damager instanceof Player && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.PlayerSlowTime, Config.PlayerSlowPower));
		}
	}
}
