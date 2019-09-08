package io.github.portlek.mcjson.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class SuggestCommand implements JsonEvent {

    @NotNull
    private final String value;

    public SuggestCommand(@NotNull String value) {
        this.value = value;
    }

    @NotNull
    public String action() {
        return "suggest_command";
    }

    @NotNull
    public String value() {
        return '"' + value + '"';
    }

}
