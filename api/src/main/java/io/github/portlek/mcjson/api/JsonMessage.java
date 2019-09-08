package io.github.portlek.mcjson.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface JsonMessage {

  void sendAll();
  
  void send(@NotNull Player... players);

}