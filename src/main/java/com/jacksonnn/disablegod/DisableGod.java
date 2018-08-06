package com.jacksonnn.disablegod;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableGod extends JavaPlugin {

    private PluginManager pm = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        pm.registerEvents(new onWorldChange(), this);
        pm.registerEvents(new onCommand(), this);
        Bukkit.getServer().getLogger().info("Jacksonnn God/Fly Test is successfully enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("Jacksonnn God/Fly Test is successfully disabled!");
    }
}
