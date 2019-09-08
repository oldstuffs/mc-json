package io.github.portlek.mcjson.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface IJson {

    void sendRaw(@NotNull Player player, @NotNull String json);

}
