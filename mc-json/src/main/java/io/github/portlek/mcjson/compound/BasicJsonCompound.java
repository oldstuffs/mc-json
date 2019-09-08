package io.github.portlek.mcjson.compound;

import io.github.portlek.mcjson.api.JsonCompound;
import io.github.portlek.mcjson.api.JsonFeature;
import io.github.portlek.mcjson.feature.EmptyFeature;
import org.jetbrains.annotations.NotNull;

public final class BasicJsonCompound implements JsonCompound {

    @NotNull
    private final String text;

    @NotNull
    private final JsonFeature jsonFeature1;

    @NotNull
    private final JsonFeature jsonFeature2;

    public BasicJsonCompound(@NotNull String text,
                             @NotNull JsonFeature jsonFeature1,
                             @NotNull JsonFeature jsonFeature2) {
        this.text = text;
        this.jsonFeature1 = jsonFeature1;
        this.jsonFeature2 = jsonFeature2;
    }

    public BasicJsonCompound(@NotNull String text,
                             @NotNull JsonFeature jsonFeature1) {
        this(text, jsonFeature1, new EmptyFeature());
    }

    public BasicJsonCompound(@NotNull String text) {
        this(text, new EmptyFeature(), new EmptyFeature());
    }

    public BasicJsonCompound() {
        this("", new EmptyFeature(), new EmptyFeature());
    }

    @NotNull
    public String convert() {
        return "{\"text\":\"" + text + '"' + jsonFeature1.handle() + jsonFeature2.handle() + '}';
    }

}
