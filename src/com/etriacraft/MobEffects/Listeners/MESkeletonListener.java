package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.etriacraft.MobEffects.MobEffects;

public class MESkeletonListener implements Listener {

public static MobEffects plugin;
	
	public MESkeletonListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void SkeletonBlindness(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		String world = e.getWorld().getName();
		double rand = Math.random();
		boolean dodged = false;
		if (rand <= plugin.getSkeletonConfig().getInt("Skeleton.Blindness.DodgeChance") / 100) {
			dodged = true;
		}
		if (damager instanceof Arrow) {
			Arrow a = (Arrow) event.getDamager();
			LivingEntity shooter = a.getShooter();
			if (plugin.getSkeletonConfig().getBoolean("Skeleton.Blindness.Enabled", true) && shooter instanceof Skeleton && e instanceof Player && plugin.getConfig().getStringList("Worlds").contains(world) && !dodged) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, plugin.getSkeletonConfig().getInt("Skeleton.Blindness.Time"), plugin.getSkeletonConfig().getInt("Skeleton.Blindness.Power")));
			}
		}
	}
	
}
