package me.notplayerbladedev.thepluginv1.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.GOLD + "Welcome to the server!" + ChatColor.AQUA + player.getDisplayName());
    }

}
