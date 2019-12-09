package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;
import org.jetbrains.annotations.NotNull;

public final class ColorFeature extends JsonFeatureEnvelope {

    public ColorFeature(@NotNull String color) {
        super("color", color);
    }

}
