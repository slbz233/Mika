package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaPostCheckEvent extends MikaEvent implements RawPacketInspectableEvent{
    private final boolean failed;
    private final CheckData check;
    private final Player player;
    private final Object packet;

    @Override
    public boolean isCancellable() {
        return false;
    }

    @Override
    public Object getPacket() {
        return this.packet;
    }

    public MikaPostCheckEvent(boolean failed, CheckData check, Player player, Object packet) {
        this.failed = failed;
        this.check = check;
        this.player = player;
        this.packet = packet;
    }

    public boolean isFailed() {
        return this.failed;
    }

    public CheckData getCheck() {
        return this.check;
    }

    public Player getPlayer() {
        return this.player;
    }
}
