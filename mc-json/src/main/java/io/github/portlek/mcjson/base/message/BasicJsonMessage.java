package io.github.portlek.mcjson.base.message;

import io.github.portlek.mcjson.api.JsonCompound;
import io.github.portlek.mcjson.api.JsonMessage;
import io.github.portlek.mcjson.api.JsonPlayer;
import io.github.portlek.mcjson.base.JsonPlayerOf;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.cactoos.list.ListOf;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class BasicJsonMessage implements JsonMessage {

    private final List<JsonCompound> compounds;

    public BasicJsonMessage(List<JsonCompound> compounds) {
        this.compounds = compounds;
    }

    public BasicJsonMessage(JsonCompound... compounds) {
        this(
            new ListOf<>(
                compounds
            )
        );
    }

    @Override
    public void sendAll() {
        Bukkit.getOnlinePlayers().forEach(this::send);
    }

    @Override
    public void send(@NotNull Player... players) {
        for (Player player : players) {
            final StringBuilder stringBuilder = new StringBuilder();
            final JsonPlayer jsonPlayer = new JsonPlayerOf(player);

            for (int i = 0; i < compounds.size(); i++) {
                stringBuilder.append(compounds.get(i).convert());

                if (i != compounds.size() - 1) {
                    stringBuilder.append(",");
                }
            }

            jsonPlayer.sendRaw("[\"\"," + stringBuilder.toString() + "]");
        }
    }

}