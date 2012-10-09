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
		if (rand <= plugin.getConfig().getInt("Wolf.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getConfig().getBoolean("Wolf.Blindness.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getConfig().getInt("Wolf.Blindness.Time"), plugin.getConfig().getInt("Wolf.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void WolfNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Nausea.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getConfig().getInt("Wolf.Nausea.Time"), plugin.getConfig().getInt("Wolf.Nausea.Power")));
		}
	}
	@EventHandler
	public void WolfResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Resistance.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getConfig().getInt("Wolf.Resistance.Time"), plugin.getConfig().getInt("Wolf.Resistance.Power")));
		}
	}
	@EventHandler
	public void WolfFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.FastDigging.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getConfig().getInt("Wolf.FastDigging.Time"), plugin.getConfig().getInt("Wolf.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void WolfFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.FireResistance.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getConfig().getInt("Wolf.FireResistance.Time"), plugin.getConfig().getInt("Wolf.FireResistance.Power")));
		}
	}
	@EventHandler
	public void WolfHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Harm.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getConfig().getInt("Wolf.Harm.Time"), plugin.getConfig().getInt("Wolf.Harm.Power")));
		}
	}
	@EventHandler
	public void WolfHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Heal.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getConfig().getInt("Wolf.Heal.Time"), plugin.getConfig().getInt("Wolf.Heal.Power")));
		}
	}
	@EventHandler
	public void WolfRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Regeneration.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getConfig().getInt("Wolf.Regeneration.Time"), plugin.getConfig().getInt("Wolf.Regeneration.Power")));
		}
	}
	@EventHandler
	public void WolfStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Strength.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getConfig().getInt("Wolf.Strength.Time"), plugin.getConfig().getInt("Wolf.Strength.Power")));
		}
	}
	@EventHandler
	public void WolfJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Jump.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getConfig().getInt("Wolf.Jump.Time"), plugin.getConfig().getInt("Wolf.Jump.Power")));
		}
	}
	@EventHandler
	public void WolfPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Poison.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getConfig().getInt("Wolf.Poison.Time"), plugin.getConfig().getInt("Wolf.Poison.Power")));
		}
	}
	@EventHandler
	public void WolfSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Slow.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getConfig().getInt("Wolf.Slow.Time"), plugin.getConfig().getInt("Wolf.Slow.Power")));
		}
	}
	@EventHandler
	public void WolfMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.MiningFatigue.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getConfig().getInt("Wolf.MiningFatigue.Time"), plugin.getConfig().getInt("Wolf.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void WolfSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Speed.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getConfig().getInt("Wolf.Speed.Time"), plugin.getConfig().getInt("Wolf.Speed.Power")));
		}
	}
	@EventHandler
	public void WolfWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.WaterBreathing.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getConfig().getInt("Wolf.WaterBreathing.Time"), plugin.getConfig().getInt("Wolf.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void WolfWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Wolf.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Wolf.Weakness.Enabled", true) && damager instanceof Wolf && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getConfig().getInt("Wolf.Weakness.Time"), plugin.getConfig().getInt("Wolf.Weakness.Power")));
		}
	}
}