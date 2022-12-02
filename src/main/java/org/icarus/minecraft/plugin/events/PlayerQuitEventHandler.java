package org.icarus.minecraft.plugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.icarus.minecraft.plugin.core.PlayerService;

public class PlayerQuitEventHandler implements Listener {
    private final MinecraftPlayerMapper minecraftPlayerMapper;
    private final PlayerService playerService;

    public PlayerQuitEventHandler(final MinecraftPlayerMapper minecraftPlayerMapper, final PlayerService playerService) {
        this.minecraftPlayerMapper = minecraftPlayerMapper;
        this.playerService = playerService;
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerQuit(final PlayerQuitEvent event) {
        this.playerService.logout(this.minecraftPlayerMapper.map(event.getPlayer()));
    }
}
