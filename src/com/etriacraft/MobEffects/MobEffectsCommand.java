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
				if (args.length < 1) {
					s.sendMessage("§eMobEffects Commands");
					s.sendMessage("§3/mobeffects reload:§f - Reloads the config.");
					s.sendMessage("§3/mobeffects version:§f - Checks your version of MobEffects");
					s.sendMessage("§3/mobeffects update:§f - Checks if there is a new version available");
					return true;
				}
				else if (args[0].equalsIgnoreCase("reload") && s.hasPermission("mobeffects.reload")) {
					plugin.ConfigReload();
					s.sendMessage("§aConfig reloaded");
					return true;
				}
				else if (args[0].equalsIgnoreCase("version")) {
					if (s.hasPermission("mobeffects.version")) {
						s.sendMessage("§eThis server is running MobEffects §4v" + plugin.getDescription().getVersion());
						return true;
					}
					else {
						s.sendMessage("§cYou don't have permission to do that!");
					}
				} return true;
			}
		}; mobeffects.setExecutor(exe);
	}


}
