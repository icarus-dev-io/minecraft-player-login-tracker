package org.icarus.minecraft.plugin.utils.dummies;

import org.icarus.minecraft.plugin.core.model.Player;
import org.icarus.minecraft.plugin.events.MinecraftPlayerMapper;

public class MinecraftPlayerMapperDummy extends MinecraftPlayerMapper {

    @Override
    public Player map(org.bukkit.entity.Player player) {
        return null;
    }
}
