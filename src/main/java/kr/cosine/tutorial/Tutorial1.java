package kr.cosine.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial1 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("테스트").setExecutor(new TestCommand());
        getCommand("텔레포트").setExecutor(new TeleportCommand());
    }

    @Override
    public void onDisable() {

    }
}
