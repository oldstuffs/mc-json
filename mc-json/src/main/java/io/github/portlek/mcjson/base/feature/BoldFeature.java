package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeature;
import org.jetbrains.annotations.NotNull;

public final class BoldFeature implements JsonFeature {

    private final boolean bold;

    public BoldFeature(boolean bold) {
        this.bold = bold;
    }

    @NotNull
    @Override
    public String handle() {
        return ",\"bold\": " + bold;
    }

}
