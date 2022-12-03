package org.icarus.minecraft.plugin.infra.repositories;

import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.model.Event;

import java.util.logging.Logger;

public class PlayerEventRepositoryInMemory implements PlayerEventRepository {
    private static final Logger LOGGER = Logger.getLogger("PlayerEventRepositoryInMemory");

    @Override
    public void addEvent(final Event event) {
        LOGGER.info("PlayerEventRepositoryInMemory#addEvent - start");
        LOGGER.info(String.format("addEvent({%s, {%s, %s}, %s, %s})", event.getIdentifier(), event.getPlayer().identifier(), event.getPlayer().name(), event.getType().name(), event.getTimestamp()));
        LOGGER.info("PlayerEventRepositoryInMemory#addEvent - end");
    }
}
