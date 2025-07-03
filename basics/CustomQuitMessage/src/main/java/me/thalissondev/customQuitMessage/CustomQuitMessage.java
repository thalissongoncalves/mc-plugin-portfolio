package me.thalissondev.customQuitMessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomQuitMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Custom Quit Message Plugin has been successfully executed!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent e) {
        e.setQuitMessage(e.getPlayer().getName() + " scaped from the server.");
    }
}
