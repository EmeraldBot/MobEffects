package com.etriacraft.MobEffects;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;
import com.etriacraft.MobEffects.Listeners.*;

public class MobEffects extends JavaPlugin {
	
	public static Config config = new Config();
	
	public void onEnable() {
		config.load(new File(getDataFolder(), "config.yml"));
		this.getServer().getPluginManager().registerEvents(new MEBlazeListener(), this);
		this.getServer().getPluginManager().registerEvents(new MECaveSpiderListener(), this);
		this.getServer().getPluginManager().registerEvents(new MECreeperListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEEndermanListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEPlayerListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEPigZombieListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESilverfishListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESlimeListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESpiderListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEZombieListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEGiantListener(), this);
		
		try {
			MetricsLite metrics = new MetricsLite(this);
			metrics.start();
		} catch (IOException e) {
			// Failed to submit stats :-(
		}
	}
	
	public void onDisable() {
	 // Stuff will be here eventually
	}

}
