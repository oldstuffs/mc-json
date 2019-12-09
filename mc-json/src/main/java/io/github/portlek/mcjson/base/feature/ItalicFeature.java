package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;

public final class ItalicFeature extends JsonFeatureEnvelope {

    public ItalicFeature(boolean italic) {
        super("italic", "\"" + italic + "\"");
    }

}
