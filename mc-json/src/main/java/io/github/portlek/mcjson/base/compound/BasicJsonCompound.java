package io.github.portlek.mcjson.base.compound;

import io.github.portlek.mcjson.api.JsonCompound;
import io.github.portlek.mcjson.api.JsonFeature;
import org.cactoos.list.ListOf;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class BasicJsonCompound implements JsonCompound {

    @NotNull
    private final String text;

    @NotNull
    private final List<JsonFeature> jsonFeatures;

    public BasicJsonCompound(@NotNull String text, @NotNull List<JsonFeature> jsonFeatures) {
        this.text = text;
        this.jsonFeatures = jsonFeatures;
    }

    public BasicJsonCompound(@NotNull String text,
                             @NotNull JsonFeature... jsonFeatures) {
        this(text, new ListOf<>(jsonFeatures));
    }

    @NotNull
    public String convert() {
        return "{\"text\":\"" + text + '"' + merge() + '}';
    }

    @NotNull
    private String merge() {
        final StringBuilder builder = new StringBuilder();

        for (JsonFeature jsonFeature : jsonFeatures) {
            builder.append(jsonFeature.handle());
        }

        return builder.toString();
    }

}
