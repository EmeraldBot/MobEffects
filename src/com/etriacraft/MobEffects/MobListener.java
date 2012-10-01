package com.etriacraft.MobEffects;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MobListener implements Listener {
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		Entity e = event.getEntity();
		Entity damager = event.getDamager();
		
		if (e instanceof Player && damager instanceof Zombie) {
			Player player = (Player) e;
			
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
					500, 1));
		}
			else if (e instanceof Player && damager instanceof Enderman) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,
						500, 1));
			}
			else if (e instanceof Player && damager instanceof Spider) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 500, 1));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 500, 1));
			}

			else if (e instanceof Player && damager instanceof Creeper) {
				Player player = (Player) e;
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 250, 1));
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 1));
			}
		
		} 
		
	}