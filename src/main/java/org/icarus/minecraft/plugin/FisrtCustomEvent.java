package org.icarus.minecraft.plugin;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FisrtCustomEvent implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(final PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text(String.format("Hello, %s:%s!", event.getPlayer().getEntityId(), event.getPlayer().getName())));
    }

}
