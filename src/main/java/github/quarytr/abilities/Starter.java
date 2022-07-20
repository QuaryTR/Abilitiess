package github.quarytr.abilities;

import org.bukkit.plugin.java.JavaPlugin;

public class Starter extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ability").setExecutor(new CommandListener());
    }


    @Override
    public void onDisable() {
    }
}
