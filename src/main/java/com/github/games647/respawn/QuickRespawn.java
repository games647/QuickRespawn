package com.github.games647.respawn;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.Order;
import org.spongepowered.api.event.entity.DestructEntityEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = PomData.ARTIFACT_ID, name = PomData.NAME, version = PomData.VERSION
        , url = PomData.URL, description = PomData.DESCRIPTION)
public class QuickRespawn {

    @Listener(order = Order.POST)
    public void onDeath(DestructEntityEvent.Death deathEvent, @First Player player) {
        player.respawnPlayer();
    }
}
