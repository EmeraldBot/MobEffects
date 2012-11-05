package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEGhastListener implements Listener {

	public static MobEffects plugin;

	public MEGhastListener(MobEffects instance) {
		plugin = instance;
	}

	@EventHandler
	public void GhastBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Blindness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Blindness.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getGhastConfig().getInt("Ghast.Blindness.Time"), plugin.getGhastConfig().getInt("Ghast.Blindness.Power")));
			}
		}
	}
	@EventHandler
	public void GhastConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Nausea.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getGhastConfig().getInt("Ghast.Nausea.Time"), plugin.getGhastConfig().getInt("Ghast.Nausea.Power")));
			}
		}
	}

	@EventHandler
	public void GhastInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Invisibility.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Invisibility.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getGhastConfig().getInt("Ghast.Invisibility.Time"), plugin.getGhastConfig().getInt("Ghast.Invisibility.Power")));
			}
		}
	}

	@EventHandler
	public void GhastResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Resistance.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getGhastConfig().getInt("Ghast.Resistance.Time"), plugin.getGhastConfig().getInt("Ghast.Resitance.Power")));
			}
		}
	}
	@EventHandler
	public void GhastFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.FastDigging.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getGhastConfig().getInt("Ghast.FastDigging.Time"), plugin.getGhastConfig().getInt("Ghast.FastDigging.Power")));
			}
		}
	}

	@EventHandler
	public void GhastFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.FireResistance.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getGhastConfig().getInt("Ghast.FireResistance.Time"), plugin.getGhastConfig().getInt("Ghast.FireResistance.Power")));
			}
		}
	}

	@EventHandler
	public void GhastHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Harm.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getGhastConfig().getInt("Ghast.Harm.Time"), plugin.getGhastConfig().getInt("Ghast.Harm.Power")));
			}
		}
	}

	@EventHandler
	public void GhastHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Heal.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getGhastConfig().getInt("Ghast.Heal.Time"), plugin.getGhastConfig().getInt("Ghast.Heal.Power")));
			}
		}
	}

	@EventHandler
	public void GhastNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.NightVision.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.NightVision.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getGhastConfig().getInt("Ghast.NightVision.Time"), plugin.getGhastConfig().getInt("Ghast.NightVision.Power")));
			}
		}
	}

	@EventHandler
	public void GhastRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Regeneration.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getGhastConfig().getInt("Ghast.Regeneration.Time"), plugin.getGhastConfig().getInt("Ghast.Regeneration.Power")));
			}
		}
	}

	@EventHandler
	public void GhastStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Strength.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getGhastConfig().getInt("Ghast.Strength.Time"), plugin.getGhastConfig().getInt("Ghast.Strength.Power")));
			}
		}
	}

	@EventHandler
	public void GhastJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Jump.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getGhastConfig().getInt("Ghast.Jump.Time"), plugin.getGhastConfig().getInt("Ghast.Jump.Power")));
			}
		}
	}

	@EventHandler
	public void GhastPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Poison.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getGhastConfig().getInt("Ghast.Poison.Time"), plugin.getGhastConfig().getInt("Ghast.Poison.Power")));
			}
		}
	}

	@EventHandler
	public void GhastSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Slow.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getGhastConfig().getInt("Ghast.Slow.Time"), plugin.getGhastConfig().getInt("Ghast.Slow.Power")));
			}
		}
	}

	@EventHandler
	public void GhastMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.MiningFatigue.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getGhastConfig().getInt("Ghast.MiningFatigue.Time"), plugin.getGhastConfig().getInt("Ghast.MiningFatigue.Power")));
			}
		}
	}

	@EventHandler
	public void GhastSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Speed.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getGhastConfig().getInt("Ghast.Speed.Time"), plugin.getGhastConfig().getInt("Ghast.Speed.Power")));
			}
		}
	}
	@EventHandler
	public void GhastWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.WaterBreathing.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getGhastConfig().getInt("Ghast.WaterBreathing.Time"), plugin.getGhastConfig().getInt("Ghast.WaterBreathing.Power")));
			}
		}
	}
	@EventHandler
	public void GhastWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Weakness.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getGhastConfig().getInt("Ghast.Weakness.Time"), plugin.getGhastConfig().getInt("Ghast.Weakness.Power")));
			}
		}
	}

	@EventHandler
	public void GhastWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGhastConfig().getInt("Ghast.Ghast.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getGhastConfig().getBoolean("Ghast.Ghast.Enabled", true) && shooter instanceof Ghast && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getGhastConfig().getInt("Ghast.Ghast.Time"), plugin.getGhastConfig().getInt("Ghast.Ghast.Power")));
			}
		}
	}

}