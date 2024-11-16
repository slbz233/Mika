package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.MikaEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public final class MikaPullbackEvent extends MikaEvent {
    private final Player player;
    private final CheckData check;
    private Location to;

    public MikaPullbackEvent(Player player, CheckData check, Location to) {
        this.player = player;
        this.check = check;
        this.to = to.clone();
    }

    public void setTo(Location to) {
        this.to = to;
    }

    public Player getPlayer() {
        return this.player;
    }

    public CheckData getCheck() {
        return this.check;
    }

    public Location getTo() {
        return this.to;
    }
}
