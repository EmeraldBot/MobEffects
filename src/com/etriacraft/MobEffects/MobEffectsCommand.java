package com.etriacraft.MobEffects;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;

public class MobEffectsCommand { 
	
	MobEffects plugin;
	
	public MobEffectsCommand(MobEffects instance) {
		this.plugin = instance;
		init();
	}
	
	private void init() {
		PluginCommand mobeffects = plugin.getCommand("mobeffects");
		CommandExecutor exe;
		
		exe = new CommandExecutor() {
			@Override
			public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
				if (args.length < 1) return false;
				if (!s.hasPermission("mobeffects.reload")) {
					s.sendMessage("§cYou don't have permission to do that!");
					return true;
				}
				
				if (args[0].equalsIgnoreCase("reload")) {
					ConfigReload();
					s.sendMessage("§aConfig reloaded");
					return true;
				} return false;
			}
		}; mobeffects.setExecutor(exe);
	}
	
	public void ConfigReload() {
		plugin.reloadConfig();
		plugin.reloadZombieConfig();
	}
	

}
