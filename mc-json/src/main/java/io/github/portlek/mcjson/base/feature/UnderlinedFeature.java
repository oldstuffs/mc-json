package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;

public final class UnderlinedFeature extends JsonFeatureEnvelope {

    public UnderlinedFeature(boolean underlined) {
        super("underlined", underlined);
    }

}
