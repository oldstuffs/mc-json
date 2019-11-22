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
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            builder.append("{\"text\":\"").append(text[i]).append("\"}");

            if (i + 1 != text.length) {
                builder.append(",");
            }

        }

        return builder.toString();
    }

}
