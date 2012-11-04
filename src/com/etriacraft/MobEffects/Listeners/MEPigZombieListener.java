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
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getPigZombieConfig().getBoolean("PigZombie.Blindness.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getPigZombieConfig().getInt("PigZombie.Blindness.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Nausea.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getPigZombieConfig().getInt("PigZombie.Nausea.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Nausea.Power")));
		}
	}
	@EventHandler
	public void PigZombieResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Resistance.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getPigZombieConfig().getInt("PigZombie.Resistance.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Resistance.Power")));
		}
	}
	@EventHandler
	public void PigZombieFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.FastDigging.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getPigZombieConfig().getInt("PigZombie.FastDigging.Time"), plugin.getPigZombieConfig().getInt("PigZombie.FastDigging.Power")));
		}
	}
	@EventHandler
	public void PigZombieInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getPigZombieConfig().getBoolean("PigZombie.Invisibility.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getPigZombieConfig().getInt("PigZombie.Invisibility.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getPigZombieConfig().getBoolean("PigZombie.NightVision.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getPigZombieConfig().getInt("PigZombie.NightVision.Time"), plugin.getPigZombieConfig().getInt("PigZombie.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getPigZombieConfig().getBoolean("PigZombie.Wither.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getPigZombieConfig().getInt("PigZombie.Wither.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Wither.Power")));
		}
	}
	
	@EventHandler
	public void PigZombieFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.FireResistance.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getPigZombieConfig().getInt("PigZombie.FireResistance.Time"), plugin.getPigZombieConfig().getInt("PigZombie.FireResistance.Power")));
		}
	}
	@EventHandler
	public void PigZombieHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Harm.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getPigZombieConfig().getInt("PigZombie.Harm.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Harm.Power")));
		}
	}
	@EventHandler
	public void PigZombieHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Heal.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getPigZombieConfig().getInt("PigZombie.Heal.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Heal.Power")));
		}
	}
	@EventHandler
	public void PigZombieRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Regeneration.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getPigZombieConfig().getInt("PigZombie.Regeneration.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Regeneration.Power")));
		}
	}
	@EventHandler
	public void PigZombieStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Strength.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getPigZombieConfig().getInt("PigZombie.Strength.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Strength.Power")));
		}
	}
	@EventHandler
	public void PigZombieJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Jump.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getPigZombieConfig().getInt("PigZombie.Jump.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Jump.Power")));
		}
	}
	@EventHandler
	public void PigZombiePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Poison.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getPigZombieConfig().getInt("PigZombie.Poison.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Poison.Power")));
		}
	}
	@EventHandler
	public void PigZombieSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Slow.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getPigZombieConfig().getInt("PigZombie.Slow.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Slow.Power")));
		}
	}
	@EventHandler
	public void PigZombieMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.MiningFatigue.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getPigZombieConfig().getInt("PigZombie.MiningFatigue.Time"), plugin.getPigZombieConfig().getInt("PigZombie.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void PigZombieSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Speed.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getPigZombieConfig().getInt("PigZombie.Speed.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Speed.Power")));
		}
	}
	@EventHandler
	public void PigZombieWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.WaterBreathing.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getPigZombieConfig().getInt("PigZombie.WaterBreathing.Time"), plugin.getPigZombieConfig().getInt("PigZombie.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void PigZombieWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getPigZombieConfig().getInt("PigZombie.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getPigZombieConfig().getBoolean("PigZombie.Weakness.Enabled", true) && damager instanceof PigZombie && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getPigZombieConfig().getInt("PigZombie.Weakness.Time"), plugin.getPigZombieConfig().getInt("PigZombie.Weakness.Power")));
		}
	}
}