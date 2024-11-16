package bluearchive.iroha.api;

import bluearchive.iroha.api.exception.EventNotCancellableException;

public class MikaEvent {
    private boolean cancelled = false;

    public final void cancel() {
        if (!this.isCancellable()) {
            throw new EventNotCancellableException(this);
        } else {
            this.cancelled = true;
        }
    }

    public boolean isCancellable() {
        return true;
    }

    public final boolean isCancelled() {
        return this.isCancellable() && this.cancelled;
    }
}
