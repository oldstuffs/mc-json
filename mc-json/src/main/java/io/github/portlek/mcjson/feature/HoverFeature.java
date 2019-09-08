package io.github.portlek.mcjson.feature;

import io.github.portlek.mcjson.api.JsonEvent;
import io.github.portlek.mcjson.api.JsonFeature;
import org.jetbrains.annotations.NotNull;

public final class HoverFeature implements JsonFeature {

    @NotNull
    private final JsonEvent jsonEvent;

    public HoverFeature(@NotNull JsonEvent jsonEvent) {
        this.jsonEvent = jsonEvent;
    }

    @NotNull
    public String handle() {
        return ",\"hoverEvent\":{\"action\":\"" + jsonEvent.action() + "\",\"value\":" + jsonEvent.value() + '}';
    }

}
