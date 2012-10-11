package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESpiderListener implements Listener {
	
	public static MobEffects plugin;
	
	public MESpiderListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SpiderBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getspiderConfig().getBoolean("Spider.Blindness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getspiderConfig().getInt("Spider.Blindness.Time"), plugin.getspiderConfig().getInt("Spider.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void SpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Nausea.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getspiderConfig().getInt("Spider.Nausea.Time"), plugin.getspiderConfig().getInt("Spider.Nausea.Power")));
		}
	}
	@EventHandler
	public void SpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Resistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getspiderConfig().getInt("Spider.Resistance.Time"), plugin.getspiderConfig().getInt("Spider.Resistance.Power")));
		}
	}
	@EventHandler
	public void SpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.FastDigging.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getspiderConfig().getInt("Spider.FastDigging.Time"), plugin.getspiderConfig().getInt("Spider.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void SpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.FireResistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getspiderConfig().getInt("Spider.FireResistance.Time"), plugin.getspiderConfig().getInt("Spider.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Harm.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getspiderConfig().getInt("Spider.Harm.Time"), plugin.getspiderConfig().getInt("Spider.Harm.Power")));
		}
	}
	@EventHandler
	public void SpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Heal.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getspiderConfig().getInt("Spider.Heal.Time"), plugin.getspiderConfig().getInt("Spider.Heal.Power")));
		}
	}
	@EventHandler
	public void SpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Regeneration.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getspiderConfig().getInt("Spider.Regeneration.Time"), plugin.getspiderConfig().getInt("Spider.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Strength.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getspiderConfig().getInt("Spider.Strength.Time"), plugin.getspiderConfig().getInt("Spider.Strength.Power")));
		}
	}
	@EventHandler
	public void SpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Jump.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getspiderConfig().getInt("Spider.Jump.Time"), plugin.getspiderConfig().getInt("Spider.Jump.Power")));
		}
	}
	@EventHandler
	public void SpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Poison.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getspiderConfig().getInt("Spider.Poison.Time"), plugin.getspiderConfig().getInt("Spider.Poison.Power")));
		}
	}
	@EventHandler
	public void SpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Slow.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getspiderConfig().getInt("Spider.Slow.Time"), plugin.getspiderConfig().getInt("Spider.Slow.Power")));
		}
	}
	@EventHandler
	public void SpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.MiningFatigue.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getspiderConfig().getInt("Spider.MiningFatigue.Time"), plugin.getspiderConfig().getInt("Spider.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Speed.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getspiderConfig().getInt("Spider.Speed.Time"), plugin.getspiderConfig().getInt("Spider.Speed.Power")));
		}
	}
	@EventHandler
	public void SpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.WaterBreathing.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getspiderConfig().getInt("Spider.WaterBreathing.Time"), plugin.getspiderConfig().getInt("Spider.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getspiderConfig().getInt("Spider.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getspiderConfig().getBoolean("Spider.Weakness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getspiderConfig().getInt("Spider.Weakness.Time"), plugin.getspiderConfig().getInt("Spider.Weakness.Power")));
		}
	}
}