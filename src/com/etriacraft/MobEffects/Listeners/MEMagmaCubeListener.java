package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEMagmaCubeListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEMagmaCubeListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void MagmaCubeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Blindness.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getMagmaCubeConfig().getInt("MagmaCube.Blindness.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void MagmaCubeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Hunger.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getMagmaCubeConfig().getInt("MagmaCube.Hunger.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void MagmaCubeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Nausea.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getMagmaCubeConfig().getInt("MagmaCube.Nausea.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Nausea.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Resistance.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getMagmaCubeConfig().getInt("MagmaCube.Resistance.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Resistance.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.FastDigging.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getMagmaCubeConfig().getInt("MagmaCube.FastDigging.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.FastDigging.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Invisibility.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getMagmaCubeConfig().getInt("MagmaCube.Invisibility.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void MagmaCubeNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getMagmaCubeConfig().getBoolean("MagmaCube.NightVision.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getMagmaCubeConfig().getInt("MagmaCube.NightVision.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void MagmaCubeWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Wither.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getMagmaCubeConfig().getInt("MagmaCube.Wither.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Wither.Power")));
		}
	}
	
	@EventHandler
	public void MagmaCubeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.FireResistance.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getMagmaCubeConfig().getInt("MagmaCube.FireResistance.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.FireResistance.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Harm.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getMagmaCubeConfig().getInt("MagmaCube.Harm.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Harm.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Heal.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getMagmaCubeConfig().getInt("MagmaCube.Heal.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Heal.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Regeneration.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getMagmaCubeConfig().getInt("MagmaCube.Regeneration.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Regeneration.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Strength.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getMagmaCubeConfig().getInt("MagmaCube.Strength.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Strength.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Jump.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getMagmaCubeConfig().getInt("MagmaCube.Jump.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Jump.Power")));
		}
	}
	@EventHandler
	public void MagmaCubePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Poison.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getMagmaCubeConfig().getInt("MagmaCube.Poison.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Poison.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Slow.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getMagmaCubeConfig().getInt("MagmaCube.Slow.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Slow.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.MiningFatigue.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getMagmaCubeConfig().getInt("MagmaCube.MiningFatigue.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Speed.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getMagmaCubeConfig().getInt("MagmaCube.Speed.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Speed.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.WaterBreathing.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getMagmaCubeConfig().getInt("MagmaCube.WaterBreathing.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void MagmaCubeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getMagmaCubeConfig().getInt("MagmaCube.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getMagmaCubeConfig().getBoolean("MagmaCube.Weakness.Enabled", true) && damager instanceof MagmaCube && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getMagmaCubeConfig().getInt("MagmaCube.Weakness.Time"), plugin.getMagmaCubeConfig().getInt("MagmaCube.Weakness.Power")));
		}
	}
}