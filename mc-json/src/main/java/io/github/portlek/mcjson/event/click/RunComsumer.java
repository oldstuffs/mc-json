package io.github.portlek.mcjson.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Consumer;

public class RunComsumer implements JsonEvent {

    @NotNull
    private final UUID uuid;

    @NotNull
    private final Listener listener;

    public RunComsumer(@NotNull JavaPlugin plugin, @NotNull UUID uuid, boolean removeAfter, @NotNull Consumer<Player> consumer) {
        this.uuid = UUID.randomUUID();

        Listener listener = new Listener() {
            @EventHandler
            public void run(PlayerCommandPreprocessEvent event) {
                if (!event.getMessage().equalsIgnoreCase("/spigot:callback " + uuid.toString())) return;

                consumer.accept(event.getPlayer());

                if (removeAfter)
                    unregister();
            }
        };
        Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        this.listener = listener;
    }

    @NotNull
    public String action() {
        return "run_command";
    }

    @NotNull
    public String value() {
        return "\"/spigot:callback " + uuid + '"';
    }

    private void unregister() {
        HandlerList.unregisterAll(listener);
    }

}
