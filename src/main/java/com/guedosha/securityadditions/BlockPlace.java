package com.guedosha.securityadditions;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;
public class BlockPlace implements Listener {
    @EventHandler
    public boolean onBedrockPlace(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack i = p.getInventory().getItemInMainHand();
        ItemStack io = p.getInventory().getItemInOffHand();
        if (a == Objects.requireNonNull(Action.RIGHT_CLICK_BLOCK)){
            if (!p.hasPermission("security.action.placeillegal")) {
                if (i.getType() == Material.BEDROCK || i.getType() == Material.COMMAND_BLOCK || i.getType() == Material.SPAWNER || i.getType() == Material.COMMAND_BLOCK_MINECART || i.getType() == Material.BARRIER || i.getType() == Material.STRUCTURE_BLOCK || i.getType() == Material.STRUCTURE_VOID || i.getType() == Material.REPEATING_COMMAND_BLOCK || i.getType() == Material.CHAIN_COMMAND_BLOCK || i.getType() == Material.JIGSAW || i.getType() == Material.LIGHT) {
                    i.setAmount(0);
                } else if (io.getType() == Material.BEDROCK || io.getType() == Material.COMMAND_BLOCK || io.getType() == Material.SPAWNER || io.getType() == Material.COMMAND_BLOCK_MINECART || io.getType() == Material.BARRIER || io.getType() == Material.STRUCTURE_BLOCK || io.getType() == Material.STRUCTURE_VOID || io.getType() == Material.REPEATING_COMMAND_BLOCK || io.getType() == Material.CHAIN_COMMAND_BLOCK || io.getType() == Material.JIGSAW || io.getType() == Material.LIGHT) {
                    io.setAmount(0);
                }
            }
        }
        return false;
    }
}
