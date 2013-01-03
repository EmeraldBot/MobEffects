package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESlimeListener implements Listener {
	
	public static MobEffects plugin;
	
	public MESlimeListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SlimeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getSlimeConfig().getBoolean("Slime.Blindness.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getSlimeConfig().getInt("Slime.Blindness.Time"), plugin.getSlimeConfig().getInt("Slime.Blindness.Power")));
		}
	}
	@EventHandler
	public void SlimeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getSlimeConfig().getBoolean("Slime.Hunger.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getSlimeConfig().getInt("Slime.Hunger.Time"), plugin.getSlimeConfig().getInt("Slime.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void SlimeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Nausea.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getSlimeConfig().getInt("Slime.Nausea.Time"), plugin.getSlimeConfig().getInt("Slime.Nausea.Power")));
		}
	}
	@EventHandler
	public void SlimeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Resistance.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getSlimeConfig().getInt("Slime.Resistance.Time"), plugin.getSlimeConfig().getInt("Slime.Resistance.Power")));
		}
	}
	@EventHandler
	public void SlimeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.FastDigging.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getSlimeConfig().getInt("Slime.FastDigging.Time"), plugin.getSlimeConfig().getInt("Slime.FastDigging.Power")));
		}
	}
	@EventHandler
	public void SlimeInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getSlimeConfig().getBoolean("Slime.Invisibility.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getSlimeConfig().getInt("Slime.Invisibility.Time"), plugin.getSlimeConfig().getInt("Slime.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void SlimeNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getSlimeConfig().getBoolean("Slime.NightVision.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getSlimeConfig().getInt("Slime.NightVision.Time"), plugin.getSlimeConfig().getInt("Slime.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void SlimeWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getSlimeConfig().getBoolean("Slime.Wither.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getSlimeConfig().getInt("Slime.Wither.Time"), plugin.getSlimeConfig().getInt("Slime.Wither.Power")));
		}
	}
	
	@EventHandler
	public void SlimeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getSlimeConfig().getBoolean("Slime.FireResistance.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getSlimeConfig().getInt("Slime.FireResistance.Time"), plugin.getSlimeConfig().getInt("Slime.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SlimeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Harm.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getSlimeConfig().getInt("Slime.Harm.Time"), plugin.getSlimeConfig().getInt("Slime.Harm.Power")));
		}
	}
	@EventHandler
	public void SlimeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Heal.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getSlimeConfig().getInt("Slime.Heal.Time"), plugin.getSlimeConfig().getInt("Slime.Heal.Power")));
		}
	}
	@EventHandler
	public void SlimeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Regeneration.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getSlimeConfig().getInt("Slime.Regeneration.Time"), plugin.getSlimeConfig().getInt("Slime.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SlimeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Strength.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getSlimeConfig().getInt("Slime.Strength.Time"), plugin.getSlimeConfig().getInt("Slime.Strength.Power")));
		}
	}
	@EventHandler
	public void SlimeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Jump.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getSlimeConfig().getInt("Slime.Jump.Time"), plugin.getSlimeConfig().getInt("Slime.Jump.Power")));
		}
	}
	@EventHandler
	public void SlimePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Poison.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getSlimeConfig().getInt("Slime.Poison.Time"), plugin.getSlimeConfig().getInt("Slime.Poison.Power")));
		}
	}
	@EventHandler
	public void SlimeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Slow.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getSlimeConfig().getInt("Slime.Slow.Time"), plugin.getSlimeConfig().getInt("Slime.Slow.Power")));
		}
	}
	@EventHandler
	public void SlimeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.MiningFatigue.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getSlimeConfig().getInt("Slime.MiningFatigue.Time"), plugin.getSlimeConfig().getInt("Slime.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SlimeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Speed.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getSlimeConfig().getInt("Slime.Speed.Time"), plugin.getSlimeConfig().getInt("Slime.Speed.Power")));
		}
	}
	@EventHandler
	public void SlimeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.WaterBreathing.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getSlimeConfig().getInt("Slime.WaterBreathing.Time"), plugin.getSlimeConfig().getInt("Slime.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SlimeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getSlimeConfig().getDouble("Slime.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getSlimeConfig().getBoolean("Slime.Weakness.Enabled", true) && damager instanceof Slime && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getSlimeConfig().getInt("Slime.Weakness.Time"), plugin.getSlimeConfig().getInt("Slime.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void SlimeSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.SLIME && plugin.getSlimeConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}