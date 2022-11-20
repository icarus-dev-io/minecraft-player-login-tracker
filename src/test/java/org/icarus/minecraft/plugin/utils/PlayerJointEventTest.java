package org.icarus.minecraft.plugin.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJointEventTest extends PlayerJoinEvent {
    public PlayerJointEventTest(final Player player) {
        super(player, Component.text(""));
    }
}
