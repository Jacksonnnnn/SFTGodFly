package com.jacksonnn.disablegod;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class onCommand implements Listener {
    String worldType;

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        Player player = e.getPlayer();
        World world = player.getWorld();

        String command = e.getMessage();

        if (world.getEnvironment().equals(World.Environment.NETHER) || world.getEnvironment().equals(World.Environment.THE_END)) {
            if (!player.hasPermission("SFT.bypass")) {
                if (command.equalsIgnoreCase("/fly") || command.equalsIgnoreCase("/god")) {

                    if (world.getEnvironment().equals(World.Environment.NETHER)) {
                        worldType = "the Nether";
                    } else if (world.getEnvironment().equals(World.Environment.THE_END)) {
                        worldType = "the End";
                    }

                    e.setCancelled(true);
                    player.sendMessage(ChatColor.RED + "You are not allowed to do " + command + " in " + worldType);
                }
            }
        }
    }
}
