package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonEvent;
import io.github.portlek.mcjson.api.JsonFeatureEnvelope;
import org.jetbrains.annotations.NotNull;

public final class ClickFeature extends JsonFeatureEnvelope {

    public ClickFeature(@NotNull JsonEvent jsonEvent) {
        super("clickEvent", "{\"action\":\"" + jsonEvent.action() + "\",\"value\":" + jsonEvent.value() + '}');
    }

}
