package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MECaveSpiderListener implements Listener {
	
	public static MobEffects plugin;
	
	public MECaveSpiderListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void CaveSpiderBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Blindness.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getCaveSpiderConfig().getInt("CaveSpider.Blindness.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Blindness.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Hunger.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getCaveSpiderConfig().getInt("CaveSpider.Hunger.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void CaveSpiderNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Nausea.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getCaveSpiderConfig().getInt("CaveSpider.Nausea.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Nausea.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Resistance.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getCaveSpiderConfig().getInt("CaveSpider.Resistance.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Resistance.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.FastDigging.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getCaveSpiderConfig().getInt("CaveSpider.FastDigging.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.FastDigging.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Invisibility.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getCaveSpiderConfig().getInt("CaveSpider.Invisibility.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void CaveSpiderNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCaveSpiderConfig().getBoolean("CaveSpider.NightVision.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getCaveSpiderConfig().getInt("CaveSpider.NightVision.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void CaveSpiderWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Wither.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getCaveSpiderConfig().getInt("CaveSpider.Wither.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Wither.Power")));
		}
	}
	
	@EventHandler
	public void CaveSpiderFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.FireResistance.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getCaveSpiderConfig().getInt("CaveSpider.FireResistance.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.FireResistance.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Harm.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getCaveSpiderConfig().getInt("CaveSpider.Harm.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Harm.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Heal.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getCaveSpiderConfig().getInt("CaveSpider.Heal.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Heal.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Regeneration.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getCaveSpiderConfig().getInt("CaveSpider.Regeneration.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Regeneration.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Strength.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getCaveSpiderConfig().getInt("CaveSpider.Strength.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Strength.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Jump.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getCaveSpiderConfig().getInt("CaveSpider.Jump.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Jump.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Poison.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getCaveSpiderConfig().getInt("CaveSpider.Poison.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Poison.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Slow.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getCaveSpiderConfig().getInt("CaveSpider.Slow.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Slow.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.MiningFatigue.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getCaveSpiderConfig().getInt("CaveSpider.MiningFatigue.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Speed.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getCaveSpiderConfig().getInt("CaveSpider.Speed.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Speed.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.WaterBreathing.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getCaveSpiderConfig().getInt("CaveSpider.WaterBreathing.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void CaveSpiderWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getCaveSpiderConfig().getDouble("CaveSpider.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getCaveSpiderConfig().getBoolean("CaveSpider.Weakness.Enabled", true) && damager instanceof CaveSpider && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getCaveSpiderConfig().getInt("CaveSpider.Weakness.Time"), plugin.getCaveSpiderConfig().getInt("CaveSpider.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void CaveSpiderSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.CAVE_SPIDER && plugin.getCaveSpiderConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}