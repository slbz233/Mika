package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaBanEvent extends MikaEvent {
    private final Player player;
    private final CheckData check;

    public Player getPlayer() {
        return this.player;
    }

    public CheckData getCheck() {
        return this.check;
    }

    public MikaBanEvent(Player player, CheckData check) {
        this.player = player;
        this.check = check;
    }
}
