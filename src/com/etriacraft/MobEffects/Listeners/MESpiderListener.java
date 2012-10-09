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
		if (rand <= plugin.getConfig().getInt("Spider.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getConfig().getBoolean("Spider.Blindness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getConfig().getInt("Spider.Blindness.Time"), plugin.getConfig().getInt("Spider.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void SpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Nausea.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getConfig().getInt("Spider.Nausea.Time"), plugin.getConfig().getInt("Spider.Nausea.Power")));
		}
	}
	@EventHandler
	public void SpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Resistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getConfig().getInt("Spider.Resistance.Time"), plugin.getConfig().getInt("Spider.Resistance.Power")));
		}
	}
	@EventHandler
	public void SpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.FastDigging.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getConfig().getInt("Spider.FastDigging.Time"), plugin.getConfig().getInt("Spider.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void SpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.FireResistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getConfig().getInt("Spider.FireResistance.Time"), plugin.getConfig().getInt("Spider.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Harm.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getConfig().getInt("Spider.Harm.Time"), plugin.getConfig().getInt("Spider.Harm.Power")));
		}
	}
	@EventHandler
	public void SpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Heal.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getConfig().getInt("Spider.Heal.Time"), plugin.getConfig().getInt("Spider.Heal.Power")));
		}
	}
	@EventHandler
	public void SpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Regeneration.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getConfig().getInt("Spider.Regeneration.Time"), plugin.getConfig().getInt("Spider.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Strength.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getConfig().getInt("Spider.Strength.Time"), plugin.getConfig().getInt("Spider.Strength.Power")));
		}
	}
	@EventHandler
	public void SpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Jump.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getConfig().getInt("Spider.Jump.Time"), plugin.getConfig().getInt("Spider.Jump.Power")));
		}
	}
	@EventHandler
	public void SpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Poison.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getConfig().getInt("Spider.Poison.Time"), plugin.getConfig().getInt("Spider.Poison.Power")));
		}
	}
	@EventHandler
	public void SpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Slow.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getConfig().getInt("Spider.Slow.Time"), plugin.getConfig().getInt("Spider.Slow.Power")));
		}
	}
	@EventHandler
	public void SpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.MiningFatigue.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getConfig().getInt("Spider.MiningFatigue.Time"), plugin.getConfig().getInt("Spider.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Speed.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getConfig().getInt("Spider.Speed.Time"), plugin.getConfig().getInt("Spider.Speed.Power")));
		}
	}
	@EventHandler
	public void SpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.WaterBreathing.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getConfig().getInt("Spider.WaterBreathing.Time"), plugin.getConfig().getInt("Spider.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Spider.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Spider.Weakness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getConfig().getInt("Spider.Weakness.Time"), plugin.getConfig().getInt("Spider.Weakness.Power")));
		}
	}
}