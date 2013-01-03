package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MECreeperListener implements Listener {
	
	public static MobEffects plugin;
	
	public MECreeperListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void CreeperBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getCreeperConfig().getBoolean("Creeper.Blindness.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getCreeperConfig().getInt("Creeper.Blindness.Time"), plugin.getCreeperConfig().getInt("Creeper.Blindness.Power")));
		}
	}
	@EventHandler
	public void CreeperHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getCreeperConfig().getBoolean("Creeper.Hunger.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getCreeperConfig().getInt("Creeper.Hunger.Time"), plugin.getCreeperConfig().getInt("Creeper.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void CreeperNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Nausea.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getCreeperConfig().getInt("Creeper.Nausea.Time"), plugin.getCreeperConfig().getInt("Creeper.Nausea.Power")));
		}
	}
	@EventHandler
	public void CreeperResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Resistance.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getCreeperConfig().getInt("Creeper.Resistance.Time"), plugin.getCreeperConfig().getInt("Creeper.Resistance.Power")));
		}
	}
	@EventHandler
	public void CreeperFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.FastDigging.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getCreeperConfig().getInt("Creeper.FastDigging.Time"), plugin.getCreeperConfig().getInt("Creeper.FastDigging.Power")));
		}
	}
	@EventHandler
	public void CreeperInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCreeperConfig().getBoolean("Creeper.Invisibility.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getCreeperConfig().getInt("Creeper.Invisibility.Time"), plugin.getCreeperConfig().getInt("Creeper.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void CreeperNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCreeperConfig().getBoolean("Creeper.NightVision.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getCreeperConfig().getInt("Creeper.NightVision.Time"), plugin.getCreeperConfig().getInt("Creeper.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void CreeperWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCreeperConfig().getBoolean("Creeper.Wither.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getCreeperConfig().getInt("Creeper.Wither.Time"), plugin.getCreeperConfig().getInt("Creeper.Wither.Power")));
		}
	}
	
	@EventHandler
	public void CreeperFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getCreeperConfig().getBoolean("Creeper.FireResistance.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getCreeperConfig().getInt("Creeper.FireResistance.Time"), plugin.getCreeperConfig().getInt("Creeper.FireResistance.Power")));
		}
	}
	@EventHandler
	public void CreeperHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Harm.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getCreeperConfig().getInt("Creeper.Harm.Time"), plugin.getCreeperConfig().getInt("Creeper.Harm.Power")));
		}
	}
	@EventHandler
	public void CreeperHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Heal.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getCreeperConfig().getInt("Creeper.Heal.Time"), plugin.getCreeperConfig().getInt("Creeper.Heal.Power")));
		}
	}
	@EventHandler
	public void CreeperRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Regeneration.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getCreeperConfig().getInt("Creeper.Regeneration.Time"), plugin.getCreeperConfig().getInt("Creeper.Regeneration.Power")));
		}
	}
	@EventHandler
	public void CreeperStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Strength.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getCreeperConfig().getInt("Creeper.Strength.Time"), plugin.getCreeperConfig().getInt("Creeper.Strength.Power")));
		}
	}
	@EventHandler
	public void CreeperJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Jump.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getCreeperConfig().getInt("Creeper.Jump.Time"), plugin.getCreeperConfig().getInt("Creeper.Jump.Power")));
		}
	}
	@EventHandler
	public void CreeperPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Poison.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getCreeperConfig().getInt("Creeper.Poison.Time"), plugin.getCreeperConfig().getInt("Creeper.Poison.Power")));
		}
	}
	@EventHandler
	public void CreeperSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Slow.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getCreeperConfig().getInt("Creeper.Slow.Time"), plugin.getCreeperConfig().getInt("Creeper.Slow.Power")));
		}
	}
	@EventHandler
	public void CreeperMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.MiningFatigue.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getCreeperConfig().getInt("Creeper.MiningFatigue.Time"), plugin.getCreeperConfig().getInt("Creeper.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void CreeperSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Speed.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getCreeperConfig().getInt("Creeper.Speed.Time"), plugin.getCreeperConfig().getInt("Creeper.Speed.Power")));
		}
	}
	@EventHandler
	public void CreeperWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.WaterBreathing.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getCreeperConfig().getInt("Creeper.WaterBreathing.Time"), plugin.getCreeperConfig().getInt("Creeper.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void CreeperWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCreeperConfig().getDouble("Creeper.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCreeperConfig().getBoolean("Creeper.Weakness.Enabled", true) && damager instanceof Creeper && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getCreeperConfig().getInt("Creeper.Weakness.Time"), plugin.getCreeperConfig().getInt("Creeper.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void CreeperSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.CREEPER && plugin.getCreeperConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}