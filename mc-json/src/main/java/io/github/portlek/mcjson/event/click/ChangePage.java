package io.github.portlek.mcjson.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ChangePage implements JsonEvent {

    @NotNull
    private final String value;

    public ChangePage(@NotNull String value) {
        this.value = value;
    }

    @NotNull
    public String action() {
        return "change_page";
    }

    @NotNull
    public String value() {
        return '"' + value + '"';
    }

}
