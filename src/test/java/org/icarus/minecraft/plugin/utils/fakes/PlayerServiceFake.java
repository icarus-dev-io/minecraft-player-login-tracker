package org.icarus.minecraft.plugin.utils.fakes;

import org.icarus.minecraft.plugin.core.PlayerService;
import org.icarus.minecraft.plugin.core.model.Player;
import org.icarus.minecraft.plugin.utils.mock.PlayerEventRepositoryMock;

public class PlayerServiceFake extends PlayerService {
    public boolean loginHasBeenCall = false;
    public boolean logoutHasBeenCall = false;

    public PlayerServiceFake() {
        super(new PlayerEventRepositoryMock());
    }

    @Override
    public void login(final Player player) {
        this.loginHasBeenCall = true;
    }

    @Override
    public void logout(final Player player) {
        this.logoutHasBeenCall = true;
    }
}
