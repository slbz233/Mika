package bluearchive.iroha.api.registry;

import bluearchive.iroha.api.MikaEvent;
import bluearchive.iroha.api.MikaListener;

public interface MikaEventListenerRegistry {
    boolean fireEvent(MikaEvent mikaEvent);

    void shutdown();

    void addListener(MikaListener mikaListener);

    void removeListener(MikaListener mikaListener);
}
