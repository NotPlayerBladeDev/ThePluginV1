package me.notplayerbladedev.thepluginv1;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ThePluginV1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started!");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        //here is code event will run when player leaves bed
        Player player = event.getPlayer();
        player.sendMessage("You left the bed!");

    }

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event){
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.AQUA + "Nice try!");
    }

}
