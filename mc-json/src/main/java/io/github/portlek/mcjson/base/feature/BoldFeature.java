package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;

public final class BoldFeature extends JsonFeatureEnvelope {

    public BoldFeature(boolean bold) {
        super("bold", "\"" + bold + "\"");
    }

}
