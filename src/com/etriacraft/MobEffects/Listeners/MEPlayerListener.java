package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEPlayerListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEPlayerListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void PlayerBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getPlayerConfig().getBoolean("Player.Blindness.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getPlayerConfig().getInt("Player.Blindness.Time"), plugin.getPlayerConfig().getInt("Player.Blindness.Power")));
		}
	}
	@EventHandler
	public void PlayerHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getPlayerConfig().getBoolean("Player.Hunger.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getPlayerConfig().getInt("Player.Hunger.Time"), plugin.getPlayerConfig().getInt("Player.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void PlayerNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Nausea.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getPlayerConfig().getInt("Player.Nausea.Time"), plugin.getPlayerConfig().getInt("Player.Nausea.Power")));
		}
	}
	@EventHandler
	public void PlayerResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Resistance.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getPlayerConfig().getInt("Player.Resistance.Time"), plugin.getPlayerConfig().getInt("Player.Resistance.Power")));
		}
	}
	@EventHandler
	public void PlayerFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.FastDigging.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getPlayerConfig().getInt("Player.FastDigging.Time"), plugin.getPlayerConfig().getInt("Player.FastDigging.Power")));
		}
	}
	@EventHandler
	public void PlayerInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getPlayerConfig().getBoolean("Player.Invisibility.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getPlayerConfig().getInt("Player.Invisibility.Time"), plugin.getPlayerConfig().getInt("Player.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void PlayerNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getPlayerConfig().getBoolean("Player.NightVision.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getPlayerConfig().getInt("Player.NightVision.Time"), plugin.getPlayerConfig().getInt("Player.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void PlayerWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getPlayerConfig().getBoolean("Player.Wither.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getPlayerConfig().getInt("Player.Wither.Time"), plugin.getPlayerConfig().getInt("Player.Wither.Power")));
		}
	}
	
	@EventHandler
	public void PlayerFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getPlayerConfig().getBoolean("Player.FireResistance.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getPlayerConfig().getInt("Player.FireResistance.Time"), plugin.getPlayerConfig().getInt("Player.FireResistance.Power")));
		}
	}
	@EventHandler
	public void PlayerHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Harm.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getPlayerConfig().getInt("Player.Harm.Time"), plugin.getPlayerConfig().getInt("Player.Harm.Power")));
		}
	}
	@EventHandler
	public void PlayerHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Heal.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getPlayerConfig().getInt("Player.Heal.Time"), plugin.getPlayerConfig().getInt("Player.Heal.Power")));
		}
	}
	@EventHandler
	public void PlayerRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Regeneration.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getPlayerConfig().getInt("Player.Regeneration.Time"), plugin.getPlayerConfig().getInt("Player.Regeneration.Power")));
		}
	}
	@EventHandler
	public void PlayerStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Strength.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getPlayerConfig().getInt("Player.Strength.Time"), plugin.getPlayerConfig().getInt("Player.Strength.Power")));
		}
	}
	@EventHandler
	public void PlayerJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Jump.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getPlayerConfig().getInt("Player.Jump.Time"), plugin.getPlayerConfig().getInt("Player.Jump.Power")));
		}
	}
	@EventHandler
	public void PlayerPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Poison.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getPlayerConfig().getInt("Player.Poison.Time"), plugin.getPlayerConfig().getInt("Player.Poison.Power")));
		}
	}
	@EventHandler
	public void PlayerSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Slow.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getPlayerConfig().getInt("Player.Slow.Time"), plugin.getPlayerConfig().getInt("Player.Slow.Power")));
		}
	}
	@EventHandler
	public void PlayerMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.MiningFatigue.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getPlayerConfig().getInt("Player.MiningFatigue.Time"), plugin.getPlayerConfig().getInt("Player.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void PlayerSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Speed.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getPlayerConfig().getInt("Player.Speed.Time"), plugin.getPlayerConfig().getInt("Player.Speed.Power")));
		}
	}
	@EventHandler
	public void PlayerWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.WaterBreathing.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getPlayerConfig().getInt("Player.WaterBreathing.Time"), plugin.getPlayerConfig().getInt("Player.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void PlayerWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getPlayerConfig().getDouble("Player.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getPlayerConfig().getBoolean("Player.Weakness.Enabled", true) && damager instanceof Player && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getPlayerConfig().getInt("Player.Weakness.Time"), plugin.getPlayerConfig().getInt("Player.Weakness.Power")));
		}
	}
}