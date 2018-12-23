package com.jacksonnn.disablegod;

import com.sk89q.commandbook.GodComponent;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class onWorldChange implements Listener {

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent e) {

        GodComponent gc = new GodComponent();

        Player player = e.getPlayer();

        World world = player.getWorld();

        if (world.getEnvironment().equals(World.Environment.NETHER) || world.getEnvironment().equals(World.Environment.THE_END)) {
            if (!player.hasPermission("SFT.bypass")) {
                gc.disableGodMode(player);
                player.setFlying(false);
                player.setAllowFlight(false);
            }
        }
    }
}
