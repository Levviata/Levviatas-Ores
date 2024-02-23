package com.levviata.recipes;

import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {
    public static void init() {
        //Bronze
        ItemStack tin_and_copper_powder = new ItemStack(ItemInit.TIN_AND_COPPER_POWDER);

        Ingredient copperIngotIngredient = CraftingHelper.getIngredient("ingotCopper");
        Ingredient tinIngotIngredient = CraftingHelper.getIngredient("ingotTin");

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("tin_and_copper_powder"),
                null,
                tin_and_copper_powder,
                copperIngotIngredient, tinIngotIngredient);

        ItemStack bronze_ingot = new ItemStack(ItemInit.BRONZE_INGOT);

        GameRegistry.addSmelting(tin_and_copper_powder, bronze_ingot, 0.7F);

        //Ore Full Blocks
        ItemStack raw_tin_nine = new ItemStack(ItemInit.RAW_TIN, 9);
        ItemStack raw_copper_nine = new ItemStack(ItemInit.RAW_COPPER, 9);
        ItemStack raw_platinum_nine = new ItemStack(ItemInit.RAW_PLATINUM, 9);

        Ingredient tinBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_TIN_BLOCK));
        Ingredient copperBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_COPPER_BLOCK));
        Ingredient platinumBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_PLATINUM_BLOCK));

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_tin"),
                null,
                raw_tin_nine,
                tinBlockIngredient);

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_copper"),
                null,
                raw_copper_nine,
                copperBlockIngredient);

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_platinum"),
                null,
                raw_platinum_nine,
                platinumBlockIngredient);

        //Ore Blocks
        ItemStack raw_tin = new ItemStack(ItemInit.RAW_TIN);
        ItemStack raw_copper = new ItemStack(ItemInit.RAW_COPPER);
        ItemStack raw_platinum = new ItemStack(ItemInit.RAW_PLATINUM);

        ItemStack tin_ore = new ItemStack(BlockInit.TIN_ORE);
        ItemStack copper_ore = new ItemStack(BlockInit.COPPER_ORE);
        ItemStack platinum_ore = new ItemStack(BlockInit.PLATINUM_ORE);

        ItemStack raw_tin_block = new ItemStack(BlockInit.RAW_TIN_BLOCK);
        ItemStack raw_copper_block = new ItemStack(BlockInit.RAW_COPPER_BLOCK);
        ItemStack raw_platinum_block = new ItemStack(BlockInit.RAW_PLATINUM_BLOCK);

        ItemStack tin_ingot_nine = new ItemStack(ItemInit.TIN_INGOT, 9);
        ItemStack copper_ingot_nine = new ItemStack(ItemInit.COPPER_INGOT, 9);
        ItemStack platinum_ingot_nine = new ItemStack(ItemInit.PLATINUM_INGOT, 9);

        ItemStack tin_ingot = new ItemStack(ItemInit.TIN_INGOT);
        ItemStack copper_ingot = new ItemStack(ItemInit.COPPER_INGOT);
        ItemStack platinum_ingot = new ItemStack(ItemInit.PLATINUM_INGOT);

        GameRegistry.addSmelting(tin_ore, tin_ingot, 0.7F);
        GameRegistry.addSmelting(copper_ore, copper_ingot, 0.7F);
        GameRegistry.addSmelting(platinum_ore, platinum_ingot, 0.7F);

        GameRegistry.addSmelting(raw_tin, tin_ingot, 0.7F);
        GameRegistry.addSmelting(raw_copper, copper_ingot, 0.7F);
        GameRegistry.addSmelting(raw_platinum, platinum_ingot, 0.7F);

        GameRegistry.addSmelting(raw_tin_block, tin_ingot_nine, 4.0F);
        GameRegistry.addSmelting(raw_copper_block, copper_ingot_nine, 4.0F);
        GameRegistry.addSmelting(raw_platinum_block, platinum_ingot_nine, 4.0F);

        //Armor
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

        float xpHelmet = 4.5F;
        float xpChestplate = 7.0F;
        float xpLeggings = 6.0f;
        float xpBoots = 4.0f;

        GameRegistry.addSmelting(copper_helmet, new ItemStack(ItemInit.COPPER_INGOT), xpHelmet);
        GameRegistry.addSmelting(copper_chestplate, new ItemStack(ItemInit.COPPER_INGOT), xpChestplate);
        GameRegistry.addSmelting(copper_leggings, new ItemStack(ItemInit.COPPER_INGOT), xpLeggings);
        GameRegistry.addSmelting(copper_boots, new ItemStack(ItemInit.COPPER_INGOT), xpBoots);

        GameRegistry.addSmelting(tin_helmet, new ItemStack(ItemInit.TIN_INGOT), xpHelmet);
        GameRegistry.addSmelting(tin_chestplate, new ItemStack(ItemInit.TIN_INGOT), xpChestplate);
        GameRegistry.addSmelting(tin_leggings, new ItemStack(ItemInit.TIN_INGOT), xpLeggings);
        GameRegistry.addSmelting(tin_boots, new ItemStack(ItemInit.TIN_INGOT), xpBoots);

        GameRegistry.addSmelting(platinum_helmet, new ItemStack(ItemInit.PLATINUM_INGOT), xpHelmet);
        GameRegistry.addSmelting(platinum_chestplate, new ItemStack(ItemInit.PLATINUM_INGOT), xpChestplate);
        GameRegistry.addSmelting(platinum_leggings, new ItemStack(ItemInit.PLATINUM_INGOT), xpLeggings);
        GameRegistry.addSmelting(platinum_boots, new ItemStack(ItemInit.PLATINUM_INGOT), xpBoots);

        //Tools
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

        GameRegistry.addSmelting(copper_axe, new ItemStack(ItemInit.COPPER_INGOT, amountAxe), xpAxe);
        GameRegistry.addSmelting(copper_hoe, new ItemStack(ItemInit.COPPER_INGOT, amountHoe), xpHoe);
        GameRegistry.addSmelting(copper_pickaxe, new ItemStack(ItemInit.COPPER_INGOT, amountPickaxe), xpPickaxe);
        GameRegistry.addSmelting(copper_shovel, new ItemStack(ItemInit.COPPER_INGOT, amountShovel), xpShovel);
        GameRegistry.addSmelting(copper_sword, new ItemStack(ItemInit.COPPER_INGOT), xpSword);

        GameRegistry.addSmelting(tin_axe, new ItemStack(ItemInit.TIN_INGOT, amountAxe), xpAxe);
        GameRegistry.addSmelting(tin_hoe, new ItemStack(ItemInit.TIN_INGOT, amountHoe), xpHoe);
        GameRegistry.addSmelting(tin_pickaxe, new ItemStack(ItemInit.COPPER_INGOT, amountPickaxe), xpShovel);
        GameRegistry.addSmelting(tin_shovel, new ItemStack(ItemInit.TIN_INGOT, amountShovel), xpShovel);
        GameRegistry.addSmelting(tin_sword, new ItemStack(ItemInit.TIN_INGOT), xpSword);

        GameRegistry.addSmelting(platinum_axe, new ItemStack(ItemInit.PLATINUM_INGOT, amountAxe), xpAxe);
        GameRegistry.addSmelting(platinum_hoe, new ItemStack(ItemInit.PLATINUM_INGOT, amountHoe), xpHoe);
        GameRegistry.addSmelting(platinum_pickaxe, new ItemStack(ItemInit.PLATINUM_INGOT, amountPickaxe), xpPickaxe);
        GameRegistry.addSmelting(platinum_shovel, new ItemStack(ItemInit.PLATINUM_INGOT, amountShovel), xpShovel);
        GameRegistry.addSmelting(platinum_sword, new ItemStack(ItemInit.PLATINUM_INGOT, amountSword), xpSword);
    }
}
