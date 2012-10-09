package com.etriacraft.MobEffects.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.etriacraft.MobEffects.MobEffects;
import com.etriacraft.MobEffects.UpdateChecker;

public class MiscListener implements Listener {
	
	public static MobEffects plugin;
	
	public MiscListener(MobEffects instance) {
		plugin = instance;
		}
	
	@EventHandler
	public void playerUpdateCheck(PlayerJoinEvent e) {
		Player p = e.getPlayer();
			if (UpdateChecker.updateNeeded() && p.hasPermission("mobeffects.check") && plugin.getConfig().getBoolean("AutoCheckForUpdates", true)) {
				p.sendMessage("§cYour version of MobEffects differs from the one on Bukkit");
				p.sendMessage("§cPerhaps it is time for an update?... or not");
				
			}
			
		}
	}