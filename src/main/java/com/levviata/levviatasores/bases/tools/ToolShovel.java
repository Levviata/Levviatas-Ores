package com.levviata.levviatasores.bases.tools;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {

    public ToolShovel(String name, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(this, 0, "inventory");
    }
    }

