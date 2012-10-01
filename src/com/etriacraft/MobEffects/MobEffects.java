package com.etriacraft.MobEffects;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class MobEffects extends JavaPlugin {
	
	public static Config config = new Config();
	
	public void onEnable() {
		config.load(new File(getDataFolder(), "config.yml"));
		this.getServer().getPluginManager().registerEvents(new MobListener(), this);
	}
	
	public void onDisable() {
	 // Stuff will be here eventually
	}

}
