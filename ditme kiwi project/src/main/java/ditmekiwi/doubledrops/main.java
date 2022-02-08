package ditmekiwi.doubledrops;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("hello world");

        getServer().getPluginManager().registerEvents(new BreakBlock(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
