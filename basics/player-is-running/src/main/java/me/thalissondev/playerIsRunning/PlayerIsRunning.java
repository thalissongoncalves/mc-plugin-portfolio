package me.thalissondev.playerIsRunning;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class PlayerIsRunning extends JavaPlugin implements Listener {

    private final Set<UUID> walking = new HashSet<>();

    @Override
    public void onEnable() {
        System.out.println("Plugin Player Is Running has been executed with success!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        UUID id = player.getUniqueId();

        if (player.isSprinting()) {
            if (walking.contains(id)) {
                player.sendMessage("🏃 You are running!");
                walking.remove(id);
            }
        } else {
            walking.add(id);
        }
    }

}
