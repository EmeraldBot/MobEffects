package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
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
		if (rand <= plugin.getConfig().getInt("Zombie.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getConfig().getBoolean("Zombie.Blindness.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getConfig().getInt("Zombie.Blindness.Time"), plugin.getConfig().getInt("Zombie.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void ZombieNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Nausea.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getConfig().getInt("Zombie.Nausea.Time"), plugin.getConfig().getInt("Zombie.Nausea.Power")));
		}
	}
	@EventHandler
	public void ZombieResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Resistance.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getConfig().getInt("Zombie.Resistance.Time"), plugin.getConfig().getInt("Zombie.Resistance.Power")));
		}
	}
	@EventHandler
	public void ZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.FastDigging.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getConfig().getInt("Zombie.FastDigging.Time"), plugin.getConfig().getInt("Zombie.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void ZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.FireResistance.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getConfig().getInt("Zombie.FireResistance.Time"), plugin.getConfig().getInt("Zombie.FireResistance.Power")));
		}
	}
	@EventHandler
	public void ZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Harm.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getConfig().getInt("Zombie.Harm.Time"), plugin.getConfig().getInt("Zombie.Harm.Power")));
		}
	}
	@EventHandler
	public void ZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Heal.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getConfig().getInt("Zombie.Heal.Time"), plugin.getConfig().getInt("Zombie.Heal.Power")));
		}
	}
	@EventHandler
	public void ZombieRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Regeneration.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getConfig().getInt("Zombie.Regeneration.Time"), plugin.getConfig().getInt("Zombie.Regeneration.Power")));
		}
	}
	@EventHandler
	public void ZombieStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Strength.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getConfig().getInt("Zombie.Strength.Time"), plugin.getConfig().getInt("Zombie.Strength.Power")));
		}
	}
	@EventHandler
	public void ZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Jump.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getConfig().getInt("Zombie.Jump.Time"), plugin.getConfig().getInt("Zombie.Jump.Power")));
		}
	}
	@EventHandler
	public void ZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Poison.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getConfig().getInt("Zombie.Poison.Time"), plugin.getConfig().getInt("Zombie.Poison.Power")));
		}
	}
	@EventHandler
	public void ZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Slow.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getConfig().getInt("Zombie.Slow.Time"), plugin.getConfig().getInt("Zombie.Slow.Power")));
		}
	}
	@EventHandler
	public void ZombieMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.MiningFatigue.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getConfig().getInt("Zombie.MiningFatigue.Time"), plugin.getConfig().getInt("Zombie.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void ZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Speed.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getConfig().getInt("Zombie.Speed.Time"), plugin.getConfig().getInt("Zombie.Speed.Power")));
		}
	}
	@EventHandler
	public void ZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.WaterBreathing.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getConfig().getInt("Zombie.WaterBreathing.Time"), plugin.getConfig().getInt("Zombie.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void ZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Zombie.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Zombie.Weakness.Enabled", true) && damager instanceof Zombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getConfig().getInt("Zombie.Weakness.Time"), plugin.getConfig().getInt("Zombie.Weakness.Power")));
		}
	}
}