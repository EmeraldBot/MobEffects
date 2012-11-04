package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEWitherListener implements Listener {

	public static MobEffects plugin;

	public MEWitherListener(MobEffects instance) {
		plugin = instance;
	}

	@EventHandler
	public void WitherBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Blindness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Blindness.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getWitherConfig().getInt("Wither.Blindness.Time"), plugin.getWitherConfig().getInt("Wither.Blindness.Power")));
			}
		}
	}
	@EventHandler
	public void WitherConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Nausea.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getWitherConfig().getInt("Wither.Nausea.Time"), plugin.getWitherConfig().getInt("Wither.Nausea.Power")));
			}
		}
	}

	@EventHandler
	public void WitherInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Invisibility.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Invisibility.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getWitherConfig().getInt("Wither.Invisibility.Time"), plugin.getWitherConfig().getInt("Wither.Invisibility.Power")));
			}
		}
	}

	@EventHandler
	public void WitherResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Resistance.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getWitherConfig().getInt("Wither.Resistance.Time"), plugin.getWitherConfig().getInt("Wither.Resitance.Power")));
			}
		}
	}
	@EventHandler
	public void WitherFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.FastDigging.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getWitherConfig().getInt("Wither.FastDigging.Time"), plugin.getWitherConfig().getInt("Wither.FastDigging.Power")));
			}
		}
	}

	@EventHandler
	public void WitherFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.FireResistance.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getWitherConfig().getInt("Wither.FireResistance.Time"), plugin.getWitherConfig().getInt("Wither.FireResistance.Power")));
			}
		}
	}

	@EventHandler
	public void WitherHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Harm.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getWitherConfig().getInt("Wither.Harm.Time"), plugin.getWitherConfig().getInt("Wither.Harm.Power")));
			}
		}
	}

	@EventHandler
	public void WitherHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Heal.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getWitherConfig().getInt("Wither.Heal.Time"), plugin.getWitherConfig().getInt("Wither.Heal.Power")));
			}
		}
	}

	@EventHandler
	public void WitherNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.NightVision.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.NightVision.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getWitherConfig().getInt("Wither.NightVision.Time"), plugin.getWitherConfig().getInt("Wither.NightVision.Power")));
			}
		}
	}

	@EventHandler
	public void WitherRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Regeneration.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getWitherConfig().getInt("Wither.Regeneration.Time"), plugin.getWitherConfig().getInt("Wither.Regeneration.Power")));
			}
		}
	}

	@EventHandler
	public void WitherStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Strength.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getWitherConfig().getInt("Wither.Strength.Time"), plugin.getWitherConfig().getInt("Wither.Strength.Power")));
			}
		}
	}

	@EventHandler
	public void WitherJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Jump.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getWitherConfig().getInt("Wither.Jump.Time"), plugin.getWitherConfig().getInt("Wither.Jump.Power")));
			}
		}
	}

	@EventHandler
	public void WitherPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Poison.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getWitherConfig().getInt("Wither.Poison.Time"), plugin.getWitherConfig().getInt("Wither.Poison.Power")));
			}
		}
	}

	@EventHandler
	public void WitherSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Slow.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getWitherConfig().getInt("Wither.Slow.Time"), plugin.getWitherConfig().getInt("Wither.Slow.Power")));
			}
		}
	}

	@EventHandler
	public void WitherMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.MiningFatigue.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getWitherConfig().getInt("Wither.MiningFatigue.Time"), plugin.getWitherConfig().getInt("Wither.MiningFatigue.Power")));
			}
		}
	}

	@EventHandler
	public void WitherSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Speed.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getWitherConfig().getInt("Wither.Speed.Time"), plugin.getWitherConfig().getInt("Wither.Speed.Power")));
			}
		}
	}
	@EventHandler
	public void WitherWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.WaterBreathing.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getWitherConfig().getInt("Wither.WaterBreathing.Time"), plugin.getWitherConfig().getInt("Wither.WaterBreathing.Power")));
			}
		}
	}
	@EventHandler
	public void WitherWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Weakness.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getWitherConfig().getInt("Wither.Weakness.Time"), plugin.getWitherConfig().getInt("Wither.Weakness.Power")));
			}
		}
	}

	@EventHandler
	public void WitherWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitherConfig().getInt("Wither.Wither.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof WitherSkull) {
			WitherSkull s = (WitherSkull) event.getDamager();
			LivingEntity shooter = s.getShooter();
			if (plugin.getWitherConfig().getBoolean("Wither.Wither.Enabled", true) && shooter instanceof Wither && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getWitherConfig().getInt("Wither.Wither.Time"), plugin.getWitherConfig().getInt("Wither.Wither.Power")));
			}
		}
	}

}