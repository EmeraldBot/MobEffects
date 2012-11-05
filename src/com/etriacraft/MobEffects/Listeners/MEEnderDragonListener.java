package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEEnderDragonListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEEnderDragonListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void EnderDragonBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEnderDragonConfig().getBoolean("EnderDragon.Blindness.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getEnderDragonConfig().getInt("EnderDragon.Blindness.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void EnderDragonHunger(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Hunger.DodgeChance") / 100) {
			dodged = true;
		} if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Hunger.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, plugin.getEnderDragonConfig().getInt("EnderDragon.Hunger.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Hunger.Power")));
		}
	}
	
	@EventHandler
	public void EnderDragonNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Nausea.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getEnderDragonConfig().getInt("EnderDragon.Nausea.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Nausea.Power")));
		}
	}
	@EventHandler
	public void EnderDragonResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Resistance.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getEnderDragonConfig().getInt("EnderDragon.Resistance.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Resistance.Power")));
		}
	}
	@EventHandler
	public void EnderDragonFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.FastDigging.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getEnderDragonConfig().getInt("EnderDragon.FastDigging.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.FastDigging.Power")));
		}
	}
	@EventHandler
	public void EnderDragonInvisibility(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Invisibility.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEnderDragonConfig().getBoolean("EnderDragon.Invisibility.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, plugin.getEnderDragonConfig().getInt("EnderDragon.Invisibility.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Invisibility.Power")));
		}
	}
	
	@EventHandler
	public void EnderDragonNightVision(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.NightVision.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEnderDragonConfig().getBoolean("EnderDragon.NightVision.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, plugin.getEnderDragonConfig().getInt("EnderDragon.NightVision.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.NightVision.Power")));
		}
	}
	
	@EventHandler
	public void EnderDragonWither(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Wither.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getEnderDragonConfig().getBoolean("EnderDragon.Wither.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, plugin.getEnderDragonConfig().getInt("EnderDragon.Wither.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Wither.Power")));
		}
	}
	
	@EventHandler
	public void EnderDragonFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.FireResistance.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getEnderDragonConfig().getInt("EnderDragon.FireResistance.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.FireResistance.Power")));
		}
	}
	@EventHandler
	public void EnderDragonHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Harm.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getEnderDragonConfig().getInt("EnderDragon.Harm.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Harm.Power")));
		}
	}
	@EventHandler
	public void EnderDragonHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Heal.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getEnderDragonConfig().getInt("EnderDragon.Heal.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Heal.Power")));
		}
	}
	@EventHandler
	public void EnderDragonRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Regeneration.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getEnderDragonConfig().getInt("EnderDragon.Regeneration.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Regeneration.Power")));
		}
	}
	@EventHandler
	public void EnderDragonStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Strength.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getEnderDragonConfig().getInt("EnderDragon.Strength.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Strength.Power")));
		}
	}
	@EventHandler
	public void EnderDragonJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Jump.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getEnderDragonConfig().getInt("EnderDragon.Jump.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Jump.Power")));
		}
	}
	@EventHandler
	public void EnderDragonPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Poison.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getEnderDragonConfig().getInt("EnderDragon.Poison.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Poison.Power")));
		}
	}
	@EventHandler
	public void EnderDragonSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Slow.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getEnderDragonConfig().getInt("EnderDragon.Slow.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Slow.Power")));
		}
	}
	@EventHandler
	public void EnderDragonMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.MiningFatigue.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getEnderDragonConfig().getInt("EnderDragon.MiningFatigue.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void EnderDragonSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Speed.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getEnderDragonConfig().getInt("EnderDragon.Speed.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Speed.Power")));
		}
	}
	@EventHandler
	public void EnderDragonWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.WaterBreathing.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getEnderDragonConfig().getInt("EnderDragon.WaterBreathing.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void EnderDragonWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getEnderDragonConfig().getInt("EnderDragon.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getEnderDragonConfig().getBoolean("EnderDragon.Weakness.Enabled", true) && damager instanceof EnderDragon && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getEnderDragonConfig().getInt("EnderDragon.Weakness.Time"), plugin.getEnderDragonConfig().getInt("EnderDragon.Weakness.Power")));
		}
	}
}