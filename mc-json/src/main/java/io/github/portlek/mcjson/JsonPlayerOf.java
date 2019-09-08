package io.github.portlek.mcjson;

import io.github.portlek.mcjson.api.IJson;
import io.github.portlek.mcjson.api.JsonPlayer;
import io.github.portlek.mcjson.api.MckJson;
import io.github.portlek.versionmatched.VersionMatched;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class JsonPlayerOf implements JsonPlayer {

    private static final IJson JSON = new VersionMatched<>(
        new MckJson()
    ).of().instance();

    @NotNull
    private final Player player;

    public JsonPlayerOf(@NotNull Player player) {
        this.player = player;
    }

    @Override
    public void sendRaw(@NotNull String json) {
        JSON.sendRaw(player, json);
    }

}
