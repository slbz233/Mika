package bluearchive.iroha.api.util;

public final class Conditions {
    public static void notNull(Object o, String msg) {
        if (o == null) {
            throw new IllegalArgumentException(msg);
        }
    }
}
