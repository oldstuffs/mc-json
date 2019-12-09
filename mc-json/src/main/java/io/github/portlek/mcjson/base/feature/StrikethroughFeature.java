package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;

public final class StrikethroughFeature extends JsonFeatureEnvelope {

    public StrikethroughFeature(boolean strikethrough) {
        super("strikethrough", strikethrough);
    }

}
