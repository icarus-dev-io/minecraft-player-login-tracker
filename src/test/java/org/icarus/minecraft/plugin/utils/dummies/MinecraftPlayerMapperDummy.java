package org.icarus.minecraft.plugin.utils.dummies;

import org.icarus.minecraft.plugin.core.model.Player;
import org.icarus.minecraft.plugin.events.MinecraftPlayerMapper;

import java.util.logging.Logger;

public class MinecraftPlayerMapperDummy extends MinecraftPlayerMapper {
    public MinecraftPlayerMapperDummy() {
        super(Logger.getGlobal());
    }

    @Override
    public Player map(org.bukkit.entity.Player player) {
        return null;
    }
}
