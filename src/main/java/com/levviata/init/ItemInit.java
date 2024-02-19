package com.levviata.init;

import com.levviata.bases.BlockBase;
import com.levviata.bases.ItemBase;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item TIN_INGOT = new ItemBase("tin_ingot", "ingotTin", CreativeTabs.MATERIALS);
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot", "ingotCopper", CreativeTabs.MATERIALS);
    public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", "ingotBronze", CreativeTabs.MATERIALS);
    public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot", "ingotPlatinum", CreativeTabs.MATERIALS);

    public static final Item TIN_AND_COPPER_POWDER = new ItemBase("tin_and_copper_powder", "tinAndCopperPowder", CreativeTabs.MATERIALS);

    public static final Item RAW_TIN = new ItemBase("raw_tin", "oreRawTin", CreativeTabs.MATERIALS);
    public static final Item RAW_COPPER = new ItemBase("raw_copper", "oreRawCopper", CreativeTabs.MATERIALS);
    public static final Item RAW_PLATINUM = new ItemBase("raw_platinum", "oreRawPlatinum", CreativeTabs.MATERIALS);
}
