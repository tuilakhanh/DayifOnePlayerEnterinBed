package fr.Tarzan.event;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerBedEnterEvent;
import cn.nukkit.level.Level;

public class PlayerBed implements Listener {
    @EventHandler
    public void onBed(PlayerBedEnterEvent event){
        Player player = event.getPlayer();
        event.getBed().getLevel().setTime(Level.TIME_DAY);
        event.setCancelled(true);
        player.getServer().broadcastMessage("[§6§l!§r]The §6Day §fis up");
    }
}
