package org.icarus.minecraft.plugin.core;

import org.icarus.minecraft.plugin.core.model.Player;

public class PlayerService {

    private final PlayerEventRepository playerEventRepository;

    public PlayerService(final PlayerEventRepository playerEventRepository) {
        this.playerEventRepository = playerEventRepository;
    }

    public void login(final Player player) {
        this.playerEventRepository.addEvent(EventFactory.createLoginEvent(player));
    }

    public void logout(final Player player) {
        this.playerEventRepository.addEvent(EventFactory.createLogoutEvent(player));
    }
}
