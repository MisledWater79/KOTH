package com.misledwater.koth;

import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.scheduler.ServerScheduler;
import cn.nukkit.utils.TextFormat;

public class KOTHCore extends PluginBase {

    public static KOTHCore plugin;

    @Override
    public void onEnable() {
        plugin = this;
        registerCommands();
        registerEvents();
        registerTasks();
        this.getLogger().info(TextFormat.GREEN + "KOTHCore activated");
    }

    private void registerCommands() {
        SimpleCommandMap cmdMap = getServer().getCommandMap();
    }

    private void registerEvents() {
        PluginManager pManager = getServer().getPluginManager();
    }

    private void registerTasks() {
        ServerScheduler sScheduler = getServer().getScheduler();
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.RED + "KOTHCore deactivated");
    }

    public static KOTHCore getInstance() {
        return plugin;
    }
}