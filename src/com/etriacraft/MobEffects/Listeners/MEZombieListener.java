package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Zombie;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEZombieListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEZombieListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void ZombieBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getZombieConfig().getBoolean("Zombie.Blindness.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getZombieConfig().getInt("Zombie.Blindness.Time"), plugin.getZombieConfig().getInt("Zombie.Blindness.Power")));
		}
	}
	@EventHandler
	public void ZombieHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getZombieConfig().getBoolean("Zombie.Hunger.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getZombieConfig().getInt("Zombie.Hunger.Time"), plugin.getZombieConfig().getInt("Zombie.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void ZombieNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Nausea.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getZombieConfig().getInt("Zombie.Nausea.Time"), plugin.getZombieConfig().getInt("Zombie.Nausea.Power")));
		}
	}
	@EventHandler
	public void ZombieResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Resistance.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getZombieConfig().getInt("Zombie.Resistance.Time"), plugin.getZombieConfig().getInt("Zombie.Resistance.Power")));
		}
	}
	@EventHandler
	public void ZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.FastDigging.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getZombieConfig().getInt("Zombie.FastDigging.Time"), plugin.getZombieConfig().getInt("Zombie.FastDigging.Power")));
		}
	}
	@EventHandler
	public void ZombieInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getZombieConfig().getBoolean("Zombie.Invisibility.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getZombieConfig().getInt("Zombie.Invisibility.Time"), plugin.getZombieConfig().getInt("Zombie.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void ZombieNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getZombieConfig().getBoolean("Zombie.NightVision.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getZombieConfig().getInt("Zombie.NightVision.Time"), plugin.getZombieConfig().getInt("Zombie.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void ZombieWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getZombieConfig().getBoolean("Zombie.Wither.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getZombieConfig().getInt("Zombie.Wither.Time"), plugin.getZombieConfig().getInt("Zombie.Wither.Power")));
		}
	}
	
	@EventHandler
	public void ZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.FireResistance.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getZombieConfig().getInt("Zombie.FireResistance.Time"), plugin.getZombieConfig().getInt("Zombie.FireResistance.Power")));
		}
	}
	@EventHandler
	public void ZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Harm.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getZombieConfig().getInt("Zombie.Harm.Time"), plugin.getZombieConfig().getInt("Zombie.Harm.Power")));
		}
	}
	@EventHandler
	public void ZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Heal.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getZombieConfig().getInt("Zombie.Heal.Time"), plugin.getZombieConfig().getInt("Zombie.Heal.Power")));
		}
	}
	@EventHandler
	public void ZombieRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Regeneration.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getZombieConfig().getInt("Zombie.Regeneration.Time"), plugin.getZombieConfig().getInt("Zombie.Regeneration.Power")));
		}
	}
	@EventHandler
	public void ZombieStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Strength.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getZombieConfig().getInt("Zombie.Strength.Time"), plugin.getZombieConfig().getInt("Zombie.Strength.Power")));
		}
	}
	@EventHandler
	public void ZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Jump.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getZombieConfig().getInt("Zombie.Jump.Time"), plugin.getZombieConfig().getInt("Zombie.Jump.Power")));
		}
	}
	@EventHandler
	public void ZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Poison.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getZombieConfig().getInt("Zombie.Poison.Time"), plugin.getZombieConfig().getInt("Zombie.Poison.Power")));
		}
	}
	@EventHandler
	public void ZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Slow.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getZombieConfig().getInt("Zombie.Slow.Time"), plugin.getZombieConfig().getInt("Zombie.Slow.Power")));
		}
	}
	@EventHandler
	public void ZombieMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.MiningFatigue.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getZombieConfig().getInt("Zombie.MiningFatigue.Time"), plugin.getZombieConfig().getInt("Zombie.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void ZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Speed.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getZombieConfig().getInt("Zombie.Speed.Time"), plugin.getZombieConfig().getInt("Zombie.Speed.Power")));
		}
	}
	@EventHandler
	public void ZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.WaterBreathing.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getZombieConfig().getInt("Zombie.WaterBreathing.Time"), plugin.getZombieConfig().getInt("Zombie.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void ZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getZombieConfig().getInt("Zombie.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getZombieConfig().getBoolean("Zombie.Weakness.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getZombieConfig().getInt("Zombie.Weakness.Time"), plugin.getZombieConfig().getInt("Zombie.Weakness.Power")));
		}
	}
}