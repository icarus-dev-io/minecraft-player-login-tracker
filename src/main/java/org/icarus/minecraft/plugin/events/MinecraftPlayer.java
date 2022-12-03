package org.icarus.minecraft.plugin.events;

import org.icarus.minecraft.plugin.core.model.Player;

record MinecraftPlayer(String identifier, String name) implements Player {
}