package com.etriacraft.MobEffects.Listeners;

import java.util.Random;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEBlazeListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEBlazeListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void BlazeBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Blindness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if ( plugin.getBlazeConfig().getBoolean("Blaze.Blindness.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getBlazeConfig().getInt("Blaze.Blindness.Time"), plugin.getBlazeConfig().getInt("Blaze.Blindness.Power")));
		}
	}
	@EventHandler
	public void BlazeHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Hunger.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if (plugin.getBlazeConfig().getBoolean("Blaze.Hunger.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getBlazeConfig().getInt("Blaze.Hunger.Time"), plugin.getBlazeConfig().getInt("Blaze.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void BlazeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Nausea.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Nausea.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getBlazeConfig().getInt("Blaze.Nausea.Time"), plugin.getBlazeConfig().getInt("Blaze.Nausea.Power")));
		}
	}
	@EventHandler
	public void BlazeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Resistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Resistance.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getBlazeConfig().getInt("Blaze.Resistance.Time"), plugin.getBlazeConfig().getInt("Blaze.Resistance.Power")));
		}
	}
	@EventHandler
	public void BlazeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.FastDigging.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.FastDigging.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getBlazeConfig().getInt("Blaze.FastDigging.Time"), plugin.getBlazeConfig().getInt("Blaze.FastDigging.Power")));
		}
	}
	@EventHandler
	public void BlazeInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Invisibility.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getBlazeConfig().getBoolean("Blaze.Invisibility.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getBlazeConfig().getInt("Blaze.Invisibility.Time"), plugin.getBlazeConfig().getInt("Blaze.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void BlazeNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.NightVision.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getBlazeConfig().getBoolean("Blaze.NightVision.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getBlazeConfig().getInt("Blaze.NightVision.Time"), plugin.getBlazeConfig().getInt("Blaze.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void BlazeWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Wither.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		} if ( plugin.getBlazeConfig().getBoolean("Blaze.Wither.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getBlazeConfig().getInt("Blaze.Wither.Time"), plugin.getBlazeConfig().getInt("Blaze.Wither.Power")));
		}
	}
	
	@EventHandler
	public void BlazeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.FireResistance.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}dodged = true;
		if (plugin.getBlazeConfig().getBoolean("Blaze.FireResistance.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getBlazeConfig().getInt("Blaze.FireResistance.Time"), plugin.getBlazeConfig().getInt("Blaze.FireResistance.Power")));
		}
	}
	@EventHandler
	public void BlazeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Harm.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Harm.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getBlazeConfig().getInt("Blaze.Harm.Time"), plugin.getBlazeConfig().getInt("Blaze.Harm.Power")));
		}
	}
	@EventHandler
	public void BlazeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Heal.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Heal.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getBlazeConfig().getInt("Blaze.Heal.Time"), plugin.getBlazeConfig().getInt("Blaze.Heal.Power")));
		}
	}
	@EventHandler
	public void BlazeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Regeneration.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Regeneration.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getBlazeConfig().getInt("Blaze.Regeneration.Time"), plugin.getBlazeConfig().getInt("Blaze.Regeneration.Power")));
		}
	}
	@EventHandler
	public void BlazeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Strength.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Strength.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getBlazeConfig().getInt("Blaze.Strength.Time"), plugin.getBlazeConfig().getInt("Blaze.Strength.Power")));
		}
	}
	@EventHandler
	public void BlazeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Jump.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Jump.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getBlazeConfig().getInt("Blaze.Jump.Time"), plugin.getBlazeConfig().getInt("Blaze.Jump.Power")));
		}
	}
	@EventHandler
	public void BlazePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Poison.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Poison.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getBlazeConfig().getInt("Blaze.Poison.Time"), plugin.getBlazeConfig().getInt("Blaze.Poison.Power")));
		}
	}
	@EventHandler
	public void BlazeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Slow.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Slow.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getBlazeConfig().getInt("Blaze.Slow.Time"), plugin.getBlazeConfig().getInt("Blaze.Slow.Power")));
		}
	}
	@EventHandler
	public void BlazeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.MiningFatigue.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.MiningFatigue.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getBlazeConfig().getInt("Blaze.MiningFatigue.Time"), plugin.getBlazeConfig().getInt("Blaze.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void BlazeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Speed.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Speed.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getBlazeConfig().getInt("Blaze.Speed.Time"), plugin.getBlazeConfig().getInt("Blaze.Speed.Power")));
		}
	}
	@EventHandler
	public void BlazeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.WaterBreathing.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.WaterBreathing.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getBlazeConfig().getInt("Blaze.WaterBreathing.Time"), plugin.getBlazeConfig().getInt("Blaze.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void BlazeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		boolean dodged = false;
		Random random = new Random();
		double randomChance = plugin.getBlazeConfig().getDouble("Blaze.Weakness.DodgeChance") / 100;
		final double ChanceOfHappening = random.nextDouble();
		if (ChanceOfHappening >= randomChance) {
			dodged = true;
		}
		if (plugin.getBlazeConfig().getBoolean("Blaze.Weakness.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getBlazeConfig().getInt("Blaze.Weakness.Time"), plugin.getBlazeConfig().getInt("Blaze.Weakness.Power")));
		}
	}
	
	@EventHandler
	public void BlazeSpawnEvent(CreatureSpawnEvent event) {
		Entity e = event.getEntity();
		EntityType type = event.getEntity().getType();
		String world = e.getWorld().getName();
		if (type == EntityType.BLAZE && plugin.getBlazeConfig().getStringList("DisableSpawnInWorlds").contains(world) && plugin.getConfig().getBoolean("ManipulateSpawns", true)) {
			event.setCancelled(true);
		}
	}
}