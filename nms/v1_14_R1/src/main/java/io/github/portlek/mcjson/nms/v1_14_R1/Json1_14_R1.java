package io.github.portlek.mcjson.nms.v1_14_R1;

import com.sun.istack.internal.NotNull;
import io.github.portlek.mcjson.api.IJson;
import net.minecraft.server.v1_14_R1.IChatBaseComponent;
import net.minecraft.server.v1_14_R1.Packet;
import net.minecraft.server.v1_14_R1.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Json1_14_R1 implements IJson {

    @Override
    public void sendRaw(@NotNull Player player, @NotNull String json) {
        sendPacket(player, new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a(json)));
    }

    private void sendPacket(@NotNull Player player, @NotNull Packet packet) {
        (((CraftPlayer)player).getHandle()).playerConnection.sendPacket(packet);
    }

}