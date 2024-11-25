package bluearchive.mika.access.player;

import java.util.function.Consumer;

public interface PlayerClicks {
  int clicksLastSecond();
  void subscribeToSecond(Consumer<Integer> clicks);
}