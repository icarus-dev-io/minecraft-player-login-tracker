package org.icarus.minecraft.plugin.core.model;

import java.time.Instant;

public class Event {
    private final String identifier;
    private final EventType type;
    private final Player player;
    private final Instant timestamp;

    public Event(final String identifier, final EventType type, final Player player, final Instant timestamp) {
        this.identifier = identifier;
        this.type = type;
        this.player = player;
        this.timestamp = timestamp;
    }

    public String getIdentifier() {
        return identifier;
    }

    public EventType getType() {
        return type;
    }

    public Player getPlayer() {
        return player;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
