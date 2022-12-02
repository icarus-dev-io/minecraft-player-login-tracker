package org.icarus.minecraft.plugin.utils.stubs;

import org.icarus.minecraft.plugin.core.model.Player;

public class StubPlayer implements Player {
    public String identifier;
    public String name;

    @Override
    public String identifier() {
        return this.identifier;
    }

    @Override
    public String name() {
        return this.name;
    }
}
