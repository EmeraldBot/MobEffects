package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Giant;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEGiantListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEGiantListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void GiantBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getGiantConfig().getBoolean("Giant.Blindness.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getGiantConfig().getInt("Giant.Blindness.Time"), plugin.getGiantConfig().getInt("Giant.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void GiantNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Nausea.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getGiantConfig().getInt("Giant.Nausea.Time"), plugin.getGiantConfig().getInt("Giant.Nausea.Power")));
		}
	}
	@EventHandler
	public void GiantResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Resistance.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getGiantConfig().getInt("Giant.Resistance.Time"), plugin.getGiantConfig().getInt("Giant.Resistance.Power")));
		}
	}
	@EventHandler
	public void GiantFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.FastDigging.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getGiantConfig().getInt("Giant.FastDigging.Time"), plugin.getGiantConfig().getInt("Giant.FastDigging.Power")));
		}
	}
	@EventHandler
	public void GiantInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getGiantConfig().getBoolean("Giant.Invisibility.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getGiantConfig().getInt("Giant.Invisibility.Time"), plugin.getGiantConfig().getInt("Giant.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void GiantNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getGiantConfig().getBoolean("Giant.NightVision.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getGiantConfig().getInt("Giant.NightVision.Time"), plugin.getGiantConfig().getInt("Giant.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void GiantWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getGiantConfig().getBoolean("Giant.Wither.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getGiantConfig().getInt("Giant.Wither.Time"), plugin.getGiantConfig().getInt("Giant.Wither.Power")));
		}
	}
	
	@EventHandler
	public void GiantFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.FireResistance.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getGiantConfig().getInt("Giant.FireResistance.Time"), plugin.getGiantConfig().getInt("Giant.FireResistance.Power")));
		}
	}
	@EventHandler
	public void GiantHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Harm.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getGiantConfig().getInt("Giant.Harm.Time"), plugin.getGiantConfig().getInt("Giant.Harm.Power")));
		}
	}
	@EventHandler
	public void GiantHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Heal.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getGiantConfig().getInt("Giant.Heal.Time"), plugin.getGiantConfig().getInt("Giant.Heal.Power")));
		}
	}
	@EventHandler
	public void GiantRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Regeneration.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getGiantConfig().getInt("Giant.Regeneration.Time"), plugin.getGiantConfig().getInt("Giant.Regeneration.Power")));
		}
	}
	@EventHandler
	public void GiantStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Strength.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getGiantConfig().getInt("Giant.Strength.Time"), plugin.getGiantConfig().getInt("Giant.Strength.Power")));
		}
	}
	@EventHandler
	public void GiantJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Jump.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getGiantConfig().getInt("Giant.Jump.Time"), plugin.getGiantConfig().getInt("Giant.Jump.Power")));
		}
	}
	@EventHandler
	public void GiantPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Poison.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getGiantConfig().getInt("Giant.Poison.Time"), plugin.getGiantConfig().getInt("Giant.Poison.Power")));
		}
	}
	@EventHandler
	public void GiantSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Slow.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getGiantConfig().getInt("Giant.Slow.Time"), plugin.getGiantConfig().getInt("Giant.Slow.Power")));
		}
	}
	@EventHandler
	public void GiantMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.MiningFatigue.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getGiantConfig().getInt("Giant.MiningFatigue.Time"), plugin.getGiantConfig().getInt("Giant.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void GiantSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Speed.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getGiantConfig().getInt("Giant.Speed.Time"), plugin.getGiantConfig().getInt("Giant.Speed.Power")));
		}
	}
	@EventHandler
	public void GiantWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.WaterBreathing.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getGiantConfig().getInt("Giant.WaterBreathing.Time"), plugin.getGiantConfig().getInt("Giant.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void GiantWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getGiantConfig().getInt("Giant.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getGiantConfig().getBoolean("Giant.Weakness.Enabled", true) && damager instanceof Giant && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getGiantConfig().getInt("Giant.Weakness.Time"), plugin.getGiantConfig().getInt("Giant.Weakness.Power")));
		}
	}
}