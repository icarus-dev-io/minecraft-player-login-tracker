package org.icarus.minecraft.plugin;

import org.icarus.minecraft.plugin.utils.PlayerForTest;
import org.icarus.minecraft.plugin.utils.PlayerJointEventTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FisrtCustomEventTest {
    private final FisrtCustomEvent fisrtCustomEvent = new FisrtCustomEvent();

    @Test
    @DisplayName("Should send message to the player on player join")
    void shouldSendMessageToThePlayer() {
        final String playerName = "Martine";
        final int playerId = 1;
        final PlayerForTest player = new PlayerForTest(playerId, playerName);
        final PlayerJointEventTest event = new PlayerJointEventTest(player);

        this.fisrtCustomEvent.onPlayerJoin(event);

        assertThat(player.isSendMessageHasBeenCalled).isTrue();
        assertThat(player.message).isEqualTo(String.format("Hello, %s:%s!", playerId, playerName));
    }
}