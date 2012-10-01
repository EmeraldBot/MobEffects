package com.etriacraft.MobEffects;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.etriacraft.MobEffects.Listeners.MEPlayerListener;
import com.etriacraft.MobEffects.Listeners.MEZombieListener;

public class MobEffects extends JavaPlugin {
	
	public static Config config = new Config();
	
	public void onEnable() {
		config.load(new File(getDataFolder(), "config.yml"));
		this.getServer().getPluginManager().registerEvents(new MobListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEPlayerListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEZombieListener(), this);
	}
	
	public void onDisable() {
	 // Stuff will be here eventually
	}

}
