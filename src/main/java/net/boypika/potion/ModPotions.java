package net.boypika.potion;

import net.boypika.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModPotions {
    public static Potion BADLUCK;
    public static Potion DECAY;
    public static Potion GLOWING;
    public static void registerPotions() {
        BADLUCK = register("bad_luck", new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3600)));
        DECAY = register("decay", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 800, 1)));
        GLOWING = register("glowing", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 3600)));
    }
    private static Potion register(String name, Potion potion) {
        return Registry.register(Registries.POTION, name, potion);
    }
    public static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.EMERALD, Potions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.SPIDER_EYE, BADLUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.WITHER_ROSE, DECAY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.GLOW_BERRIES, GLOWING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC, GLOWING);
    }
}
