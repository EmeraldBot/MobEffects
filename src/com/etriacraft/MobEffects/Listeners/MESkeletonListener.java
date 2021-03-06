package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESkeletonListener implements Listener {

public static MobEffects plugin;
	
	public MESkeletonListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SkeletonBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Blindness.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getSkeletonConfig().getInt("Skeleton.Blindness.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Blindness.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Fireball) {
			Fireball f = (Fireball) event.getDamager();
			LivingEntity shooter = f.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Hunger.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getSkeletonConfig().getInt("Skeleton.Hunger.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Hunger.Power")));
			}
		}
	}
	@EventHandler
	public void SkeletonConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Nausea.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getSkeletonConfig().getInt("Skeleton.Nausea.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Nausea.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Invisibility.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getSkeletonConfig().getInt("Skeleton.Invisibility.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Invisibility.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Resistance.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getSkeletonConfig().getInt("Skeleton.Resistance.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Resitance.Power")));
			}
		}
	}
	@EventHandler
	public void SkeletonFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.FastDigging.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getSkeletonConfig().getInt("Skeleton.FastDigging.Time"), plugin.getSkeletonConfig().getInt("Skeleton.FastDigging.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.FireResistance.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getSkeletonConfig().getInt("Skeleton.FireResistance.Time"), plugin.getSkeletonConfig().getInt("Skeleton.FireResistance.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Harm.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getSkeletonConfig().getInt("Skeleton.Harm.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Harm.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Heal.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getSkeletonConfig().getInt("Skeleton.Heal.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Heal.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.NightVision.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getSkeletonConfig().getInt("Skeleton.NightVision.Time"), plugin.getSkeletonConfig().getInt("Skeleton.NightVision.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Regeneration.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getSkeletonConfig().getInt("Skeleton.Regeneration.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Regeneration.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Strength.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getSkeletonConfig().getInt("Skeleton.Strength.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Strength.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Jump.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getSkeletonConfig().getInt("Skeleton.Jump.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Jump.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Poison.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getSkeletonConfig().getInt("Skeleton.Poison.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Poison.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Slow.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getSkeletonConfig().getInt("Skeleton.Slow.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Slow.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.MiningFatigue.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getSkeletonConfig().getInt("Skeleton.MiningFatigue.Time"), plugin.getSkeletonConfig().getInt("Skeleton.MiningFatigue.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Speed.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getSkeletonConfig().getInt("Skeleton.Speed.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Speed.Power")));
			}
		}
	}
	@EventHandler
	public void SkeletonWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.WaterBreathing.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getSkeletonConfig().getInt("Skeleton.WaterBreathing.Time"), plugin.getSkeletonConfig().getInt("Skeleton.WaterBreathing.Power")));
			}
		}
	}
	@EventHandler
	public void SkeletonWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Weakness.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getSkeletonConfig().getInt("Skeleton.Weakness.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Weakness.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getZombieConfig().getDouble("Skeleton.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Wither.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getSkeletonConfig().getInt("Skeleton.Wither.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Wither.Power")));
			}
		}
	}
	
	@EventHandler
	public void SkeletonSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.SKELETON && plugin.getSkeletonConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}

}
