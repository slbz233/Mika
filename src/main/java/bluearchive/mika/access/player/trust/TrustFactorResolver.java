package bluearchive.mika.access.player.trust;

import org.bukkit.entity.Player;

import java.util.function.Consumer;

public interface TrustFactorResolver {
  void resolve(Player player, Consumer<TrustFactor> callback);
}
