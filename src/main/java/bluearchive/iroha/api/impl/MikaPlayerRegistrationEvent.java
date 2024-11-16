package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaPlayerRegistrationEvent extends MikaEvent {
    private final Player player;

    @Override
    public boolean isCancellable() {
        return false;
    }

    public Player getPlayer() {
        return this.player;
    }

    public MikaPlayerRegistrationEvent(Player player) {
        this.player = player;
    }
}
