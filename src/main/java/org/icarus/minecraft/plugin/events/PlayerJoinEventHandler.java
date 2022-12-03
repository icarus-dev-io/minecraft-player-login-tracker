package org.icarus.minecraft.plugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.icarus.minecraft.plugin.core.PlayerService;

public class PlayerJoinEventHandler implements Listener {
    private final MinecraftPlayerMapper minecraftPlayerMapper;
    private final PlayerService playerService;

    public PlayerJoinEventHandler(final MinecraftPlayerMapper minecraftPlayerMapper, final PlayerService playerService) {
        this.minecraftPlayerMapper = minecraftPlayerMapper;
        this.playerService = playerService;
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(final PlayerJoinEvent event) {
        this.playerService.login(this.minecraftPlayerMapper.map(event.getPlayer()));
    }
}
