package org.icarus.minecraft.plugin.events;

import net.kyori.adventure.text.Component;
import org.bukkit.event.player.PlayerQuitEvent;
import org.icarus.minecraft.plugin.utils.dummies.MinecraftPlayerMapperDummy;
import org.icarus.minecraft.plugin.utils.fakes.PlayerServiceFake;
import org.icarus.minecraft.plugin.utils.stubs.StubBukkitPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerQuitEventHandlerTest {
    private PlayerQuitEventHandler playerQuitEventHandler;
    private PlayerServiceFake playerService;

    @BeforeEach
    void setUp() {
        final MinecraftPlayerMapperDummy minecraftPlayerMapper = new MinecraftPlayerMapperDummy();
        this.playerService = new PlayerServiceFake();
        this.playerQuitEventHandler = new PlayerQuitEventHandler(minecraftPlayerMapper, this.playerService);
    }

    @Test
    @DisplayName("Should call login of player service on joinEvent")
    void test0() {
        this.playerQuitEventHandler.onPlayerQuit(new PlayerQuitEvent(new StubBukkitPlayer(), Component.text(""), PlayerQuitEvent.QuitReason.DISCONNECTED));

        assertThat(this.playerService.logoutHasBeenCall).isTrue();
    }
}