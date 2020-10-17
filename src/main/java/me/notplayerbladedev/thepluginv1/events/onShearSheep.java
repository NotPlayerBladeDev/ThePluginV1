package me.notplayerbladedev.thepluginv1.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class onShearSheep implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event){
        //This is what happens when the sheep is sheared
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.AQUA + "Nice try, gamer");

    }
}
