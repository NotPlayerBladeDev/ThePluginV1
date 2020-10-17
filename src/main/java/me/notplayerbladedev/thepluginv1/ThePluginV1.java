package me.notplayerbladedev.thepluginv1;

import me.notplayerbladedev.thepluginv1.events.onJoin;
import me.notplayerbladedev.thepluginv1.events.onLeaveBed;
import me.notplayerbladedev.thepluginv1.events.onShearSheep;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ThePluginV1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started!");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new onLeaveBed(), this);
        getServer().getPluginManager().registerEvents(new onShearSheep(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
    }

}
