package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEEndermanListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEEndermanListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void EndermanBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEndermanConfig().getBoolean("Enderman.Blindness.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getEndermanConfig().getInt("Enderman.Blindness.Time"), plugin.getEndermanConfig().getInt("Enderman.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void EndermanHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getEndermanConfig().getBoolean("Enderman.Hunger.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getEndermanConfig().getInt("Enderman.Hunger.Time"), plugin.getEndermanConfig().getInt("Enderman.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void EndermanNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Nausea.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getEndermanConfig().getInt("Enderman.Nausea.Time"), plugin.getEndermanConfig().getInt("Enderman.Nausea.Power")));
		}
	}
	@EventHandler
	public void EndermanResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Resistance.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getEndermanConfig().getInt("Enderman.Resistance.Time"), plugin.getEndermanConfig().getInt("Enderman.Resistance.Power")));
		}
	}
	@EventHandler
	public void EndermanFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.FastDigging.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getEndermanConfig().getInt("Enderman.FastDigging.Time"), plugin.getEndermanConfig().getInt("Enderman.FastDigging.Power")));
		}
	}
	@EventHandler
	public void EndermanInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEndermanConfig().getBoolean("Enderman.Invisibility.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getEndermanConfig().getInt("Enderman.Invisibility.Time"), plugin.getEndermanConfig().getInt("Enderman.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void EndermanNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEndermanConfig().getBoolean("Enderman.NightVision.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getEndermanConfig().getInt("Enderman.NightVision.Time"), plugin.getEndermanConfig().getInt("Enderman.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void EndermanWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEndermanConfig().getBoolean("Enderman.Wither.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getEndermanConfig().getInt("Enderman.Wither.Time"), plugin.getEndermanConfig().getInt("Enderman.Wither.Power")));
		}
	}
	
	@EventHandler
	public void EndermanFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.FireResistance.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getEndermanConfig().getInt("Enderman.FireResistance.Time"), plugin.getEndermanConfig().getInt("Enderman.FireResistance.Power")));
		}
	}
	@EventHandler
	public void EndermanHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Harm.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getEndermanConfig().getInt("Enderman.Harm.Time"), plugin.getEndermanConfig().getInt("Enderman.Harm.Power")));
		}
	}
	@EventHandler
	public void EndermanHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Heal.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getEndermanConfig().getInt("Enderman.Heal.Time"), plugin.getEndermanConfig().getInt("Enderman.Heal.Power")));
		}
	}
	@EventHandler
	public void EndermanRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Regeneration.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getEndermanConfig().getInt("Enderman.Regeneration.Time"), plugin.getEndermanConfig().getInt("Enderman.Regeneration.Power")));
		}
	}
	@EventHandler
	public void EndermanStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Strength.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getEndermanConfig().getInt("Enderman.Strength.Time"), plugin.getEndermanConfig().getInt("Enderman.Strength.Power")));
		}
	}
	@EventHandler
	public void EndermanJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Jump.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getEndermanConfig().getInt("Enderman.Jump.Time"), plugin.getEndermanConfig().getInt("Enderman.Jump.Power")));
		}
	}
	@EventHandler
	public void EndermanPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Poison.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getEndermanConfig().getInt("Enderman.Poison.Time"), plugin.getEndermanConfig().getInt("Enderman.Poison.Power")));
		}
	}
	@EventHandler
	public void EndermanSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Slow.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getEndermanConfig().getInt("Enderman.Slow.Time"), plugin.getEndermanConfig().getInt("Enderman.Slow.Power")));
		}
	}
	@EventHandler
	public void EndermanMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.MiningFatigue.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getEndermanConfig().getInt("Enderman.MiningFatigue.Time"), plugin.getEndermanConfig().getInt("Enderman.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void EndermanSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Speed.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getEndermanConfig().getInt("Enderman.Speed.Time"), plugin.getEndermanConfig().getInt("Enderman.Speed.Power")));
		}
	}
	@EventHandler
	public void EndermanWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.WaterBreathing.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getEndermanConfig().getInt("Enderman.WaterBreathing.Time"), plugin.getEndermanConfig().getInt("Enderman.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void EndermanWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEndermanConfig().getInt("Enderman.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEndermanConfig().getBoolean("Enderman.Weakness.Enabled", true) && damager instanceof Enderman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getEndermanConfig().getInt("Enderman.Weakness.Time"), plugin.getEndermanConfig().getInt("Enderman.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void EndermanSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.ENDERMAN && plugin.getEndermanConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}