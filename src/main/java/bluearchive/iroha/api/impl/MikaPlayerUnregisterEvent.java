package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaPlayerUnregisterEvent extends MikaEvent {
    private final Player player;

    @Override
    public boolean isCancellable() {
        return false;
    }

    public MikaPlayerUnregisterEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }
}
