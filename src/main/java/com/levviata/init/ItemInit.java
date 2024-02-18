package com.levviata.init;

import com.levviata.bases.ItemBase;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item TIN_INGOT = new ItemBase("tin_ingot", "ingotTin", CreativeTabs.MATERIALS);
    public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", "ingotBronze", CreativeTabs.MATERIALS);
    public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot", "ingotPlatinum", CreativeTabs.MATERIALS);
}
