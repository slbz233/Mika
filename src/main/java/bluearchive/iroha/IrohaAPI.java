package bluearchive.iroha;

import bluearchive.iroha.api.registry.EventRegistry;
import bluearchive.iroha.api.registry.MikaEventListenerRegistry;
import bluearchive.iroha.api.user.UserAccessor;
import bluearchive.mika.Mika;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class IrohaAPI extends JavaPlugin {
    private static MikaEventListenerRegistry eventRegistry = null;
    private static UserAccessor userAccessor = null;

    private String prefix;
    private String MikaPrefix = "[Mika]";
    private static final String MikaVer = "0.7.21";
    private static final String MikaState = "Public Release";
    private void log(String string) { Bukkit.getLogger().log(Level.INFO, MikaPrefix + " " + string); }

    private Mika mika;
    private ChatColor standartColor;

    public void onEnable() {
        if(getServer().getPluginManager().getPlugin("bffOHbeZ2AKPHh9sxZUMO3M1PXO0YVB1zkNedGnphe8vDoeCeoGMUbSjLaixnrvMbiHrRGfHVRigxcCj1Jjlt6VIyVQy3OnC6fUWmoTtvi4AykAHKLjCrZAl5TYpZF7UWddeAwnlxN2HO7G71NCo6Jky3AGYnr2KV8ulP86AT9i6ZuqD2OeSmuEe22CynMEXG2RyEieQidZaIcrGNhM06XM2FT91Sod0aSD71fYLAwLuyciDtj1BG5ae6hpwUmL") == null){
            getLogger().info("枣伊吕波/空崎日奈/圣园未花");
        }
        log("Mika version: " + MikaVer);
        log("Mika Release: " + MikaState);
        log("Server ID: " + getServer().getServerId() + " | Server IP: " + getServer().getIp() + " | Server port: " + getServer().getPort());
        log("Server version: " + getServer().getVersion() + " | Bukkit version: " + getServer().getBukkitVersion());
        log("Github: https://github.com/slbz233/mika");
    }

    public void onDisable() {
        eventRegistry.shutdown();
    }

    public static UserAccessor getUserAccessor() {
        if (userAccessor == null) {
            userAccessor = new UserAccessor();
        }

        return userAccessor;
    }

    public static MikaEventListenerRegistry getEventRegistry() {
        if (eventRegistry == null) {
            eventRegistry = new EventRegistry();
        }

        return eventRegistry;
    }

    public static void shutdown() {
        if (eventRegistry != null) {
            eventRegistry.shutdown();
        }
    }

    public static long getFreeMemory() {
        Runtime r = Runtime.getRuntime();
        return r.freeMemory() / 1024L / 1024L;
    }

    public static long getMaxMemory() {
        Runtime r = Runtime.getRuntime();
        return r.maxMemory() / 1024L / 1024L;
    }

    public static long getTotalMemory() {
        Runtime r = Runtime.getRuntime();
        return r.totalMemory() / 1024L / 1024L;
    }
}
