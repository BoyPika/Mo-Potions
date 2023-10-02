package net.boypika.config;

import java.io.File;

public class Config {
    public net.boypika.pikaconfiga.config.Config serverProperties;
    public boolean decayArrowTrade;
    public void init() {
        this.serverProperties = new net.boypika.pikaconfiga.config.Config(new File("config/mopotions.properties"));
        this.decayArrowTrade = this.serverProperties.setBoolean("decayArrowTrade", true);
    }
}
