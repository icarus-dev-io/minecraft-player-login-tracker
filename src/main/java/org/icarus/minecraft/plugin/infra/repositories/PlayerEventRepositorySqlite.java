package org.icarus.minecraft.plugin.infra.repositories;

import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.model.Event;

import java.sql.Timestamp;

public class PlayerEventRepositorySqlite implements PlayerEventRepository {

    private final SqliteDataBase sqliteDataBase;

    public PlayerEventRepositorySqlite(final SqliteDataBase sqliteDataBase) {
        this.sqliteDataBase = sqliteDataBase;
    }

    @Override
    public void addEvent(final Event event) {
        this.sqliteDataBase.insert(
                event.getIdentifier(),
                event.getPlayer().identifier(),
                event.getPlayer().name(),
                event.getType().name(),
                Timestamp.from(event.getTimestamp())
        );
    }

}
