package org.icarus.minecraft.plugin.events;

import org.icarus.minecraft.plugin.core.model.Player;
import org.icarus.minecraft.plugin.utils.stubs.StubBukkitPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Minecraft player mapper test")
class MinecraftPlayerMapperTest {
    private final MinecraftPlayerMapper minecraftPlayerMapper = new MinecraftPlayerMapper(Logger.getGlobal());

    @Test
    @DisplayName("should return a minecraft player")
    void test0() {
        final StubBukkitPlayer bukkitPlayer = new StubBukkitPlayer();
        bukkitPlayer.id = 1234;
        bukkitPlayer.name = "Baguette";

        final Player player = this.minecraftPlayerMapper.map(bukkitPlayer);

        assertThat(player.identifier()).isEqualTo(String.valueOf(bukkitPlayer.id));
        assertThat(player.name()).isEqualTo(bukkitPlayer.name);
    }
}