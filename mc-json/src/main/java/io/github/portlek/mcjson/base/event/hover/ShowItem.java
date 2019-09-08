package io.github.portlek.mcjson.base.event.hover;

import io.github.portlek.mcjson.api.JsonEvent;
import io.github.portlek.nbt.base.ItemStackNBTOf;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class ShowItem implements JsonEvent {

    @NotNull
    private final ItemStack itemStack;

    public ShowItem(@NotNull ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @NotNull
    public String action() { return "show_item"; }
    @NotNull
    public String value() {
        return "\"" + new ItemStackNBTOf(itemStack).nbt().toString() + "\"";
    }

}
