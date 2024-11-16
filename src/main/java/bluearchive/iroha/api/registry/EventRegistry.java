package bluearchive.iroha.api.registry;

import bluearchive.iroha.api.MikaEvent;
import bluearchive.iroha.api.MikaListener;
import bluearchive.iroha.api.logger.IrohaLogger;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventRegistry implements MikaEventListenerRegistry {
    private final List<MikaListener> listeners = new CopyOnWriteArrayList<>();
    private int errors;
    private boolean forceShutdown;

    @Override
    public boolean fireEvent(MikaEvent event) {
        if (!this.forceShutdown) {
            try {
                this.listeners.forEach(l -> l.onEvent(event));
                return !event.isCancelled();
            } catch (Throwable var3) {
                var3.printStackTrace();
                if (++this.errors >= 5) {
                    IrohaLogger.critical("The event service has been set to idle due to numerous unknown errors\nIf you still want to utilize the event system, please restart your server");
                    this.forceShutdown = true;
                }

                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public void addListener(MikaListener listener) {
        if (!this.forceShutdown) {
            if (!this.listeners.contains(listener)) {
                this.listeners.add(listener);
            }
        } else {
            throw new RuntimeException("event registry is halted");
        }
    }

    @Override
    public void removeListener(MikaListener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void shutdown() {
        this.listeners.clear();
    }

    public void setForceShutdown(boolean forceShutdown) {
        this.forceShutdown = forceShutdown;
    }
}
