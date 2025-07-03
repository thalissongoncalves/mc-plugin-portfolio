package me.thalissondev.healYourselfInBed;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class HealYourselfInBed extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("Plugin Heal Yourself In Bed has been executed with success!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();

        player.setHealth(20);
    }

}
