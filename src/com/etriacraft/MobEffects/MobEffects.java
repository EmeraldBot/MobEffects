package com.etriacraft.MobEffects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import com.etriacraft.MobEffects.Listeners.*;

public class MobEffects extends JavaPlugin {
	
	protected Logger log;
	protected UpdateChecker updateChecker;

	File configFile;
	FileConfiguration config;
	
	//--- Privates ---//
	private final MESpiderListener spiderListener = new MESpiderListener(this);
	private final MEWolfListener wolfListener = new MEWolfListener(this);
	private final MEZombieListener zombieListener = new MEZombieListener(this);
	private final MiscListener miscListener = new MiscListener(this);
	
	@Override
	public void onEnable() {
		// Initialize Config
		configFile = new File(getDataFolder(), "config.yml");
		
		// Use firstRun() method
		try {
			firstRun();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Declare FileCOnfigurations, load COnfigs
		config = new YamlConfiguration();
		loadYamls();
		
		// Logger
		this.log = this.getLogger();
		
		// Events
		PluginManager pm  = getServer().getPluginManager();
		
		pm.registerEvents(spiderListener, this);
		pm.registerEvents(zombieListener, this);
		pm.registerEvents(wolfListener, this);
		//
		pm.registerEvents(miscListener, this);
		this.getServer().getPluginManager().registerEvents(new MEBlazeListener(), this);
		this.getServer().getPluginManager().registerEvents(new MECaveSpiderListener(), this);
		this.getServer().getPluginManager().registerEvents(new MECreeperListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEEnderDragonListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEEndermanListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEIronGolemListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEPlayerListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEPigZombieListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESilverfishListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESlimeListener(), this);
		this.getServer().getPluginManager().registerEvents(new MESnowGolemListener(), this);
		this.getServer().getPluginManager().registerEvents(new MEGiantListener(), this);
		//
		
		// UpdateChecker to Console
		this.updateChecker = new UpdateChecker(this, "http://dev.bukkit.org/server-mods/mobeffects/files.rss");
		if (UpdateChecker.updateNeeded() && this.getConfig().getBoolean("AutoCheckForUpdates", true)) {
			this.log.info("A new version is available: " + this.updateChecker.getVersion());
			this.log.info("Get it from: " + this.updateChecker.getLink());
		}
		// Metrics
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
	// Methods
	private void firstRun() throws Exception {
		if (!configFile.exists()) {
			configFile.getParentFile().mkdirs();
			copy(getResource("config.yml"), configFile);
		}
	}
	
	private void copy(InputStream in, File file) {
		try {
			OutputStream out = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf))>0) {
				out.write(buf,0,len);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveYamls() {
		try {
			config.save(configFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void loadYamls() {
		try {
			config.load(configFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
