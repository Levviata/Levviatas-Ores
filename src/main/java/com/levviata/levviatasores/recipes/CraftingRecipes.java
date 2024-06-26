package com.levviata.levviatasores.recipes;

import com.levviata.levviatasores.init.BlockInit;
import com.levviata.levviatasores.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.levviata.levviatasores.config.Config.*;

public class CraftingRecipes {
    public static void init() {
        ItemStack copper_helmet = new ItemStack(ItemInit.COPPER_HELMET);
        ItemStack copper_chestplate = new ItemStack(ItemInit.COPPER_CHESTPLATE);
        ItemStack copper_leggings = new ItemStack(ItemInit.COPPER_LEGGINGS);
        ItemStack copper_boots = new ItemStack(ItemInit.COPPER_BOOTS);

        ItemStack tin_helmet = new ItemStack(ItemInit.TIN_HELMET);
        ItemStack tin_chestplate = new ItemStack(ItemInit.TIN_CHESTPLATE);
        ItemStack tin_leggings = new ItemStack(ItemInit.TIN_LEGGINGS);
        ItemStack tin_boots = new ItemStack(ItemInit.TIN_BOOTS);

        ItemStack platinum_helmet = new ItemStack(ItemInit.PLATINUM_HELMET);
        ItemStack platinum_chestplate = new ItemStack(ItemInit.PLATINUM_CHESTPLATE);
        ItemStack platinum_leggings = new ItemStack(ItemInit.PLATINUM_LEGGINGS);
        ItemStack platinum_boots = new ItemStack(ItemInit.PLATINUM_BOOTS);

        ItemStack bronze_helmet = new ItemStack(ItemInit.BRONZE_HELMET);
        ItemStack bronze_chestplate = new ItemStack(ItemInit.BRONZE_CHESTPLATE);
        ItemStack bronze_leggings = new ItemStack(ItemInit.BRONZE_LEGGINGS);
        ItemStack bronze_boots = new ItemStack(ItemInit.BRONZE_BOOTS);

        ItemStack bronze_ingot = new ItemStack(ItemInit.BRONZE_INGOT);

        ItemStack raw_tin_nine = new ItemStack(ItemInit.RAW_TIN, 9);
        ItemStack raw_copper_nine = new ItemStack(ItemInit.RAW_COPPER, 9);
        ItemStack raw_platinum_nine = new ItemStack(ItemInit.RAW_PLATINUM, 9);

        Ingredient tinBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_TIN_BLOCK));
        Ingredient copperBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_COPPER_BLOCK));
        Ingredient platinumBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_PLATINUM_BLOCK));

        ItemStack raw_tin = new ItemStack(ItemInit.RAW_TIN);
        ItemStack raw_copper = new ItemStack(ItemInit.RAW_COPPER);
        ItemStack raw_platinum = new ItemStack(ItemInit.RAW_PLATINUM);

        ItemStack tin_ore = new ItemStack(BlockInit.TIN_ORE);
        ItemStack copper_ore = new ItemStack(BlockInit.COPPER_ORE);
        ItemStack platinum_ore = new ItemStack(BlockInit.PLATINUM_ORE);

        ItemStack tin_ore_granite = new ItemStack(BlockInit.TIN_ORE_GRANITE);
        ItemStack copper_ore_granite = new ItemStack(BlockInit.COPPER_ORE_GRANITE);
        ItemStack platinum_ore_granite = new ItemStack(BlockInit.PLATINUM_ORE_GRANITE);

        ItemStack tin_ore_andesite = new ItemStack(BlockInit.TIN_ORE_ANDESITE);
        ItemStack copper_ore_andesite = new ItemStack(BlockInit.COPPER_ORE_ANDESITE);
        ItemStack platinum_ore_andesite = new ItemStack(BlockInit.PLATINUM_ORE_ANDESITE);

        ItemStack tin_ore_diorite = new ItemStack(BlockInit.TIN_ORE_DIORITE);
        ItemStack copper_ore_diorite = new ItemStack(BlockInit.COPPER_ORE_DIORITE);
        ItemStack platinum_ore_diorite = new ItemStack(BlockInit.PLATINUM_ORE_DIORITE);

        ItemStack raw_tin_block = new ItemStack(BlockInit.RAW_TIN_BLOCK);
        ItemStack raw_copper_block = new ItemStack(BlockInit.RAW_COPPER_BLOCK);
        ItemStack raw_platinum_block = new ItemStack(BlockInit.RAW_PLATINUM_BLOCK);

        ItemStack tin_ingot_nine = new ItemStack(ItemInit.TIN_INGOT, 9);
        ItemStack copper_ingot_nine = new ItemStack(ItemInit.COPPER_INGOT, 9);
        ItemStack platinum_ingot_nine = new ItemStack(ItemInit.PLATINUM_INGOT, 9);

        ItemStack tin_ingot = new ItemStack(ItemInit.TIN_INGOT);
        ItemStack copper_ingot = new ItemStack(ItemInit.COPPER_INGOT);
        ItemStack platinum_ingot = new ItemStack(ItemInit.PLATINUM_INGOT);

        ItemStack copper_axe = new ItemStack(ItemInit.COPPER_AXE);
        ItemStack copper_hoe = new ItemStack(ItemInit.COPPER_HOE);
        ItemStack copper_pickaxe = new ItemStack(ItemInit.COPPER_PICKAXE);
        ItemStack copper_shovel = new ItemStack(ItemInit.COPPER_SHOVEL);
        ItemStack copper_sword = new ItemStack(ItemInit.COPPER_SWORD);

        ItemStack tin_axe = new ItemStack(ItemInit.TIN_AXE);
        ItemStack tin_hoe = new ItemStack(ItemInit.TIN_HOE);
        ItemStack tin_pickaxe = new ItemStack(ItemInit.TIN_PICKAXE);
        ItemStack tin_shovel = new ItemStack(ItemInit.TIN_SHOVEL);
        ItemStack tin_sword = new ItemStack(ItemInit.TIN_SWORD);

        ItemStack platinum_axe = new ItemStack(ItemInit.PLATINUM_AXE);
        ItemStack platinum_hoe = new ItemStack(ItemInit.PLATINUM_HOE);
        ItemStack platinum_pickaxe = new ItemStack(ItemInit.PLATINUM_PICKAXE);
        ItemStack platinum_shovel = new ItemStack(ItemInit.PLATINUM_SHOVEL);
        ItemStack platinum_sword = new ItemStack(ItemInit.PLATINUM_SWORD);

        ItemStack bronze_axe = new ItemStack(ItemInit.BRONZE_AXE);
        ItemStack bronze_hoe = new ItemStack(ItemInit.BRONZE_HOE);
        ItemStack bronze_pickaxe = new ItemStack(ItemInit.BRONZE_PICKAXE);
        ItemStack bronze_shovel = new ItemStack(ItemInit.BRONZE_SHOVEL);
        ItemStack bronze_sword = new ItemStack(ItemInit.BRONZE_SWORD);

        ItemStack tin_and_copper_powder = new ItemStack(ItemInit.TIN_AND_COPPER_POWDER);

        Ingredient copperIngotIngredient = CraftingHelper.getIngredient("ingotCopper");
        Ingredient tinIngotIngredient = CraftingHelper.getIngredient("ingotTin");
        Ingredient rawCopperIngredient = CraftingHelper.getIngredient("rawCopper");
        Ingredient rawTinIngredient = CraftingHelper.getIngredient("rawTin");

        int amountAxe = 2;
        int amountHoe = 1;
        int amountPickaxe = 2;
        int amountShovel = 1;
        int amountSword = 1;

        float xpAxe = 2.0F;
        float xpHoe = 1.0F;
        float xpPickaxe = 2.0F;
        float xpShovel = 1.0F;
        float xpSword = 1.0F;

        int amountHelmet = 3;
        int amountChestplate = 4;
        int amountLeggings = 4;
        int amountBoots = 2;

        float xpHelmet = 4.5F;
        float xpChestplate = 7.0F;
        float xpLeggings = 6.0f;
        float xpBoots = 4.0f;

            GameRegistry.addShapelessRecipe(
                new ResourceLocation("tin_and_copper_powder"),
                null,
                tin_and_copper_powder,
                rawCopperIngredient, rawTinIngredient);
            GameRegistry.addShapelessRecipe(
                new ResourceLocation("tin_and_copper_powder_alt"),
                null,
                tin_and_copper_powder,
                copperIngotIngredient, tinIngotIngredient);

            GameRegistry.addSmelting(tin_and_copper_powder, bronze_ingot, 0.7F);


       /*if (enableTinGen)*/
        {
            GameRegistry.addSmelting(tin_ore, tin_ingot, 0.7F);
            GameRegistry.addSmelting(raw_tin, tin_ingot, 0.7F);
            GameRegistry.addSmelting(raw_tin_block, tin_ingot_nine, 4.0F);
            GameRegistry.addSmelting(tin_ore_granite, tin_ingot, 0.7F);
            GameRegistry.addSmelting(tin_ore_andesite, tin_ingot, 0.7F);
            GameRegistry.addSmelting(tin_ore_diorite, tin_ingot, 0.7F);

            GameRegistry.addShapelessRecipe(
                    new ResourceLocation("raw_tin"),
                    null,
                    raw_tin_nine,
                    tinBlockIngredient);
            GameRegistry.addSmelting(tin_helmet, new ItemStack(ItemInit.TIN_INGOT, amountHelmet), xpHelmet);
            GameRegistry.addSmelting(tin_chestplate, new ItemStack(ItemInit.TIN_INGOT, amountChestplate), xpChestplate);
            GameRegistry.addSmelting(tin_leggings, new ItemStack(ItemInit.TIN_INGOT, amountLeggings), xpLeggings);
            GameRegistry.addSmelting(tin_boots, new ItemStack(ItemInit.TIN_INGOT, amountBoots), xpBoots);

            GameRegistry.addSmelting(tin_axe, new ItemStack(ItemInit.TIN_INGOT, amountAxe), xpAxe);
            GameRegistry.addSmelting(tin_hoe, new ItemStack(ItemInit.TIN_INGOT, amountHoe), xpHoe);
            GameRegistry.addSmelting(tin_pickaxe, new ItemStack(ItemInit.TIN_INGOT, amountPickaxe), xpShovel);
            GameRegistry.addSmelting(tin_shovel, new ItemStack(ItemInit.TIN_INGOT, amountShovel), xpShovel);
            GameRegistry.addSmelting(tin_sword, new ItemStack(ItemInit.TIN_INGOT, amountSword), xpSword);
        }
       /* if (enableCopperGen)*/ {
            GameRegistry.addSmelting(copper_ore, copper_ingot, 0.7F);
            GameRegistry.addSmelting(raw_copper, copper_ingot, 0.7F);
            GameRegistry.addSmelting(raw_copper_block, copper_ingot_nine, 4.0F);
            GameRegistry.addSmelting(copper_ore_granite, copper_ingot, 0.7F);
            GameRegistry.addSmelting(copper_ore_andesite, copper_ingot, 0.7F);
            GameRegistry.addSmelting(copper_ore_diorite, copper_ingot, 0.7F);

            GameRegistry.addShapelessRecipe(
                    new ResourceLocation("raw_copper"),
                    null,
                    raw_copper_nine,
                    copperBlockIngredient);

            GameRegistry.addSmelting(copper_helmet, new ItemStack(ItemInit.COPPER_INGOT, amountHelmet), xpHelmet);
            GameRegistry.addSmelting(copper_chestplate, new ItemStack(ItemInit.COPPER_INGOT, amountChestplate), xpChestplate);
            GameRegistry.addSmelting(copper_leggings, new ItemStack(ItemInit.COPPER_INGOT, amountLeggings), xpLeggings);
            GameRegistry.addSmelting(copper_boots, new ItemStack(ItemInit.COPPER_INGOT, amountBoots), xpBoots);

            GameRegistry.addSmelting(copper_axe, new ItemStack(ItemInit.COPPER_INGOT, amountAxe), xpAxe);
            GameRegistry.addSmelting(copper_hoe, new ItemStack(ItemInit.COPPER_INGOT, amountHoe), xpHoe);
            GameRegistry.addSmelting(copper_pickaxe, new ItemStack(ItemInit.COPPER_INGOT, amountPickaxe), xpPickaxe);
            GameRegistry.addSmelting(copper_shovel, new ItemStack(ItemInit.COPPER_INGOT, amountShovel), xpShovel);
            GameRegistry.addSmelting(copper_sword, new ItemStack(ItemInit.COPPER_INGOT, amountSword), xpSword);
        }

       /* if (enablePlatinumGen)*/ {
            GameRegistry.addSmelting(platinum_ore, platinum_ingot, 0.7F);
            GameRegistry.addSmelting(raw_platinum, platinum_ingot, 0.7F);
            GameRegistry.addSmelting(raw_platinum_block, platinum_ingot_nine, 4.0F);
            GameRegistry.addSmelting(platinum_ore_granite, platinum_ingot, 0.7F);
            GameRegistry.addSmelting(platinum_ore_andesite, platinum_ingot, 0.7F);
            GameRegistry.addSmelting(platinum_ore_diorite, platinum_ingot, 0.7F);

            GameRegistry.addShapelessRecipe(
                    new ResourceLocation("raw_platinum"),
                    null,
                    raw_platinum_nine,
                    platinumBlockIngredient);

            GameRegistry.addSmelting(platinum_helmet, new ItemStack(ItemInit.PLATINUM_INGOT, amountHelmet), xpHelmet);
            GameRegistry.addSmelting(platinum_chestplate, new ItemStack(ItemInit.PLATINUM_INGOT, amountChestplate), xpChestplate);
            GameRegistry.addSmelting(platinum_leggings, new ItemStack(ItemInit.PLATINUM_INGOT, amountLeggings), xpLeggings);
            GameRegistry.addSmelting(platinum_boots, new ItemStack(ItemInit.PLATINUM_INGOT, amountBoots), xpBoots);

            GameRegistry.addSmelting(platinum_axe, new ItemStack(ItemInit.PLATINUM_INGOT, amountAxe), xpAxe);
            GameRegistry.addSmelting(platinum_hoe, new ItemStack(ItemInit.PLATINUM_INGOT, amountHoe), xpHoe);
            GameRegistry.addSmelting(platinum_pickaxe, new ItemStack(ItemInit.PLATINUM_INGOT, amountPickaxe), xpPickaxe);
            GameRegistry.addSmelting(platinum_shovel, new ItemStack(ItemInit.PLATINUM_INGOT, amountShovel), xpShovel);
            GameRegistry.addSmelting(platinum_sword, new ItemStack(ItemInit.PLATINUM_INGOT, amountSword), xpSword);
        }

            GameRegistry.addSmelting(bronze_axe, new ItemStack(ItemInit.BRONZE_INGOT, amountAxe), xpAxe);
            GameRegistry.addSmelting(bronze_hoe, new ItemStack(ItemInit.BRONZE_INGOT, amountHoe), xpHoe);
            GameRegistry.addSmelting(bronze_pickaxe, new ItemStack(ItemInit.BRONZE_INGOT, amountPickaxe), xpPickaxe);
            GameRegistry.addSmelting(bronze_shovel, new ItemStack(ItemInit.BRONZE_INGOT, amountShovel), xpShovel);
            GameRegistry.addSmelting(bronze_sword, new ItemStack(ItemInit.BRONZE_INGOT, amountSword), xpSword);

            GameRegistry.addSmelting(bronze_helmet, new ItemStack(ItemInit.BRONZE_INGOT, amountHelmet), xpHelmet);
            GameRegistry.addSmelting(bronze_chestplate, new ItemStack(ItemInit.BRONZE_INGOT, amountChestplate), xpChestplate);
            GameRegistry.addSmelting(bronze_leggings, new ItemStack(ItemInit.BRONZE_INGOT, amountLeggings), xpLeggings);
            GameRegistry.addSmelting(bronze_boots, new ItemStack(ItemInit.BRONZE_INGOT, amountBoots), xpBoots);
    }
}
