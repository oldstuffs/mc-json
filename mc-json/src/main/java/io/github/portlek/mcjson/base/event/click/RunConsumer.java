package io.github.portlek.mcjson.base.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Consumer;

public class RunConsumer implements JsonEvent {

    @NotNull
    private final UUID uuid;

    private boolean registered = false;

    public RunConsumer(@NotNull JavaPlugin plugin,
                       boolean removeAfter,
                       @NotNull Consumer<Player> consumer) {
        this.uuid = UUID.randomUUID();
        @NotNull Listener listener = new Listener() {
            @EventHandler
            public void run(PlayerCommandPreprocessEvent event) {
                if (!event.getMessage().equalsIgnoreCase("/spigot:callback " + uuid.toString())) {
                    return;
                }

                if (!registered) {
                    event.setCancelled(true);
                    return;
                }

                event.setCancelled(true);
                consumer.accept(event.getPlayer());

                if (removeAfter) {
                    registered = false;
                }
            }
        };
        Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        registered = true;
    }

    @NotNull
    public String action() {
        return "run_command";
    }

    @NotNull
    public String value() {
        return "\"/spigot:callback " + uuid + '"';
    }

}
