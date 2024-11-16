package bluearchive.mika.access.player;

import bluearchive.mika.access.IntaveAccessException;

public final class UnknownPlayerException extends IntaveAccessException {
  public UnknownPlayerException() {
    super();
  }

  public UnknownPlayerException(String message) {
    super(message);
  }

  public UnknownPlayerException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnknownPlayerException(Throwable cause) {
    super(cause);
  }
}
