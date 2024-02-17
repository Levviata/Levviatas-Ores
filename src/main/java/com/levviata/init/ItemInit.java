package com.levviata.init;

import com.levviata.bases.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item TIN_INGOT = new ItemBase("ingot_tin", CreativeTabs.MATERIALS);
}
