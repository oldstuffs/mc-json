package io.github.portlek.mcjson.base.event.hover;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowAchievement implements JsonEvent {

    @NotNull
    private final String value;

    public ShowAchievement(@NotNull String value) {
        this.value = value;
    }

    @NotNull
    public String action() {
        return "show_achievement";
    }

    @NotNull
    public String value() {
        return '"' + value + '"';
    }

}
