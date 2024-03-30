package com.levviata.levviatasores.bases.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.oredict.OreDictionary;

public class ToolAxe extends ItemTool implements IHasModel
{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Block block = state.getBlock();
        int[] oreIDs = OreDictionary.getOreIDs(new ItemStack(block, 1, block.getMetaFromState(state)));
        for (int id : oreIDs) {
            String oreName = OreDictionary.getOreName(id);
            if (oreName.startsWith("logWood") || oreName.startsWith("plankWood")) {
                return this.toolMaterial.getEfficiency();
            }
        }
        return super.getDestroySpeed(stack, state);
    }
    @Override
    public void registerModels()
    {
        Main.proxy.registerModel(this, 0, "inventory");
    }
}
