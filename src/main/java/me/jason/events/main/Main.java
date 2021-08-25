package me.jason.events.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerEvents();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    public void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new blockListener(),this);
    }
}
