package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Spider;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
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
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSpiderConfig().getBoolean("Spider.Blindness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getSpiderConfig().getInt("Spider.Blindness.Time"), plugin.getSpiderConfig().getInt("Spider.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void SpiderHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getSpiderConfig().getBoolean("Spider.Hunger.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getSpiderConfig().getInt("Spider.Hunger.Time"), plugin.getSpiderConfig().getInt("Spider.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void SpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Nausea.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getSpiderConfig().getInt("Spider.Nausea.Time"), plugin.getSpiderConfig().getInt("Spider.Nausea.Power")));
		}
	}
	@EventHandler
	public void SpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Resistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getSpiderConfig().getInt("Spider.Resistance.Time"), plugin.getSpiderConfig().getInt("Spider.Resistance.Power")));
		}
	}
	@EventHandler
	public void SpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.FastDigging.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getSpiderConfig().getInt("Spider.FastDigging.Time"), plugin.getSpiderConfig().getInt("Spider.FastDigging.Power")));
		}
	}
	@EventHandler
	public void SpiderInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSpiderConfig().getBoolean("Spider.Invisibility.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getSpiderConfig().getInt("Spider.Invisibility.Time"), plugin.getSpiderConfig().getInt("Spider.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void SpiderNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSpiderConfig().getBoolean("Spider.NightVision.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getSpiderConfig().getInt("Spider.NightVision.Time"), plugin.getSpiderConfig().getInt("Spider.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void SpiderWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSpiderConfig().getBoolean("Spider.Wither.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getSpiderConfig().getInt("Spider.Wither.Time"), plugin.getSpiderConfig().getInt("Spider.Wither.Power")));
		}
	}
	
	@EventHandler
	public void SpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.FireResistance.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getSpiderConfig().getInt("Spider.FireResistance.Time"), plugin.getSpiderConfig().getInt("Spider.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Harm.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getSpiderConfig().getInt("Spider.Harm.Time"), plugin.getSpiderConfig().getInt("Spider.Harm.Power")));
		}
	}
	@EventHandler
	public void SpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Heal.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getSpiderConfig().getInt("Spider.Heal.Time"), plugin.getSpiderConfig().getInt("Spider.Heal.Power")));
		}
	}
	@EventHandler
	public void SpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Regeneration.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getSpiderConfig().getInt("Spider.Regeneration.Time"), plugin.getSpiderConfig().getInt("Spider.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Strength.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getSpiderConfig().getInt("Spider.Strength.Time"), plugin.getSpiderConfig().getInt("Spider.Strength.Power")));
		}
	}
	@EventHandler
	public void SpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Jump.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getSpiderConfig().getInt("Spider.Jump.Time"), plugin.getSpiderConfig().getInt("Spider.Jump.Power")));
		}
	}
	@EventHandler
	public void SpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Poison.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getSpiderConfig().getInt("Spider.Poison.Time"), plugin.getSpiderConfig().getInt("Spider.Poison.Power")));
		}
	}
	@EventHandler
	public void SpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Slow.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getSpiderConfig().getInt("Spider.Slow.Time"), plugin.getSpiderConfig().getInt("Spider.Slow.Power")));
		}
	}
	@EventHandler
	public void SpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.MiningFatigue.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getSpiderConfig().getInt("Spider.MiningFatigue.Time"), plugin.getSpiderConfig().getInt("Spider.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Speed.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getSpiderConfig().getInt("Spider.Speed.Time"), plugin.getSpiderConfig().getInt("Spider.Speed.Power")));
		}
	}
	@EventHandler
	public void SpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.WaterBreathing.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getSpiderConfig().getInt("Spider.WaterBreathing.Time"), plugin.getSpiderConfig().getInt("Spider.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSpiderConfig().getInt("Spider.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSpiderConfig().getBoolean("Spider.Weakness.Enabled", true) && damager instanceof Spider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getSpiderConfig().getInt("Spider.Weakness.Time"), plugin.getSpiderConfig().getInt("Spider.Weakness.Power")));
		}
	}
}