package com.levviata.levviatasores.handlers;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

import static com.levviata.levviatasores.config.Config.*;

public class RecipeHandler {
    @SubscribeEvent
    public void onRecipeRegister(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistryModifiable<IRecipe> modifiableRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();

        //if (!enableTinGen)
        {
            // Assume you have the recipe's registry name
            ResourceLocation tinAxe = new ResourceLocation("levviatasores", "tin_axe");
            modifiableRegistry.remove(tinAxe);
            ResourceLocation tinAxeAlt = new ResourceLocation("levviatasores", "tin_axe_alt");
            modifiableRegistry.remove(tinAxeAlt);

            ResourceLocation tinHoe = new ResourceLocation("levviatasores", "tin_hoe");
            modifiableRegistry.remove(tinHoe);
            ResourceLocation tinHoeAlt = new ResourceLocation("levviatasores", "tin_hoe_alt");
            modifiableRegistry.remove(tinHoeAlt);

            ResourceLocation tinShears = new ResourceLocation("levviatasores", "tin_shears");
            modifiableRegistry.remove(tinShears);
            ResourceLocation tinShovel = new ResourceLocation("levviatasores", "tin_shovel");
            modifiableRegistry.remove(tinShovel);

            ResourceLocation tinPickaxe = new ResourceLocation("levviatasores", "tin_pickaxe");
            modifiableRegistry.remove(tinPickaxe);

            ResourceLocation tinSword = new ResourceLocation("levviatasores", "tin_sword");
            modifiableRegistry.remove(tinSword);

            ResourceLocation tinHelmet = new ResourceLocation("levviatasores", "tin_helmet");
            modifiableRegistry.remove(tinHelmet);

            ResourceLocation tinChestplate = new ResourceLocation("levviatasores", "tin_chestplate");
            modifiableRegistry.remove(tinChestplate);

            ResourceLocation tinLeggings = new ResourceLocation("levviatasores", "tin_leggings");
            modifiableRegistry.remove(tinLeggings);

            ResourceLocation tinBoots = new ResourceLocation("levviatasores", "tin_boots");
            modifiableRegistry.remove(tinBoots);
        }
        //if (!enableCopperGen)
        {
            // Assume you have the recipe's registry name
            ResourceLocation copperAxe = new ResourceLocation("levviatasores", "copper_axe");
            modifiableRegistry.remove(copperAxe);
            ResourceLocation copperAxeAlt = new ResourceLocation("levviatasores", "copper_axe_alt");
            modifiableRegistry.remove(copperAxeAlt);

            ResourceLocation copperHoe = new ResourceLocation("levviatasores", "copper_hoe");
            modifiableRegistry.remove(copperHoe);
            ResourceLocation copperHoeAlt = new ResourceLocation("levviatasores", "copper_hoe_alt");
            modifiableRegistry.remove(copperHoeAlt);

            ResourceLocation copperShovel = new ResourceLocation("levviatasores", "copper_shovel");
            modifiableRegistry.remove(copperShovel);

            ResourceLocation copperPickaxe = new ResourceLocation("levviatasores", "copper_pickaxe");
            modifiableRegistry.remove(copperPickaxe);

            ResourceLocation copperSword = new ResourceLocation("levviatasores", "copper_sword");
            modifiableRegistry.remove(copperSword);

            ResourceLocation copperHelmet = new ResourceLocation("levviatasores", "copper_helmet");
            modifiableRegistry.remove(copperHelmet);

            ResourceLocation copperChestplate = new ResourceLocation("levviatasores", "copper_chestplate");
            modifiableRegistry.remove(copperChestplate);

            ResourceLocation copperLeggings = new ResourceLocation("levviatasores", "copper_leggings");
            modifiableRegistry.remove(copperLeggings);

            ResourceLocation copperBoots = new ResourceLocation("levviatasores", "copper_boots");
            modifiableRegistry.remove(copperBoots);
        }
        //if(!enablePlatinumGen)
        {
            // Assume you have the recipe's registry name
            ResourceLocation platinumAxe = new ResourceLocation("levviatasores", "platinum_axe");
            modifiableRegistry.remove(platinumAxe);
            ResourceLocation platinumAxeAlt = new ResourceLocation("levviatasores", "platinum_axe_alt");
            modifiableRegistry.remove(platinumAxeAlt);

            ResourceLocation platinumHoe = new ResourceLocation("levviatasores", "platinum_hoe");
            modifiableRegistry.remove(platinumHoe);
            ResourceLocation platinumHoeAlt = new ResourceLocation("levviatasores", "platinum_hoe_alt");
            modifiableRegistry.remove(platinumHoeAlt);

            ResourceLocation platinumShovel = new ResourceLocation("levviatasores", "platinum_shovel");
            modifiableRegistry.remove(platinumShovel);

            ResourceLocation platinumPickaxe = new ResourceLocation("levviatasores", "platinum_pickaxe");
            modifiableRegistry.remove(platinumPickaxe);

            ResourceLocation platinumSword = new ResourceLocation("levviatasores", "platinum_sword");
            modifiableRegistry.remove(platinumSword);

            ResourceLocation platinumHelmet = new ResourceLocation("levviatasores", "platinum_helmet");
            modifiableRegistry.remove(platinumHelmet);

            ResourceLocation platinumChestplate = new ResourceLocation("levviatasores", "platinum_chestplate");
            modifiableRegistry.remove(platinumChestplate);

            ResourceLocation platinumLeggings = new ResourceLocation("levviatasores", "platinum_leggings");
            modifiableRegistry.remove(platinumLeggings);

            ResourceLocation platinumBoots = new ResourceLocation("levviatasores", "platinum_boots");
            modifiableRegistry.remove(platinumBoots);

        }
    }
}
