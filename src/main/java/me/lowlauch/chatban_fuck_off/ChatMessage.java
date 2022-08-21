package me.lowlauch.chatban_fuck_off;

import org.bukkit.Bukkit;

public class ChatMessage {
    public static void send(String chatMessage) {
        Bukkit.getServer().broadcastMessage(chatMessage);
    }
}
