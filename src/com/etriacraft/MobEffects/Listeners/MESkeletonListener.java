package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Blindness.DodgeChance") / 100) {
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
	public void SkeletonConfusion(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Nausea.DodgeChance") / 100) {
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
	public void SkeletonResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Resistance.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.FastDigging.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.FireResistance.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Harm.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Heal.DodgeChance") / 100) {
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
	public void SkeletonRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Regeneration.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Strength.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Jump.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Poison.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Slow.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.MiningFatigue.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Speed.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.WaterBreathing.DodgeChance") / 100) {
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Weakness.DodgeChance") / 100) {
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

}
