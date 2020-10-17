package me.notplayerbladedev.thepluginv1.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class onLeaveBed implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        //This is what ^ will run when you leave a bed!
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GOLD + "You have left a bed!");
    }
}
