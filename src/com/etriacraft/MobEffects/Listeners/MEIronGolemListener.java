package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.IronGolem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MEIronGolemListener implements Listener {
	
	public static MobEffects plugin;
	
	public MEIronGolemListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void IronGolemBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Blindness.DodgeChance") / 100) {
			dodged = true;
		} if ( plugin.getIronGolemConfig().getBoolean("IronGolem.Blindness.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getIronGolemConfig().getInt("IronGolem.Blindness.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Blindness.Power")));
		}
	}
	
	@EventHandler
	public void IronGolemNausea(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Nausea.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Nausea.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, plugin.getIronGolemConfig().getInt("IronGolem.Nausea.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Nausea.Power")));
		}
	}
	@EventHandler
	public void IronGolemResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Resistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Resistance.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, plugin.getIronGolemConfig().getInt("IronGolem.Resistance.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Resistance.Power")));
		}
	}
	@EventHandler
	public void IronGolemFastDigging(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.FastDigging.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.FastDigging.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, plugin.getIronGolemConfig().getInt("IronGolem.FastDigging.Time"), plugin.getIronGolemConfig().getInt("IronGolem.FastDigging.Power")));
		}
	}
	
	@EventHandler
	public void IronGolemFireResistance(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.FireResistance.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.FireResistance.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, plugin.getIronGolemConfig().getInt("IronGolem.FireResistance.Time"), plugin.getIronGolemConfig().getInt("IronGolem.FireResistance.Power")));
		}
	}
	@EventHandler
	public void IronGolemHarm(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Harm.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Harm.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, plugin.getIronGolemConfig().getInt("IronGolem.Harm.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Harm.Power")));
		}
	}
	@EventHandler
	public void IronGolemHeal(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Heal.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Heal.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, plugin.getIronGolemConfig().getInt("IronGolem.Heal.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Heal.Power")));
		}
	}
	@EventHandler
	public void IronGolemRegeneration(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Regeneration.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Regeneration.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, plugin.getIronGolemConfig().getInt("IronGolem.Regeneration.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Regeneration.Power")));
		}
	}
	@EventHandler
	public void IronGolemStrength(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Strength.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Strength.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, plugin.getIronGolemConfig().getInt("IronGolem.Strength.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Strength.Power")));
		}
	}
	@EventHandler
	public void IronGolemJump(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Jump.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Jump.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, plugin.getIronGolemConfig().getInt("IronGolem.Jump.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Jump.Power")));
		}
	}
	@EventHandler
	public void IronGolemPoison(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Poison.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Poison.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, plugin.getIronGolemConfig().getInt("IronGolem.Poison.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Poison.Power")));
		}
	}
	@EventHandler
	public void IronGolemSlow(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Slow.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Slow.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, plugin.getIronGolemConfig().getInt("IronGolem.Slow.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Slow.Power")));
		}
	}
	@EventHandler
	public void IronGolemMiningFatigue(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.MiningFatigue.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.MiningFatigue.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, plugin.getIronGolemConfig().getInt("IronGolem.MiningFatigue.Time"), plugin.getIronGolemConfig().getInt("IronGolem.MiningFatigue.Power")));
		}
	}
	@EventHandler
	public void IronGolemSpeed(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Speed.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Speed.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, plugin.getIronGolemConfig().getInt("IronGolem.Speed.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Speed.Power")));
		}
	}
	@EventHandler
	public void IronGolemWaterBreathing(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.WaterBreathing.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.WaterBreathing.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, plugin.getIronGolemConfig().getInt("IronGolem.WaterBreathing.Time"), plugin.getIronGolemConfig().getInt("IronGolem.WaterBreathing.Power")));
		}
	}
	@EventHandler
	public void IronGolemWeakness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getIronGolemConfig().getInt("IronGolem.Weakness.DodgeChance") / 100) {
			dodged = true;
		}
		if (plugin.getIronGolemConfig().getBoolean("IronGolem.Weakness.Enabled", true) && damager instanceof IronGolem && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, plugin.getIronGolemConfig().getInt("IronGolem.Weakness.Time"), plugin.getIronGolemConfig().getInt("IronGolem.Weakness.Power")));
		}
	}
}