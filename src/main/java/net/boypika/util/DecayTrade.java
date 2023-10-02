package net.boypika.util;

import net.boypika.potion.ModPotions;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

import static net.boypika.MoPotions.config;

public class DecayTrade {
    public static void registerTrades() {
        if (config.decayArrowTrade){
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5,
                    factories -> factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(Items.ARROW, 5),
                            PotionUtil.setPotion(new ItemStack(Items.TIPPED_ARROW, 5), ModPotions.DECAY),
                            12, 30, 0.05f
                    ))));
        }
        else {
            System.out.println("Decay Arrow Trade Disabled");
        }
    }
}
