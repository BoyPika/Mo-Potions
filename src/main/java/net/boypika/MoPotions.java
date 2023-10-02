package net.boypika;

import net.boypika.config.Config;
import net.boypika.potion.ModPotions;
import net.boypika.util.DecayTrade;
import net.fabricmc.api.ModInitializer;

public class MoPotions implements ModInitializer {
	public static final Config config = new Config();
	@Override
	public void onInitialize() {
		config.init();
		ModPotions.registerPotions();
		ModPotions.registerPotionRecipes();
		DecayTrade.registerTrades();
	}
}