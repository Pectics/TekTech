package com.peckot.mc.tektech;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class TekTechConfig extends YamlConfiguration {

    //private static TekTechPlugin plugin;
    private static FileConfiguration config;

    public TekTechConfig(TekTechPlugin tekTechPlugin) {
        //plugin = tekTechPlugin;
        config = tekTechPlugin.getConfig();
    }

    public enum base {
        CONFIG_VERSION("config-version");

        private Object data;

        private base() { }

        private base(String key) {
            data = config.get(key);
        }

        private base(String key, int configVersion) {
            data = config.get(key);
        }

        public Object getValue() {
            return data;
        }
    }

}
