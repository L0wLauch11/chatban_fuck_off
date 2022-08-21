package me.lowlauch.chatban_fuck_off;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        // This works by cancelling the chatting and sending the chat message manually
        ChatMessage.send("<" + e.getPlayer().getName() + "> " + e.getMessage());
        e.setCancelled(true);
    }
}
