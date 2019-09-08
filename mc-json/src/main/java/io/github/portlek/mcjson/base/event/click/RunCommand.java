package io.github.portlek.mcjson.base.event.click;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class RunCommand implements JsonEvent {

    @NotNull
    private final String value;

    public RunCommand(@NotNull String value) {
        this.value = value;
    }

    @NotNull
    public String action() {
        return "run_command";
    }

    @NotNull
    public String value() {
        return '"' + value + '"';
    }

}
