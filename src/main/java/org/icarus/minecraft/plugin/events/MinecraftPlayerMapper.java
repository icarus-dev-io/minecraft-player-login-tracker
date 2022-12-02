package org.icarus.minecraft.plugin.events;

import org.icarus.minecraft.plugin.core.model.Player;

import java.util.logging.Logger;

public class MinecraftPlayerMapper {
    private final Logger logger;

    public MinecraftPlayerMapper(final Logger logger) {
        this.logger = logger;
    }

    public Player map(final org.bukkit.entity.Player player) {
        this.logger.info("MinecraftPlayerMapper#map - start");
        final MinecraftPlayer minecraftPlayer = new MinecraftPlayer(String.valueOf(player.getEntityId()), player.getName());
        this.logger.info("MinecraftPlayerMapper#map - end");
        return minecraftPlayer;
    }
}
