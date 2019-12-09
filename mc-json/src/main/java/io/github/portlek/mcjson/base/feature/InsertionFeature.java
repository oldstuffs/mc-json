package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;
import org.jetbrains.annotations.NotNull;

public final class InsertionFeature extends JsonFeatureEnvelope {

    public InsertionFeature(@NotNull String insertion) {
        super("insertion", insertion);
    }

}
