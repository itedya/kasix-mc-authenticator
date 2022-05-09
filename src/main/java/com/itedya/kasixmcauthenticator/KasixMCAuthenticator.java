package com.itedya.kasixmcauthenticator;

import org.bukkit.plugin.java.JavaPlugin;

public final class KasixMCAuthenticator extends JavaPlugin {
    private static KasixMCAuthenticator instance;

    public static KasixMCAuthenticator getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        this.getDataFolder().mkdir();

        this.getServer().getPluginManager().registerEvents(new OnJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
