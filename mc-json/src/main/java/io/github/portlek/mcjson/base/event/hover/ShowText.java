package io.github.portlek.mcjson.base.event.hover;

import io.github.portlek.mcjson.api.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowText implements JsonEvent {

    @NotNull
    private final String[] text;

    public ShowText(@NotNull String... text) {
        this.text = text;
    }

    @NotNull
    public String action() {
        return "show_text";
    }

    @NotNull
    public String value() {
        return "{\"text\":\"\",\"extra\":[" + merge() + "]}";
    }

    @NotNull
    private String merge() {
        StringBuilder builder = new StringBuilder();
        for (int b = 0; b < text.length; b++) {
            builder.append("{\"text\":\"").append(b).append("\"}");

            if (b + 1 != text.length)
                builder.append(",");

        }
        return builder.toString();
    }

}
