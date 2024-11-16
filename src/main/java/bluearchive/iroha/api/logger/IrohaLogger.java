package bluearchive.iroha.api.logger;

public final class IrohaLogger {
    public static void info(String info) {
        System.out.println("[Mika] " + info);
    }

    public static void critical(String info) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Mika error: " + info);
        System.out.println("----------------------------------------------------------------");
    }
}
