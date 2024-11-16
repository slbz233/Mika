package bluearchive.iroha.api.example;

import bluearchive.iroha.api.data.CheckData;
import bluearchive.iroha.api.MikaEvent;
import bluearchive.iroha.api.MikaListener;
import bluearchive.iroha.api.impl.MikaAlertEvent;
import org.bukkit.entity.Player;

public class ExampleListener implements MikaListener {
    @Override
    public void onEvent(MikaEvent event) {
        if (event instanceof MikaAlertEvent) {
            CheckData check = ((MikaAlertEvent)event).getCheck();
            Player var3 = ((MikaAlertEvent)event).getPlayer();
        }
    }
}
