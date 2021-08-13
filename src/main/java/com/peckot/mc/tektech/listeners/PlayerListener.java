package com.peckot.mc.tektech.listeners;

import com.peckot.mc.tektech.TekTechPlugin;

import org.bukkit.event.Listener;

public class PlayerListener implements Listener {

    public PlayerListener(TekTechPlugin tekTechPlugin) {
        tekTechPlugin.getServer().getPluginManager().registerEvents(this, tekTechPlugin);
    }

}
