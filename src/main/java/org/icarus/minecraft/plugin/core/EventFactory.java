package org.icarus.minecraft.plugin.core;

import org.icarus.minecraft.plugin.core.model.Event;
import org.icarus.minecraft.plugin.core.model.EventType;
import org.icarus.minecraft.plugin.core.model.Player;

import java.time.Instant;
import java.util.UUID;

public final class EventFactory {
    public static Event createLoginEvent(final Player player) {
        return createEvent(EventType.LOGIN, player);
    }

    public static Event createLogoutEvent(final Player player) {
        return createEvent(EventType.LOGOUT, player);
    }

    private static Event createEvent(final EventType login, final Player player) {
        return new Event(UUID.randomUUID().toString(), login, player, Instant.now());
    }
}
