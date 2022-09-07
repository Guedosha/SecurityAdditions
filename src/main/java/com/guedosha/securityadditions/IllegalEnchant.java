package com.guedosha.securityadditions;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class IllegalEnchant implements Listener {
    @EventHandler
    public boolean onEnchant( e) {
        Player p = e.getEnchanter();
        int en = e.getItem().getEnchantmentLevel(Enchantment.);
    }
}
