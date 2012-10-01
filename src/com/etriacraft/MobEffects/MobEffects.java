package com.etriacraft.MobEffects;

import org.bukkit.plugin.java.JavaPlugin;

public class MobEffects extends JavaPlugin {
	
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new MobListener(), this);
	}
	
	public void onDisable() {
	 // Stuff will be here eventually
	}

}
