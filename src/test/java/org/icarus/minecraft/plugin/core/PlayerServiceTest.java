package org.icarus.minecraft.plugin.core;

import org.icarus.minecraft.plugin.core.model.EventType;
import org.icarus.minecraft.plugin.utils.mock.PlayerEventRepositoryMock;
import org.icarus.minecraft.plugin.utils.stubs.StubPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

@DisplayName("Player service test")
class PlayerServiceTest {

    private PlayerService playerService;
    private PlayerEventRepositoryMock playerEventRepository;

    @BeforeEach
    void setUp() {
        this.playerEventRepository = new PlayerEventRepositoryMock();
        this.playerService = new PlayerService(this.playerEventRepository);
    }

    @Nested
    @DisplayName("Login test")
    class LoginTest {
        @Test
        @DisplayName("Should store a new login event")
        void test0() {
            playerService.login(new StubPlayer());

            assertThat(playerEventRepository.event.getType()).isEqualTo(EventType.LOGIN);
        }

        @Test
        @DisplayName("Should store a new login event with an id")
        void test1() {
            playerService.login(new StubPlayer());

            assertThat(playerEventRepository.event.getIdentifier()).matches("^[0-9(a-f|A-F)]{8}-[0-9(a-f|A-F)]{4}-4[0-9(a-f|A-F)]{3}-[89ab][0-9(a-f|A-F)]{3}-[0-9(a-f|A-F)]{12}$");
        }

        @Test
        @DisplayName("Should store a new login event with player data")
        void test2() {
            final StubPlayer player = new StubPlayer();
            player.identifier = "Why not";
            player.name = "Baguette";

            playerService.login(player);

            assertThat(playerEventRepository.event.getPlayer().identifier()).isEqualTo(player.identifier);
            assertThat(playerEventRepository.event.getPlayer().name()).isEqualTo(player.name);
        }


        @Test
        @DisplayName("Should store a new login event with timestamp")
        void test3() {
            playerService.login(new StubPlayer());

            assertThat(playerEventRepository.event.getTimestamp()).isCloseTo(Instant.now(), within(5, ChronoUnit.SECONDS));
        }
    }

    @Nested
    @DisplayName("Logout test")
    class LogoutTest {
        @Test
        @DisplayName("Should store a new logout event")
        void test0() {
            playerService.logout(new StubPlayer());

            assertThat(playerEventRepository.event.getType()).isEqualTo(EventType.LOGOUT);
        }

        @Test
        @DisplayName("Should store a new logout event with an id")
        void test1() {
            playerService.logout(new StubPlayer());

            assertThat(playerEventRepository.event.getIdentifier()).matches("^[0-9(a-f|A-F)]{8}-[0-9(a-f|A-F)]{4}-4[0-9(a-f|A-F)]{3}-[89ab][0-9(a-f|A-F)]{3}-[0-9(a-f|A-F)]{12}$");
        }

        @Test
        @DisplayName("Should store a new login event with player data")
        void test2() {
            final StubPlayer player = new StubPlayer();
            player.identifier = "Why not";
            player.name = "Baguette";

            playerService.logout(player);

            assertThat(playerEventRepository.event.getPlayer().identifier()).isEqualTo(player.identifier);
            assertThat(playerEventRepository.event.getPlayer().name()).isEqualTo(player.name);
        }


        @Test
        @DisplayName("Should store a new login event with timestamp")
        void test3() {
            playerService.logout(new StubPlayer());

            assertThat(playerEventRepository.event.getTimestamp()).isCloseTo(Instant.now(), within(5, ChronoUnit.SECONDS));
        }
    }
}