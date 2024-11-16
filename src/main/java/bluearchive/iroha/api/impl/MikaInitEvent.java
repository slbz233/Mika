package bluearchive.iroha.api.impl;

import bluearchive.iroha.api.MikaEvent;

public final class MikaInitEvent extends MikaEvent {
    private final long loadTime;

    @Override
    public boolean isCancellable() {
        return false;
    }

    public long getLoadTime() {
        return this.loadTime;
    }

    public MikaInitEvent(long loadTime) {
        this.loadTime = loadTime;
    }
}
