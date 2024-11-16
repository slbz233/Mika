package bluearchive.mika.wrappers.nbt;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.logging.Level;

public final class MikaProtocolAdapter extends JavaPlugin {

    String savePath = getDataFolder().getPath();
    private String downloadurl = "https://repo.dmulloy2.net/repository/public/com/comphenix/protocol/ProtocolLib/5.1.0/ProtocolLib-5.1.0.jar";
//    URL url = new URL("https://repo.dmulloy2.net/repository/public/com/comphenix/protocol/ProtocolLib/5.1.0/ProtocolLib-5.1.0.jar");
//    URLConnection connection = url.openConnection();
    private String MikaPrefix = "[Mika]";
    private void log(String string) { Bukkit.getLogger().log(Level.INFO, MikaPrefix + " " + string); }


    public MikaProtocolAdapter() throws IOException { }

    @Override
    public void onLoad(){
        if(getServer().getPluginManager().getPlugin("ProtocolLib") == null){
            log("Download ProtocolLib here: " + downloadurl);
        }
    }
}
