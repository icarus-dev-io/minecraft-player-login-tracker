package org.icarus.minecraft.plugin.events;

import org.icarus.minecraft.plugin.core.model.Player;

import java.util.logging.Logger;

public class MinecraftPlayerMapper {
    private static final Logger LOGGER = Logger.getLogger("MinecraftPlayerMapper");

    public Player map(final org.bukkit.entity.Player player) {
        LOGGER.info("MinecraftPlayerMapper#map - start");
        final MinecraftPlayer minecraftPlayer = new MinecraftPlayer(String.valueOf(player.getEntityId()), player.getName());
        LOGGER.info("MinecraftPlayerMapper#map - end");
        return minecraftPlayer;
    }
}
