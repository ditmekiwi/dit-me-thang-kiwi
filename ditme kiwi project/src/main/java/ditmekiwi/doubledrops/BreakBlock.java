package ditmekiwi.doubledrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockbroken = event.getBlock();

        if (blockbroken.getType() == Material.DIAMOND_ORE) {
            event.setCancelled(true);
            blockbroken.setType(Material.AIR);
            ItemStack diamonds = new ItemStack(Material.DIAMOND,2);
            blockbroken.getWorld().dropItemNaturally(blockbroken.getLocation(), diamonds);
        }
    }
}
