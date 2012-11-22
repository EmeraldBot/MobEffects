package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Witch;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEWitchListener implements Listener {

	public static MobEffects plugin;

	public MEWitchListener(MobEffects instance) {
		plugin = instance;
	}

	@EventHandler
	public void WitchBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Blindness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Blindness.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getWitchConfig().getInt("Witch.Blindness.Time"), plugin.getWitchConfig().getInt("Witch.Blindness.Power")));
			}
		}
	}
	@EventHandler
	public void WitchHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Hunger.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Hunger.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getWitchConfig().getInt("Witch.Hunger.Time"), plugin.getWitchConfig().getInt("Witch.Hunger.Power")));
			}
		}
	}
	@EventHandler
	public void WitchConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Nausea.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getWitchConfig().getInt("Witch.Nausea.Time"), plugin.getWitchConfig().getInt("Witch.Nausea.Power")));
			}
		}
	}

	@EventHandler
	public void WitchInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Invisibility.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Invisibility.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getWitchConfig().getInt("Witch.Invisibility.Time"), plugin.getWitchConfig().getInt("Witch.Invisibility.Power")));
			}
		}
	}

	@EventHandler
	public void WitchResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Resistance.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getWitchConfig().getInt("Witch.Resistance.Time"), plugin.getWitchConfig().getInt("Witch.Resitance.Power")));
			}
		}
	}
	@EventHandler
	public void WitchFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.FastDigging.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getWitchConfig().getInt("Witch.FastDigging.Time"), plugin.getWitchConfig().getInt("Witch.FastDigging.Power")));
			}
		}
	}

	@EventHandler
	public void WitchFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.FireResistance.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getWitchConfig().getInt("Witch.FireResistance.Time"), plugin.getWitchConfig().getInt("Witch.FireResistance.Power")));
			}
		}
	}

	@EventHandler
	public void WitchHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Harm.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getWitchConfig().getInt("Witch.Harm.Time"), plugin.getWitchConfig().getInt("Witch.Harm.Power")));
			}
		}
	}

	@EventHandler
	public void WitchHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Heal.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getWitchConfig().getInt("Witch.Heal.Time"), plugin.getWitchConfig().getInt("Witch.Heal.Power")));
			}
		}
	}

	@EventHandler
	public void WitchNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.NightVision.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.NightVision.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getWitchConfig().getInt("Witch.NightVision.Time"), plugin.getWitchConfig().getInt("Witch.NightVision.Power")));
			}
		}
	}

	@EventHandler
	public void WitchRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Regeneration.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getWitchConfig().getInt("Witch.Regeneration.Time"), plugin.getWitchConfig().getInt("Witch.Regeneration.Power")));
			}
		}
	}

	@EventHandler
	public void WitchStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Strength.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getWitchConfig().getInt("Witch.Strength.Time"), plugin.getWitchConfig().getInt("Witch.Strength.Power")));
			}
		}
	}

	@EventHandler
	public void WitchJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Jump.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getWitchConfig().getInt("Witch.Jump.Time"), plugin.getWitchConfig().getInt("Witch.Jump.Power")));
			}
		}
	}

	@EventHandler
	public void WitchPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Poison.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getWitchConfig().getInt("Witch.Poison.Time"), plugin.getWitchConfig().getInt("Witch.Poison.Power")));
			}
		}
	}

	@EventHandler
	public void WitchSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Slow.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getWitchConfig().getInt("Witch.Slow.Time"), plugin.getWitchConfig().getInt("Witch.Slow.Power")));
			}
		}
	}

	@EventHandler
	public void WitchMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.MiningFatigue.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getWitchConfig().getInt("Witch.MiningFatigue.Time"), plugin.getWitchConfig().getInt("Witch.MiningFatigue.Power")));
			}
		}
	}

	@EventHandler
	public void WitchSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Speed.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getWitchConfig().getInt("Witch.Speed.Time"), plugin.getWitchConfig().getInt("Witch.Speed.Power")));
			}
		}
	}
	@EventHandler
	public void WitchWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.WaterBreathing.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getWitchConfig().getInt("Witch.WaterBreathing.Time"), plugin.getWitchConfig().getInt("Witch.WaterBreathing.Power")));
			}
		}
	}
	@EventHandler
	public void WitchWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Weakness.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getWitchConfig().getInt("Witch.Weakness.Time"), plugin.getWitchConfig().getInt("Witch.Weakness.Power")));
			}
		}
	}

	@EventHandler
	public void WitchWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getWitchConfig().getInt("Witch.Wither.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof ThrownPotion) {
			ThrownPotion t = (ThrownPotion) event.getDamager();
			LivingEntity shooter = t.getShooter();
			if (plugin.getWitchConfig().getBoolean("Witch.Wither.Enabled", true) && shooter instanceof Witch && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getWitchConfig().getInt("Witch.Wither.Time"), plugin.getWitchConfig().getInt("Witch.Wither.Power")));
			}
		}
	}
	
	@EventHandler
	public void WitchSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.WITCH && plugin.getWitchConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}

}


