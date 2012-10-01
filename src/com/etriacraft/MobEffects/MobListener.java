package com.etriacraft.MobEffects;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MobListener implements Listener {
	
	@EventHandler
	public void EnderEvent(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		
		if (Config.EndermanEnabled != false && damager instanceof Enderman && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Config.EndermanBlindTime, Config.EndermanBlindPower));
		}
	}
	@EventHandler
	public void SpiderEvent(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		
		if (Config.SpiderEnabled != false && damager instanceof Spider && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Config.SpiderWeakTime, Config.SpiderWeakPower));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Config.SpiderSlowTime, Config.SpiderSlowPower));
		}
	}
	
	@EventHandler
	public void CreeperEvent(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		
		if(Config.CreeperEnabled != false && damager instanceof Creeper && e instanceof Player) {
			Player player = (Player) e;
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Config.CreeperConfusionTime, Config.CreeperConfusionPower));
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Config.CreeperPoisonPower, Config.CreeperPoisonTime));
		}
	}
}