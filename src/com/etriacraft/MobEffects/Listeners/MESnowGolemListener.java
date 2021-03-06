package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESnowGolemListener implements Listener {
	
	public static MobEffects plugin;
	
	public MESnowGolemListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SnowmanBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getsnowgolemConfig().getBoolean("Snowman.Blindness.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getsnowgolemConfig().getInt("Snowman.Blindness.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Blindness.Power")));
		}
	}
	@EventHandler
	public void SnowmanHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getsnowgolemConfig().getBoolean("Snowman.Hunger.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getsnowgolemConfig().getInt("Snowman.Hunger.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void SnowmanNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Nausea.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getsnowgolemConfig().getInt("Snowman.Nausea.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Nausea.Power")));
		}
	}
	@EventHandler
	public void SnowmanResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Resistance.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getsnowgolemConfig().getInt("Snowman.Resistance.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Resistance.Power")));
		}
	}
	@EventHandler
	public void SnowmanFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.FastDigging.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getsnowgolemConfig().getInt("Snowman.FastDigging.Time"), plugin.getsnowgolemConfig().getInt("Snowman.FastDigging.Power")));
		}
	}
	@EventHandler
	public void SnowmanInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getsnowgolemConfig().getBoolean("Snowman.Invisibility.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getsnowgolemConfig().getInt("Snowman.Invisibility.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void SnowmanNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getsnowgolemConfig().getBoolean("Snowman.NightVision.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getsnowgolemConfig().getInt("Snowman.NightVision.Time"), plugin.getsnowgolemConfig().getInt("Snowman.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void SnowmanWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getsnowgolemConfig().getBoolean("Snowman.Wither.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getsnowgolemConfig().getInt("Snowman.Wither.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Wither.Power")));
		}
	}
	
	@EventHandler
	public void SnowmanFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.FireResistance.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getsnowgolemConfig().getInt("Snowman.FireResistance.Time"), plugin.getsnowgolemConfig().getInt("Snowman.FireResistance.Power")));
		}
	}
	@EventHandler
	public void SnowmanHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Harm.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getsnowgolemConfig().getInt("Snowman.Harm.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Harm.Power")));
		}
	}
	@EventHandler
	public void SnowmanHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Heal.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getsnowgolemConfig().getInt("Snowman.Heal.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Heal.Power")));
		}
	}
	@EventHandler
	public void SnowmanRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Regeneration.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getsnowgolemConfig().getInt("Snowman.Regeneration.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Regeneration.Power")));
		}
	}
	@EventHandler
	public void SnowmanStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Strength.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getsnowgolemConfig().getInt("Snowman.Strength.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Strength.Power")));
		}
	}
	@EventHandler
	public void SnowmanJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Jump.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getsnowgolemConfig().getInt("Snowman.Jump.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Jump.Power")));
		}
	}
	@EventHandler
	public void SnowmanPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Poison.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getsnowgolemConfig().getInt("Snowman.Poison.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Poison.Power")));
		}
	}
	@EventHandler
	public void SnowmanSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Slow.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getsnowgolemConfig().getInt("Snowman.Slow.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Slow.Power")));
		}
	}
	@EventHandler
	public void SnowmanMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.MiningFatigue.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getsnowgolemConfig().getInt("Snowman.MiningFatigue.Time"), plugin.getsnowgolemConfig().getInt("Snowman.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void SnowmanSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Speed.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getsnowgolemConfig().getInt("Snowman.Speed.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Speed.Power")));
		}
	}
	@EventHandler
	public void SnowmanWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.WaterBreathing.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getsnowgolemConfig().getInt("Snowman.WaterBreathing.Time"), plugin.getsnowgolemConfig().getInt("Snowman.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void SnowmanWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getsnowgolemConfig().getDouble("Snowman.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getsnowgolemConfig().getBoolean("Snowman.Weakness.Enabled", true) && damager instanceof Snowman && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getsnowgolemConfig().getInt("Snowman.Weakness.Time"), plugin.getsnowgolemConfig().getInt("Snowman.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void SnowmanSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.SNOWMAN && plugin.getsnowgolemConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}