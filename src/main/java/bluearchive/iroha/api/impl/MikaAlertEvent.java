package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.data.DebugData;
import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaAlertEvent extends MikaEvent {
    private final Player player;
    private final CheckData check;
    private final DebugData debug;
    private final int violations;

    public Player getPlayer() {
        return this.player;
    }

    public CheckData getCheck() {
        return this.check;
    }

    public DebugData getDebug() {
        return this.debug;
    }

    public int getViolations() {
        return this.violations;
    }

    public MikaAlertEvent(Player player, CheckData check, DebugData debug, int violations) {
        this.player = player;
        this.check = check;
        this.debug = debug;
        this.violations = violations;
    }
}
