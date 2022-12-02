package org.icarus.minecraft.plugin.infra.repositories;

import org.icarus.minecraft.plugin.core.model.Event;
import org.icarus.minecraft.plugin.core.model.EventType;
import org.icarus.minecraft.plugin.utils.stubs.StubPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThatCode;

@DisplayName("Player event repository in memory test")
class PlayerEventRepositoryInMemoryTest {

    private final PlayerEventRepositoryInMemory playerEventRepositoryInMemory = new PlayerEventRepositoryInMemory(Logger.getGlobal());

    @Test
    @DisplayName("should not throw exception")
    void test0() {
        assertThatCode(() -> this.playerEventRepositoryInMemory.addEvent(new Event("", EventType.LOGOUT, new StubPlayer(), Instant.now())))
                .doesNotThrowAnyException();
    }

}