package bluearchive.mika;

//import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Mika extends JavaPlugin {
    public Mika(){
        this.prefix = ChatColor.AQUA + "[" + ChatColor.DARK_BLUE + ChatColor.BOLD + "Mika" + ChatColor.AQUA + "]" + ChatColor.DARK_BLUE + " ";
        this.standartColor = ChatColor.DARK_PURPLE;
    }
     private String prefix;
    /* private void colorlog(String string){ Bukkit.getLogger().log(Level.INFO, prefix + " " + string); } */

    private ChatColor standartColor;
    private String MikaPrefix = "[Mika]";
    private static final String MikaVer = "0.7.21";
    private static final String MikaState = "Public Release";
    private void log(String string) { Bukkit.getLogger().log(Level.INFO, MikaPrefix + " " + string); }

    private Mika mika;

    @Override
    public void onEnable() {
        log("Mika version: " + MikaVer);
        log("Mika Release: " + MikaState);
        log("Server ID: " + getServer().getServerId() + " | Server IP: " + getServer().getIp() + " | Server port: " + getServer().getPort());
        log("Server version: " + getServer().getVersion() + " | Bukkit version: " + getServer().getBukkitVersion());
        log("Github: https://github.com/slbz233/mika");
    }

    @Override
    public void onDisable() {
    }
}
