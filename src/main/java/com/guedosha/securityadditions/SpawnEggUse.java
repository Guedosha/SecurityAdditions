package com.guedosha.securityadditions;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SpawnEggUse implements Listener {
    @EventHandler
    public boolean onSpawnEggUse(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack i = p.getInventory().getItemInMainHand();
        ItemStack io = p.getInventory().getItemInOffHand();
        if (a == Objects.requireNonNull(Action.RIGHT_CLICK_BLOCK)){
            if (!p.hasPermission("security.action.useillegal")) {
                if (i.getType() == Material.SALMON_SPAWN_EGG || i.getType() == Material.WARDEN_SPAWN_EGG || i.getType() == Material.ALLAY_SPAWN_EGG || i.getType() == Material.AXOLOTL_SPAWN_EGG || i.getType() == Material.BAT_SPAWN_EGG || i.getType() == Material.BEE_SPAWN_EGG || i.getType() == Material.BLAZE_SPAWN_EGG || i.getType() == Material.CAT_SPAWN_EGG || i.getType() == Material.CHICKEN_SPAWN_EGG || i.getType() == Material.COD_SPAWN_EGG || i.getType() == Material.COW_SPAWN_EGG || i.getType() == Material.CREEPER_SPAWN_EGG || i.getType() == Material.CAVE_SPIDER_SPAWN_EGG || i.getType() == Material.PILLAGER_SPAWN_EGG || i.getType() == Material.CHICKEN_SPAWN_EGG || i.getType() == Material.MAGMA_CUBE_SPAWN_EGG || i.getType() == Material.DOLPHIN_SPAWN_EGG || i.getType() == Material.DONKEY_SPAWN_EGG || i.getType() == Material.DROWNED_SPAWN_EGG || i.getType() == Material.ELDER_GUARDIAN_SPAWN_EGG || i.getType() == Material.ENDERMAN_SPAWN_EGG || i.getType() == Material.ENDERMITE_SPAWN_EGG || i.getType() == Material.EVOKER_SPAWN_EGG || i.getType() == Material.FOX_SPAWN_EGG || i.getType() == Material.FROG_SPAWN_EGG || i.getType() == Material.GHAST_SPAWN_EGG || i.getType() == Material.GOAT_SPAWN_EGG || i.getType() == Material.GUARDIAN_SPAWN_EGG || i.getType() == Material.GLOW_SQUID_SPAWN_EGG || i.getType() == Material.HOGLIN_SPAWN_EGG || i.getType() == Material.HORSE_SPAWN_EGG || i.getType() == Material.HUSK_SPAWN_EGG || i.getType() == Material.LLAMA_SPAWN_EGG || i.getType() == Material.MAGMA_CUBE_SPAWN_EGG || i.getType() == Material.MULE_SPAWN_EGG || i.getType() == Material.MOOSHROOM_SPAWN_EGG || i.getType() == Material.OCELOT_SPAWN_EGG || i.getType() == Material.PANDA_SPAWN_EGG || i.getType() == Material.PARROT_SPAWN_EGG || i.getType() == Material.PHANTOM_SPAWN_EGG || i.getType() == Material.PIG_SPAWN_EGG || i.getType() == Material.PIGLIN_SPAWN_EGG || i.getType() == Material.RABBIT_SPAWN_EGG || i.getType() == Material.RAVAGER_SPAWN_EGG || i.getType() == Material.SHEEP_SPAWN_EGG || i.getType() == Material.SALMON_SPAWN_EGG || i.getType() == Material.TADPOLE_SPAWN_EGG || i.getType() == Material.TURTLE_SPAWN_EGG || i.getType() == Material.TRADER_LLAMA_SPAWN_EGG || i.getType() == Material.TROPICAL_FISH_SPAWN_EGG || i.getType() == Material.WARDEN_SPAWN_EGG || i.getType() == Material.WANDERING_TRADER_SPAWN_EGG || i.getType() == Material.WOLF_SPAWN_EGG || i.getType() == Material.WITCH_SPAWN_EGG || i.getType() == Material.ZOGLIN_SPAWN_EGG || i.getType() == Material.ZOMBIE_SPAWN_EGG || i.getType() == Material.ZOMBIE_HORSE_SPAWN_EGG || i.getType() == Material.ZOMBIE_VILLAGER_SPAWN_EGG || i.getType() == Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) {
                    i.setAmount(0);
                } else if (io.getType() == Material.SALMON_SPAWN_EGG || io.getType() == Material.WARDEN_SPAWN_EGG || io.getType() == Material.ALLAY_SPAWN_EGG || io.getType() == Material.AXOLOTL_SPAWN_EGG || io.getType() == Material.BAT_SPAWN_EGG || io.getType() == Material.BEE_SPAWN_EGG || io.getType() == Material.BLAZE_SPAWN_EGG || io.getType() == Material.CAT_SPAWN_EGG || io.getType() == Material.CHICKEN_SPAWN_EGG || io.getType() == Material.COD_SPAWN_EGG || io.getType() == Material.COW_SPAWN_EGG || io.getType() == Material.CREEPER_SPAWN_EGG || io.getType() == Material.CAVE_SPIDER_SPAWN_EGG || io.getType() == Material.CHICKEN_SPAWN_EGG || io.getType() == Material.MAGMA_CUBE_SPAWN_EGG || io.getType() == Material.DOLPHIN_SPAWN_EGG || io.getType() == Material.DONKEY_SPAWN_EGG || io.getType() == Material.DROWNED_SPAWN_EGG || io.getType() == Material.ELDER_GUARDIAN_SPAWN_EGG || io.getType() == Material.ENDERMAN_SPAWN_EGG || io.getType() == Material.ENDERMITE_SPAWN_EGG || io.getType() == Material.EVOKER_SPAWN_EGG || io.getType() == Material.FOX_SPAWN_EGG || io.getType() == Material.FROG_SPAWN_EGG || io.getType() == Material.GHAST_SPAWN_EGG || io.getType() == Material.GOAT_SPAWN_EGG || io.getType() == Material.GUARDIAN_SPAWN_EGG || io.getType() == Material.GLOW_SQUID_SPAWN_EGG || io.getType() == Material.HOGLIN_SPAWN_EGG || io.getType() == Material.HORSE_SPAWN_EGG || io.getType() == Material.HUSK_SPAWN_EGG || io.getType() == Material.LLAMA_SPAWN_EGG || io.getType() == Material.MAGMA_CUBE_SPAWN_EGG || io.getType() == Material.MULE_SPAWN_EGG || io.getType() == Material.MOOSHROOM_SPAWN_EGG || io.getType() == Material.OCELOT_SPAWN_EGG || io.getType() == Material.PANDA_SPAWN_EGG || io.getType() == Material.PARROT_SPAWN_EGG || io.getType() == Material.PHANTOM_SPAWN_EGG || io.getType() == Material.PIG_SPAWN_EGG || io.getType() == Material.PIGLIN_SPAWN_EGG || io.getType() == Material.RABBIT_SPAWN_EGG || io.getType() == Material.RAVAGER_SPAWN_EGG || io.getType() == Material.SHEEP_SPAWN_EGG || io.getType() == Material.SALMON_SPAWN_EGG || io.getType() == Material.TADPOLE_SPAWN_EGG || io.getType() == Material.TURTLE_SPAWN_EGG || io.getType() == Material.TRADER_LLAMA_SPAWN_EGG || io.getType() == Material.TROPICAL_FISH_SPAWN_EGG || io.getType() == Material.WARDEN_SPAWN_EGG || io.getType() == Material.WANDERING_TRADER_SPAWN_EGG || io.getType() == Material.WOLF_SPAWN_EGG || io.getType() == Material.WITCH_SPAWN_EGG || io.getType() == Material.ZOGLIN_SPAWN_EGG || io.getType() == Material.ZOMBIE_SPAWN_EGG || io.getType() == Material.ZOMBIE_HORSE_SPAWN_EGG || io.getType() == Material.ZOMBIE_VILLAGER_SPAWN_EGG || io.getType() == Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) {
                    io.setAmount(0);
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
