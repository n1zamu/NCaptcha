package wtf.n1zamu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import wtf.n1zamu.listeners.*;

import wtf.n1zamu.utils.TimerUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public final class NCaptcha extends JavaPlugin implements Listener {
    public static HashMap<Player, TimerUtil> handledPlayers = new HashMap<>();
    public static List<Player> verifiedPlayers = new ArrayList<>();
    public static String logotype = ChatColor.GOLD + "NCaptcha" + ChatColor.GRAY + " » ";

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerLeaveListener(), this);
        getLogger().info("=====NCaptcha was successfully loaded=====");
        getLogger().info("=====Author: github.com/n1zamu=====");
    }

    @Override
    public void onDisable() {
        getLogger().info("=====NCaptcha was successfully unloaded=====");
        getLogger().info("=====Author: github.com/n1zamu=====");
    }
    public static NCaptcha getInstance() {
        return NCaptcha.getPlugin(NCaptcha.class);
    }
}
