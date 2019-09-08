package io.github.portlek.mcjson.base.event.hover;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowEntity implements JsonEvent {

    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String entityType;

    public ShowEntity(int id, @NotNull String name, @NotNull String entityType) {
        this.id = id;
        this.name = name;
        this.entityType = entityType;
    }

    @NotNull
    public String action() {
        return "show_entity";
    }

    @NotNull
    public String value() {
        return "\"{id:" + id + ",name:" + name + ",type:" + entityType + "}\"";
    }
}
