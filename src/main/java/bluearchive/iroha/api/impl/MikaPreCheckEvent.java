package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.MikaEvent;
import org.bukkit.entity.Player;

public final class MikaPreCheckEvent extends MikaEvent implements RawPacketInspectableEvent {
    private final Player player;
    private final CheckData check;
    private final Object packet;

    @Override
    public Object getPacket() {
        return this.packet;
    }

    public Player getPlayer() {
        return this.player;
    }

    public CheckData getCheck() {
        return this.check;
    }

    public MikaPreCheckEvent(Player player, CheckData check, Object packet) {
        this.player = player;
        this.check = check;
        this.packet = packet;
    }
}
