package io.github.portlek.mcjson;

import io.github.portlek.mcjson.api.IJson;
import io.github.portlek.mcjson.api.JsonPlayer;
import io.github.portlek.mcjson.api.MckJson;
import io.github.portlek.mcjson.nms.v1_10_R1.Json1_10_R1;
import io.github.portlek.mcjson.nms.v1_11_R1.Json1_11_R1;
import io.github.portlek.mcjson.nms.v1_12_R1.Json1_12_R1;
import io.github.portlek.mcjson.nms.v1_13_R1.Json1_13_R1;
import io.github.portlek.mcjson.nms.v1_13_R2.Json1_13_R2;
import io.github.portlek.mcjson.nms.v1_14_R1.Json1_14_R1;
import io.github.portlek.mcjson.nms.v1_8_R1.Json1_8_R1;
import io.github.portlek.mcjson.nms.v1_8_R2.Json1_8_R2;
import io.github.portlek.mcjson.nms.v1_8_R3.Json1_8_R3;
import io.github.portlek.mcjson.nms.v1_9_R1.Json1_9_R1;
import io.github.portlek.mcjson.nms.v1_9_R2.Json1_9_R2;
import io.github.portlek.versionmatched.VersionMatched;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class JsonPlayerOf implements JsonPlayer {

    private static final IJson JSON = new VersionMatched<>(
        new MckJson(),
        Json1_8_R1.class,
        Json1_8_R2.class,
        Json1_8_R3.class,
        Json1_9_R1.class,
        Json1_9_R2.class,
        Json1_10_R1.class,
        Json1_11_R1.class,
        Json1_12_R1.class,
        Json1_13_R1.class,
        Json1_13_R2.class,
        Json1_14_R1.class
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
