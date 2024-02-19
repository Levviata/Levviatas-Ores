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
    }
}
