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

	File configFile;
	FileConfiguration config;
	
	FileConfiguration zombieConfig;
	File zombieConfigFile;
	FileConfiguration WitchConfig;
	File WitchConfigFile;
	FileConfiguration WitherConfig;
	File WitherConfigFile;
	FileConfiguration wolfConfig;
	File wolfConfigFile;
	FileConfiguration SpiderConfig;
	File SpiderConfigFile;
	FileConfiguration snowgolemConfig;
	File snowgolemConfigFile;
	FileConfiguration SlimeConfig;
	File SlimeConfigFile;
	FileConfiguration SilverfishConfig;
	File SkeletonConfigFile;
	FileConfiguration SkeletonConfig;
	File SilverfishConfigFile;
	FileConfiguration PlayerConfig;
	File PlayerConfigFile;
	FileConfiguration PigZombieConfig;
	File PigZombieConfigFile;
	FileConfiguration MagmaCubeConfig;
	File MagmaCubeConfigFile;
	File IronGolemConfigFile;
	FileConfiguration IronGolemConfig;
	File GiantConfigFile;
	FileConfiguration GiantConfig;
	File GhastConfigFile;
	FileConfiguration GhastConfig;
	File EndermanConfigFile;
	FileConfiguration EndermanConfig;
	File EnderDragonConfigFile;
	FileConfiguration EnderDragonConfig;
	File CreeperConfigFile;
	FileConfiguration CreeperConfig;
	File CaveSpiderConfigFile;
	FileConfiguration CaveSpiderConfig;
	File BlazeConfigFile;
	FileConfiguration BlazeConfig;
	
	MobEffectsCommand mec;
	
	// Listeners
	private final MEBlazeListener blazeListener = new MEBlazeListener(this);
	private final MECaveSpiderListener cavespiderListener = new MECaveSpiderListener(this);
	private final MECreeperListener creeperListener = new MECreeperListener(this);
	private final MEEnderDragonListener enderdragonListener = new MEEnderDragonListener(this);
	private final MEEndermanListener endermanListener = new MEEndermanListener(this);
	private final MEGiantListener giantListener = new MEGiantListener(this);
	private final MEIronGolemListener irongolemListener = new MEIronGolemListener(this);
	private final MEMagmaCubeListener magmacubeListener = new MEMagmaCubeListener(this);
	private final MEPigZombieListener pigzombieListener = new MEPigZombieListener(this);
	private final MEWitchListener witchListener = new MEWitchListener(this);
	private final MEGhastListener ghastListener = new MEGhastListener(this);
	private final MEPlayerListener playerListener = new MEPlayerListener(this);
	private final MESilverfishListener silverfishListener = new MESilverfishListener(this);
	private final MESkeletonListener skeletonListener = new MESkeletonListener(this);
	private final MESlimeListener slimeListener = new MESlimeListener(this);
	private final MESnowGolemListener snowmanListener = new MESnowGolemListener(this);
	private final MESpiderListener spiderListener = new MESpiderListener(this);
	private final MEWitherListener witherListener = new MEWitherListener(this);
	private final MEWolfListener wolfListener = new MEWolfListener(this);
	private final MEZombieListener zombieListener = new MEZombieListener(this);
	
	@Override
	public void onEnable() {
		// Initialize Config
		configFile = new File(getDataFolder(), "config.yml");
		zombieConfigFile = new File(getDataFolder(), "zombie.yml");
		wolfConfigFile = new File(getDataFolder(), "wolf.yml");
		SpiderConfigFile = new File(getDataFolder(), "spider.yml");
		snowgolemConfigFile = new File(getDataFolder(), "snowgolem.yml");
		SlimeConfigFile = new File(getDataFolder(), "slime.yml");
		WitchConfigFile = new File(getDataFolder(), "witch.yml");
		SilverfishConfigFile = new File(getDataFolder(), "silverfish.yml");
		PlayerConfigFile = new File(getDataFolder(), "player.yml");
		PigZombieConfigFile = new File(getDataFolder(), "pigzombie.yml");
		SkeletonConfigFile = new File(getDataFolder(), "skeleton.yml");
		GhastConfigFile = new File(getDataFolder(), "ghast.yml");
		MagmaCubeConfigFile = new File(getDataFolder(), "magmacube.yml");
		IronGolemConfigFile = new File(getDataFolder(), "irongolem.yml");
		GiantConfigFile = new File(getDataFolder(), "giant.yml");
		EndermanConfigFile = new File(getDataFolder(), "enderman.yml");
		EnderDragonConfigFile = new File(getDataFolder(), "enderdragon.yml");
		CreeperConfigFile = new File(getDataFolder(), "creeper.yml");
		CaveSpiderConfigFile = new File(getDataFolder(), "cavespider.yml");
		BlazeConfigFile = new File(getDataFolder(), "blaze.yml");
		WitherConfigFile = new File(getDataFolder(), "wither.yml");

		// Use firstRun() method
		try {
			firstRun();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Declare FileCOnfigurations, load COnfigs
		config = new YamlConfiguration();
		zombieConfig = new YamlConfiguration();
		wolfConfig = new YamlConfiguration();
		WitchConfig = new YamlConfiguration();
		SpiderConfig = new YamlConfiguration();
		snowgolemConfig = new YamlConfiguration();
		SlimeConfig = new YamlConfiguration();
		SilverfishConfig = new YamlConfiguration();
		PlayerConfig = new YamlConfiguration();
		PigZombieConfig = new YamlConfiguration();
		MagmaCubeConfig = new YamlConfiguration();
		IronGolemConfig = new YamlConfiguration();
		GiantConfig = new YamlConfiguration();
		SkeletonConfig = new YamlConfiguration();
		EndermanConfig = new YamlConfiguration();
		EnderDragonConfig = new YamlConfiguration();
		WitherConfig = new YamlConfiguration();
		CreeperConfig = new YamlConfiguration();
		CaveSpiderConfig = new YamlConfiguration();
		GhastConfig = new YamlConfiguration();
		BlazeConfig = new YamlConfiguration();
		loadYamls();
		ConfigReload();
		
		// Logger
		this.log = this.getLogger();
		
		// Events
		PluginManager pm  = getServer().getPluginManager();
		
		pm.registerEvents(blazeListener, this);
		pm.registerEvents(cavespiderListener, this);
		pm.registerEvents(creeperListener, this);
		pm.registerEvents(enderdragonListener, this);
		pm.registerEvents(witchListener, this);
		pm.registerEvents(endermanListener, this);
		pm.registerEvents(giantListener, this);
		pm.registerEvents(irongolemListener, this);
		pm.registerEvents(magmacubeListener, this);
		pm.registerEvents(pigzombieListener, this);
		pm.registerEvents(playerListener, this);
		pm.registerEvents(silverfishListener, this);
		pm.registerEvents(skeletonListener, this);
		pm.registerEvents(slimeListener, this);
		pm.registerEvents(snowmanListener, this);
		pm.registerEvents(spiderListener, this);
		pm.registerEvents(zombieListener, this);
		pm.registerEvents(ghastListener, this);
		pm.registerEvents(wolfListener, this);
		pm.registerEvents(witherListener, this);
		
		// Metrics
		try {
			MetricsLite metrics = new MetricsLite(this);
			metrics.start();
		} catch (IOException e) {
			// Failed to submit stats :-(
		}
		
		mec = new MobEffectsCommand(this);
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
		if (!zombieConfigFile.exists()) {
			zombieConfigFile.getParentFile().mkdirs();
			copy(getResource("zombie.yml"), zombieConfigFile);
		}
		if (!wolfConfigFile.exists()) {
			wolfConfigFile.getParentFile().mkdirs();
			copy(getResource("wolf.yml"), wolfConfigFile);
		}
		if (!SpiderConfigFile.exists()) {
			SpiderConfigFile.getParentFile().mkdirs();
			copy(getResource("spider.yml"), SpiderConfigFile);
		}
		if (!snowgolemConfigFile.exists()) {
			snowgolemConfigFile.getParentFile().mkdirs();
			copy(getResource("snowgolem.yml"), snowgolemConfigFile);
		}
		if (!SlimeConfigFile.exists()) {
			SlimeConfigFile.getParentFile().mkdirs();
			copy(getResource("slime.yml"), SlimeConfigFile);
		}
		if (!SilverfishConfigFile.exists()) {
			SilverfishConfigFile.getParentFile().mkdirs();
			copy(getResource("silverfish.yml"), SilverfishConfigFile);
		}
		if (!PlayerConfigFile.exists()) {
			PlayerConfigFile.getParentFile().mkdirs();
			copy(getResource("player.yml"), PlayerConfigFile);
		}
		if (!PigZombieConfigFile.exists()) {
			PigZombieConfigFile.getParentFile().mkdirs();
			copy(getResource("pigzombie.yml"), PigZombieConfigFile);
		}
		if (!MagmaCubeConfigFile.exists()) {
			MagmaCubeConfigFile.getParentFile().mkdirs();
			copy(getResource("magmacube.yml"), MagmaCubeConfigFile);
		}
		if (!IronGolemConfigFile.exists()) {
			IronGolemConfigFile.getParentFile().mkdirs();
			copy(getResource("irongolem.yml"), IronGolemConfigFile);
		}
		if (!GiantConfigFile.exists()) {
			GiantConfigFile.getParentFile().mkdirs();
			copy(getResource("giant.yml"), GiantConfigFile);
		}
		if (!EndermanConfigFile.exists()) {
			EndermanConfigFile.getParentFile().mkdirs();
			copy(getResource("enderman.yml"), EndermanConfigFile);
		}
		if (!EnderDragonConfigFile.exists()) {
			EnderDragonConfigFile.getParentFile().mkdirs();
			copy(getResource("enderdragon.yml"), EnderDragonConfigFile);
		}
		if (!CreeperConfigFile.exists()) {
			CreeperConfigFile.getParentFile().mkdirs();
			copy(getResource("creeper.yml"), CreeperConfigFile);
		}
		if (!CaveSpiderConfigFile.exists()) {
			CaveSpiderConfigFile.getParentFile().mkdirs();
			copy(getResource("cavespider.yml"), CaveSpiderConfigFile);
		}
		if (!BlazeConfigFile.exists()) {
			BlazeConfigFile.getParentFile().mkdirs();
			copy(getResource("blaze.yml"), BlazeConfigFile);
		}
		if (!SkeletonConfigFile.exists()) {
			SkeletonConfigFile.getParentFile().mkdirs();
			copy(getResource("skeleton.yml"), SkeletonConfigFile);
		}
		if (!WitherConfigFile.exists()) {
			WitherConfigFile.getParentFile().mkdirs();
			copy(getResource("wither.yml"), WitherConfigFile);
		}
		if (!GhastConfigFile.exists()) {
			GhastConfigFile.getParentFile().mkdirs();
			copy(getResource("ghast.yml"), GhastConfigFile);
		}
		if (!WitchConfigFile.exists()) {
			WitchConfigFile.getParentFile().mkdirs();
			copy(getResource("witch.yml"), WitchConfigFile);
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
			config.save(zombieConfigFile);
			config.save(WitherConfigFile);
			config.save(wolfConfigFile);
			config.save(SpiderConfigFile);
			config.save(snowgolemConfigFile);
			config.save(SlimeConfigFile);
			config.save(SkeletonConfigFile);
			config.save(WitchConfigFile);
			config.save(SilverfishConfigFile);
			config.save(PlayerConfigFile);
			config.save(PigZombieConfigFile);
			config.save(MagmaCubeConfigFile);
			config.save(IronGolemConfigFile);
			config.save(GiantConfigFile);
			config.save(EndermanConfigFile);
			config.save(EnderDragonConfigFile);
			config.save(CreeperConfigFile);
			config.save(CaveSpiderConfigFile);
			config.save(GhastConfigFile);
			config.save(BlazeConfigFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void loadYamls() {
		try {
			config.load(configFile);
			config.load(zombieConfigFile);
			config.load(wolfConfigFile);
			config.load(SpiderConfigFile);
			config.load(WitherConfigFile);
			config.load(WitchConfigFile);
			config.load(snowgolemConfigFile);
			config.load(SlimeConfigFile);
			config.load(SilverfishConfigFile);
			config.load(PlayerConfigFile);
			config.load(PigZombieConfigFile);
			config.load(SkeletonConfigFile);
			config.load(MagmaCubeConfigFile);
			config.load(IronGolemConfigFile);
			config.load(GiantConfigFile);
			config.load(EndermanConfigFile);
			config.load(EnderDragonConfigFile);
			config.load(CreeperConfigFile);
			config.load(CaveSpiderConfigFile);
			config.load(GhastConfigFile);
			config.load(BlazeConfigFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reloadZombieConfig() {
		if (zombieConfigFile == null) {
			zombieConfigFile = new File(getDataFolder(), "zombie.yml");
		}
		zombieConfig = YamlConfiguration.loadConfiguration(zombieConfigFile);
		
		InputStream defConfigStream = getResource("zombie.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			zombieConfig.setDefaults(defConfig);
		}
		}
		
		public FileConfiguration getwolfConfig() {
			if (wolfConfig == null) {
				reloadwolfConfig();
			}
			return wolfConfig;
		}
	
		public void reloadwolfConfig() {
			if (wolfConfigFile == null) {
				wolfConfigFile = new File(getDataFolder(), "wolf.yml");
			}
			wolfConfig = YamlConfiguration.loadConfiguration(wolfConfigFile);
			
			InputStream defConfigStream = getResource("wolf.yml");
			if (defConfigStream != null) {
				YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
				wolfConfig.setDefaults(defConfig);
			}
			}
			
			public FileConfiguration getWolfConfig() {
				if (wolfConfig == null) {
					reloadwolfConfig();
				}
				return wolfConfig;
			}
			
			public FileConfiguration getZombieConfig() {
				if (zombieConfig == null) {
					reloadZombieConfig();
				}
				return zombieConfig;
			}
		
	public void saveZombieConfig() {
		if (zombieConfig == null || zombieConfigFile == null) {
			return;
		}
		try {
			zombieConfig.save(zombieConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + zombieConfigFile);
		}
	}
	
	public void saveWolfConfig() {
		if (wolfConfig == null || wolfConfigFile == null) {
			return;
		}
		try {
			wolfConfig.save(wolfConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + wolfConfigFile);
		}
	}
	
	public FileConfiguration getSpiderConfig() {
		if (SpiderConfig == null) {
			reloadspiderConfig();
		}
		return SpiderConfig;
	}

	public void reloadspiderConfig() {
		if (SpiderConfigFile == null) {
			SpiderConfigFile = new File(getDataFolder(), "spider.yml");
		}
		SpiderConfig = YamlConfiguration.loadConfiguration(SpiderConfigFile);
		
		InputStream defConfigStream = getResource("spider.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			SpiderConfig.setDefaults(defConfig);
		}
		}
	
	public void savespiderConfig() {
		if (SpiderConfig == null || SpiderConfigFile == null) {
			return;
		}
		try {
			SpiderConfig.save(SpiderConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + SpiderConfigFile);
		}
	}
	
	public FileConfiguration getsnowgolemConfig() {
		if (snowgolemConfig == null) {
			reloadsnowgolemConfig();
		}
		return snowgolemConfig;
	}

	public void reloadsnowgolemConfig() {
		if (snowgolemConfigFile == null) {
			snowgolemConfigFile = new File(getDataFolder(), "snowgolem.yml");
		}
		snowgolemConfig = YamlConfiguration.loadConfiguration(snowgolemConfigFile);
		
		InputStream defConfigStream = getResource("snowgolem.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			snowgolemConfig.setDefaults(defConfig);
		}
		}
	
	public void savesnowgolemConfig() {
		if (snowgolemConfig == null || snowgolemConfigFile == null) {
			return;
		}
		try {
			snowgolemConfig.save(snowgolemConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + snowgolemConfigFile);
		}
	}

	public FileConfiguration getSlimeConfig() {
		if (SlimeConfig == null) {
			reloadSlimeConfig();
		}
		return SlimeConfig;
	}

	public void reloadSlimeConfig() {
		if (SlimeConfigFile == null) {
			SlimeConfigFile = new File(getDataFolder(), "Slime.yml");
		}
		SlimeConfig = YamlConfiguration.loadConfiguration(SlimeConfigFile);
		
		InputStream defConfigStream = getResource("Slime.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			SlimeConfig.setDefaults(defConfig);
		}
		}
	
	public void saveSlimeConfig() {
		if (SlimeConfig == null || SlimeConfigFile == null) {
			return;
		}
		try {
			SlimeConfig.save(SlimeConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + SlimeConfigFile);
		}
	}
	
	public FileConfiguration getSilverfishConfig() {
		if (SilverfishConfig == null) {
			reloadSilverfishConfig();
		}
		return SilverfishConfig;
	}

	public void reloadSilverfishConfig() {
		if (SilverfishConfigFile == null) {
			SilverfishConfigFile = new File(getDataFolder(), "Silverfish.yml");
		}
		SilverfishConfig = YamlConfiguration.loadConfiguration(SilverfishConfigFile);
		
		InputStream defConfigStream = getResource("Silverfish.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			SilverfishConfig.setDefaults(defConfig);
		}
		}
	
	public void saveSilverfishConfig() {
		if (SilverfishConfig == null || SilverfishConfigFile == null) {
			return;
		}
		try {
			SilverfishConfig.save(SilverfishConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + SilverfishConfigFile);
		}
	}
	
	public FileConfiguration getPlayerConfig() {
		if (PlayerConfig == null) {
			reloadPlayerConfig();
		}
		return PlayerConfig;
	}

	public void reloadPlayerConfig() {
		if (PlayerConfigFile == null) {
			PlayerConfigFile = new File(getDataFolder(), "Player.yml");
		}
		PlayerConfig = YamlConfiguration.loadConfiguration(PlayerConfigFile);
		
		InputStream defConfigStream = getResource("Player.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			PlayerConfig.setDefaults(defConfig);
		}
		}
	
	public void savePlayerConfig() {
		if (PlayerConfig == null || PlayerConfigFile == null) {
			return;
		}
		try {
			PlayerConfig.save(PlayerConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + PlayerConfigFile);
		}
	}
	
	public FileConfiguration getPigZombieConfig() {
		if (PigZombieConfig == null) {
			reloadPigZombieConfig();
		}
		return PigZombieConfig;
	}

	public void reloadPigZombieConfig() {
		if (PigZombieConfigFile == null) {
			PigZombieConfigFile = new File(getDataFolder(), "PigZombie.yml");
		}
		PigZombieConfig = YamlConfiguration.loadConfiguration(PigZombieConfigFile);
		
		InputStream defConfigStream = getResource("PigZombie.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			PigZombieConfig.setDefaults(defConfig);
		}
		}
	
	public void savePigZombieConfig() {
		if (PigZombieConfig == null || PigZombieConfigFile == null) {
			return;
		}
		try {
			PigZombieConfig.save(PigZombieConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + PigZombieConfigFile);
		}
	}
	
	public FileConfiguration getMagmaCubeConfig() {
		if (MagmaCubeConfig == null) {
			reloadMagmaCubeConfig();
		}
		return MagmaCubeConfig;
	}

	public void reloadMagmaCubeConfig() {
		if (MagmaCubeConfigFile == null) {
			MagmaCubeConfigFile = new File(getDataFolder(), "MagmaCube.yml");
		}
		MagmaCubeConfig = YamlConfiguration.loadConfiguration(MagmaCubeConfigFile);
		
		InputStream defConfigStream = getResource("MagmaCube.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			MagmaCubeConfig.setDefaults(defConfig);
		}
		}
	
	public void saveMagmaCubeConfig() {
		if (MagmaCubeConfig == null || MagmaCubeConfigFile == null) {
			return;
		}
		try {
			MagmaCubeConfig.save(MagmaCubeConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + MagmaCubeConfigFile);
		}
	}
	
	public FileConfiguration getIronGolemConfig() {
		if (IronGolemConfig == null) {
			reloadIronGolemConfig();
		}
		return IronGolemConfig;
	}

	public void reloadIronGolemConfig() {
		if (IronGolemConfigFile == null) {
			IronGolemConfigFile = new File(getDataFolder(), "IronGolem.yml");
		}
		IronGolemConfig = YamlConfiguration.loadConfiguration(IronGolemConfigFile);
		
		InputStream defConfigStream = getResource("IronGolem.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			IronGolemConfig.setDefaults(defConfig);
		}
		}
	
	public void saveIronGolemConfig() {
		if (IronGolemConfig == null || IronGolemConfigFile == null) {
			return;
		}
		try {
			IronGolemConfig.save(IronGolemConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + IronGolemConfigFile);
		}
	}
	
	public FileConfiguration getGiantConfig() {
		if (GiantConfig == null) {
			reloadGiantConfig();
		}
		return GiantConfig;
	}

	public void reloadGiantConfig() {
		if (GiantConfigFile == null) {
			GiantConfigFile = new File(getDataFolder(), "Giant.yml");
		}
		GiantConfig = YamlConfiguration.loadConfiguration(GiantConfigFile);
		
		InputStream defConfigStream = getResource("Giant.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			GiantConfig.setDefaults(defConfig);
		}
		}
	
	public void saveGiantConfig() {
		if (GiantConfig == null || GiantConfigFile == null) {
			return;
		}
		try {
			GiantConfig.save(GiantConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + GiantConfigFile);
		}
	}
	
	public FileConfiguration getEndermanConfig() {
		if (EndermanConfig == null) {
			reloadEndermanConfig();
		}
		return EndermanConfig;
	}

	public void reloadEndermanConfig() {
		if (EndermanConfigFile == null) {
			EndermanConfigFile = new File(getDataFolder(), "Enderman.yml");
		}
		EndermanConfig = YamlConfiguration.loadConfiguration(EndermanConfigFile);
		
		InputStream defConfigStream = getResource("Enderman.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			EndermanConfig.setDefaults(defConfig);
		}
		}
	
	public void saveEndermanConfig() {
		if (EndermanConfig == null || EndermanConfigFile == null) {
			return;
		}
		try {
			EndermanConfig.save(EndermanConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + EndermanConfigFile);
		}
	}
	
	public FileConfiguration getEnderDragonConfig() {
		if (EnderDragonConfig == null) {
			reloadEnderDragonConfig();
		}
		return EnderDragonConfig;
	}

	public void reloadEnderDragonConfig() {
		if (EnderDragonConfigFile == null) {
			EnderDragonConfigFile = new File(getDataFolder(), "EnderDragon.yml");
		}
		EnderDragonConfig = YamlConfiguration.loadConfiguration(EnderDragonConfigFile);
		
		InputStream defConfigStream = getResource("EnderDragon.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			EnderDragonConfig.setDefaults(defConfig);
		}
		}
	
	public void saveEnderDragonConfig() {
		if (EnderDragonConfig == null || EnderDragonConfigFile == null) {
			return;
		}
		try {
			EnderDragonConfig.save(EnderDragonConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + EnderDragonConfigFile);
		}
	}
	
	public FileConfiguration getCreeperConfig() {
		if (CreeperConfig == null) {
			reloadCreeperConfig();
		}
		return CreeperConfig;
	}

	public void reloadCreeperConfig() {
		if (CreeperConfigFile == null) {
			CreeperConfigFile = new File(getDataFolder(), "Creeper.yml");
		}
		CreeperConfig = YamlConfiguration.loadConfiguration(CreeperConfigFile);
		
		InputStream defConfigStream = getResource("Creeper.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			CreeperConfig.setDefaults(defConfig);
		}
		}
	
	public void saveCreeperConfig() {
		if (CreeperConfig == null || CreeperConfigFile == null) {
			return;
		}
		try {
			CreeperConfig.save(CreeperConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + CreeperConfigFile);
		}
	}
	
	public FileConfiguration getCaveSpiderConfig() {
		if (CaveSpiderConfig == null) {
			reloadCaveSpiderConfig();
		}
		return CaveSpiderConfig;
	}

	public void reloadCaveSpiderConfig() {
		if (CaveSpiderConfigFile == null) {
			CaveSpiderConfigFile = new File(getDataFolder(), "CaveSpider.yml");
		}
		CaveSpiderConfig = YamlConfiguration.loadConfiguration(CaveSpiderConfigFile);
		
		InputStream defConfigStream = getResource("CaveSpider.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			CaveSpiderConfig.setDefaults(defConfig);
		}
		}
	
	public void saveCaveSpiderConfig() {
		if (CaveSpiderConfig == null || CaveSpiderConfigFile == null) {
			return;
		}
		try {
			CaveSpiderConfig.save(CaveSpiderConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + CaveSpiderConfigFile);
		}
	}
	
	public FileConfiguration getBlazeConfig() {
		if (BlazeConfig == null) {
			reloadBlazeConfig();
		}
		return BlazeConfig;
	}

	public void reloadBlazeConfig() {
		if (BlazeConfigFile == null) {
			BlazeConfigFile = new File(getDataFolder(), "Blaze.yml");
		}
		BlazeConfig = YamlConfiguration.loadConfiguration(BlazeConfigFile);
		
		InputStream defConfigStream = getResource("Blaze.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			BlazeConfig.setDefaults(defConfig);
		}
		}
	
	public void saveBlazeConfig() {
		if (BlazeConfig == null || BlazeConfigFile == null) {
			return;
		}
		try {
			BlazeConfig.save(BlazeConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + BlazeConfigFile);
		}
	}
	//
	public FileConfiguration getSkeletonConfig() {
		if (SkeletonConfig == null) {
			reloadSkeletonConfig();
		}
		return SkeletonConfig;
	}

	public void reloadSkeletonConfig() {
		if (SkeletonConfigFile == null) {
			SkeletonConfigFile = new File(getDataFolder(), "Skeleton.yml");
		}
		SkeletonConfig = YamlConfiguration.loadConfiguration(SkeletonConfigFile);
		
		InputStream defConfigStream = getResource("Skeleton.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			SkeletonConfig.setDefaults(defConfig);
		}
		}
	
	public void saveSkeletonConfig() {
		if (SkeletonConfig == null || SkeletonConfigFile == null) {
			return;
		}
		try {
			SkeletonConfig.save(SkeletonConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + SkeletonConfigFile);
		}
	}
	//
	public FileConfiguration getWitherConfig() {
		if (WitherConfig == null) {
			reloadWitherConfig();
		}
		return WitherConfig;
	}

	public void reloadWitherConfig() {
		if (WitherConfigFile == null) {
			WitherConfigFile = new File(getDataFolder(), "Wither.yml");
		}
		WitherConfig = YamlConfiguration.loadConfiguration(WitherConfigFile);
		
		InputStream defConfigStream = getResource("Wither.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			WitherConfig.setDefaults(defConfig);
		}
		}
	
	public void saveWitherConfig() {
		if (WitherConfig == null || WitherConfigFile == null) {
			return;
		}
		try {
			WitherConfig.save(WitherConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + WitherConfigFile);
		}
	}
	//
	public FileConfiguration getGhastConfig() {
		if (GhastConfig == null) {
			reloadGhastConfig();
		}
		return GhastConfig;
	}

	public void reloadGhastConfig() {
		if (GhastConfigFile == null) {
			GhastConfigFile = new File(getDataFolder(), "Ghast.yml");
		}
		GhastConfig = YamlConfiguration.loadConfiguration(GhastConfigFile);
		
		InputStream defConfigStream = getResource("Ghast.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			GhastConfig.setDefaults(defConfig);
		}
		}
	
	public void saveGhastConfig() {
		if (GhastConfig == null || GhastConfigFile == null) {
			return;
		}
		try {
			GhastConfig.save(GhastConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + GhastConfigFile);
		}
	}
	//
	public FileConfiguration getWitchConfig() {
		if (GhastConfig == null) {
			reloadGhastConfig();
		}
		return GhastConfig;
	}

	public void reloadWitchConfig() {
		if (WitchConfigFile == null) {
			WitchConfigFile = new File(getDataFolder(), "Witch.yml");
		}
		WitchConfig = YamlConfiguration.loadConfiguration(WitchConfigFile);
		
		InputStream defConfigStream = getResource("Witch.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			WitchConfig.setDefaults(defConfig);
		}
		}
	
	public void saveWitchConfig() {
		if (WitchConfig == null || WitchConfigFile == null) {
			return;
		}
		try {
			WitchConfig.save(WitchConfigFile);
		} catch (IOException ex) {
			this.log.info("Could not save config to " + WitchConfigFile);
		}
	}
	
	public void ConfigReload() {
		reloadConfig();
		reloadspiderConfig();
		reloadwolfConfig();
		reloadGhastConfig();
		reloadZombieConfig();
		reloadSkeletonConfig();
		reloadSlimeConfig();
		reloadWitchConfig();
		reloadSilverfishConfig();
		reloadPlayerConfig();
		reloadWitherConfig();
		reloadPigZombieConfig();
		reloadMagmaCubeConfig();
		reloadIronGolemConfig();
		reloadGiantConfig();
		reloadEndermanConfig();
		reloadEnderDragonConfig();
		reloadCreeperConfig();
		reloadCaveSpiderConfig();
		reloadBlazeConfig();
	}
}
