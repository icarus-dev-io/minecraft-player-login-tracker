package org.icarus.minecraft.plugin.utils.mock;

import org.icarus.minecraft.plugin.core.PlayerEventRepository;
import org.icarus.minecraft.plugin.core.model.Event;

public class PlayerEventRepositoryMock implements PlayerEventRepository {
    public Event event;
    @Override
    public void addEvent(final Event event) {
        this.event = event;
    }
}
