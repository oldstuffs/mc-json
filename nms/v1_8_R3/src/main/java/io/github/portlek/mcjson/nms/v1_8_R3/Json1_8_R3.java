package io.github.portlek.mcjson.nms.v1_8_R3;

import io.github.portlek.mcjson.api.IJson;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Json1_8_R3 implements IJson {

    @Override
    public void sendRaw(@NotNull Player player, @NotNull String json) {
        sendPacket(player, new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a(json)));
    }

    private void sendPacket(@NotNull Player player, @NotNull Packet packet) {
        (((CraftPlayer)player).getHandle()).playerConnection.sendPacket(packet);
    }

}
