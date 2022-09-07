package com.guedosha.securityadditions;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Securityadditions extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockPlace(), this);
        getServer().getPluginManager().registerEvents(new SpawnEggUse(), this);
        getServer().getPluginManager().registerEvents(new IllegalActions(), this);
    }

    public void onDisable(){

    }
}
