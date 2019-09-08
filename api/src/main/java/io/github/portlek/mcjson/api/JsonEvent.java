package io.github.portlek.mcjson.api;

import org.jetbrains.annotations.NotNull;

public interface JsonEvent {

    @NotNull
    String action();

    @NotNull
    String value();

}