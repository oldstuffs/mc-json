package io.github.portlek.mcjson.api;

import org.jetbrains.annotations.NotNull;

public interface JsonPlayer {

    void sendRaw(@NotNull String json);

}
