package org.icarus.minecraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.PlayerService;
import org.icarus.minecraft.plugin.events.MinecraftPlayerMapper;
import org.icarus.minecraft.plugin.events.PlayerJoinEventHandler;
import org.icarus.minecraft.plugin.events.PlayerQuitEventHandler;
import org.icarus.minecraft.plugin.infra.repositories.PlayerEventRepositoryInMemory;

public class PlayerLoginTrackerApplication extends JavaPlugin implements Listener {
    private final MinecraftPlayerMapper minecraftPlayerMapper;
    private final PlayerService playerService;

    public PlayerLoginTrackerApplication() {
        this.minecraftPlayerMapper = new MinecraftPlayerMapper();
        final PlayerEventRepository playerEventRepository = new PlayerEventRepositoryInMemory();
        this.playerService = new PlayerService(playerEventRepository);
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerJoinEventHandler(this.minecraftPlayerMapper, this.playerService), this);
        Bukkit.getPluginManager().registerEvents(new PlayerQuitEventHandler(this.minecraftPlayerMapper, this.playerService), this);
    }
}
