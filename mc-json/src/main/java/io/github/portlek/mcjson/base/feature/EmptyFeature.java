package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeature;
import org.jetbrains.annotations.NotNull;

public final class EmptyFeature implements JsonFeature {

    @NotNull
    public String handle() {
        return "";
    }

}