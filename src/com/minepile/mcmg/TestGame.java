package com.minepile.mcmg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class TestGame extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.broadcastMessage(ChatColor.GREEN + "-- ENABLING TESTGAME! --");
		new TestMiniGame();
	}
	
	@Override
	public void onDisable() {
		Bukkit.broadcastMessage(ChatColor.RED + "--> DISABLING TESTGAME!!!! <--");
	}
}
