package io.github.portlek.mcjson.api;

import org.jetbrains.annotations.NotNull;

public abstract class JsonFeatureEnvelope implements JsonFeature {

    @NotNull
    private final String path;

    @NotNull
    private final Object value;

    public JsonFeatureEnvelope(@NotNull String path, @NotNull Object value) {
        this.path = path;
        this.value = value;
    }

    @NotNull
    @Override
    public String handle() {
        return ",\"" + path + "\":" + value;
    }

}
