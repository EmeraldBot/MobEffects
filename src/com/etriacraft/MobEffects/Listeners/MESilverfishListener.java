package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESilverfishListener implements Listener {
	
	public static MobEffects plugin;
	
	public MESilverfishListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SilverfishBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSilverfishConfig().getBoolean("Silverfish.Blindness.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getSilverfishConfig().getInt("Silverfish.Blindness.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getSilverfishConfig().getBoolean("Silverfish.Hunger.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getSilverfishConfig().getInt("Silverfish.Hunger.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Nausea.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getSilverfishConfig().getInt("Silverfish.Nausea.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Nausea.Power")));
		}
	}
	@EventHandler
	public void SilverfishResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Resistance.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getSilverfishConfig().getInt("Silverfish.Resistance.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Resistance.Power")));
		}
	}
	@EventHandler
	public void SilverfishFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.FastDigging.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getSilverfishConfig().getInt("Silverfish.FastDigging.Time"), plugin.getSilverfishConfig().getInt("Silverfish.FastDigging.Power")));
		}
	}
	@EventHandler
	public void SilverfishInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSilverfishConfig().getBoolean("Silverfish.Invisibility.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getSilverfishConfig().getInt("Silverfish.Invisibility.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSilverfishConfig().getBoolean("Silverfish.NightVision.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getSilverfishConfig().getInt("Silverfish.NightVision.Time"), plugin.getSilverfishConfig().getInt("Silverfish.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getSilverfishConfig().getBoolean("Silverfish.Wither.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getSilverfishConfig().getInt("Silverfish.Wither.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Wither.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.FireResistance.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getSilverfishConfig().getInt("Silverfish.FireResistance.Time"), plugin.getSilverfishConfig().getInt("Silverfish.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SilverfishHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Harm.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getSilverfishConfig().getInt("Silverfish.Harm.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Harm.Power")));
		}
	}
	@EventHandler
	public void SilverfishHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Heal.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getSilverfishConfig().getInt("Silverfish.Heal.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Heal.Power")));
		}
	}
	@EventHandler
	public void SilverfishRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Regeneration.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getSilverfishConfig().getInt("Silverfish.Regeneration.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SilverfishStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Strength.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getSilverfishConfig().getInt("Silverfish.Strength.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Strength.Power")));
		}
	}
	@EventHandler
	public void SilverfishJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Jump.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getSilverfishConfig().getInt("Silverfish.Jump.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Jump.Power")));
		}
	}
	@EventHandler
	public void SilverfishPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Poison.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getSilverfishConfig().getInt("Silverfish.Poison.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Poison.Power")));
		}
	}
	@EventHandler
	public void SilverfishSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Slow.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getSilverfishConfig().getInt("Silverfish.Slow.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Slow.Power")));
		}
	}
	@EventHandler
	public void SilverfishMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.MiningFatigue.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getSilverfishConfig().getInt("Silverfish.MiningFatigue.Time"), plugin.getSilverfishConfig().getInt("Silverfish.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SilverfishSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Speed.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getSilverfishConfig().getInt("Silverfish.Speed.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Speed.Power")));
		}
	}
	@EventHandler
	public void SilverfishWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.WaterBreathing.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getSilverfishConfig().getInt("Silverfish.WaterBreathing.Time"), plugin.getSilverfishConfig().getInt("Silverfish.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SilverfishWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSilverfishConfig().getInt("Silverfish.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getSilverfishConfig().getBoolean("Silverfish.Weakness.Enabled", true) && damager instanceof Silverfish && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getSilverfishConfig().getInt("Silverfish.Weakness.Time"), plugin.getSilverfishConfig().getInt("Silverfish.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void SilverfishSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.SILVERFISH && plugin.getSilverfishConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}