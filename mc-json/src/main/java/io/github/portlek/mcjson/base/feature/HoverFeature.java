package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonEvent;
import io.github.portlek.mcjson.api.JsonFeatureEnvelope;
import org.jetbrains.annotations.NotNull;

public final class HoverFeature extends JsonFeatureEnvelope {

    public HoverFeature(@NotNull JsonEvent jsonEvent) {
        super("hoverEvent", "{\"action\":\"" + jsonEvent.action() + "\",\"value\":" + jsonEvent.value() + '}');
    }

}
