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

        ItemStack raw_tin = new ItemStack(ItemInit.RAW_TIN, 9);
        ItemStack raw_copper = new ItemStack(ItemInit.RAW_COPPER, 9);
        ItemStack raw_platinum = new ItemStack(ItemInit.RAW_PLATINUM, 9);

        Ingredient tinBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_TIN_BLOCK));
        Ingredient copperBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_COPPER_BLOCK));
        Ingredient platinumBlockIngredient = Ingredient.fromStacks(new ItemStack(BlockInit.RAW_PLATINUM_BLOCK));

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_tin"),
                null,
                raw_tin,
                tinBlockIngredient);

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_copper"),
                null,
                raw_copper,
                copperBlockIngredient);

        GameRegistry.addShapelessRecipe(
                new ResourceLocation("raw_platinum"),
                null,
                raw_platinum,
                platinumBlockIngredient);

        //Ore Blocks

        ItemStack tin_ore = new ItemStack(BlockInit.TIN_ORE);
        ItemStack copper_ore = new ItemStack(BlockInit.COPPER_ORE);
        ItemStack platinum_ore = new ItemStack(BlockInit.PLATINUM_ORE);

        GameRegistry.addSmelting(tin_ore, raw_tin, 0.7F);
        GameRegistry.addSmelting(copper_ore, raw_copper, 0.7F);
        GameRegistry.addSmelting(platinum_ore, raw_platinum, 0.7F);
    }
}
