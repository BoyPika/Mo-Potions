package net.boypika;

import net.boypika.config.ModConfig;
import net.boypika.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

public class MoPotions implements ModInitializer {
	public static final ModConfig config = new ModConfig();
	@Override
	public void onInitialize() {
		config.init();
		ModPotions.registerPotions();
		ModPotions.registerPotionRecipes();
	}
}