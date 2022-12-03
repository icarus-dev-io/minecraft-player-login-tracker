package org.icarus.minecraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.PlayerService;
import org.icarus.minecraft.plugin.events.MinecraftPlayerMapper;
import org.icarus.minecraft.plugin.events.PlayerJoinEventHandler;
import org.icarus.minecraft.plugin.events.PlayerQuitEventHandler;
import org.icarus.minecraft.plugin.infra.repositories.PlayerEventRepositorySqlite;
import org.icarus.minecraft.plugin.infra.repositories.SqliteDataBase;

public class PlayerLoginTrackerApplication extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        final SqliteDataBase sqliteDataBase = new SqliteDataBase();
        sqliteDataBase.createTable();
        final MinecraftPlayerMapper minecraftPlayerMapper = new MinecraftPlayerMapper();
        final PlayerEventRepository playerEventRepository = new PlayerEventRepositorySqlite(sqliteDataBase);
        final PlayerService playerService = new PlayerService(playerEventRepository);

        Bukkit.getPluginManager().registerEvents(new PlayerJoinEventHandler(minecraftPlayerMapper, playerService), this);
        Bukkit.getPluginManager().registerEvents(new PlayerQuitEventHandler(minecraftPlayerMapper, playerService), this);
    }
}
