package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Blaze;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getConfig().getBoolean("Blaze.Blindness.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getConfig().getInt("Blaze.Blindness.Time"), plugin.getConfig().getInt("Blaze.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void BlazeNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Nausea.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getConfig().getInt("Blaze.Nausea.Time"), plugin.getConfig().getInt("Blaze.Nausea.Power")));
		}
	}
	@EventHandler
	public void BlazeResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Resistance.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getConfig().getInt("Blaze.Resistance.Time"), plugin.getConfig().getInt("Blaze.Resistance.Power")));
		}
	}
	@EventHandler
	public void BlazeFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.FastDigging.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getConfig().getInt("Blaze.FastDigging.Time"), plugin.getConfig().getInt("Blaze.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void BlazeFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.FireResistance.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getConfig().getInt("Blaze.FireResistance.Time"), plugin.getConfig().getInt("Blaze.FireResistance.Power")));
		}
	}
	@EventHandler
	public void BlazeHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Harm.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getConfig().getInt("Blaze.Harm.Time"), plugin.getConfig().getInt("Blaze.Harm.Power")));
		}
	}
	@EventHandler
	public void BlazeHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Heal.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getConfig().getInt("Blaze.Heal.Time"), plugin.getConfig().getInt("Blaze.Heal.Power")));
		}
	}
	@EventHandler
	public void BlazeRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Regeneration.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getConfig().getInt("Blaze.Regeneration.Time"), plugin.getConfig().getInt("Blaze.Regeneration.Power")));
		}
	}
	@EventHandler
	public void BlazeStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Strength.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getConfig().getInt("Blaze.Strength.Time"), plugin.getConfig().getInt("Blaze.Strength.Power")));
		}
	}
	@EventHandler
	public void BlazeJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Jump.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getConfig().getInt("Blaze.Jump.Time"), plugin.getConfig().getInt("Blaze.Jump.Power")));
		}
	}
	@EventHandler
	public void BlazePoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Poison.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getConfig().getInt("Blaze.Poison.Time"), plugin.getConfig().getInt("Blaze.Poison.Power")));
		}
	}
	@EventHandler
	public void BlazeSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Slow.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getConfig().getInt("Blaze.Slow.Time"), plugin.getConfig().getInt("Blaze.Slow.Power")));
		}
	}
	@EventHandler
	public void BlazeMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.MiningFatigue.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getConfig().getInt("Blaze.MiningFatigue.Time"), plugin.getConfig().getInt("Blaze.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void BlazeSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Speed.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getConfig().getInt("Blaze.Speed.Time"), plugin.getConfig().getInt("Blaze.Speed.Power")));
		}
	}
	@EventHandler
	public void BlazeWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.WaterBreathing.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getConfig().getInt("Blaze.WaterBreathing.Time"), plugin.getConfig().getInt("Blaze.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void BlazeWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getConfig().getInt("Blaze.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getConfig().getBoolean("Blaze.Weakness.Enabled", true) && damager instanceof Blaze && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getConfig().getInt("Blaze.Weakness.Time"), plugin.getConfig().getInt("Blaze.Weakness.Power")));
		}
	}
}