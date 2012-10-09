package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEPigZombieListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEPigZombieListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void PigZombieBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getConfig().getBoolean("PigZombie.Blindness.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getConfig().getInt("PigZombie.Blindness.Time"), plugin.getConfig().getInt("PigZombie.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Nausea.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getConfig().getInt("PigZombie.Nausea.Time"), plugin.getConfig().getInt("PigZombie.Nausea.Power")));
		}
	}
	@EventHandler
	public void PigZombieResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Resistance.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getConfig().getInt("PigZombie.Resistance.Time"), plugin.getConfig().getInt("PigZombie.Resistance.Power")));
		}
	}
	@EventHandler
	public void PigZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.FastDigging.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getConfig().getInt("PigZombie.FastDigging.Time"), plugin.getConfig().getInt("PigZombie.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.FireResistance.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getConfig().getInt("PigZombie.FireResistance.Time"), plugin.getConfig().getInt("PigZombie.FireResistance.Power")));
		}
	}
	@EventHandler
	public void PigZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Harm.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getConfig().getInt("PigZombie.Harm.Time"), plugin.getConfig().getInt("PigZombie.Harm.Power")));
		}
	}
	@EventHandler
	public void PigZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Heal.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getConfig().getInt("PigZombie.Heal.Time"), plugin.getConfig().getInt("PigZombie.Heal.Power")));
		}
	}
	@EventHandler
	public void PigZombieRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Regeneration.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getConfig().getInt("PigZombie.Regeneration.Time"), plugin.getConfig().getInt("PigZombie.Regeneration.Power")));
		}
	}
	@EventHandler
	public void PigZombieStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Strength.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getConfig().getInt("PigZombie.Strength.Time"), plugin.getConfig().getInt("PigZombie.Strength.Power")));
		}
	}
	@EventHandler
	public void PigZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Jump.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getConfig().getInt("PigZombie.Jump.Time"), plugin.getConfig().getInt("PigZombie.Jump.Power")));
		}
	}
	@EventHandler
	public void PigZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Poison.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getConfig().getInt("PigZombie.Poison.Time"), plugin.getConfig().getInt("PigZombie.Poison.Power")));
		}
	}
	@EventHandler
	public void PigZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Slow.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getConfig().getInt("PigZombie.Slow.Time"), plugin.getConfig().getInt("PigZombie.Slow.Power")));
		}
	}
	@EventHandler
	public void PigZombieMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.MiningFatigue.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getConfig().getInt("PigZombie.MiningFatigue.Time"), plugin.getConfig().getInt("PigZombie.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void PigZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Speed.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getConfig().getInt("PigZombie.Speed.Time"), plugin.getConfig().getInt("PigZombie.Speed.Power")));
		}
	}
	@EventHandler
	public void PigZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.WaterBreathing.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getConfig().getInt("PigZombie.WaterBreathing.Time"), plugin.getConfig().getInt("PigZombie.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void PigZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("PigZombie.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("PigZombie.Weakness.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getConfig().getInt("PigZombie.Weakness.Time"), plugin.getConfig().getInt("PigZombie.Weakness.Power")));
		}
	}
}