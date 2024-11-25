package bluearchive.mika;

import bluearchive.mika.access.IntaveAccess;
import bluearchive.mika.access.IntaveColdException;

import java.lang.ref.WeakReference;

public final class IntaveAccessor {
  private static transient WeakReference<IntaveAccess> weakAccess;

  public static synchronized boolean loaded() {
    return false;
  }

  public static synchronized WeakReference<IntaveAccess> weakAccess() {
    if (!loaded()) {
      throw new IntaveColdException("Intave offline");
    }
    if (weakAccess == null) {
      weakAccess = new WeakReference<>(uncheckedUnsafeAccess());
    }
    return weakAccess;
  }

  public static synchronized IntaveAccess unsafeAccess() {
    if (!loaded()) {
      throw new IntaveColdException("Intave offline");
    }
    return uncheckedUnsafeAccess();
  }

  private static IntaveAccess uncheckedUnsafeAccess() {
    return null;
  }
}
