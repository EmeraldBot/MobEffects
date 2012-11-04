package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEWolfListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEWolfListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void WolfBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getWolfConfig().getBoolean("Wolf.Blindness.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getWolfConfig().getInt("Wolf.Blindness.Time"), plugin.getWolfConfig().getInt("Wolf.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void WolfNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Nausea.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getWolfConfig().getInt("Wolf.Nausea.Time"), plugin.getWolfConfig().getInt("Wolf.Nausea.Power")));
		}
	}
	@EventHandler
	public void WolfResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Resistance.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getWolfConfig().getInt("Wolf.Resistance.Time"), plugin.getWolfConfig().getInt("Wolf.Resistance.Power")));
		}
	}
	@EventHandler
	public void WolfFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.FastDigging.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getWolfConfig().getInt("Wolf.FastDigging.Time"), plugin.getWolfConfig().getInt("Wolf.FastDigging.Power")));
		}
	}
	@EventHandler
	public void WolfInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getWolfConfig().getBoolean("Wolf.Invisibility.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getWolfConfig().getInt("Wolf.Invisibility.Time"), plugin.getWolfConfig().getInt("Wolf.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void WolfNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getWolfConfig().getBoolean("Wolf.NightVision.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getWolfConfig().getInt("Wolf.NightVision.Time"), plugin.getWolfConfig().getInt("Wolf.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void WolfWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getWolfConfig().getBoolean("Wolf.Wither.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getWolfConfig().getInt("Wolf.Wither.Time"), plugin.getWolfConfig().getInt("Wolf.Wither.Power")));
		}
	}
	
	@EventHandler
	public void WolfFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.FireResistance.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getWolfConfig().getInt("Wolf.FireResistance.Time"), plugin.getWolfConfig().getInt("Wolf.FireResistance.Power")));
		}
	}
	@EventHandler
	public void WolfHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Harm.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getWolfConfig().getInt("Wolf.Harm.Time"), plugin.getWolfConfig().getInt("Wolf.Harm.Power")));
		}
	}
	@EventHandler
	public void WolfHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Heal.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getWolfConfig().getInt("Wolf.Heal.Time"), plugin.getWolfConfig().getInt("Wolf.Heal.Power")));
		}
	}
	@EventHandler
	public void WolfRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Regeneration.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getWolfConfig().getInt("Wolf.Regeneration.Time"), plugin.getWolfConfig().getInt("Wolf.Regeneration.Power")));
		}
	}
	@EventHandler
	public void WolfStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Strength.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getWolfConfig().getInt("Wolf.Strength.Time"), plugin.getWolfConfig().getInt("Wolf.Strength.Power")));
		}
	}
	@EventHandler
	public void WolfJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Jump.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getWolfConfig().getInt("Wolf.Jump.Time"), plugin.getWolfConfig().getInt("Wolf.Jump.Power")));
		}
	}
	@EventHandler
	public void WolfPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Poison.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getWolfConfig().getInt("Wolf.Poison.Time"), plugin.getWolfConfig().getInt("Wolf.Poison.Power")));
		}
	}
	@EventHandler
	public void WolfSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Slow.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getWolfConfig().getInt("Wolf.Slow.Time"), plugin.getWolfConfig().getInt("Wolf.Slow.Power")));
		}
	}
	@EventHandler
	public void WolfMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.MiningFatigue.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getWolfConfig().getInt("Wolf.MiningFatigue.Time"), plugin.getWolfConfig().getInt("Wolf.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void WolfSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Speed.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getWolfConfig().getInt("Wolf.Speed.Time"), plugin.getWolfConfig().getInt("Wolf.Speed.Power")));
		}
	}
	@EventHandler
	public void WolfWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.WaterBreathing.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getWolfConfig().getInt("Wolf.WaterBreathing.Time"), plugin.getWolfConfig().getInt("Wolf.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void WolfWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWolfConfig().getInt("Wolf.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getWolfConfig().getBoolean("Wolf.Weakness.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getWolfConfig().getInt("Wolf.Weakness.Time"), plugin.getWolfConfig().getInt("Wolf.Weakness.Power")));
		}
	}
}