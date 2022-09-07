package com.guedosha.securityadditions;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.*;
import org.bukkit.inventory.ItemStack;

public class IllegalActions implements Listener {
    @EventHandler
    public boolean onCreativeEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (!p.hasPermission("security.action.illegal")) {
            if (p.getGameMode() == GameMode.CREATIVE || p.getGameMode() == GameMode.SPECTATOR) {
                p.setGameMode(GameMode.SURVIVAL);
                e.setCancelled(true);
                e.getCurrentItem().setAmount(0);
            }
        }
        return false;
    }
}
