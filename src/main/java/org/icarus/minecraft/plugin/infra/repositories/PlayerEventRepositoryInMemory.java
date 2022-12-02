package org.icarus.minecraft.plugin.infra.repositories;

import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.model.Event;

import java.util.logging.Logger;

public class PlayerEventRepositoryInMemory implements PlayerEventRepository {
    private final Logger logger;

    public PlayerEventRepositoryInMemory(final Logger logger) {
        this.logger = logger;
    }

    @Override
    public void addEvent(final Event event) {
        this.logger.info("PlayerEventRepositoryInMemory#addEvent - start");
        this.logger.info(String.format("addEvent({%s, {%s, %s}, %s, %s})", event.getIdentifier(), event.getPlayer().identifier(), event.getPlayer().name(), event.getType().name(), event.getTimestamp()));
        this.logger.info("PlayerEventRepositoryInMemory#addEvent - end");
    }
}
