package org.icarus.minecraft.plugin.events;

import net.kyori.adventure.text.Component;
import org.bukkit.event.player.PlayerJoinEvent;
import org.icarus.minecraft.plugin.utils.dummies.MinecraftPlayerMapperDummy;
import org.icarus.minecraft.plugin.utils.fakes.PlayerServiceFake;
import org.icarus.minecraft.plugin.utils.stubs.StubBukkitPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Player join event handler test")
class PlayerJoinEventHandlerTest {

    private PlayerJoinEventHandler playerJoinEventHandler;
    private PlayerServiceFake playerService;

    @BeforeEach
    void setUp() {
        final MinecraftPlayerMapperDummy minecraftPlayerMapper = new MinecraftPlayerMapperDummy();
        this.playerService = new PlayerServiceFake();
        this.playerJoinEventHandler = new PlayerJoinEventHandler(minecraftPlayerMapper, this.playerService);
    }

    @Test
    @DisplayName("Should call login of player service on joinEvent")
    void test0() {
        this.playerJoinEventHandler.onPlayerJoin(new PlayerJoinEvent(new StubBukkitPlayer(), Component.text("")));

        assertThat(this.playerService.loginHasBeenCall).isTrue();
    }
}