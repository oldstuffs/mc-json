package io.github.portlek.mcjson.base.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class OpenURL implements JsonEvent {

    @NotNull
    private final String value;

    public OpenURL(@NotNull String value) {
        this.value = value;
    }

    @NotNull
    public String action() {
        return "open_url";
    }

    @NotNull
    public String value() {
        return '"' + value + '"';
    }

}
