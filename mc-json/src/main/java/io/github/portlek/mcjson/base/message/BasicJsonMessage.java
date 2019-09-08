package io.github.portlek.mcjson.base.message;

import io.github.portlek.mcjson.base.JsonPlayerOf;
import io.github.portlek.mcjson.api.JsonCompound;
import io.github.portlek.mcjson.api.JsonMessage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.cactoos.iterable.IterableOf;
import org.cactoos.list.ListOf;
import org.cactoos.scalar.And;
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
        try {
            new And(
                player -> {
                    new And(
                        compound -> {
                            new JsonPlayerOf(player).sendRaw(compound.convert());
                        },
                        new IterableOf<>(compounds)
                    ).value();
                },
                new IterableOf<>(players)
            ).value();
        } catch (Exception ignored) {
        }
    }

}