package com.levviata.recipes;

import com.levviata.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingRecipes {
    public static void init() {
        //Tin and Copper Powder / bronze
        ItemStack tin_and_copper_powder = new ItemStack(ItemInit.TIN_AND_COPPER_POWDER);

        Ingredient copperIngot = CraftingHelper.getIngredient("ingotCopper");
        Ingredient tinIngot = Ingredient.fromStacks(new ItemStack(ItemInit.TIN_INGOT));

        GameRegistry.addShapelessRecipe(new ResourceLocation("tin_and_copper_powder"), null, tin_and_copper_powder, copperIngot, tinIngot);
    }
}
