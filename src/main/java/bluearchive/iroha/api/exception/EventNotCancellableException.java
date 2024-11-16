package bluearchive.iroha.api.exception;

import bluearchive.iroha.api.MikaEvent;

public final class EventNotCancellableException extends RuntimeException{
    public EventNotCancellableException(MikaEvent event) {
        super(event.getClass().getSimpleName() + " cannot be force-cancelled (is it cancellable?)");
    }
}
