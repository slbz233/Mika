package bluearchive.mika.access.player.event;

import bluearchive.mika.access.IntaveEvent;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public final class AsyncIntaveBlockBreakPermissionEvent extends IntaveEvent implements Cancellable {
  private Player player;
  private Block block;
  private boolean cancelled;

  private AsyncIntaveBlockBreakPermissionEvent() {
  }

  public Player player() {
    return player;
  }

  public Block block() {
    return block;
  }

  public void copy(Player player, Block block) {
    this.player = player;
    this.block = block;
    this.cancelled = false;
  }

  @Override
  public void referenceInvalidate() {
    player = null;
    block = null;
  }

  @Override
  public boolean isCancelled() {
    return cancelled;
  }

  @Override
  public void setCancelled(boolean cancelled) {
    this.cancelled = cancelled;
  }

  public static AsyncIntaveBlockBreakPermissionEvent empty() {
    return new AsyncIntaveBlockBreakPermissionEvent();
  }
}
