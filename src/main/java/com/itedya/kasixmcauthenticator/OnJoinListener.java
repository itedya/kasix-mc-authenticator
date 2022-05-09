package com.itedya.kasixmcauthenticator;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OnJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        String username = player.getName();

        KasixMCAuthenticator plugin = KasixMCAuthenticator.getInstance();

        Path path = Paths.get(plugin.getDataFolder().toString(), username + ".pass");

        if (!Files.exists(path)) {
            player.kickPlayer("Nie wykupiłeś whitelisty, możesz ją dostać za punkty kanału na platformie twitch.");
        }
    }
}
